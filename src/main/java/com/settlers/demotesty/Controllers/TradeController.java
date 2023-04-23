package com.settlers.demotesty.Controllers;

import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.ResourceBundle;

import com.settlers.demotesty.Fundimentals.Player;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
public class TradeController{

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text OfferBrickCounter;

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
    private ImageView b1;

    @FXML
    private ImageView b2;

    @FXML
    private ImageView g1;

    @FXML
    private ImageView g2;

    @FXML
    private Pane main;

    @FXML
    private ImageView o1;

    @FXML
    private ImageView o2;

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
    private Label requestMessage;

    @FXML
    private Label requestMessage1;

    @FXML
    private ImageView w1;

    @FXML
    private ImageView w2;

    @FXML
    private ImageView wl1;

    @FXML
    private ImageView wl2;


    @FXML
    void Reset(MouseEvent event) {

    }
    ArrayList<Player> players = SignUpController.getPlayers();
    private ArrayList<ImageView> OfferImages = new ArrayList<>();
    private ArrayList<ImageView> ResourceOfferImages = new ArrayList<>();



//    @FXML
//    void TradeRequest(MouseEvent event) {
//        System.out.println(players.get(0).getResources().get("Brick"));
//    }

    @FXML
    void initialize() {
        assert OfferBrickCounter != null : "fx:id=\"OfferBrickCounter\" was not injected: check your FXML file 'tradeNew.fxml'.";
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
        assert b1 != null : "fx:id=\"b1\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert b2 != null : "fx:id=\"b2\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert g1 != null : "fx:id=\"g1\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert g2 != null : "fx:id=\"g2\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert main != null : "fx:id=\"main\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert o1 != null : "fx:id=\"o1\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert o2 != null : "fx:id=\"o2\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert offerImage1 != null : "fx:id=\"offerImage1\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert offerImage2 != null : "fx:id=\"offerImage2\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert offerImage3 != null : "fx:id=\"offerImage3\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert offerImage4 != null : "fx:id=\"offerImage4\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert offerImage5 != null : "fx:id=\"offerImage5\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert requestMessage != null : "fx:id=\"requestMessage\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert requestMessage1 != null : "fx:id=\"requestMessage1\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert w1 != null : "fx:id=\"w1\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert w2 != null : "fx:id=\"w2\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert wl1 != null : "fx:id=\"wl1\" was not injected: check your FXML file 'tradeNew.fxml'.";
        assert wl2 != null : "fx:id=\"wl2\" was not injected: check your FXML file 'tradeNew.fxml'.";

        //////////////////////////////
        OfferBrickCounter.setText(String.valueOf(players.get(Board.getCurrentPlayerIndex()).getResources().get("brick")));
        OfferGrainCounter.setText(String.valueOf(players.get(Board.getCurrentPlayerIndex()).getResources().get("grain")));
        OfferOreCounter.setText(String.valueOf(players.get(Board.getCurrentPlayerIndex()).getResources().get("ore")));
        OfferWoodCounter.setText(String.valueOf(players.get(Board.getCurrentPlayerIndex()).getResources().get("wood")));
        OfferWoolCounter.setText(String.valueOf(players.get(Board.getCurrentPlayerIndex()).getResources().get("wool")));

        OfferImages.add(offerImage1);
        OfferImages.add(offerImage2);
        OfferImages.add(offerImage3);
        OfferImages.add(offerImage4);
        OfferImages.add(offerImage5);
        for (ImageView idk:OfferImages){
            idk.setVisible(false);
        }
        setupResourceOfferImages();

//        ResourceOfferImages.add(b1);
//        ResourceOfferImages.add(g1);
//        ResourceOfferImages.add(w1);
//        ResourceOfferImages.add(o1);
//        ResourceOfferImages.add(wl1);




    }





    private void setupResourceOfferImages() {
        ArrayList<ImageView> ResourceOfferImages = new ArrayList<>();
        HashMap<ImageView, Integer> imageClickCount = new HashMap<>();

        ResourceOfferImages.add(b1);
        ResourceOfferImages.add(g1);
        ResourceOfferImages.add(w1);
        ResourceOfferImages.add(o1);
        ResourceOfferImages.add(wl1);

        EventHandler<MouseEvent> imageViewClickHandler = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (event.getButton() == MouseButton.PRIMARY) {
                    ImageView clickedImageView = (ImageView) event.getSource();
                    System.out.println("ImageView clicked: " + clickedImageView.getId());

                    // Increment the click count for the clicked image
                    imageClickCount.put(clickedImageView, imageClickCount.getOrDefault(clickedImageView, 0) + 1);

                    // Replace the appropriate offerImage depending on the click count
                    int clickCount = imageClickCount.get(clickedImageView);
                    switch (clickedImageView.getId()) {
                        case "b1":
                            if (clickCount <= OfferImages.size()) {
                                ImageView offerImage = OfferImages.get(clickCount - 1);
                                offerImage.setImage(clickedImageView.getImage());
                                offerImage.setVisible(true);
                            }
                            break;
                        case "g1":
                            if (clickCount <= OfferImages.size()) {
                                ImageView offerImage = OfferImages.get(clickCount - 1);
                                offerImage.setImage(clickedImageView.getImage());
                                offerImage.setVisible(true);
                            }
                            break;
                        case "w1":
                            if (clickCount <= OfferImages.size()) {
                                ImageView offerImage = OfferImages.get(clickCount - 1);
                                offerImage.setImage(clickedImageView.getImage());
                                offerImage.setVisible(true);
                            }
                            break;
                        case "o1":
                            if (clickCount <= OfferImages.size()) {
                                ImageView offerImage = OfferImages.get(clickCount - 1);
                                offerImage.setImage(clickedImageView.getImage());
                                offerImage.setVisible(true);
                            }
                            break;
                        case "wl1":
                            if (clickCount <= OfferImages.size()) {
                                ImageView offerImage = OfferImages.get(clickCount - 1);
                                offerImage.setImage(clickedImageView.getImage());
                                offerImage.setVisible(true);
                            }
                            break;
                    }
                }
            }
        };

        for (ImageView imageView : ResourceOfferImages) {
            imageView.addEventHandler(MouseEvent.MOUSE_CLICKED, imageViewClickHandler);
        }
    }

    public void TradeRequest(MouseEvent event) {
        System.out.println(Board.getCurrentPlayerIndex());
        ArrayList<Player> players = SignUpController.getPlayers();
        for (Player player : players) {
            System.out.println(player.getPlayerName());
        }
    }



}
