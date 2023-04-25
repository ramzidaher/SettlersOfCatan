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

public class SignUpController implements Initializable {

    public Button Human_BTN;
    public Button AI_BTN;
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
    void addPlayerHuman(MouseEvent event) throws IOException {
        System.out.println("addPlayerHuman called");

        addPlayer(false);
    }

    @FXML
    void addPlayerAI(MouseEvent event) throws IOException {
        System.out.println("addPlayerAI called");

        addPlayer(true);
    }

    private void addPlayer(boolean isAI) throws IOException {
        System.out.println("Works Submit");
        String tempPlayerName = PlayerNameTextField.getText();
        Colour tempPlayerColour = PlayerColourDropDownList.getValue();

        if (!isAI && tempPlayerName.trim().isEmpty()) {
            System.out.println("Please enter a player name");
            PlayerNameNotEntered.setVisible(true);
            return;
        }

        if (isAI) {
            tempPlayerName += " (AI)";
        }

        for (Player player : players) {
            if (player.getPlayerName().equals(tempPlayerName)) {
                System.out.println("Player name already exists");
                PlayerNameWarning.setVisible(true);
                return;
            }
        }

        if (PlayerColourDropDownList.getSelectionModel().isEmpty()) {
            System.out.println("Please select a colour");
            ColourPickWarning.setVisible(true);
            return;
        } else {
            Player newPlayer = new Player(tempPlayerName, tempPlayerColour);
            newPlayer.setAi(isAI);
            players.add(newPlayer);
        }

        PlayerNameWarning.setVisible(false);
        ColourPickWarning.setVisible(false);
        PlayerNameNotEntered.setVisible(false);
        PlayerNameTextField.setText(""); // Resets the Text field to empty, regardless of player type (human or AI)

//        if (!isAI) {
//            PlayerNameTextField.setText("");
//        }
        for (Player player : players) {
            System.out.println("Players in the Game: " + player.getPlayerName() + " (" + player.getPlayerColour() + ")");
        }
        PlayerColourDropDownList.getItems().remove(tempPlayerColour);
    }

    public void submitBTN(MouseEvent event) throws IOException {
        if (players.size() == 4) {
            FXMLLoader loader = new FXMLLoader(SignUpController.class.getResource("/com/settlers/demotesty/test.fxml"));
            Parent root = loader.load();
            Stage stage = (Stage) submitButton.getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            System.out.println("submitBTN called");

            System.out.println(players.size());
        }
    }
    public static ArrayList<Player> getPlayers() {
        return players;
    }

}