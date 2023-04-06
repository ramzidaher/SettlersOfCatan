package com.settlers.demotesty.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import java.net.URL;
import java.util.*;


/**
 * This class represents the Board Controller which has the Board builder.
 * @version 1.0
 * @author Ramzi
 */
public class Board extends SignUpController  implements Initializable {

    public Rectangle Road_1_100;
    public Rectangle Road_1_101;
    public Text Num_1;
    public Text Num_2;
    public Text Num_3;
    public Text Num_4;
    public Text Num_5;
    public Text Num_6;
    public Text Num_7;
    public Text Num_8;
    public Text Num_9;
    public Text Num_10;
    public Text Num_11;
    public Text Num_12;
    public Text Num_13;
    public Text Num_14;
    public Text Num_15;
    public Text Num_16;
    public Text Num_17;
    public Text Num_18;
    public Text Num_19;
    public Group PlayerOneTagBox;
    public Group PlayerTwoTagBox;
    public Group PlayerThreeTagBox;
    public Group PlayerFoursTagBox;
    public Text GrainCardCOunter;
    public Text WoodCardCounter;
    public Text OreCardCounter;
    public Text WoolCardCounter;
    public Text BrickCardCounter;
    public Text ResourceCrdsPlayerName;
    public AnchorPane CardResources;
    //PLayers ID
    public Text PlayerOneID;
    public Text PlayerTwoID;
    public Text PlayerThreeID;
    public Text PlayerFourID;
    @FXML
    private Rectangle Road_1_10;

    @FXML
    private Rectangle Road_1_11;

    @FXML
    private Rectangle Road_1_12;

    @FXML
    private Rectangle Road_1_13;

    @FXML
    private Rectangle Road_1_14;

    @FXML
    private Rectangle Road_1_15;

    @FXML
    private Rectangle Road_1_16;

    @FXML
    private Rectangle Road_1_17;

    @FXML
    private Rectangle Road_1_18;

    @FXML
    private Rectangle Road_1_19;

    @FXML
    private Rectangle Road_1_2;

    @FXML
    private Rectangle Road_1_20;

    @FXML
    private Rectangle Road_1_21;

    @FXML
    private Rectangle Road_1_22;

    @FXML
    private Rectangle Road_1_23;

    @FXML
    private Rectangle Road_1_24;

    @FXML
    private Rectangle Road_1_25;

    @FXML
    private Rectangle Road_1_26;

    @FXML
    private Rectangle Road_1_27;

    @FXML
    private Rectangle Road_1_28;

    @FXML
    private Rectangle Road_1_29;

    @FXML
    private Rectangle Road_1_3;

    @FXML
    private Rectangle Road_1_30;

    @FXML
    private Rectangle Road_1_31;

    @FXML
    private Rectangle Road_1_32;

    @FXML
    private Rectangle Road_1_33;

    @FXML
    private Rectangle Road_1_34;

    @FXML
    private Rectangle Road_1_35;

    @FXML
    private Rectangle Road_1_36;

    @FXML
    private Rectangle Road_1_37;

    @FXML
    private Rectangle Road_1_38;

    @FXML
    private Rectangle Road_1_39;

    @FXML
    private Rectangle Road_1_40;

    @FXML
    private Rectangle Road_1_41;

    @FXML
    private Rectangle Road_1_42;

    @FXML
    private Rectangle Road_1_43;

    @FXML
    private Rectangle Road_1_44;

    @FXML
    private Rectangle Road_1_45;

    @FXML
    private Rectangle Road_1_46;

    @FXML
    private Rectangle Road_1_47;

    @FXML
    private Rectangle Road_1_48;

    @FXML
    private Rectangle Road_1_5;

    @FXML
    private Rectangle Road_1_50;

    @FXML
    private Rectangle Road_1_51;

    @FXML
    private Rectangle Road_1_52;

    @FXML
    private Rectangle Road_1_53;

    @FXML
    private Rectangle Road_1_54;

    @FXML
    private Rectangle Road_1_55;

    @FXML
    private Rectangle Road_1_56;

    @FXML
    private Rectangle Road_1_57;

    @FXML
    private Rectangle Road_1_58;

    @FXML
    private Rectangle Road_1_59;

    @FXML
    private Rectangle Road_1_6;

    @FXML
    private Rectangle Road_1_60;

    @FXML
    private Rectangle Road_1_61;

    @FXML
    private Rectangle Road_1_62;

    @FXML
    private Rectangle Road_1_63;

    @FXML
    private Rectangle Road_1_64;

    @FXML
    private Rectangle Road_1_65;

    @FXML
    private Rectangle Road_1_66;

    @FXML
    private Rectangle Road_1_67;

    @FXML
    private Rectangle Road_1_68;

    @FXML
    private Rectangle Road_1_69;

    @FXML
    private Rectangle Road_1_7;

    @FXML
    private Rectangle Road_1_70;

    @FXML
    private Rectangle Road_1_72;

    @FXML
    private Rectangle Road_1_73;

    @FXML
    private Rectangle Road_1_8;

    @FXML
    private Rectangle Road_1_9;

    @FXML
    private Rectangle Road_74;

    @FXML
    Rectangle dice1;

    @FXML
    Rectangle dice2;

    @FXML
    private Rectangle road_1_99;

    @FXML
    private Polygon HexDesert;

    @FXML
    private Polygon Hex1;


    @FXML
    private Polygon Hex10;


    @FXML
    private Polygon Hex11;

    @FXML
    private Polygon Hex12;

    @FXML
    private Polygon Hex13;

    @FXML
    private Polygon Hex14;

    @FXML
    private Polygon Hex15;

    @FXML
    private Polygon Hex17;

    @FXML
    private Polygon Hex18;

    @FXML
    private Polygon Hex19;

    @FXML
    private Polygon Hex2;

    @FXML
    private Polygon Hex3;

    @FXML
    private Polygon Hex4;

    @FXML
    private Polygon Hex5;

    @FXML
    private Polygon Hex6;

    @FXML
    private Polygon Hex7;

    @FXML
    private Polygon Hex8;

    @FXML
    private Polygon Hex9;


    @FXML
    public Text DiceOutCome;


    List<Polygon> hexagons = new ArrayList<>();


    ArrayList<Double> xCoordinates = new ArrayList<Double>();//x-coordinates for Hexs
    ArrayList<Double> yCoordinates = new ArrayList<Double>();//y-coordinates for Hexs
    ArrayList<Image> diceImages_1 = new ArrayList<>();//Dice_1 ArrayList
    ArrayList<Image> diceImages_2 = new ArrayList<>();//Dice_2 ArrayList

    ArrayList<Rectangle> Roads = new ArrayList<>();

    ArrayList<Text> TextNumbers = new ArrayList<>();
    ArrayList<Double> xCoordText = new ArrayList<>();
    ArrayList<Double> yCoordText = new ArrayList<>();

    int DiceResult = 0;
    static ArrayList<Polygon> shuffledHexagons = new ArrayList<>(); // create a new ArrayList to hold the shuffled hexagons


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //IMages of the Tiles
        Image img1_ore = new Image("Images for the game/ore.png");
        Image img2_grain = new Image("Images for the game/grain.png");
        Image img3_clay = new Image("Images for the game/Clay.png");
        Image img4_wood = new Image("Images for the game/wood.png");
        Image img5_wool = new Image("Images for the game/wool.png");
        Image img6_Desert = new Image("Images for the game/Desert.png");
        //Ore x 3
        Hex1.setFill(new ImagePattern(img1_ore));
        Hex2.setFill(new ImagePattern(img1_ore));
        Hex3.setFill(new ImagePattern(img1_ore));
        //Grain x 4
        Hex4.setFill(new ImagePattern(img2_grain));
        Hex5.setFill(new ImagePattern(img2_grain));
        Hex6.setFill(new ImagePattern(img2_grain));
        Hex7.setFill(new ImagePattern(img2_grain));
        //wool x 4
        Hex8.setFill(new ImagePattern(img5_wool));
        Hex9.setFill(new ImagePattern(img5_wool));
        Hex10.setFill(new ImagePattern(img5_wool));
        Hex11.setFill(new ImagePattern(img5_wool));

        //Bricks x 3
        Hex12.setFill(new ImagePattern(img3_clay));
        Hex13.setFill(new ImagePattern(img3_clay));
        Hex14.setFill(new ImagePattern(img3_clay));

        //Lumber x 4
        Hex15.setFill(new ImagePattern(img4_wood));
        Hex17.setFill(new ImagePattern(img4_wood));
        Hex18.setFill(new ImagePattern(img4_wood));
        Hex19.setFill(new ImagePattern(img4_wood));

        //Desert x 1
        HexDesert.setFill(new ImagePattern(img6_Desert));

        Roads.addAll(Arrays.asList(Road_1_2, Road_1_3, Road_1_5, Road_1_6, Road_1_7, Road_1_8, Road_1_9, Road_1_10, Road_1_11,
                Road_1_12, Road_1_13, Road_1_14, Road_1_15, Road_1_16, Road_1_17, Road_1_18, Road_1_19,
                Road_1_20, Road_1_21, Road_1_22, Road_1_23, Road_1_24, Road_1_25, Road_1_26, Road_1_27,
                Road_1_28, Road_1_29, Road_1_30, Road_1_31, Road_1_32, Road_1_33, Road_1_34, Road_1_35,
                Road_1_36, Road_1_37, Road_1_38, Road_1_39, Road_1_40, Road_1_41, Road_1_42, Road_1_43,
                Road_1_44, Road_1_45, Road_1_46, Road_1_47, Road_1_48, Road_1_50, Road_1_51, Road_1_52,
                Road_1_53, Road_1_54, Road_1_55, Road_1_56, Road_1_57, Road_1_58, Road_1_59, Road_1_60,
                Road_1_61, Road_1_62, Road_1_63, Road_1_64, Road_1_65, Road_1_66, Road_1_67, Road_1_68,
                Road_1_69, Road_1_70, Road_1_72, Road_1_73, Road_74, Road_74, road_1_99, Road_1_100, Road_1_101));

        TextNumbers.addAll(Arrays.asList(Num_1, Num_2, Num_3, Num_4, Num_5, Num_6, Num_7, Num_8, Num_9, Num_10, Num_11, Num_12, Num_13, Num_14, Num_15, Num_16, Num_17, Num_18, Num_19));
        for (Text number : TextNumbers) {
            xCoordText.add(number.getLayoutX());
            yCoordText.add(number.getLayoutY());

        }

        hexagons.addAll(Arrays.asList(Hex1, Hex2, Hex3, Hex4, Hex5, Hex6, Hex7, Hex8, Hex9, Hex10, Hex11, Hex12, Hex13, Hex14, Hex15, Hex17, Hex18, Hex19, HexDesert));//Add all the Hex's to the ArrayList
        for (Polygon hexagon : hexagons) {
            xCoordinates.add(hexagon.getLayoutX());//Add Hex's X-coordiantes in the specific array
            yCoordinates.add(hexagon.getLayoutY());//Add Hex's Y-Coordinates in the specific array
        }

        System.out.println(xCoordinates);
        System.out.println(yCoordinates);

        System.out.println("Text x: " + xCoordText);
        System.out.println("Text y: " + yCoordText);

        System.out.println("Printing The Hex");
        System.out.println(hexagons);

        shuffleHexagons();//Calls Shuffle method
        shuffleNumber();
        diceRoll();//Calls Dice Roll
//        assignPlayer();
    }

    //This method assigns player names to the respective PlayerID labels
//    private void assignPlayer() {
//        // Set the text of PlayerOneID label to the first player's name
//        PlayerOneID.setText(players.get(0).getPlayerName());
//        // Set the text of PlayerTwoID label to the second player's name
//        PlayerTwoID.setText(players.get(1).getPlayerName());
//        // Set the text of PlayerThreeID label to the third player's name
//        PlayerThreeID.setText(players.get(2).getPlayerName());
//        // Set the text of PlayerFourID label to the fourth player's name
//        PlayerFourID.setText(players.get(3).getPlayerName());
//    }

    // This method shuffles the positions of the hexagons on the board
    private void shuffleHexagons() {
        // Initialize new lists to store the shuffled coordinates and hexagons
        ArrayList<Double> shuffledXCoordinates = new ArrayList<>();
        ArrayList<Double> shuffledYCoordinates = new ArrayList<>();
        ArrayList<Polygon> shuffledHexagons = new ArrayList<>();

        // Create copies of the original coordinates lists
        ArrayList<Double> xCoordinatesCopy = new ArrayList<>(xCoordinates);
        ArrayList<Double> yCoordinatesCopy = new ArrayList<>(yCoordinates);

        // Iterate through each hexagon
        for (Polygon hexagon : hexagons)
        {
            // Create a new Random object for generating random indices
            Random rand = new Random();
            // Generate a random index within the range of xCoordinatesCopy's size
            int randomIndex = rand.nextInt(xCoordinatesCopy.size());
            // Get the x-coordinate at the random index from xCoordinatesCopy
            double newX = xCoordinatesCopy.get(randomIndex);
            // Get the y-coordinate at the random index from yCoordinatesCopy
            double newY = yCoordinatesCopy.get(randomIndex);
            // Update the x and y layout positions of the hexagon
            hexagon.setLayoutX(newX);
            hexagon.setLayoutY(newY);
            // Add the new x and y coordinates to the shuffled coordinates lists
            shuffledXCoordinates.add(newX);
            shuffledYCoordinates.add(newY);
            // Remove the used coordinates from the coordinates copies
            xCoordinatesCopy.remove(randomIndex);
            yCoordinatesCopy.remove(randomIndex);
            // Add the hexagon to the shuffled hexagons list
            shuffledHexagons.add(hexagon);
        }

        // Clear the original hexagons list and add the shuffled hexagons
        hexagons.clear();
        hexagons.addAll(shuffledHexagons);

        // Print the new x and y coordinates for debugging purposes
        System.out.println("New X Coordinates: " + shuffledXCoordinates);
        System.out.println("New Y Coordinates: " + shuffledYCoordinates);
    }

    private double getHexDesertX() {
        return hexagons.get(18).getLayoutX();
    }

    private double getHexDesertY() {
        return hexagons.get(18).getLayoutY();
    }

    private void shuffleNumber() {
        // Hide the desert number token (Num_19) since the desert hexagon has no number
        Num_19.setVisible(false);

        // Remove Num_19 from the TextNumbers list as it's not needed for the shuffling process
        TextNumbers.remove(Num_19);

        // Iterate through each number token in TextNumbers
        for (Text textNumber : TextNumbers) {
            double newX, newY;
            boolean validPosition;
            do {
                // Create a new Random object for generating random indices
                Random rand = new Random();
                // Generate a random index within the range of xCoordText's size
                int randomIndex = rand.nextInt(xCoordText.size());
                // Get the x and y coordinates for the current number token
                newX = xCoordText.get(randomIndex);
                newY = yCoordText.get(randomIndex);
                // Check if the number token is too close to the desert hexagon
                validPosition = Math.abs(newX - getHexDesertX()) > 1e-6 || Math.abs(newY - getHexDesertY()) > 1e-6;
                if (validPosition) {
                    // Set the layout position of the number token to the randomly chosen coordinates
                    textNumber.setLayoutX(newX);
                    textNumber.setLayoutY(newY);
                    // Remove the used coordinates from xCoordText and yCoordText lists
                    xCoordText.remove(randomIndex);
                    yCoordText.remove(randomIndex);
                }
            } while (!validPosition);
        }
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

    public void roll(MouseEvent mouseEvent) {
        Random randomImage = new Random();
        int diceOne = randomImage.nextInt(0, 6);
        int diceTwo = randomImage.nextInt(0, 6);
        dice1.setFill(new ImagePattern(diceImages_1.get(diceOne)));
        dice2.setFill(new ImagePattern(diceImages_2.get(diceTwo)));

        DiceOutCome.setVisible(true);
        for (Rectangle rectangle : Roads) {
            if (rectangle != null) {
                rectangle.setFill(Color.rgb(216, 213, 213));
            }
        }

        int result = diceOne + diceTwo + 2; // Add 2 because array indexes start at 0
        String diceOutcomeSTR = String.valueOf(result);
        System.out.println("The result is: " + result);
        DiceOutCome.setText("Dice OutCome: " + diceOutcomeSTR);
    }
    public void click(MouseEvent mouseEvent) {
        System.out.println("Road is Clicked");
    }


}
