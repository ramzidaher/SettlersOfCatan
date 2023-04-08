package com.settlers.demotesty.Controllers;

import com.settlers.demotesty.Fundimentals.Colour;
import com.settlers.demotesty.Fundimentals.Player;
import javafx.animation.ScaleTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.util.Duration;

import java.net.URL;
import java.util.*;


/**
 * This class represents the Board Controller which has the Board builder.
 * @version 1.0
 * @author Ramzi
 */
public class Board extends SignUpController  implements Initializable {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Text BrickCardCounter;

    @FXML
    private AnchorPane CardResources;

    @FXML
    private ImageView CityBTN;

    @FXML
    private Text DiceOutCome;

    @FXML
    private Text GrainCardCOunter;

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
    private Polygon HexDesert;

    @FXML
    private Button NextTurn;

    @FXML
    private Text Num_1;

    @FXML
    private Text Num_10;

    @FXML
    private Text Num_11;

    @FXML
    private Text Num_12;

    @FXML
    private Text Num_13;

    @FXML
    private Text Num_14;

    @FXML
    private Text Num_15;

    @FXML
    private Text Num_16;

    @FXML
    private Text Num_17;

    @FXML
    private Text Num_18;

    @FXML
    private Text Num_19;

    @FXML
    private Text Num_2;

    @FXML
    private Text Num_3;

    @FXML
    private Text Num_4;

    @FXML
    private Text Num_5;

    @FXML
    private Text Num_6;

    @FXML
    private Text Num_7;

    @FXML
    private Text Num_8;

    @FXML
    private Text Num_9;

    @FXML
    private Text OreCardCounter;

    @FXML
    private Text PickATurnNote;

    @FXML
    private Text PlayerFourID;

    @FXML
    private Text PlayerFourLongestRoad;

    @FXML
    private Rectangle PlayerFourTagBoxColor;

    @FXML
    private Group PlayerFoursTagBox;

    @FXML
    private Text PlayerOneID;

    @FXML
    private Text PlayerOneLongestRoad;

    @FXML
    private Group PlayerOneTagBox;

    @FXML
    private Rectangle PlayerOneTagBoxColor;

    @FXML
    private Text PlayerThreeID;

    @FXML
    private Text PlayerThreeLongestRoad;

    @FXML
    private Group PlayerThreeTagBox;

    @FXML
    private Rectangle PlayerThreeTagBoxColor;

    @FXML
    private Text PlayerTwoID;

    @FXML
    private Text PlayerTwoLongestRoad;

    @FXML
    private Group PlayerTwoTagBox;

    @FXML
    private Rectangle PlayerTwoTagBoxColor;

    @FXML
    private RadioButton RadioBTN1;

    @FXML
    private RadioButton RadioBTN10;

    @FXML
    private RadioButton RadioBTN11;

    @FXML
    private RadioButton RadioBTN12;

    @FXML
    private RadioButton RadioBTN13;

    @FXML
    private RadioButton RadioBTN14;

    @FXML
    private RadioButton RadioBTN15;

    @FXML
    private RadioButton RadioBTN16;

    @FXML
    private RadioButton RadioBTN17;

    @FXML
    private RadioButton RadioBTN18;

    @FXML
    private RadioButton RadioBTN19;

    @FXML
    private RadioButton RadioBTN2;

    @FXML
    private RadioButton RadioBTN20;

    @FXML
    private RadioButton RadioBTN21;

    @FXML
    private RadioButton RadioBTN22;

    @FXML
    private RadioButton RadioBTN23;

    @FXML
    private RadioButton RadioBTN24;

    @FXML
    private RadioButton RadioBTN25;

    @FXML
    private RadioButton RadioBTN26;

    @FXML
    private RadioButton RadioBTN27;

    @FXML
    private RadioButton RadioBTN28;

    @FXML
    private RadioButton RadioBTN29;

    @FXML
    private RadioButton RadioBTN3;

    @FXML
    private RadioButton RadioBTN30;

    @FXML
    private RadioButton RadioBTN31;

    @FXML
    private RadioButton RadioBTN32;

    @FXML
    private RadioButton RadioBTN33;

    @FXML
    private RadioButton RadioBTN34;

    @FXML
    private RadioButton RadioBTN35;

    @FXML
    private RadioButton RadioBTN36;

    @FXML
    private RadioButton RadioBTN37;

    @FXML
    private RadioButton RadioBTN38;

    @FXML
    private RadioButton RadioBTN39;

    @FXML
    private RadioButton RadioBTN4;

    @FXML
    private RadioButton RadioBTN40;

    @FXML
    private RadioButton RadioBTN41;

    @FXML
    private RadioButton RadioBTN42;

    @FXML
    private RadioButton RadioBTN43;

    @FXML
    private RadioButton RadioBTN44;

    @FXML
    private RadioButton RadioBTN45;

    @FXML
    private RadioButton RadioBTN46;

    @FXML
    private RadioButton RadioBTN47;

    @FXML
    private RadioButton RadioBTN48;

    @FXML
    private RadioButton RadioBTN49;

    @FXML
    private RadioButton RadioBTN5;

    @FXML
    private RadioButton RadioBTN50;

    @FXML
    private RadioButton RadioBTN51;

    @FXML
    private RadioButton RadioBTN52;

    @FXML
    private RadioButton RadioBTN53;

    @FXML
    private RadioButton RadioBTN54;

    @FXML
    private RadioButton RadioBTN6;

    @FXML
    private RadioButton RadioBTN7;

    @FXML
    private RadioButton RadioBTN8;

    @FXML
    private RadioButton RadioBTN9;

    @FXML
    private Text ResourceCrdsPlayerName;

    @FXML
    private ImageView RoadBTN;

    @FXML
    private Rectangle Road_1_10;

    @FXML
    private Rectangle Road_1_101;

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
    private ImageView SettlementBTN;

    @FXML
    private Text WoodCardCounter;

    @FXML
    private Text WoolCardCounter;

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Rectangle dice1;

    @FXML
    private Rectangle dice2;

    @FXML
    private Rectangle road_1_99;
    //Main Fields that are used

    List<Polygon> hexagons = new ArrayList<>();
    ArrayList<Double> xCoordinates = new ArrayList<Double>();//x-coordinates for Hexs
    ArrayList<Double> yCoordinates = new ArrayList<Double>();//y-coordinates for Hexs
    ArrayList<Image> diceImages_1 = new ArrayList<>();//Dice_1 ArrayList
    ArrayList<Image> diceImages_2 = new ArrayList<>();//Dice_2 ArrayList
    ArrayList<Rectangle> Roads = new ArrayList<>();
    ArrayList<RadioButton> ButtonForBuildings = new ArrayList<>();
    ArrayList<Text> TextNumbers = new ArrayList<>();
    ArrayList<Double> xCoordText = new ArrayList<>();
    ArrayList<Double> yCoordText = new ArrayList<>();
    ArrayList<Double> xCoordRadioBTN = new ArrayList<>();
    ArrayList<Double> yCoordRadioBTN = new ArrayList<>();
    private int currentPlayerIndex = -1;
    //Images for Roads, Settlements and Cities

    //Blue
    ImageView BlueSettlement = new ImageView("Images for the game/BlueSettlement.png");
    ImageView BlueCity = new ImageView("Images for the game/BlueCity.png");
    //Red
    ImageView RedSettlement = new ImageView("Images for the game/RedSettlement.png");
    ImageView RedCity = new ImageView("Images for the game/RedCity.png");
    //Yellow
    ImageView YellowSettlement = new ImageView("Images for the game/YellowSettlement.png");
    ImageView YellowCity = new ImageView("Images for the game/YellowCity.png");
    //Green
    ImageView GreenSettlement = new ImageView("Images for the game/GreenSettlement.png");
    ImageView GreenCity = new ImageView("Images for the game/GreenCity.png");



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
                Road_1_69, Road_1_70, Road_1_72, Road_1_73, Road_74, Road_74, road_1_99, Road_1_101));

        for (Rectangle rectangle : Roads) {
            if (rectangle != null) {
                rectangle.setFill(Color.valueOf("White"));

            }
        }

        TextNumbers.addAll(Arrays.asList(Num_1, Num_2, Num_3, Num_4, Num_5, Num_6,
                Num_7, Num_8, Num_9, Num_10, Num_11, Num_12, Num_13, Num_14, Num_15,
                Num_16, Num_17, Num_18, Num_19));
        for (Text number : TextNumbers) {
            xCoordText.add(number.getLayoutX());
            yCoordText.add(number.getLayoutY());

        }

        hexagons.addAll(Arrays.asList(Hex1, Hex2, Hex3, Hex4, Hex5, Hex6, Hex7, Hex8,
                Hex9, Hex10, Hex11, Hex12, Hex13, Hex14,
                Hex15, Hex17, Hex18, Hex19, HexDesert));//Add all the Hex's to the ArrayList
        for (Polygon hexagon : hexagons) {
            xCoordinates.add(hexagon.getLayoutX());//Add Hex's X-coordiantes in the specific array
            yCoordinates.add(hexagon.getLayoutY());//Add Hex's Y-Coordinates in the specific array
        }

        ButtonForBuildings.addAll(Arrays.asList(
                RadioBTN1, RadioBTN2, RadioBTN3, RadioBTN4, RadioBTN5,
                RadioBTN6, RadioBTN7, RadioBTN8, RadioBTN9, RadioBTN10,
                RadioBTN11, RadioBTN12, RadioBTN13, RadioBTN14, RadioBTN15,
                RadioBTN16, RadioBTN17, RadioBTN18, RadioBTN19, RadioBTN20,
                RadioBTN21, RadioBTN22, RadioBTN23, RadioBTN24, RadioBTN25,
                RadioBTN26, RadioBTN27, RadioBTN28, RadioBTN29, RadioBTN30,
                RadioBTN31, RadioBTN32, RadioBTN33, RadioBTN34, RadioBTN35,
                RadioBTN36, RadioBTN37, RadioBTN38, RadioBTN39, RadioBTN40,
                RadioBTN41, RadioBTN42, RadioBTN43, RadioBTN44, RadioBTN45,
                RadioBTN46, RadioBTN47, RadioBTN48, RadioBTN49, RadioBTN50,
                RadioBTN51, RadioBTN52, RadioBTN53, RadioBTN54
        ));

        for (RadioButton placeButton : ButtonForBuildings) {
            if (placeButton != null) {
                xCoordRadioBTN.add(placeButton.getLayoutX());
                yCoordRadioBTN.add(placeButton.getLayoutX());

            }
        }

        System.out.println("RadioBTN x: " + xCoordRadioBTN);
        System.out.println("RadioBTN y: " + yCoordRadioBTN);

        System.out.println("Text x: " + xCoordText);
        System.out.println("Text y: " + yCoordText);

        System.out.println("Printing The Hex");
        System.out.println(hexagons);

        currentPlayerIndex = -1;


        shuffleHexagons();//Calls Shuffle method
        shuffleNumber();
        diceRoll();//Calls Dice Roll
        for (Rectangle road : Roads) {
            if (road != null) {
                road.setOnMouseClicked(this::changeRoadColor);
            } else {
                System.out.println("Road is null!");
            }
        }

        //TODO remove later as its used for testing
        Player player1 = new Player("Ramzi", Colour.RED);
        Player player2 = new Player("Ahmad", Colour.BLUE);
        Player player3 = new Player("Shelly", Colour.YELLOW);
        Player player4 = new Player("Gheith", Colour.GREEN);
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);


        assignPlayer();//TODO change the position of it put it back on top
//        addImage(1012,582);
        for (RadioButton BTN: ButtonForBuildings){
            BTN.setOnMouseClicked(event -> handleRadioButtonAction(event, BTN));
        }

    }




    //This method assigns player names to the respective PlayerID labels
    private void assignPlayer() {
        // Set the text of PlayerOneID label to the first player's name
        PlayerOneID.setText(players.get(0).getPlayerName());
        // Set the fill color of PlayerOneTagBoxColor based on the first player's color
        PlayerOneTagBoxColor.setFill(players.get(0).getPlayerColour().getFxColor());

        // Set the text of PlayerTwoID label to the second player's name
        PlayerTwoID.setText(players.get(1).getPlayerName());
        // Set the fill color of PlayerTwoTagBoxColor based on the second player's color
        PlayerTwoTagBoxColor.setFill(players.get(1).getPlayerColour().getFxColor());

        // Set the text of PlayerThreeID label to the third player's name
        PlayerThreeID.setText(players.get(2).getPlayerName());
        // Set the fill color of PlayerThreeTagBoxColor based on the third player's color
        PlayerThreeTagBoxColor.setFill(players.get(2).getPlayerColour().getFxColor());

        // Set the text of PlayerFourID label to the fourth player's name
        PlayerFourID.setText(players.get(3).getPlayerName());
        // Set the fill color of PlayerFourTagBoxColor based on the fourth player's color
        PlayerFourTagBoxColor.setFill(players.get(3).getPlayerColour().getFxColor());
    }


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
        for (Polygon hexagon : hexagons) {
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

        int result = diceOne + diceTwo + 2; // Add 2 because array indexes start at 0
        String diceOutcomeSTR = String.valueOf(result);
        System.out.println("The result is: " + result);
        DiceOutCome.setText("Dice OutCome: " + diceOutcomeSTR);
    }

    public void click(MouseEvent mouseEvent) {
        System.out.println("Road is Clicked");
    }


    public void NextPlayer(MouseEvent mouseEvent) {
        // Check if the players list is empty
        if (players.isEmpty()) {
            // If it's empty, show an error message or handle the situation as needed
            System.out.println("The players list is empty!");
            return;
        }

        // Increment the currentPlayerIndex
        currentPlayerIndex++;

        // If the currentPlayerIndex reaches the last player, set it back to 0
        if (currentPlayerIndex >= players.size()) {
            currentPlayerIndex = 0;
        }

        // Get the current player
        Player currentPlayer = players.get(currentPlayerIndex);

        // Update the GUI with the current player's name
        ResourceCrdsPlayerName.setText(currentPlayer.getPlayerName());

        hideAllPlayerElements();

        // Set isPlaying for all players to false, except for the current player
        for (int i = 0; i < players.size(); i++) {
            Player player = players.get(i);
            if (i == currentPlayerIndex) {
                player.setPlaying(true);
            } else {
                player.setPlaying(false);
            }
        }

        // Show elements for the current player based on currentPlayerIndex
        switch (currentPlayerIndex) {
            case 0 -> showPlayerOneElements(currentPlayer);
            case 1 -> showPlayerTwoElements(currentPlayer);
            case 2 -> showPlayerThreeElements(currentPlayer);
            case 3 -> showPlayerFourElements(currentPlayer);
        }
    }



    public void changeRoadColor(MouseEvent mouseEvent) {
        // Get the source of the event and cast it to a Rectangle
        Rectangle clickedRoad = (Rectangle) mouseEvent.getSource();

        // Check if the UserData is set to "used", if so, return from the method
        if ("used".equals(clickedRoad.getUserData())) {
            return;
        }

        // Get the current player
        Player currentPlayer = players.get(currentPlayerIndex);

        // Check if the currentPlayer is playing and setRoad is true, otherwise return
        if (!currentPlayer.isPlaying() || !currentPlayer.isAddRoad()) {
            System.out.println("In if");
            roadAnimation();


            return;
        }

        // Set the rectangle's fill color to the current player's color
        clickedRoad.setFill(currentPlayer.getPlayerColour().getFxColor());
        currentPlayer.setRoads();
        // Set the UserData of the rectangle to "used" to mark it as used
        clickedRoad.setUserData("used");
        System.out.println(currentPlayer.getPlayerName() + currentPlayer.getRoads());

        if (currentPlayerIndex == 0) {
            PlayerOneLongestRoad.setText("Longest Road: " + String.valueOf(currentPlayer.getRoads()));
        } else if (currentPlayerIndex == 1) {
            PlayerTwoLongestRoad.setText("Longest Road: " + String.valueOf(currentPlayer.getRoads()));
        } else if (currentPlayerIndex == 2) {
            PlayerThreeLongestRoad.setText("Longest Road: " + String.valueOf(currentPlayer.getRoads()));
        } else if (currentPlayerIndex == 3) {
            PlayerFourLongestRoad.setText("Longest Road: " + String.valueOf(currentPlayer.getRoads()));
        }
    }


    //TODO add a messge to pick a turn first
    public void addCity(MouseEvent mouseEvent) {
        if (currentPlayerIndex == -1){
            PickATurnNote.setVisible(true);

        }else {
            PickATurnNote.setVisible(false);
            players.get(currentPlayerIndex).setAddCity(true);
            System.out.println("Add city is pressed");
        }


    }
    public void addSettlement(MouseEvent mouseEvent) {
        // Get the current player
        Player currentPlayer = players.get(currentPlayerIndex);

        // Check if any radio button is pressed
        RadioButton selectedButton = null;
        for (RadioButton button : ButtonForBuildings) {
            if (button.isSelected()) {
                selectedButton = button;
                break;
            }
        }

        // If no radio button is selected, return
        if (selectedButton == null) {
            System.out.println("No radio button is selected!");
            return;
        }

        // Create a new ImageView based on the current player's color
        ImageView settlement;
        switch (currentPlayer.getPlayerColour()) {
            case BLUE:
                settlement = new ImageView("Images for the game/BlueSettlement.png");
                break;
            case RED:
                settlement = new ImageView("Images for the game/RedSettlement.png");
                break;
            case YELLOW:
                settlement = new ImageView("Images for the game/YellowSettlement.png");
                break;
            case GREEN:
                settlement = new ImageView("Images for the game/GreenSettlement.png");
                break;
            default:
                System.out.println("Invalid player color!");
                return;
        }

        // Set the layout position of the settlement ImageView to the selected radio button's x and y coordinates
        settlement.setLayoutX(selectedButton.getLayoutX());
        settlement.setLayoutY(selectedButton.getLayoutY());

        // Add the settlement ImageView to the board (assuming board is a Pane)

        // Set the radio button to not visible
        selectedButton.setVisible(false);
    }
    private void handleRadioButtonAction(MouseEvent event, RadioButton BTN) {
        RadioButton radioButton = (RadioButton) event.getSource();
        radioButton.setVisible(false);
        double tempX = BTN.getLayoutX();
        double tempY = BTN.getLayoutY();
        addImage(tempX -15,tempY-20);
    }

//    public void addSettlement(MouseEvent mouseEvent) {
//        if (currentPlayerIndex == -1) {
//            PickATurnNote.setVisible(true);
//        } else {
//            PickATurnNote.setVisible(false);
//            //  implementation to add a settlement
//            System.out.println("Add Settel is pressed");
//            System.out.println(players.get(0).isPlaying());
//            System.out.println(players.get(1).isPlaying());
//            System.out.println(players.get(2).isPlaying());
//            System.out.println(players.get(3).isPlaying());
//            for (RadioButton placeButton : ButtonForBuildings) {
//                if (placeButton.isSelected()) {
//                    System.out.println("Pressed");
//                    placeButton.setVisible(false);
////                    ImageView newSettlement = new ImageView(BlueSettlement.getImage());
//                    BlueSettlement.setLayoutX(placeButton.getLayoutX());
//                    BlueSettlement.setLayoutY(placeButton.getLayoutY());
////                    .getChildren().add(newSettlement); // Replace 'yourParentPane' with the actual pane containing the radio buttons
//
//                }
//            }
//        }
//    }


    public void addRoad(MouseEvent mouseEvent) {
        // Your implementation to add a road
        //its redudndent
        //TODO Fix as its redundant
        if (currentPlayerIndex == -1){
            PickATurnNote.setVisible(true);
        }else {
            PickATurnNote.setVisible(false);
            if (players.get(currentPlayerIndex).isPlaying()){
                System.out.println("Its turn");
                players.get(currentPlayerIndex).setAddRoad(true);
            }else {
                System.out.println("not Tunr");
            }

        }

    }



    //Simple animation for the buttons
    //TODO re draw this looks pixelated
    public void hoverEnter(MouseEvent mouseEvent) {
        ImageView imageView = (ImageView) mouseEvent.getSource();
        ScaleTransition scaleUp = new ScaleTransition(Duration.millis(200), imageView);
        scaleUp.setByX(0.1);
        scaleUp.setByY(0.1);
        scaleUp.setCycleCount(1);
        scaleUp.setAutoReverse(false);
        scaleUp.play();
    }

    public void hoverExit(MouseEvent mouseEvent) {
        ImageView imageView = (ImageView) mouseEvent.getSource();
        ScaleTransition scaleDown = new ScaleTransition(Duration.millis(200), imageView);
        scaleDown.setByX(-0.1);
        scaleDown.setByY(-0.1);
        scaleDown.setCycleCount(1);
        scaleDown.setAutoReverse(false);
        scaleDown.play();
    }
    public void roadAnimation() {
        ImageView imageView = (ImageView) RoadBTN;
        ScaleTransition scaleUp = new ScaleTransition(Duration.millis(200), imageView);
        scaleUp.setByX(0.1);
        scaleUp.setByY(0.1);
        scaleUp.setCycleCount(2); // Increase cycle count to 2
        scaleUp.setAutoReverse(true); // Set auto reverse to true
        scaleUp.play();
    }



    private void hideAllPlayerElements() {
        PlayerOneLongestRoad.setVisible(false);
        PlayerTwoLongestRoad.setVisible(false);
        PlayerThreeLongestRoad.setVisible(false);
        PlayerFourLongestRoad.setVisible(false);
    }

    private void showPlayerOneElements(Player currentPlayer) {
        PlayerOneLongestRoad.setText("Longest Road: " + String.valueOf(currentPlayer.getRoads()));
        PlayerOneLongestRoad.setVisible(true);
    }

    private void showPlayerTwoElements(Player currentPlayer) {
        PlayerTwoLongestRoad.setText("Longest Road: " + String.valueOf(currentPlayer.getRoads()));
        PlayerTwoLongestRoad.setVisible(true);
    }

    private void showPlayerThreeElements(Player currentPlayer) {
        PlayerThreeLongestRoad.setText("Longest Road: " + String.valueOf(currentPlayer.getRoads()));
        PlayerThreeLongestRoad.setVisible(true);
    }

    private void showPlayerFourElements(Player currentPlayer) {
        PlayerFourLongestRoad.setText("Longest Road: " + String.valueOf(currentPlayer.getRoads()));
        PlayerFourLongestRoad.setVisible(true);
    }

    public void setWandHCity(ImageView image){
        image.setFitWidth(50);
        image.setFitHeight(65);
    }
    public void setWandHSettlement(ImageView image){
        image.setFitWidth(50);
        image.setFitHeight(45);
    }

    public void addImage(double x, double y) {
        Image image = new Image("Images for the game/YellowCity.png");
        ImageView imageView = new ImageView(image);
        imageView.setFitHeight(65);
        imageView.setFitWidth(50);

        // Set the image position
        AnchorPane.setTopAnchor(imageView, y);
        AnchorPane.setLeftAnchor(imageView, x);

        // Add the image to the AnchorPane
        anchorPane.getChildren().add(imageView);
    }

    }


