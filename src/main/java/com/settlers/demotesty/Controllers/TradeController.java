package com.settlers.demotesty.Controllers;

import java.io.IOException;
import java.net.URL;
import java.util.*;

import com.settlers.demotesty.Fundimentals.Player;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
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

public class TradeController{


    public FlowPane flowpane1;
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
    private Text RequestBrickCounter;

    @FXML
    private Text RequestGrainCounter;

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
    private Text RequestOreCounter;

    @FXML
    private Text RequestWoodCounter;

    @FXML
    private Text RequestWoolCounter;

    @FXML
    private Button ResetBTN;

    @FXML
    private Button TradeBTN;

    @FXML
    private ImageView brick;

    @FXML
    private ImageView brick1;

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

    static ArrayList<ImageView> requestedImages = new ArrayList<>();
    static ArrayList<ImageView> offeredImages = new ArrayList<>();
    private void resetOfferImages() {
        for (ImageView offerImage : OfferImages) {
            offerImage.setVisible(false);
            offerImage.setImage(null);
        }
    }

    @FXML
    void initialize() {
        assert OfferBrickCounter != null : "fx:id=\"OfferBrickCounter\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert OfferFlowPane != null : "fx:id=\"OfferFlowPane\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert OfferGrainCounter != null : "fx:id=\"OfferGrainCounter\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert OfferOreCounter != null : "fx:id=\"OfferOreCounter\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert OfferWoodCounter != null : "fx:id=\"OfferWoodCounter\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert OfferWoolCounter != null : "fx:id=\"OfferWoolCounter\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert RequestBrickCounter != null : "fx:id=\"RequestBrickCounter\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert RequestGrainCounter != null : "fx:id=\"RequestGrainCounter\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert RequestImage1 != null : "fx:id=\"RequestImage1\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert RequestImage2 != null : "fx:id=\"RequestImage2\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert RequestImage3 != null : "fx:id=\"RequestImage3\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert RequestImage4 != null : "fx:id=\"RequestImage4\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert RequestImage5 != null : "fx:id=\"RequestImage5\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert RequestOreCounter != null : "fx:id=\"RequestOreCounter\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert RequestWoodCounter != null : "fx:id=\"RequestWoodCounter\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert RequestWoolCounter != null : "fx:id=\"RequestWoolCounter\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert ResetBTN != null : "fx:id=\"ResetBTN\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert TradeBTN != null : "fx:id=\"TradeBTN\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert brick != null : "fx:id=\"brick\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert brick1 != null : "fx:id=\"brick1\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert grain != null : "fx:id=\"grain\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert grain1 != null : "fx:id=\"grain1\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert main != null : "fx:id=\"main\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert offerImage1 != null : "fx:id=\"offerImage1\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert offerImage2 != null : "fx:id=\"offerImage2\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert offerImage3 != null : "fx:id=\"offerImage3\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert offerImage4 != null : "fx:id=\"offerImage4\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert offerImage5 != null : "fx:id=\"offerImage5\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert ore != null : "fx:id=\"ore\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert ore1 != null : "fx:id=\"ore1\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert requestMessage != null : "fx:id=\"requestMessage\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert requestMessage1 != null : "fx:id=\"requestMessage1\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert wood != null : "fx:id=\"wood\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert wood1 != null : "fx:id=\"wood1\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert wool != null : "fx:id=\"wool\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert wool1 != null : "fx:id=\"wool1\" was not injected: check your FXML file 'tradeNew.fxml'.";

        updateOfferImages();

        //////////////////////////////


        OfferImages.add(offerImage1);
        OfferImages.add(offerImage2);
        OfferImages.add(offerImage3);
        OfferImages.add(offerImage4);
        OfferImages.add(offerImage5);
        for (ImageView idk : OfferImages) {
            idk.setVisible(false);
        }
        setupResourceOfferImages();
        RequestImage.add(RequestImage1);
        RequestImage.add(RequestImage2);
        RequestImage.add(RequestImage3);
        RequestImage.add(RequestImage4);
        RequestImage.add(RequestImage5);
        for (ImageView test : RequestImage) {
            test.setVisible(false);
        }
        setupResourceRequestImages();

    }


    private void updateOfferImages() {
        OfferBrickCounter.setText(String.valueOf(players.get(Board.getCurrentPlayerIndex()).getResources().get("brick")));
        OfferGrainCounter.setText(String.valueOf(players.get(Board.getCurrentPlayerIndex()).getResources().get("grain")));
        OfferOreCounter.setText(String.valueOf(players.get(Board.getCurrentPlayerIndex()).getResources().get("ore")));
        OfferWoodCounter.setText(String.valueOf(players.get(Board.getCurrentPlayerIndex()).getResources().get("wood")));
        OfferWoolCounter.setText(String.valueOf(players.get(Board.getCurrentPlayerIndex()).getResources().get("wool")));
    }

    private void setupResourceRequestImages() {
        ArrayList<ImageView> ResourceOfferImages = new ArrayList<>();

        ResourceOfferImages.add(brick1);
        ResourceOfferImages.add(grain1);
        ResourceOfferImages.add(wood1);
        ResourceOfferImages.add(ore1);
        ResourceOfferImages.add(wool1);

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

                    String resourceType = imageResourceTypeOffer.get(clickedImageView);
                    Player currentPlayer = players.get(Board.getCurrentPlayerIndex());

//                    if (currentPlayer.getResources().get(resourceType) > 0) {
                    ImageView nextAvailableOfferImage = getNextAvailableRequestImage();
                    if (nextAvailableOfferImage != null) {
                        nextAvailableOfferImage.setImage(clickedImageView.getImage());
                        nextAvailableOfferImage.setVisible(true);
                        requestedImages.add(nextAvailableOfferImage);
//                        addRequestedImage(nextAvailableOfferImage);

//                            currentPlayer.getResources().put(resourceType, currentPlayer.getResources().get(resourceType) - 1);
                    }
                    updateOfferImages();
                } else {
                    System.out.println("Player does not have enough resources of type: ");
                }
            }

        };

        for (ImageView imageView : ResourceOfferImages) {
            imageView.addEventHandler(MouseEvent.MOUSE_CLICKED, imageViewClickHandler1);
        }
    }
    public void addRequestedImage(ImageView imageView) {
        requestedImages.add(imageView);
    }

    // Add a method to add an offered image
    public void addOfferedImage(ImageView imageView) {
        offeredImages.add(imageView);
    }

    // Add a method to get the requested images list
    public ArrayList<ImageView> getRequestedImages() {
        return requestedImages;
    }

    // Add a method to get the offered images list
    public ArrayList<ImageView> getOfferedImages() {
        return offeredImages;
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
                        ImageView nextAvailableOfferImage = getNextAvailableOfferImage();
                        if (nextAvailableOfferImage != null) {
                            nextAvailableOfferImage.setImage(clickedImageView.getImage());
                            nextAvailableOfferImage.setVisible(true);
                            addOfferedImage(nextAvailableOfferImage);
                            currentPlayer.getResources().put(resourceType, currentPlayer.getResources().get(resourceType) - 1);
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

// TradeController.java

    // Add these methods to the TradeController class
//    public List<ImageView> getRequestedImages() {
//        return requestedImages;
//    }
//
//    public List<ImageView> getOfferedImages() {
//        return offeredImages;
//    }

    private ImageView getNextAvailableOfferImage() {
        for (ImageView offerImage : OfferImages) {
            if (!offerImage.isVisible()) {
                return offerImage;
            }
        }
        return null;
    }

    private ImageView getNextAvailableRequestImage() {
        for (ImageView offerImage : RequestImage) {
            if (!offerImage.isVisible()) {
                return offerImage;
            }
        }
        return null;
    }

    public void TradeRequest(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(WelcomeController.class.getResource("/com/settlers/demotesty/ACCREJTrade.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        Stage newStage = new Stage();
        newStage.setScene(scene);
        newStage.initModality(Modality.APPLICATION_MODAL); // set modality to block input events to other windows
        newStage.show();
        System.out.println(Board.getCurrentPlayerIndex());
        ArrayList<Player> players = SignUpController.getPlayers();
        for (Player player : players) {
            System.out.println(player.getPlayerName());
        }
    }


}
