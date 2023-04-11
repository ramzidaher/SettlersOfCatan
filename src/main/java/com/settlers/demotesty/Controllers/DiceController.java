package com.settlers.demotesty.Controllers;

import javafx.scene.image.Image;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DiceController {
    private List<Image> diceImages_1 = new ArrayList<>();
    private List<Image> diceImages_2 = new ArrayList<>();
    private Rectangle dice1;
    private Rectangle dice2;
    private Text DiceOutCome;

    public DiceController(Rectangle dice1, Rectangle dice2, Text diceOutCome) {
        this.dice1 = dice1;
        this.dice2 = dice2;
        this.DiceOutCome = diceOutCome;
        diceRoll();
    }

    private void diceRoll() {
        //DiceImages 1
        diceImages_1.addAll(Arrays.asList(
                new Image("Images for the game/Dice/Dice1/Dice-One-removebg-preview.png"),
                new Image("Images for the game/Dice/Dice1/Dice-Two-removebg-preview.png"),
                new Image("Images for the game/Dice/Dice1/dice-Three-removebg-preview.png"),
                new Image("Images for the game/Dice/Dice1/Dice-Four-removebg-preview.png"),
                new Image("Images for the game/Dice/Dice1/Dice-Five-removebg-preview.png"),
                new Image("Images for the game/Dice/Dice1/Dice-Six-removebg-preview.png")
        ));
        //DiceImages 2
        diceImages_2.addAll(Arrays.asList(
                new Image("Images for the game/Dice/Dice2/Dice-One-removebg-preview-Yellow.png"),
                new Image("Images for the game/Dice/Dice2/Dice-Two-removebg-preview-Yellow.png"),
                new Image("Images for the game/Dice/Dice2/Dice-Three-removebg-preview-Yellow.png"),
                new Image("Images for the game/Dice/Dice2/Dice-Four-removebg-preview-Yellow.png"),
                new Image("Images for the game/Dice/Dice2/dice-Five-removebg-preview-Yellow.png"),
                new Image("Images for the game/Dice/Dice2/Dice-Six-removebg-preview-Yellow.png")
        ));
        dice1.setFill(new ImagePattern(diceImages_1.get(0)));
        dice2.setFill(new ImagePattern(diceImages_2.get(0)));
        DiceOutCome.setVisible(false);
    }

    public int roll() {
        Random randomImage = new Random();
        int diceOne = randomImage.nextInt(0, 6);
        int diceTwo = randomImage.nextInt(0, 6);
        dice1.setFill(new ImagePattern(diceImages_1.get(diceOne)));
        dice2.setFill(new ImagePattern(diceImages_2.get(diceTwo)));
        DiceOutCome.setVisible(true);
        int result = diceOne + diceTwo + 2; // Add 2 because array indexes start at 0
        String diceOutcomeSTR = String.valueOf(result);
        System.out.println("The result is: " + result);
        DiceOutCome.setText("Dice OutCome: " + diceOutcomeSTR);
        return result;
    }
}
