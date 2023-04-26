package com.settlers.demotesty.Controllers;

import com.settlers.demotesty.Fundimentals.Colour;
import com.settlers.demotesty.Fundimentals.Player;
import com.settlers.demotesty.Fundimentals.ResourceDeck;
import javafx.animation.ScaleTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Bounds;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;
import javax.swing.JPanel;

import javax.swing.*;
import java.awt.*;

import java.io.IOException;
import java.net.URL;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;


/**
 * This class represents the Board Controller which has the Board builder.
 * @version 1.0
 * @author Ramzi
 */
public class Board extends SignUpController  implements Initializable {


    public Group PlayerOneTagBox, PlayerTwoTagBox, PlayerThreeTagBox, PlayerFoursTagBox;
    @FXML
    private AnchorPane anchorPane;

    // Text
    @FXML
    public Text GameCounterID, changeRobberMsg, pickPlayerMsg, PlayerOneResourceCounter, PlayerTwoResourceCounter, PlayerThreeResourceCounter,
            PlayerFourResourceCounter, BrickCardCounter, DiceOutCome, GrainCardCounter, Num_1, Num_10, Num_11, Num_12, Num_13, Num_14, Num_15,
            Num_16, Num_17, Num_18, Num_19, Num_2, Num_3, Num_4, Num_5, Num_6, Num_7, Num_8, Num_9, OreCardCounter, PickATurnNote, PlayerFourID,
            PlayerFourLongestRoad, PlayerOneID, PlayerOneLongestRoad, PlayerThreeID, PlayerThreeLongestRoad, PlayerTwoID, PlayerTwoLongestRoad,
            ResourceCrdsPlayerName, WoodCardCounter, WoolCardCounter;

    // ImageView
    public ImageView RoberImage, CityBTN, RoadBTN, SettlementBTN, WaterHex1, WaterHex10, WaterHex11, WaterHex12, WaterHex13, WaterHex14, WaterHex15,
            WaterHex16, WaterHex17, WaterHex18, WaterHex2, WaterHex3, WaterHex4, WaterHex5, WaterHex6, WaterHex7, WaterHex8, WaterHex9;

    // Button
    public Button testDebug, QuitGame, TradeBTN, DiceRollBTN, NextTurn;

    // Circle
    @FXML
    public Circle CirclePointerHexes;

    // Polygon
    @FXML
    private Polygon Hex1, Hex10, Hex11, Hex12, Hex13, Hex14, Hex15, Hex17, Hex18, Hex19, Hex2, Hex3, Hex4, Hex5, Hex6, Hex7, Hex8, Hex9, HexDesert;

    // RadioButton
    @FXML
    private RadioButton RadioBTN1, RadioBTN10, RadioBTN11, RadioBTN12, RadioBTN13, RadioBTN14, RadioBTN15, RadioBTN16, RadioBTN17, RadioBTN18,
            RadioBTN19, RadioBTN2, RadioBTN20, RadioBTN21, RadioBTN22, RadioBTN23, RadioBTN24, RadioBTN25, RadioBTN26, RadioBTN27, RadioBTN28,
            RadioBTN29, RadioBTN3, RadioBTN30, RadioBTN31, RadioBTN32, RadioBTN33, RadioBTN34, RadioBTN35, RadioBTN36, RadioBTN37, RadioBTN38,
            RadioBTN39, RadioBTN4, RadioBTN40, RadioBTN41, RadioBTN42, RadioBTN43, RadioBTN44, RadioBTN45, RadioBTN46, RadioBTN47, RadioBTN48,
            RadioBTN49, RadioBTN5, RadioBTN50, RadioBTN51, RadioBTN52, RadioBTN53, RadioBTN54, RadioBTN6, RadioBTN7, RadioBTN8, RadioBTN9;

    // Rectangle
    @FXML
    public Rectangle PlayerFourTagBoxColor, PlayerOneTagBoxColor, PlayerThreeTagBoxColor, PlayerTwoTagBoxColor, dice1, dice2, road_1_99;

    @FXML
    private Rectangle Road_1_2, Road_1_3, Road_1_5, Road_1_6, Road_1_7, Road_1_8, Road_1_9, Road_1_10, Road_1_11,
            Road_1_12, Road_1_13, Road_1_14, Road_1_15, Road_1_16, Road_1_17, Road_1_18, Road_1_19,
            Road_1_20, Road_1_21, Road_1_22, Road_1_23, Road_1_24, Road_1_25, Road_1_26, Road_1_27,
            Road_1_28, Road_1_29, Road_1_30, Road_1_31, Road_1_32, Road_1_33, Road_1_34, Road_1_35,
            Road_1_36, Road_1_37, Road_1_38, Road_1_39, Road_1_40, Road_1_41, Road_1_42, Road_1_43,
            Road_1_44, Road_1_45, Road_1_46, Road_1_47, Road_1_48, Road_1_50, Road_1_51, Road_1_52,
            Road_1_53, Road_1_54, Road_1_55, Road_1_56, Road_1_57, Road_1_58, Road_1_59, Road_1_60,
            Road_1_61, Road_1_62, Road_1_63, Road_1_64, Road_1_65, Road_1_66, Road_1_67, Road_1_68,
            Road_1_69, Road_1_70, Road_1_72, Road_1_73, Road_74, Road_1_101;

    //Main Fields that are used
    private HashMap<String, Polygon> hexagonsById = new HashMap<>();
    private HashMap<Polygon, String> hexagonsResources = new HashMap<>();
    private HashMap<ImageView, String> waterHex = new HashMap<>();


    ArrayList<Double> xCoordinates = new ArrayList<Double>();//x-coordinates for Hexs
    ArrayList<Double> yCoordinates = new ArrayList<Double>();//y-coordinates for Hexs
    ArrayList<Rectangle> Roads = new ArrayList<>();
    ArrayList<RadioButton> ButtonForBuildings = new ArrayList<>();
    ArrayList<Text> TextNumbers = new ArrayList<>();
    ArrayList<Double> xCoordText = new ArrayList<>();
    ArrayList<Double> yCoordText = new ArrayList<>();
    ArrayList<Double> xCoordRadioBTN = new ArrayList<>();
    ArrayList<Double> yCoordRadioBTN = new ArrayList<>();
    private static int currentPlayerIndex = -1;
    private boolean isRobberMoveAllowed = false;


    private int gameCounter;
    private DiceController diceController;

    private ArrayList<Polygon> testHex = new ArrayList<>();
    private ResourceDeck resourceDeck = new ResourceDeck();
    private boolean currentPlayerNumberFound = false;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        gameCounter = 0;
        if (gameCounter == 0) {
            NextTurn.setText("Start Game");
        } else {
            return;
        }


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

        //Ore x 3
        hexagonsResources.put(Hex1, "ore");
        hexagonsResources.put(Hex2, "ore");
        hexagonsResources.put(Hex3, "ore");
        //Grain x 4
        hexagonsResources.put(Hex4, "grain");
        hexagonsResources.put(Hex5, "grain");
        hexagonsResources.put(Hex6, "grain");
        hexagonsResources.put(Hex7, "grain");
        //wool x 4
        hexagonsResources.put(Hex8, "wool");
        hexagonsResources.put(Hex9, "wool");
        hexagonsResources.put(Hex10, "wool");
        hexagonsResources.put(Hex11, "wool");
        //Bricks x 3
        hexagonsResources.put(Hex12, "brick");
        hexagonsResources.put(Hex13, "brick");
        hexagonsResources.put(Hex14, "brick");
        //Lumber x 4
        hexagonsResources.put(Hex15, "wood");
        hexagonsResources.put(Hex17, "wood");
        hexagonsResources.put(Hex18, "wood");
        hexagonsResources.put(Hex19, "wood");
        //Desert x 1
        hexagonsResources.put(HexDesert, "desert");

        waterHex.put(WaterHex1, "Water");
        waterHex.put(WaterHex2, "Water");
        waterHex.put(WaterHex3, "Water");
        waterHex.put(WaterHex3, "Water");
        waterHex.put(WaterHex4, "Water");
        waterHex.put(WaterHex5, "Water");
        waterHex.put(WaterHex6, "Water");
        waterHex.put(WaterHex7, "Water");
        waterHex.put(WaterHex8, "Water");
        waterHex.put(WaterHex9, "Water");
        waterHex.put(WaterHex10, "Water");
        waterHex.put(WaterHex11, "Water");
        waterHex.put(WaterHex12, "Water");
        waterHex.put(WaterHex13, "Water");
        waterHex.put(WaterHex14, "Water");
        waterHex.put(WaterHex15, "Water");
        waterHex.put(WaterHex16, "Water");
        waterHex.put(WaterHex17, "Water");
        waterHex.put(WaterHex18, "Water");


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
        for (Map.Entry<String, Polygon> entry : hexagonsById.entrySet()) {
            Polygon hexagon = entry.getValue();
            xCoordinates.add(hexagon.getLayoutX()); // Add Hex's X-coordinates in the specific array
            yCoordinates.add(hexagon.getLayoutY()); // Add Hex's Y-Coordinates in the specific array
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
        hexagonsById.put("Hex1", Hex1);
        hexagonsById.put("Hex10", Hex10);
        hexagonsById.put("Hex11", Hex11);
        hexagonsById.put("Hex12", Hex12);
        hexagonsById.put("Hex13", Hex13);
        hexagonsById.put("Hex14", Hex14);
        hexagonsById.put("Hex15", Hex15);
        hexagonsById.put("Hex17", Hex17);
        hexagonsById.put("Hex18", Hex18);
        hexagonsById.put("Hex19", Hex19);
        hexagonsById.put("Hex2", Hex2);
        hexagonsById.put("Hex3", Hex3);
        hexagonsById.put("Hex4", Hex4);
        hexagonsById.put("Hex5", Hex5);
        hexagonsById.put("Hex6", Hex6);
        hexagonsById.put("Hex7", Hex7);
        hexagonsById.put("Hex8", Hex8);
        hexagonsById.put("Hex9", Hex9);
        hexagonsById.put("HexDesert", HexDesert);
        System.out.println("RadioBTN x: " + xCoordRadioBTN);
        System.out.println("RadioBTN y: " + yCoordRadioBTN);
        System.out.println("Text x: " + xCoordText);
        System.out.println("Text y: " + yCoordText);
        System.out.println("Printing The Hex");
        System.out.println(hexagonsById);
        currentPlayerIndex = -1;
        shuffleHexagons();//Calls Shuffle method
        // Get the bounds of the hexagon's filled area
        // Convert Circle's coordinates to Hexagon's coordinate system


        shuffleNumber();
        for (Rectangle road : Roads) {
            if (road != null) {
                road.setOnMouseClicked(this::changeRoadColor);
            } else {
                System.out.println("Road is null!");
            }
        }
//        //TODO remove later as its used for testing
        Player player1 = new Player("Ramzi", Colour.RED);
        Player player2 = new Player("Ahmad", Colour.BLUE);
        Player player3 = new Player("Shelly", Colour.YELLOW);
        Player player4 = new Player("Gheith", Colour.GREEN);
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        player1.setAi(true);

        diceController = new DiceController(dice1, dice2, DiceOutCome);
        assignPlayer();//TODO change the position of it put it back on top
        //Put Robber
        RoberImage.setLayoutX(HexDesert.getLayoutX() - 30);
        RoberImage.setLayoutY(HexDesert.getLayoutY() - 43);
        if (players.get(0).isAi()) {
            simulateMouseEvent();
        }

    }

    public void simulateMouseEvent() {
        double x = 100; // X coordinate of the event
        double y = 100; // Y coordinate of the event
        MouseButton button = MouseButton.PRIMARY; // MouseButton.PRIMARY represents a left-click event
        int clickCount = 1; // Number of clicks (1 for single click, 2 for double click, etc.)

        MouseEvent fakeMouseEvent = new MouseEvent(MouseEvent.MOUSE_CLICKED, x, y, x, y, button, clickCount, false, false, false, false, true, false, false, true, false, false, null);

        NextPlayer(fakeMouseEvent);
        AIMain();
//        changeRoadColor(fakeMouseEvent);


    }

    public void simulateMouseEventSettlementBTN() {
        double x = 100; // X coordinate of the event
        double y = 100; // Y coordinate of the event
        MouseButton button = MouseButton.PRIMARY; // MouseButton.PRIMARY represents a left-click event
        int clickCount = 1; // Number of clicks (1 for single click, 2 for double click, etc.)

        MouseEvent fakeMouseEvent = new MouseEvent(MouseEvent.MOUSE_CLICKED, x, y, x, y, button, clickCount, false, false, false, false, true, false, false, true, false, false, null);
        addSettlement(fakeMouseEvent);
    }
    public void simulateMouseEventRadioBTN(RadioButton randomVisibleButton) {
        double x = 100; // X coordinate of the event
        double y = 100; // Y coordinate of the event
        MouseButton button = MouseButton.PRIMARY; // MouseButton.PRIMARY represents a left-click event
        int clickCount = 1; // Number of clicks (1 for single click, 2 for double click, etc.)

        MouseEvent fakeMouseEvent = new MouseEvent(MouseEvent.MOUSE_CLICKED, x, y, x, y, button, clickCount, false, false, false, false, true, false, false, true, false, false, null);

        handleRadioButtonSettlementActions(fakeMouseEvent, randomVisibleButton, players.get(currentPlayerIndex));
    }

    private void handleRadioButtonSettlementActions(MouseEvent event, RadioButton BTN, Player currentPlayer) {
        if (players.get(currentPlayerIndex).getSettlements() != 5) {

            double tempX = BTN.getLayoutX();
            double tempY = BTN.getLayoutY();
            if (currentPlayer.isAddSettlement()) {
                BTN.setVisible(false);
                addImageSettlement(currentPlayer.getPlayerColour(), tempX, tempY);
            } else {
                ImageView settlementButton = (ImageView) SettlementBTN;
                playSettlementAnimation(settlementButton);
            }
            showPlayerElements(currentPlayerIndex, currentPlayer);
        } else {
            showError("Cant add any Settlement");
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
        // Create copies of the original coordinates lists
        List<Double> xCoordinatesCopy = new ArrayList<>();
        List<Double> yCoordinatesCopy = new ArrayList<>();

        // Save the original coordinates of hexagons
        for (Polygon hexagon : hexagonsById.values()) {
            xCoordinatesCopy.add(hexagon.getLayoutX());
            yCoordinatesCopy.add(hexagon.getLayoutY());
        }

        // Shuffle the hexagons
        for (Polygon hexagon : hexagonsById.values()) {
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
            // Remove the used coordinates from the coordinates copies
            xCoordinatesCopy.remove(randomIndex);
            yCoordinatesCopy.remove(randomIndex);
        }
    }
//    public static ArrayList<Player> getPlayers() {
//        return players;
//    }

    private double getHexDesertX() {
        return hexagonsById.get("HexDesert").getLayoutX();
    }

    private double getHexDesertY() {
        return hexagonsById.get("HexDesert").getLayoutY();
    }

    //Shuffle the numbers around
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


    //Main checker for the dice outcome
    public void distributeResources(int diceOutcome) {
        double TextX = 0;
        double TextY = 0;
        Text[] tempTexts = new Text[2];

        String diceOutComeSTR = String.valueOf(diceOutcome);

        for (Text TextNumber : TextNumbers) {
            TextX = TextNumber.getLayoutX();
            TextY = TextNumber.getLayoutY();

            if (TextNumber.getText().equals(diceOutComeSTR)) {
                if (tempTexts[0] == null) {
                    tempTexts[0] = TextNumber;
                } else if (diceOutcome == 12 || diceOutcome == 2) {
                    tempTexts[1] = null;
                    break;
                } else {
                    tempTexts[1] = TextNumber;
                    break;
                }
            }
        }

        // Add a print statement when the diceOutcome is 7
        if (diceOutcome == 7) {
            System.out.println("Lucky number 7! Player gets to change Robber Position.");
            isRobberMoveAllowed = true;
            changeRobberPosition(RoberImage);
        } else {
            // Set isRobberMoveAllowed to false when dice outcome is not 7
            isRobberMoveAllowed = false;
        }

        checksHexandNumber(tempTexts);

    }

    private void changeRobberPosition(ImageView robberImage) {
        changeRobberMsg.setVisible(true);
        //TODO implement the halving on the cards
        System.out.println(robberImage.getLayoutX() + 12);
        System.out.println(robberImage.getLayoutY() + 30);

        setHexagonsAndTextEventHandlers();
    }

    private void setHexagonsAndTextEventHandlers() {
        for (Map.Entry<Polygon, String> entry : hexagonsResources.entrySet()) {
            Polygon polygon = entry.getKey();
            polygon.setOnMouseClicked(event -> elementPressed(polygon));
        }
        for (Text nums : TextNumbers) {
            nums.setOnMouseClicked(event -> elementPressed(nums));
        }
    }

    private void elementPressed(Object element) {
        if (!isRobberMoveAllowed) {
            return;
        }
        if (element instanceof Polygon) {
            System.out.println("Polygon pressed: " + element);
            double x = ((Polygon) element).getLayoutX();
            double y = ((Polygon) element).getLayoutY();
            moveRobber(x, y);
        } else if (element instanceof Text) {
            System.out.println("Hex/Numbers is pressed");
            double x = ((Text) element).getLayoutX();
            double y = ((Text) element).getLayoutY();
            moveRobber(x, y);
        }
    }

    private void moveRobber(double x, double y) {
        RoberImage.setLayoutX(x - 30);
        RoberImage.setLayoutY(y - 43);
        changeRobberMsg.setVisible(false);
        for (Polygon hex : hexagonsResources.keySet()) {
            Point2D robber = hex.parentToLocal(
                    RoberImage.localToParent(
                            RoberImage.getBoundsInLocal().getCenterX(),
                            RoberImage.getBoundsInLocal().getCenterY()
                    )
            );

            boolean robberInsideHex = hex.contains(robber);
            if (robberInsideHex) {
                System.out.println("Robber is on the  " + hex.getId());
                ArrayList<Player> playersWithSettlementOnHex = new ArrayList<>();
                for (Player currentPlayer : players) {
                    for (Map.Entry<String, ArrayList<Polygon>> entry : currentPlayer.getNearestHexes().entrySet()) {
                        ArrayList<Polygon> polygons = entry.getValue();
                        for (Polygon polygon : polygons) {
                            if (polygon.equals(hex)) {
                                System.out.println("Found the hex in " + currentPlayer.getPlayerName() + " resource deck");
                                playersWithSettlementOnHex.add(currentPlayer);
                                break;
                            }
                        }
                    }
                }

                if (playersWithSettlementOnHex.size() > 1) {
                    System.out.println("There are multiple players with settlements on this hex. Choose which player to steal from.");
                    pickPlayerMsg.setVisible(true);
                    // Call getUserChoice with a callback that will be executed when a player is chosen
                    getUserChoice(playersWithSettlementOnHex, chosenPlayer -> {
                        stealResourcesFromHex(chosenPlayer, hex);
                        updateRCounter(chosenPlayer);
                        updateRCounter(players.get(currentPlayerIndex));
                    });

                } else if (playersWithSettlementOnHex.size() == 1) {
                    stealResourcesFromHex(playersWithSettlementOnHex.get(0), hex);
                }
            }
        }
        isRobberMoveAllowed = false;

    }

    public void Trade(MouseEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(WelcomeController.class.getResource("/com/settlers/demotesty/tradeNew.fxml"));
        Parent root = loader.load();
        Scene scene = new Scene(root);

        Stage newStage = new Stage();
        newStage.setScene(scene);
        newStage.initModality(Modality.APPLICATION_MODAL); // set modality to block input events to other windows
        newStage.show();
    }

    public static int getCurrentPlayerIndex() {
        return currentPlayerIndex;
    }

    public void hoverEnter(MouseEvent event) {
    }

    public void hoverExit(MouseEvent event) {
    }

    public interface PlayerChoiceCallback {
        void onPlayerChosen(Player player);
    }

    private void getUserChoice(ArrayList<Player> playersWithSettlementOnHex, PlayerChoiceCallback callback) {
        // Set up event handlers for each player's tag box
        PlayerOneTagBox.setOnMouseClicked(event -> {
            if (playersWithSettlementOnHex.contains(players.get(0))) {
                callback.onPlayerChosen(players.get(0));
            }
        });

        PlayerTwoTagBox.setOnMouseClicked(event -> {
            if (playersWithSettlementOnHex.contains(players.get(1))) {
                callback.onPlayerChosen(players.get(1));
            }
        });

        PlayerThreeTagBox.setOnMouseClicked(event -> {
            if (playersWithSettlementOnHex.contains(players.get(2))) {
                callback.onPlayerChosen(players.get(2));
            }
        });

        PlayerFoursTagBox.setOnMouseClicked(event -> {
            if (playersWithSettlementOnHex.contains(players.get(3))) {
                callback.onPlayerChosen(players.get(3));
            }
        });
    }


    private void stealResourcesFromHex(Player cp, Polygon hex) {
        if (cp == null || hex == null) return;

        String hexResource = hexagonsResources.get(hex);
        if (hexResource == null) {
            System.out.println("Resource type not found for the given hex parameter.");
            return;
        }
        System.out.println("Resource type for hex: " + hexResource);

        stealResourcesFromPlayer(cp, hexResource);
    }

    private void stealResourcesFromPlayer(Player cp, String hexResource) {
        // Get the resource type for the given hex parameter
        String resourceType = hexResource;
        if (resourceType == null) {
            System.out.println("Resource type not found for the given hex parameter.");
            return;
        }
        System.out.println("Resource type for hex: " + resourceType);

        for (Map.Entry<String, Integer> entry : cp.getResources().entrySet()) {
            String hexResourceType = entry.getKey();
            Integer value = entry.getValue();

            if (hexResourceType.equalsIgnoreCase(resourceType)) {
                // Check if the resource value is greater than 0
                if (value > 0) {
                    // Decrement the resource value by 1
                    value--;

                    // Update the resource value in the player's resources
                    cp.getResources().put(hexResourceType, value);

                    // Increment the resource value for the current player
                    Player currentPlayer = players.get(currentPlayerIndex);
                    int currentPlayerResourceValue = currentPlayer.getResources().getOrDefault(hexResourceType, 0);
                    currentPlayer.getResources().put(hexResourceType, currentPlayerResourceValue + 1);

                    // Update the resource counters for both the target player and the current player
//                    updateResourceCounters(cp);
                    updateResourceCounters(currentPlayer);
                    updateRCounter(cp);
                } else {
                    System.out.println("No resources of this type available to steal.");
                }
                break; // Exit the loop since the resource type is found
            }
        }
    }

    // Add this method to update the resource counters
    private void updateRCounter(Player player) {
        int totalResources = player.getResources().entrySet().stream().filter(entry -> !entry.getKey().equalsIgnoreCase("desert")).mapToInt(entry -> entry.getValue()).sum();
        int playerIndex = players.indexOf(player);

        switch (playerIndex) {
            case 0:
                PlayerOneResourceCounter.setText(String.valueOf(totalResources));
                break;
            case 1:
                PlayerTwoResourceCounter.setText(String.valueOf(totalResources));
                break;
            case 2:
                PlayerThreeResourceCounter.setText(String.valueOf(totalResources));
                break;
            case 3:
                PlayerFourResourceCounter.setText(String.valueOf(totalResources));
                break;
            default:
                System.out.println("Invalid player index for resource counter update.");
        }
    }

    public void checksHexandNumber(Text[] tempTexts) {
        Text TextOne = tempTexts[0];
        Text TextTwo = tempTexts[1];
        if (TextOne == null && TextTwo == null) {
            return; // Both texts are null, no need to continue
        }
        for (Player allPlayers : players) {
            for (Map.Entry<String, ArrayList<Polygon>> entry : allPlayers.getNearestHexes().entrySet()) {
                ArrayList<Polygon> polygons = entry.getValue();
                for (Polygon polygon : polygons) {
                    System.out.println(polygon);
                    if (TextOne != null) {
                        System.out.println("TXT ONE");
                        System.out.println(TextOne.getText());
                        double TextOneX = TextOne.getLayoutX();
                        double TextOneY = TextOne.getLayoutY();
                        if ((polygon.getLayoutX() == TextOneX) && (polygon.getLayoutY() == TextOneY)) {
                            if (hexagonsResources.get(polygon) == null) {
                                continue; // Skip the current iteration of the loop
                            }
                            boolean resourcesGiven = passedHexToResource(allPlayers, polygon);
                            if (resourcesGiven) {
                                updateRCounter(allPlayers);
                            }
                            if (players.get(currentPlayerIndex).isPlaying()) {
                                updateResourceCounters(players.get(currentPlayerIndex));

                            }
                            System.out.println("FOUND ONE");
                            if (TextOne.getText().equals("7")) {
                                System.out.println("Robber Class");
                            }

                        }
                    }

                    if (TextTwo != null) {
                        double TextTwoX = TextTwo.getLayoutX();
                        double TextTwoY = TextTwo.getLayoutY();
                        if ((polygon.getLayoutX() == TextTwoX) && (polygon.getLayoutY() == TextTwoY)) {
                            if (hexagonsResources.get(polygon) == null) {
                                continue; // Skip the current iteration of the loop
                            }
                            boolean resourcesGiven = passedHexToResource(allPlayers, polygon);
                            if (resourcesGiven) {
                                updateRCounter(allPlayers);
                            }
                            System.out.println("FOUND ONE");

                            if (TextTwo.getText().equals("7")) {
                                System.out.println("Robber Class");
                            }
                        }
                    }
                }
            }
        }
    }

    //Updates the Reosurce GUI counter
    private void updateResourceCounters(Player currentPlayer) {
        BrickCardCounter.setText(String.valueOf(currentPlayer.getResources().get("brick")));
        GrainCardCounter.setText(String.valueOf(currentPlayer.getResources().get("grain")));
        OreCardCounter.setText(String.valueOf(currentPlayer.getResources().get("ore")));
        WoolCardCounter.setText(String.valueOf(currentPlayer.getResources().get("wool")));
        WoodCardCounter.setText(String.valueOf(currentPlayer.getResources().get("wood")));
    }

    // Modify the return type of this method to boolean
    private boolean passedHexToResource(Player allPlayers, Polygon polygon) {
        boolean resourcesGiven = false;

        for (Map.Entry<Polygon, String> entry : hexagonsResources.entrySet()) {
            Polygon key = entry.getKey();
            String value = entry.getValue();

            if (key.equals(polygon)) {
                System.out.println(value);

                // Check if the player's resource map contains the resource before accessing it
                if (allPlayers.getResources().containsKey(value)) {
                    // Increment the value of the resource in the player's resources map
                    int currentValue = allPlayers.getResources().get(value);
                    allPlayers.getResources().put(value, currentValue + 1);

                    resourcesGiven = true;
                } else {
                    // If the resource is not in the player's resource map, add it with a value of 1
                    allPlayers.getResources().put(value, 1);

                    resourcesGiven = true;
                }
            }
        }

        return resourcesGiven;
    }

    //Main mouse event handler for rolling the dice
    public void roll(MouseEvent mouseEvent) {
        int diceOutcome = diceController.roll();
        distributeResources(diceOutcome);
        System.out.println("Dice Out Come" + diceOutcome);

    }

    //MouseEvent simulation (AI)






    //Mouse Handler that switch players, each time changing the resource counter for each player's resources that he has
    public void NextPlayer(MouseEvent mouseEvent) {
        if (players.isEmpty()) {
            System.out.println("The players list is empty!");
            return;
        }

        currentPlayerIndex++;
        if (currentPlayerIndex >= players.size()) {
            currentPlayerIndex = 0;
            gameCounter++;
            GameCounterID.setText(String.valueOf(gameCounter));
        }

        if (players.get(currentPlayerIndex).isAi()) {
            AIMain();
        }

        System.out.println(currentPlayerIndex);

        if (NextTurn.getText().equals("Start Game")) {
            gameCounter = 1;
            GameCounterID.setText("1");
            NextTurn.setText("Next Turn");
        }

        updateCurrentPlayer();
        BrickCardCounter.setText("0");
        GrainCardCounter.setText("0");
        OreCardCounter.setText("0");
        WoolCardCounter.setText("0");
        WoodCardCounter.setText("0");
        updateResourceCounters(players.get(currentPlayerIndex));
        changeRobberMsg.setVisible(false);
        pickPlayerMsg.setVisible(false);
    }


    private void AIMain() {
        Random random = new Random();
        if (gameCounter == 1) {
            simulateMouseEventSettlementBTN();
            int randomIndex = random.nextInt(ButtonForBuildings.size());
            RadioButton randomVisibleButton = ButtonForBuildings.get(randomIndex);
            while (!randomVisibleButton.isVisible()) {
                randomIndex = random.nextInt(ButtonForBuildings.size());
                randomVisibleButton = ButtonForBuildings.get(randomIndex);
            }
            simulateMouseEventRadioBTN(randomVisibleButton);
        }
    }








    //does updates for each player, for when pressing the radio button and showing/hiding players
    private void updateCurrentPlayer() {
        Player currentPlayer = players.get(currentPlayerIndex);
        ResourceCrdsPlayerName.setText(currentPlayer.getPlayerName());
        hideAllPlayerElements();
        for (int i = 0; i < players.size(); i++) {
            Player player = players.get(i);
            player.setPlaying(i == currentPlayerIndex);
        }
        showPlayerElements(currentPlayerIndex, currentPlayer);
        addRadioButtonListeners(currentPlayer);
    }

    //Radio buttons listeners loop through all of them
    private void addRadioButtonListeners(Player currentPlayer) {
        for (RadioButton BTN : ButtonForBuildings) {
            BTN.setOnMouseClicked(event -> handleRadioButtonSettlementAction(event, BTN, currentPlayer));
        }
    }

    //    //Settlement button
    public void addSettlement(MouseEvent mouseEvent) {
        if (currentPlayerIndex == -1) {
            PickATurnNote.setVisible(true);
        } else {
            PickATurnNote.setVisible(false);
            Player currentPlayer = players.get(currentPlayerIndex);

            // Check settlement resources when the game counter is greater than or equal to 3
            if (gameCounter >= 3) {
                checkResourcesForBuilding("Settlement", currentPlayer);
            } else {
                currentPlayer.setAddSettlement(true);
            }

            addRadioButtonListeners(currentPlayer);
        }
    }

    private void showError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
//    public void simulateMouseEventRadioBTN() {
//        double x = 100; // X coordinate of the event
//        double y = 100; // Y coordinate of the event
//        MouseButton button = MouseButton.PRIMARY; // MouseButton.PRIMARY represents a left-click event
//        int clickCount = 1; // Number of clicks (1 for single click, 2 for double click, etc.)
//
//        MouseEvent fakeMouseEvent = new MouseEvent(MouseEvent.MOUSE_CLICKED, x, y, x, y, button, clickCount, false, false, false, false, true, false, false, true, false, false, null);
//
//        handleRadioButtonSettlementAction(fakeMouseEvent);
//    }

    //Handler for every radio button so each time one is pressed it replaces it by a settlement
    private void handleRadioButtonSettlementAction(MouseEvent event, RadioButton BTN, Player currentPlayer) {
        if (players.get(currentPlayerIndex).getSettlements() != 5) {

            RadioButton radioButton = (RadioButton) event.getSource();
            double tempX = BTN.getLayoutX();
            double tempY = BTN.getLayoutY();
            if (currentPlayer.isAi()) {
                addImageSettlement(currentPlayer.getPlayerColour(), tempX, tempY);
            } else if (currentPlayer.isAddSettlement()) {
                radioButton.setVisible(false);
                addImageSettlement(currentPlayer.getPlayerColour(), tempX, tempY);
            } else {
                ImageView settlementButton = (ImageView) SettlementBTN;
                playSettlementAnimation(settlementButton);
            }
            showPlayerElements(currentPlayerIndex, currentPlayer);

        }else {
            showError("Cant add any Settlement");
        }
    }

    private void playSettlementAnimation(ImageView settlementButton) {
        ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(300), settlementButton);
        scaleTransition.setFromX(1);
        scaleTransition.setFromY(1);
        scaleTransition.setToX(1.2);
        scaleTransition.setToY(1.2);
        scaleTransition.setAutoReverse(true);
        scaleTransition.setCycleCount(2);
        scaleTransition.play();
    }


    //Main method handler when adding a settlement it gives resources depending on that
    public void addImageSettlement(Colour colour, double x, double y) {
            Image image;
            switch (colour) {
                case BLUE:
                    image = new Image("Images for the game/BlueSettlement.png");
                    break;
                case YELLOW:
                    image = new Image("Images for the game/YellowSettlement.png");
                    break;
                case GREEN:
                    image = new Image("Images for the game/GreenSettlement.png");
                    break;
                case RED:
                    image = new Image("Images for the game/RedSettlement.png");
                    break;
                default:
                    throw new IllegalArgumentException("Invalid color: " + colour);
            }
            ImageView imageView = new ImageView(image);
            AnchorPane.setTopAnchor(imageView, y - 15);
            AnchorPane.setLeftAnchor(imageView, x - 10);
            Player currentPlayer = players.get(currentPlayerIndex);
            currentPlayer.getAddedSettlements().put(imageView, currentPlayer.getPlayerColour());
            currentPlayer.setSettlements();
            anchorPane.getChildren().add(imageView);

            // Call the findNearestHexes method after adding the settlement
            double xx = imageView.getLayoutX();
            double yy = imageView.getLayoutY();

            findNearestHexes(x, y, currentPlayer, imageView);

            // Decrement resources if gameCounter is 3 or above
            if (gameCounter >= 3) {
                int currentWood = currentPlayer.getResources().get("wood");
                int currentBrick = currentPlayer.getResources().get("brick");
                int currentGrain = currentPlayer.getResources().get("grain");
                int currentWool = currentPlayer.getResources().get("wool");

                if (currentWood >= 1 && currentBrick >= 1 && currentGrain >= 1 && currentWool >= 1) {
                    currentPlayer.getResources().put("wood", currentWood - 1);
                    currentPlayer.getResources().put("brick", currentBrick - 1);
                    currentPlayer.getResources().put("grain", currentGrain - 1);
                    currentPlayer.getResources().put("wool", currentWool - 1);
                    System.out.println("Wood, brick, grain, and wool resources decremented by 1.");
                } else {
                    showError("Not enough wood, brick, grain, or wool resources.");
//                    System.out.println("Cannot decrement resources. Not enough wood, brick, grain, or wool resources.");
                }
            }

            updateRCounter(currentPlayer);
            updateResourceCounters(currentPlayer);

    }


    //Gives resources to player when he adds a settlement only in round two
    private void addResourcesFromSettlement(Player currentPlayer, ArrayList<Polygon> polygons) {
        if (gameCounter == 2) {
            for (Polygon polygon : polygons) {
                passedHexToResource(currentPlayer, polygon);
            }
            updateResourceCounters(currentPlayer);
        }
    }

    //Main method to find the nearest hex it calls option one,two,three and four
    public void findNearestHexes(double x, double y, Player currentPlayer, ImageView imageView) {
        CirclePointerHexes.setLayoutX(x + 9);
        CirclePointerHexes.setLayoutY(y + 9);
        HashSet<Polygon> polygons = new HashSet<>();
        boolean optionOneSuccessful = false;

        CirclePointerHexes.setLayoutY(y - 40);
        for (Polygon hex : hexagonsResources.keySet()) {
            Point2D circleCenterInHex = hex.parentToLocal(
                    CirclePointerHexes.localToParent(
                            CirclePointerHexes.getBoundsInLocal().getCenterX(),
                            CirclePointerHexes.getBoundsInLocal().getCenterY()
                    )
            );

            boolean isCircleInsideHex = hex.contains(circleCenterInHex);

            if (isWaterHex(CirclePointerHexes)) {
                System.out.println("The circle is in bounds of a water hex ImageView.");

            } else {
                System.out.println("The circle is not in bounds of a water hex ImageView.");
            }
            if (isCircleInsideHex) {

                polygons.add(hex);

                OptionOneLeftandRight(x + 9, y + 9, currentPlayer, "up", polygons);
                OptionOneLeftandRight(x + 9, y + 9, currentPlayer, "left", polygons);
                OptionOneLeftandRight(x + 9, y + 9, currentPlayer, "right", polygons);
                optionOneSuccessful = true;
                break;
            }
        }

        if (!optionOneSuccessful) {
            CirclePointerHexes.setLayoutX(x + 9);
            CirclePointerHexes.setLayoutY(x + 9);
            OptionTwoLeftandRight(x + 9, y + 9, currentPlayer, "down", polygons);
            OptionTwoLeftandRight(x + 9, y + 9, currentPlayer, "right", polygons);
            OptionTwoLeftandRight(x + 9, y + 9, currentPlayer, "left", polygons);
        }

        int settlementNumber = currentPlayer.getNearestHexes().size() + 1;
        ArrayList<Polygon> polygonsList = new ArrayList<>(polygons);
        currentPlayer.getNearestHexes().put("Settlement number: " + settlementNumber, polygonsList);

        addResourcesFromSettlement(currentPlayer, polygonsList);

    }

    //Option one for checking the nearest Hex by going left and right
    private void OptionOneLeftandRight(double x, double y, Player currentPlayer, String direction, HashSet<Polygon> polygons) {
        System.out.println("IN OPTION ONE");

        if (direction.equals("right")) {
            CirclePointerHexes.setLayoutX(x + 50);
            CirclePointerHexes.setLayoutY(y + 40);
        } else if (direction.equals("left")) {
            CirclePointerHexes.setLayoutX(x - 50);
            CirclePointerHexes.setLayoutY(y + 40);
        } else if (direction.equals("up")) {
            CirclePointerHexes.setLayoutY(y - 40);
        }

        for (Polygon hex : hexagonsResources.keySet()) {
            Point2D circleCenterInHex = hex.parentToLocal(
                    CirclePointerHexes.localToParent(
                            CirclePointerHexes.getBoundsInLocal().getCenterX(),
                            CirclePointerHexes.getBoundsInLocal().getCenterY()
                    )
            );

            boolean isCircleInsideHex = hex.contains(circleCenterInHex);

            if (isCircleInsideHex) {
                System.out.println("YO HO");
                polygons.add(hex);
            }
        }
    }

    //Option two for checking the nearest Hex by going left and right
    private void OptionTwoLeftandRight(double x, double y, Player currentPlayer, String direction, HashSet<Polygon> polygons) {
        System.out.println("IN OPTION TWO");

        if (direction.equals("right")) {
            CirclePointerHexes.setLayoutY(y - 40);
            CirclePointerHexes.setLayoutX(x + 50);
        } else if (direction.equals("left")) {
            CirclePointerHexes.setLayoutY(y - 40);
            CirclePointerHexes.setLayoutX(x - 50);
        } else if (direction.equals("down")) {
            CirclePointerHexes.setLayoutY(y + 40);
        }

        for (Polygon hex : hexagonsResources.keySet()) {
            Point2D circleCenterInHex = hex.parentToLocal(
                    CirclePointerHexes.localToParent(
                            CirclePointerHexes.getBoundsInLocal().getCenterX(),
                            CirclePointerHexes.getBoundsInLocal().getCenterY()
                    )
            );

            boolean isCircleInsideHex = hex.contains(circleCenterInHex);

            if (isCircleInsideHex) {
                System.out.println("YO HO");
                polygons.add(hex);
            }
        }
    }

    //Checks if there is a water hex near the settlment
    public boolean isWaterHex(Circle circle) {
        for (ImageView waterHexImageView : waterHex.keySet()) {
            Bounds waterHexBounds = waterHexImageView.localToScene(waterHexImageView.getBoundsInLocal());
            Bounds circleBounds = circle.localToScene(circle.getBoundsInLocal());

            if (waterHexBounds.intersects(circleBounds)) {
                return true;
            }
        }
        return false;
    }

    //Mouse Handler when pressing the road button
    //Mouse Handler when pressing the road button
    public void addRoad(MouseEvent mouseEvent) {
        if (currentPlayerIndex == -1) {
            PickATurnNote.setVisible(true);
            return;
        }

        PickATurnNote.setVisible(false);
        Player currentPlayer = players.get(currentPlayerIndex);

        if (!currentPlayer.isPlaying()) {
            return;
        }

        currentPlayer.setAddRoad(true);

        if (gameCounter >= 3) {
            checkResourcesForBuilding("Road", currentPlayer);
        }
    }


    private void checkResourcesForBuilding(String building, Player currentPlayer) {
        switch (building) {
            case "Road":
                checkRoadResources(currentPlayer);
            case "Settlement":
                checkSettlementResources(currentPlayer);
            case "City":
                checkCityResources(currentPlayer);
        }

    }

    private void checkCityResources(Player currentPlayer) {
        if (hasCityResources(currentPlayer)) {
            currentPlayer.setAddCity(true);
            System.out.println("You have enough resources to build a city!");
        } else {
            showError("You don't have enough resources to build a city.");
            currentPlayer.setAddCity(false);
            System.out.println("You don't have enough resources to build a city.");
        }
    }

    private boolean hasCityResources(Player currentPlayer) {
        return currentPlayer.getResources().get("grain") >= 2 && currentPlayer.getResources().get("ore") >= 3;
    }

    private void checkSettlementResources(Player currentPlayer) {
        if (hasSettlementResources(currentPlayer)) {
            currentPlayer.setAddSettlement(true);
            System.out.println("You have enough resources to build a settlement!");
        } else {
            showError("You don't have enough resources to build a settlement.");
            currentPlayer.setAddSettlement(false);
            System.out.println("You don't have enough resources to build a settlement.");
        }
    }

    private boolean hasSettlementResources(Player currentPlayer) {
        return currentPlayer.getResources().get("wood") >= 1 && currentPlayer.getResources().get("brick") >= 1
                && currentPlayer.getResources().get("grain") >= 1 && currentPlayer.getResources().get("wool") >= 1;
    }


    private void checkRoadResources(Player currentPlayer) {
        if (currentPlayer.getResources().get("wood") >= 1 && currentPlayer.getResources().get("brick") >= 1) {
            currentPlayer.setAddRoad(true);
            System.out.println("You have enough resources to build a road!");
        } else {
            showError("You don't have enough resources to build a road.");
            currentPlayer.setAddRoad(false);
            System.out.println("You don't have enough resources to build a road.");
        }
    }


    public void changeRoadColor(MouseEvent mouseEvent) {
        if (players.get(currentPlayerIndex).getRoads() != 15) {

            Rectangle clickedRoad = (Rectangle) mouseEvent.getSource();
            if ("used".equals(clickedRoad.getUserData())) {
                return;
            }
            Player currentPlayer = players.get(currentPlayerIndex);

            // Check if setAddRoad is true for the current player
            if (!currentPlayer.isAddRoad()) {
                System.out.println("setAddRoad is not true for the current player");
                return;
            }

            if (!currentPlayer.isPlaying()) {
                playRoadAnimation((ImageView) RoadBTN);
                return;
            }

            clickedRoad.setFill(currentPlayer.getPlayerColour().getFxColor());

            clickedRoad.setUserData("used");
            System.out.println(currentPlayer.getPlayerName() + currentPlayer.getRoads());
            updateLongestRoadLabel(currentPlayer);

            currentPlayer.setRoads();

            // Decrement wood and brick if the player has placed 3 or more roads
            if (currentPlayer.getRoads() >= 3) {
                int currentWood = currentPlayer.getResources().get("wood");
                int currentBrick = currentPlayer.getResources().get("brick");

                if (currentWood >= 1 && currentBrick >= 1) {
                    currentPlayer.getResources().put("wood", currentWood - 1);
                    currentPlayer.getResources().put("brick", currentBrick - 1);
                    System.out.println("Wood and brick resources decremented by 1.");
                } else {
                    System.out.println("Cannot decrement resources. Not enough wood or brick resources.");
                    showError("Not enough wood or brick resources.");
                }
            }
            updateRCounter(currentPlayer);
            updateResourceCounters(currentPlayer);
        } else {
            showError("You dont have any more roads to build");
        }
    }




    private void playRoadAnimation(ImageView roadButton) {
        ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(300), roadButton);
        scaleTransition.setFromX(1);
        scaleTransition.setFromY(1);
        scaleTransition.setToX(1.2);
        scaleTransition.setToY(1.2);
        scaleTransition.setAutoReverse(true);
        scaleTransition.setCycleCount(2);
        scaleTransition.play();
    }



    private void updateLongestRoadLabel(Player currentPlayer) {
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


    //Mouse handler for when adding a city
    public void addCity(MouseEvent mouseEvent) {
        if (currentPlayerIndex == -1) {
            PickATurnNote.setVisible(true);
        } else {
            PickATurnNote.setVisible(false);
            System.out.println("Add city is pressed");
            Player currentPlayer = players.get(currentPlayerIndex);
            System.out.println(currentPlayer.getPlayerName() + currentPlayer.getAddedSettlements());
            System.out.println(currentPlayer.getPlayerName() + currentPlayer.getAddedCities());

            // Check if the game counter is 3 or above before checking resources and allowing a city to be built
            if (gameCounter >= 3) {
                checkCityResources(currentPlayer);

                for (Map.Entry<ImageView, Colour> entry : currentPlayer.getAddedSettlements().entrySet()) {
                    ImageView image = entry.getKey();
                    Colour colour = entry.getValue();
                    currentPlayer.setAddCity(true);
                    if (entry.getValue().equals(currentPlayer.getPlayerColour())) {
                        image.setOnMouseClicked(event -> {
                            // Check if the player is allowed to build a city before proceeding
                            if (currentPlayer.isAddCity()) {
                                addCityHandler(event, image, currentPlayer);

                                // Decrement 2 grains and 3 ores
                                int currentGrain = currentPlayer.getResources().get("grain");
                                int currentOre = currentPlayer.getResources().get("ore");

                                if (currentGrain >= 2 && currentOre >= 3) {
                                    currentPlayer.getResources().put("grain", currentGrain - 2);
                                    currentPlayer.getResources().put("ore", currentOre - 3);
                                    System.out.println("Grain and ore resources decremented.");
                                    updateRCounter(currentPlayer);
                                    updateResourceCounters(currentPlayer);
                                } else {
                                    System.out.println("Cannot decrement resources. Not enough grain or ore resources.");
                                }
                            } else {
                                showError("Not enough resources to build a city.");
                            }
                        });
                    } else {
                        System.out.println("Not the right colour player");
                    }
                }
            } else {
                showError("You can only build a city starting from round 3.");
            }
        }
    }



    //Handler for when adding a city, changes the settlement to an image
    private void addCityHandler(MouseEvent event, ImageView image, Player currentPlayer) {
        if(currentPlayer.getCity() != 4) {
            System.out.println("HI works");
            image = (ImageView) event.getSource();
            double tempX = image.getLayoutX();
            double tempY = image.getLayoutY();
            if (currentPlayer.isPlaying() || currentPlayer.isAddSettlement()) {
                image.setVisible(false);
                addImageCity(currentPlayer.getPlayerColour(), tempX, tempY);
            } else {
                playSettlementAnimation((ImageView) SettlementBTN);
            }
        }else {
            showError("You dont have any more cities to build");
        }
    }

    //Adds a city image  in the position of the settlement
    private void addImageCity(Colour colour, double x, double y) {
            Image image;
            switch (colour) {
                case BLUE:
                    image = new Image("Images for the game/BlueCity.png");
                    break;
                case YELLOW:
                    image = new Image("Images for the game/YellowCity.png");
                    break;
                case GREEN:
                    image = new Image("Images for the game/GreenCity.png");
                    break;
                case RED:
                    image = new Image("Images for the game/RedCity.png");
                    break;
                default:
                    throw new IllegalArgumentException("Invalid color: " + colour);
            }
            ImageView imageView = new ImageView(image);
            imageView.setFitWidth(60);
            imageView.setFitHeight(70);
            // Set the image position
            AnchorPane.setTopAnchor(imageView, y - 15);
            AnchorPane.setLeftAnchor(imageView, x - 10);
            Player currentPlayer = players.get(currentPlayerIndex);
            currentPlayer.getAddedCities().put(imageView, currentPlayer.getPlayerColour());
            currentPlayer.setCity();
            // Add the image to the AnchorPane
            anchorPane.getChildren().add(imageView);

    }

    //Hide elements for each player
    private void hideAllPlayerElements() {
        PlayerOneLongestRoad.setVisible(false);
        PlayerTwoLongestRoad.setVisible(false);
        PlayerThreeLongestRoad.setVisible(false);
        PlayerFourLongestRoad.setVisible(false);
    }
    //Handles all the changes that happens to the player TagBox
    private void showPlayerElements(int playerIndex, Player currentPlayer) {
        switch (playerIndex) {
            case 0 -> {
                PlayerOneLongestRoad.setText("Longest Road: " + String.valueOf(currentPlayer.getRoads()));
                PlayerOneLongestRoad.setVisible(true);

            }
            case 1 -> {
                PlayerTwoLongestRoad.setText("Longest Road: " + String.valueOf(currentPlayer.getRoads()));
                PlayerTwoLongestRoad.setVisible(true);
            }
            case 2 -> {
                PlayerThreeLongestRoad.setText("Longest Road: " + String.valueOf(currentPlayer.getRoads()));
                PlayerThreeLongestRoad.setVisible(true);

            }
            case 3 -> {
                PlayerFourLongestRoad.setText("Longest Road: " + String.valueOf(currentPlayer.getRoads()));
                PlayerFourLongestRoad.setVisible(true);
            }
            default -> throw new IllegalArgumentException("Invalid player index: " + playerIndex);
        }
    }
    //Handler to quit the game
    @FXML
    private void handleQuitGame(ActionEvent event) {
        Stage stage = (Stage) QuitGame.getScene().getWindow();
        stage.close();
    }
    //Only to debug
    public void DEBUG(MouseEvent event) {
        System.out.println("///////////////");
//        Player cp = players.get(currentPlayerIndex);
        for (Player cp : players) {
            System.out.println("Player Name :"+cp.getPlayerName());
            System.out.println();
            for (Map.Entry<String, Integer> resource : cp.getResources().entrySet()) {
                String resources = resource.getKey();
                Integer valueOfResource = resource.getValue();
                System.out.println(resources + " " + valueOfResource);
            }
        }
        System.out.println(resourceDeck.getCount("wood"));
        System.out.println(players.get(currentPlayerIndex).getSettlements());
    }
}






