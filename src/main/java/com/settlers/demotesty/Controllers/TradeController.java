package com.settlers.demotesty.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.*;

import com.settlers.demotesty.Fundimentals.Player;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class TradeController {
    public Button DoneTrading;
    public FlowPane RequestFlowPane;
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text OfferBrickCounter;

    @FXML
    private FlowPane OfferFlowPane;

    @FXML
    private Text OfferGrainCounter;

    @FXML
    private Text OfferOreCounter;

    @FXML
    private Text OfferWoodCounter;

    @FXML
    private Text OfferWoolCounter;

    @FXML
    private ImageView RequestImage1;

    @FXML
    private ImageView RequestImage2;

    @FXML
    private ImageView RequestImage3;

    @FXML
    private ImageView RequestImage4;

    @FXML
    private ImageView RequestImage5;

    @FXML
    private Button ResetBTN;

    @FXML
    private Button TradeBTN;

    @FXML
    private ImageView brick;

    @FXML
    private ImageView brick1;

    @FXML
    private FlowPane flowpane1;

    @FXML
    private ImageView grain;

    @FXML
    private ImageView grain1;

    @FXML
    private Pane main;

    @FXML
    private ImageView offerImage1;

    @FXML
    private ImageView offerImage2;

    @FXML
    private ImageView offerImage3;

    @FXML
    private ImageView offerImage4;

    @FXML
    private ImageView offerImage5;

    @FXML
    private ImageView ore;

    @FXML
    private ImageView ore1;

    @FXML
    private Label requestMessage;

    @FXML
    private Label requestMessage1;

    @FXML
    private ImageView wood;

    @FXML
    private ImageView wood1;

    @FXML
    private ImageView wool;

    @FXML
    private ImageView wool1;

    @FXML
    private Button AcceptBTN1;

    @FXML
    private Button AcceptBTN2;

    @FXML
    private Button AcceptBTN3;

    @FXML
    private Text PlayerFourName;

    @FXML
    private Text PlayerThreeName;

    @FXML
    private Text PlayerTwoName;

    @FXML
    private Button RejectBTN1;

    @FXML
    private Button RejectBTN2;

    @FXML
    private Button RejectBTN3;

    @FXML
    private Label labelOne;

    @FXML
    private Label labelThree;

    @FXML
    private Label labelTwo;


    @FXML
    private FlowPane offerFlowPane;

    @FXML
    private FlowPane requestFlowPane;

    static HashMap<ImageView, String> imageResourceTypeOffer = new HashMap<>();
    HashMap<ImageView, String> imageResourceTypeRequest = new HashMap<>();


    @FXML
    void Reset(MouseEvent event) {
        returnResourcesToPlayer();
        resetOfferImages();
        updateOfferImages();
    }

    private void returnResourcesToPlayer() {
        Player currentPlayer = players.get(Board.getCurrentPlayerIndex());
        HashMap<String, Integer> resources = currentPlayer.getResources();

        for (ImageView offerImage : OfferImages) {
            if (offerImage.isVisible() && offerImage.getImage() != null) {
                String resourceType = getResourceTypeFromImage(offerImage.getImage());
                if (resourceType != null) {
                    resources.put(resourceType, resources.get(resourceType) + 1);
                }
            }
        }
    }

    private String getResourceTypeFromImage(Image image) {
        if (image == null) return null;

        for (Map.Entry<ImageView, String> entry : imageResourceTypeOffer.entrySet()) {
            if (entry.getKey().getImage().equals(image)) {
                return entry.getValue();
            }
        }
        return null;
    }

    ArrayList<Player> players = SignUpController.getPlayers();
    private ArrayList<ImageView> OfferImages = new ArrayList<>();
    private ArrayList<ImageView> RequestImage = new ArrayList<>();
    private ArrayList<ImageView> ResourceOfferImages = new ArrayList<>();
    HashMap<ImageView, String> imageRequestType = new HashMap<>();

    private ArrayList<ImageView> RequestImages = new ArrayList<>();
    ArrayList<ImageView> ResourceRequestImages = new ArrayList<>();
    //change the requestedImages and offeredImages to HashMap with Player as key and ArrayList<ImageView> as value


    static HashMap<ImageView, Player> requestedImages = new HashMap<>();
    static HashMap<ImageView, Player> offeredImages = new HashMap<>();

    private void resetOfferImages() {
        for (ImageView offerImage : OfferImages) {
            offerImage.setVisible(false);
            offerImage.setImage(null);
        }
    }

    @FXML
    void initialize() {
        updateOfferImages();
//        updatePlayerNames();
        //////////////////////////////


//        OfferImages.add(offerImage1);
//        OfferImages.add(offerImage2);
//        OfferImages.add(offerImage3);
//        OfferImages.add(offerImage4);
//        OfferImages.add(offerImage5);
////        for (ImageView idk : OfferImages) {
////            idk.setVisible(false);
////        }
//        setupResourceOfferImages();
//        RequestImage.add(RequestImage1);
//        RequestImage.add(RequestImage2);
//        RequestImage.add(RequestImage3);
//        RequestImage.add(RequestImage4);
//        RequestImage.add(RequestImage5);
//        for (ImageView test : RequestImage) {
//            test.setVisible(false);
//        }
        setupResourceRequestImages();
        setupResourceOfferImages();
        ResourceRequestImages.add(brick1);
        ResourceRequestImages.add(grain1);
        ResourceRequestImages.add(wood1);
        ResourceRequestImages.add(ore1);
        ResourceRequestImages.add(wool1);
    }






    private void updateOfferImages() {
        OfferBrickCounter.setText(String.valueOf(players.get(Board.getCurrentPlayerIndex()).getResources().get("brick")));
        OfferGrainCounter.setText(String.valueOf(players.get(Board.getCurrentPlayerIndex()).getResources().get("grain")));
        OfferOreCounter.setText(String.valueOf(players.get(Board.getCurrentPlayerIndex()).getResources().get("ore")));
        OfferWoodCounter.setText(String.valueOf(players.get(Board.getCurrentPlayerIndex()).getResources().get("wood")));
        OfferWoolCounter.setText(String.valueOf(players.get(Board.getCurrentPlayerIndex()).getResources().get("wool")));
    }

    private void setupResourceRequestImages() {
        ArrayList<ImageView> ResourceRequestImages = new ArrayList<>();

        ResourceRequestImages.add(brick1);
        ResourceRequestImages.add(grain1);
        ResourceRequestImages.add(wood1);
        ResourceRequestImages.add(ore1);
        ResourceRequestImages.add(wool1);

        imageResourceTypeRequest.put(brick1, "brick");
        imageResourceTypeRequest.put(grain1, "grain");
        imageResourceTypeRequest.put(wood1, "wood");
        imageResourceTypeRequest.put(ore1, "ore");
        imageResourceTypeRequest.put(wool1, "wool");

        EventHandler<MouseEvent> imageViewClickHandler1 = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (event.getButton() == MouseButton.PRIMARY) {
                    ImageView clickedImageView = (ImageView) event.getSource();
                    System.out.println("ImageView clicked: " + clickedImageView.getId());

                    String resourceType = imageResourceTypeRequest.get(clickedImageView);
                    if (resourceType == null) {
                        System.out.println("No resource type found for clicked image view");
                        return;
                    }

                    Player currentPlayer = players.get(Board.getCurrentPlayerIndex());

//                    if (currentPlayer.getResources().get(resourceType) > 0) {
                    ImageView nextAvailableRequestImage = createAndAddRequestImage(resourceType);
                    nextAvailableRequestImage.setImage(clickedImageView.getImage());
                    nextAvailableRequestImage.setVisible(true);
                    requestedImages.put(nextAvailableRequestImage,currentPlayer);
                    updateOfferImages();

                }
            }
        };

        for (ImageView imageView : ResourceRequestImages) { // Change this line
            imageView.addEventHandler(MouseEvent.MOUSE_CLICKED, imageViewClickHandler1);
        }
    }
    private ImageView createAndAddRequestImage(String resourceType) {
        ImageView newRequestImage = new ImageView();
        newRequestImage.setFitWidth(30);
        newRequestImage.setFitHeight(45);
        newRequestImage.setId(resourceType); // Add resourceType to the ID
        RequestFlowPane.getChildren().add(newRequestImage);
        return newRequestImage;
    }


    public static HashMap<ImageView, Player> getRequestedImages() {
        return requestedImages;
    }

    public static void setRequestedImages(HashMap<ImageView, Player> requestedImages) {
        TradeController.requestedImages = requestedImages;
    }

    public static HashMap<ImageView, Player> getOfferedImages() {
        return offeredImages;
    }

    public static void setOfferedImages(HashMap<ImageView, Player> offeredImages) {
        TradeController.offeredImages = offeredImages;
    }

    private void setupResourceOfferImages() {
        ArrayList<ImageView> ResourceOfferImages = new ArrayList<>();

        ResourceOfferImages.add(brick);
        ResourceOfferImages.add(grain);
        ResourceOfferImages.add(wood);
        ResourceOfferImages.add(ore);
        ResourceOfferImages.add(wool);

        imageResourceTypeOffer.put(brick, "brick");
        imageResourceTypeOffer.put(grain, "grain");
        imageResourceTypeOffer.put(wood, "wood");
        imageResourceTypeOffer.put(ore, "ore");
        imageResourceTypeOffer.put(wool, "wool");

        EventHandler<MouseEvent> imageViewClickHandler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (event.getButton() == MouseButton.PRIMARY) {
                    ImageView clickedImageView = (ImageView) event.getSource();
                    System.out.println("ImageView clicked: " + clickedImageView.getId());

                    String resourceType = imageResourceTypeOffer.get(clickedImageView);
                    Player currentPlayer = players.get(Board.getCurrentPlayerIndex());

                    if (currentPlayer.getResources().get(resourceType) > 0) {
                        ImageView nextAvailableOfferImage = createAndAddOfferImage(resourceType);
                        if (nextAvailableOfferImage != null) {
                            nextAvailableOfferImage.setImage(clickedImageView.getImage());
                            nextAvailableOfferImage.setVisible(true);
                            offeredImages.put(nextAvailableOfferImage,currentPlayer);
//                            currentPlayer.getResources().put(resourceType, currentPlayer.getResources().get(resourceType) - 1);
                        }
                        updateOfferImages();
                    } else {
                        System.out.println("Player does not have enough resources of type: " + resourceType);
                    }
                }
            }
        };

        for (ImageView imageView : ResourceOfferImages) {
            imageView.addEventHandler(MouseEvent.MOUSE_CLICKED, imageViewClickHandler);
        }
    }

    private ImageView createAndAddOfferImage(String resourceType) {
        ImageView newOfferImage = new ImageView();
        newOfferImage.setFitWidth(30);
        newOfferImage.setFitHeight(45);
        newOfferImage.setId(resourceType); // Add resourceType to the ID
        OfferFlowPane.getChildren().add(newOfferImage);
        return newOfferImage;
    }





    public void TradeRequest(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(WelcomeController.class.getResource("/com/settlers/demotesty/ACCREJTrade.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);
        TradeACCREQ tradeController = loader.getController();

        Stage newStage = new Stage();
        newStage.setScene(scene);
        newStage.initModality(Modality.APPLICATION_MODAL); // set modality to block input events to other windows

        // Pass newStage to the showTradeACCREQWindow method
        tradeController.showTradeACCREQWindow(newStage, requestedImages, offeredImages);
        tradeController.setCurrentPlayer(players.get(Board.getCurrentPlayerIndex()));
        newStage.show();
        ArrayList<Player> players = SignUpController.getPlayers();
        for (Player player : players) {
            System.out.println(player.getPlayerName());
        }

        // Close the current window
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.close();
    }











}