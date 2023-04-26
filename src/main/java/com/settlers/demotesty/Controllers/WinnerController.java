package com.settlers.demotesty.Controllers;

import javafx.animation.FadeTransition;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;

public class WinnerController{
    public ImageView Welcome;
    public Button startBTN;
    public Text winnerText;
    public Button QuitBTN;
    public DropShadow dropShadow;
    public void initialize() {
        FadeTransition fadeInOutAnimation = new FadeTransition(Duration.seconds(2), winnerText);
        fadeInOutAnimation.setFromValue(0.0);
        fadeInOutAnimation.setToValue(1.0);
        fadeInOutAnimation.setCycleCount(15);
        fadeInOutAnimation.setAutoReverse(true);
        fadeInOutAnimation.play();
        winnerText.setText(Board.getGameWinner().getPlayerName() + " Won the Game with " + Board.getGameWinner().getVP() + " Victory Points");
    }

    public void Quit(MouseEvent event) {
        Stage stage = (Stage) QuitBTN.getScene().getWindow();
        stage.close();
    }

//    public void Quit(MouseEvent event) {
//    }
}
