package com.settlers.demotesty.Controllers;

import java.io.IOException;
import java.util.*;

import com.settlers.demotesty.Fundimentals.Player;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;

public class TradeACCREQ extends TradeController {
    @FXML
    private Button AcceptBTN1, AcceptBTN2, AcceptBTN3, RejectBTN1, RejectBTN2, RejectBTN3, DoneTrading;

    @FXML
    private Text PlayerFourName, PlayerThreeName, PlayerTwoName;

    @FXML
    private Label labelOne, labelThree, labelTwo;

    @FXML
    private Pane main;

    @FXML
    private FlowPane offerFlowPane, requestFlowPane;

    @FXML
    private Player currentPlayer;

    private int playerIndex;

    public void setCurrentPlayer(Player currentPlayer) {
        this.playerIndex = playerIndex;
//        updatePlayerNames();
    }

    private Player getCP() {
        return players.get(Board.getCurrentPlayerIndex());
    }

    @FXML
    void initialize() {
//        players.get(playerIndex).getPlayerName();
        System.out.println("ghguiuyuyfyiuoyur");
        System.out.println(getCP().getPlayerName());
        updatePlayerNames();
        AcceptBTN1.setOnAction(event -> handleAcceptButtonAction(AcceptBTN1));
        AcceptBTN2.setOnAction(event -> handleAcceptButtonAction(AcceptBTN2));
        AcceptBTN3.setOnAction(event -> handleAcceptButtonAction(AcceptBTN3));

        RejectBTN1.setOnAction(event -> handleRejectButtonAction(RejectBTN1));
        RejectBTN2.setOnAction(event -> handleRejectButtonAction(RejectBTN2));
        RejectBTN3.setOnAction(event -> handleRejectButtonAction(RejectBTN3));

        DoneTrading.setOnAction(event -> handleDoneTradingAction());
        HashMap<ImageView, Player> offerImages = getImagesInFlowPane(offerFlowPane, offeredImages);
        HashMap<ImageView, Player> requestImages = getImagesInFlowPane(requestFlowPane, requestedImages);

//        System.out.println("Offer Images: " + offerImages.length);
        //print offerImages and requestImages
        System.out.println("Offered Images:");
        printImages(offerImages);

        System.out.println("Requested Images:");
        printImages(requestImages);

    }

    public void createRequestedImages(HashMap<ImageView, Player> requestedImages) {
        for (ImageView image : requestedImages.keySet()) {
            requestFlowPane.getChildren().add(image);
        }
    }

    public void printFlowPaneImages() {
        HashMap<ImageView, Player> offerImages = getImagesInFlowPane(offerFlowPane, offeredImages);
        HashMap<ImageView, Player> requestImages = getImagesInFlowPane(requestFlowPane, requestedImages);

        System.out.println("Offered Images:");
        printImages(offerImages);

        System.out.println("Requested Images:");
        printImages(requestImages);
        countResources(offerImages, requestImages);
    }

    private static HashMap<String, Integer> countResources(HashMap<ImageView, Player> offerImages, HashMap<ImageView, Player> requestImages) {
        HashMap<String, Integer> resources = new HashMap<>();

        // Initialize resources map with 0 counts
        resources.put("brick", 0);
        resources.put("wood", 0);
        resources.put("wool", 0);
        resources.put("grain", 0);
        resources.put("ore", 0);

        // Count occurrences in offerImages
        for (ImageView imageView : offerImages.keySet()) {
            String resourceId = imageView.getId();
            if (resources.containsKey(resourceId)) {
                resources.put(resourceId, resources.get(resourceId) + 1);
            }
        }

        // Count occurrences in requestImages
        for (ImageView imageView : requestImages.keySet()) {
            String resourceId = imageView.getId();
            if (resources.containsKey(resourceId)) {
                resources.put(resourceId, resources.get(resourceId) + 1);
            }
        }

        return resources;
    }


    public void createOfferedImages(HashMap<ImageView, Player> offeredImages) {
        for (ImageView image : offeredImages.keySet()) {
            offerFlowPane.getChildren().add(image);
        }
    }

    public void printImages(HashMap<ImageView, Player> imagesMap) {
        for (Map.Entry<ImageView, Player> entry : imagesMap.entrySet()) {
            ImageView imageView = entry.getKey();
            Player player = entry.getValue();
            System.out.println("ImageView: " + imageView.getId() + ", Player: " + player);
        }
    }

    private void resetFlowPanes() {
        offerFlowPane.getChildren().clear();
        requestFlowPane.getChildren().clear();
    }


    private Stage stage;

    public void setStage(Stage stage) {
        this.stage = stage;
        stage.addEventHandler(WindowEvent.WINDOW_CLOSE_REQUEST, event -> {
            resetFlowPanes();
        });

        createRequestedImages(requestedImages);
        createOfferedImages(offeredImages);

        printFlowPaneImages(); // Add this line here
    }


    private void updatePlayerNames() {
        System.out.println(Board.getCurrentPlayerIndex());
        switch (Board.getCurrentPlayerIndex()) {
            case 1:
                PlayerTwoName.setText(players.get(0).getPlayerName());
                PlayerThreeName.setText(players.get(2).getPlayerName());
                PlayerFourName.setText(players.get(3).getPlayerName());
                break;
            case 2:
                PlayerTwoName.setText(players.get(0).getPlayerName());
                PlayerThreeName.setText(players.get(1).getPlayerName());
                PlayerFourName.setText(players.get(3).getPlayerName());
                break;
            case 0:
                PlayerTwoName.setText(players.get(1).getPlayerName());
                PlayerThreeName.setText(players.get(2).getPlayerName());
                PlayerFourName.setText(players.get(3).getPlayerName());
                break;
            case 3:
                PlayerTwoName.setText(players.get(0).getPlayerName());
                PlayerThreeName.setText(players.get(2).getPlayerName());
                PlayerFourName.setText(players.get(1).getPlayerName());
                break;
        }
    }

    public void showTradeACCREQWindow(Stage stage, HashMap<ImageView, Player> requestedImages, HashMap<ImageView, Player> offeredImages) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/settlers/demotesty/ACCREJTrade.fxml"));
        Parent root = loader.load();

        TradeACCREQ controller = loader.getController();
        controller.setStage(stage);
//        controller.createRequestedImages(requestedImages);
//        controller.createOfferedImages(offeredImages);
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void doneTrading(MouseEvent event) {
        requestedImages.clear();
        offeredImages.clear();

        // Clear the flow pane
        offerFlowPane.getChildren().clear();
        requestFlowPane.getChildren().clear();

        // Close the window
        Stage stage = (Stage) DoneTrading.getScene().getWindow();
        stage.close();
    }


    public HashMap<ImageView, Player> getImagesInFlowPane(FlowPane flowPane, HashMap<ImageView, Player> imagesMap) {
        HashMap<ImageView, Player> filteredImagesMap = new HashMap<>();

        for (Node node : flowPane.getChildren()) {
            if (node instanceof ImageView && imagesMap.containsKey(node)) {
                filteredImagesMap.put((ImageView) node, imagesMap.get(node));

            }
        }
        return filteredImagesMap;
    }

    private void handleAcceptButtonAction(Button sourceButton) {
        String playerName = "";

        if (sourceButton == AcceptBTN1) {
            playerName = PlayerTwoName.getText();
            checkPlayer(playerName);
        } else if (sourceButton == AcceptBTN2) {
            playerName = PlayerThreeName.getText();
            checkPlayer(playerName);
        } else if (sourceButton == AcceptBTN3) {
            playerName = PlayerFourName.getText();
            checkPlayer(playerName);

        }

        if (!playerName.isEmpty()) {
            System.out.println("Accept Button Pressed for Player: " + playerName);
        }
    }

    private void checkPlayer(String pName) {
        for (Player i : players) {
            if (i.getPlayerName().equals(pName)) {
                HashMap<ImageView, Player> offerImages = getImagesInFlowPane(offerFlowPane, offeredImages);
                HashMap<ImageView, Player> requestImages = getImagesInFlowPane(requestFlowPane, requestedImages);
                HashMap<String, Integer> resourceCounts = countResources(offerImages, requestImages);

                // Offer trade (current player loses resources)
                for (String resource : resourceCounts.keySet()) {
                    int currentCount = getCP().getResources().get(resource);
                    getCP().getResources().put(resource, Math.max(0, currentCount - resourceCounts.get(resource)));
                }

                // Request trade (current player gains resources)
                for (String resource : resourceCounts.keySet()) {
                    int currentCount = getCP().getResources().get(resource);
                    getCP().getResources().put(resource, currentCount + resourceCounts.get(resource));
                }

                // Update resources for the accepting player
                for (String resource : resourceCounts.keySet()) {
                    int currentCount = i.getResources().get(resource);
                    i.getResources().put(resource, Math.max(0, currentCount + resourceCounts.get(resource) - (2 * resourceCounts.get(resource))));
                }

                break;
            }
        }
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    private void offerMainTrade(HashMap<String, Integer> resourceCounts) {
        for (String resource : resourceCounts.keySet()) {
            int currentCount = getCP().getResources().get(resource);
            getCP().getResources().put(resource, Math.max(0, currentCount - resourceCounts.get(resource)));
        }
    }

    private void requestMainTrade(HashMap<String, Integer> resourceCounts) {
        for (String resource : resourceCounts.keySet()) {
            int currentCount = getCP().getResources().get(resource);
            getCP().getResources().put(resource, currentCount + resourceCounts.get(resource));
        }
    }

    private void handleRejectButtonAction(Button sourceButton) {
        String playerName = "";

        if (sourceButton == RejectBTN1) {
            playerName = PlayerTwoName.getText();

        } else if (sourceButton == RejectBTN2) {
            playerName = PlayerThreeName.getText();
        } else if (sourceButton == RejectBTN3) {
            playerName = PlayerFourName.getText();
        }

        if (!playerName.isEmpty()) {
            System.out.println("Reject Button Pressed for Player: " + playerName);
        }
    }


    private void handleDoneTradingAction() {
        System.out.println("Done Trading Button Pressed");
    }

}