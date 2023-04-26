package com.settlers.demotesty.Controllers;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;

public class TradeACCREQ extends TradeController{
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button AcceptBTN1;

    @FXML
    private Button AcceptBTN2;

    @FXML
    private Button AcceptBTN3;

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
    private Pane main;

    @FXML
    private FlowPane offerFlowPane;

    @FXML
    private FlowPane requestFlowPane;



    //Pass a requestedImages ArrayList from TradeController to here
    public void createRequestedImages(ArrayList<ImageView> requestedImages) {
        System.out.println(requestedImages);
        for (ImageView image : requestedImages) {
            requestFlowPane.getChildren().add(image);        }
    }
    public void createOfferedImages(ArrayList<ImageView> offeredImages) {
        System.out.println(requestedImages);
        for (ImageView image : offeredImages) {
            offerFlowPane.getChildren().add(image);        }
    }

    public void createOfferImages(HashMap<ImageView, String> imageResourceTypeOffer) {
        for (Map.Entry<ImageView, String> entry : imageResourceTypeOffer.entrySet()) {
            ImageView image = entry.getKey();
            String value = entry.getValue();
//            ImageView image = new ImageView(key);

            offerFlowPane.getChildren().add(image);
        }
    }


    @FXML
    void initialize() {
        assert AcceptBTN1 != null : "fx:id=\"AcceptBTN1\" was not injected: check your FXML file 'ACCREJTrade.fxml'.";
        assert AcceptBTN2 != null : "fx:id=\"AcceptBTN2\" was not injected: check your FXML file 'ACCREJTrade.fxml'.";
        assert AcceptBTN3 != null : "fx:id=\"AcceptBTN3\" was not injected: check your FXML file 'ACCREJTrade.fxml'.";
        assert RejectBTN1 != null : "fx:id=\"RejectBTN1\" was not injected: check your FXML file 'ACCREJTrade.fxml'.";
        assert RejectBTN2 != null : "fx:id=\"RejectBTN2\" was not injected: check your FXML file 'ACCREJTrade.fxml'.";
        assert RejectBTN3 != null : "fx:id=\"RejectBTN3\" was not injected: check your FXML file 'ACCREJTrade.fxml'.";
        assert labelOne != null : "fx:id=\"labelOne\" was not injected: check your FXML file 'ACCREJTrade.fxml'.";
        assert labelThree != null : "fx:id=\"labelThree\" was not injected: check your FXML file 'ACCREJTrade.fxml'.";
        assert labelTwo != null : "fx:id=\"labelTwo\" was not injected: check your FXML file 'ACCREJTrade.fxml'.";
        assert main != null : "fx:id=\"main\" was not injected: check your FXML file 'ACCREJTrade.fxml'.";
        assert offerFlowPane != null : "fx:id=\"offerFlowPane\" was not injected: check your FXML file 'ACCREJTrade.fxml'.";
        assert requestFlowPane != null : "fx:id=\"requestFlowPane\" was not injected: check your FXML file 'ACCREJTrade.fxml'.";
        createRequestedImages(requestedImages);
        createOfferedImages(offeredImages);


    }


}

