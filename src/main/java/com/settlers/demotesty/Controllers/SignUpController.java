package com.settlers.demotesty.Controllers;

import com.settlers.demotesty.Fundimentals.Colour;
import com.settlers.demotesty.Fundimentals.Player;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class SignUpController  implements Initializable {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text PlayerColour;

    @FXML
    private ComboBox<Colour> PlayerColourDropDownList;

    @FXML
    private Text PlayerName;

    @FXML
    private TextField PlayerNameTextField;

    @FXML
    private Button submitButton;

    public Text PlayerNameWarning;
    public Text ColourPickWarning;
    public Text PlayerNameNotEntered;

     static ArrayList<Player> players = new ArrayList<>();


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        PlayerColourDropDownList.getItems().addAll(
                Colour.RED,
                Colour.BLUE,
                Colour.GREEN,
                Colour.YELLOW
        );
    }

@FXML
void submitBTN(MouseEvent event) throws IOException {
    System.out.println("Works Submit");
    String tempPlayerName = PlayerNameTextField.getText();
    Colour tempPlayerColour = PlayerColourDropDownList.getValue();
    if (tempPlayerName.trim().isEmpty()) {
        System.out.println("Please enter a player name");
        PlayerNameNotEntered.setVisible(true);
        return; // Exit the method if no player name is entered
    }
    // Check for duplicate player names
    for (Player player : players) {

        if (player.getPlayerName().equals(tempPlayerName)) {
            System.out.println("Player name already exists");
            PlayerNameWarning.setVisible(true);
            return; // Exit the method if duplicate name is found
        }
    }
    if (PlayerColourDropDownList.getSelectionModel().isEmpty()) {
        System.out.println("Please select a colour");
        ColourPickWarning.setVisible(true);
        return; // Exit the method if no colour is selected
    }else {
        players.add(new Player(tempPlayerName, tempPlayerColour));//TODO FIX this as it creates a
    }

    PlayerNameWarning.setVisible(false);
    ColourPickWarning.setVisible(false);
    PlayerNameNotEntered.setVisible(false);

    for (Player player : players) {
        System.out.println("Players in the Game: "+ player.getPlayerName() + " (" + player.getPlayerColour() + ")");
    }
    PlayerColourDropDownList.getItems().remove(tempPlayerColour);
    if (PlayerColourDropDownList.getItems().isEmpty()){
        FXMLLoader loader = new FXMLLoader(SignUpController.class.getResource("/com/settlers/demotesty/test.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) submitButton.getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
    }
}

    @FXML
    void initialize() {
        assert PlayerColour != null : "fx:id=\"PlayerColour\" was not injected: check your FXML file 'signuppagecatan (1).fxml'.";
        assert PlayerColourDropDownList != null : "fx:id=\"PlayerColourDropDwonList\" was not injected: check your FXML file 'signuppagecatan (1).fxml'.";
        assert PlayerName != null : "fx:id=\"PlayerName\" was not injected: check your FXML file 'signuppagecatan (1).fxml'.";
        assert PlayerNameTextField != null : "fx:id=\"PlayerNameTextField\" was not injected: check your FXML file 'signuppagecatan (1).fxml'.";
        assert submitButton != null : "fx:id=\"submitButton\" was not injected: check your FXML file 'signuppagecatan (1).fxml'.";

    }

    public static ArrayList<Player> getPlayersList(){
        return players;
    }
//    public void getPlayersNames(){
//        for (int i = 0; i < players.size(); i++) {
//            players.get(i);
//        }
//    }
}