package com.settlers.demotesty.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.HashMap;
import java.util.ResourceBundle;

import com.settlers.demotesty.Fundimentals.Player;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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

    @FXML
    void initialize() {
        updatePlayerNames();

        AcceptBTN1.setOnAction(event -> handleAcceptButtonAction(AcceptBTN1));
        AcceptBTN2.setOnAction(event -> handleAcceptButtonAction(AcceptBTN2));
        AcceptBTN3.setOnAction(event -> handleAcceptButtonAction(AcceptBTN3));

        RejectBTN1.setOnAction(event -> handleRejectButtonAction(RejectBTN1));
        RejectBTN2.setOnAction(event -> handleRejectButtonAction(RejectBTN2));
        RejectBTN3.setOnAction(event -> handleRejectButtonAction(RejectBTN3));

        DoneTrading.setOnAction(event -> handleDoneTradingAction());
    }

    public void createRequestedImages(HashMap<ImageView, Player> requestedImages) {
        for (ImageView image : requestedImages.keySet()) {
            requestFlowPane.getChildren().add(image);
        }
    }

    public void createOfferedImages(HashMap<ImageView, Player> offeredImages) {
        for (ImageView image : offeredImages.keySet()) {
            offerFlowPane.getChildren().add(image);
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

    private void handleAcceptButtonAction(Button sourceButton) {
        if (sourceButton == AcceptBTN1) {
            System.out.println("Accept Button 1 Pressed");
        } else if (sourceButton == AcceptBTN2) {
            System.out.println("Accept Button 2 Pressed");
        } else if (sourceButton == AcceptBTN3) {
            System.out.println("Accept Button 3 Pressed");
        }
    }

    private void handleRejectButtonAction(Button sourceButton) {
        if (sourceButton == RejectBTN1) {
            System.out.println("Reject Button 1 Pressed");
        } else if (sourceButton == RejectBTN2) {
            System.out.println("Reject Button 2 Pressed");
        } else if (sourceButton == RejectBTN3) {
            System.out.println("Reject Button 3 Pressed");
        }
    }

    private void handleDoneTradingAction() {
        System.out.println("Done Trading Button Pressed");
    }

}