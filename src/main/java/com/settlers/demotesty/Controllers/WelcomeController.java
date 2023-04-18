package com.settlers.demotesty.Controllers;

import com.settlers.demotesty.Main;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class WelcomeController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView Welcome;

    @FXML
    private Button startBTN;


    void initialize() {
        assert Welcome != null : "fx:id=\"Welcome\" was not injected: check your FXML file 'Welcome.fxml'.";
        assert startBTN != null : "fx:id=\"startBTN\" was not injected: check your FXML file 'Welcome.fxml'.";

    }

}
