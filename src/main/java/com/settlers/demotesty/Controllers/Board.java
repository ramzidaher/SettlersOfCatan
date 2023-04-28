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
import javafx.scene.Node;
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
import java.io.IOException;
import java.net.URL;
import java.util.*;
import java.util.List;


/**
 * This class represents the Board Controller which has the Board builder.
 * @version 1.0
 * @author Ramzi
 */
public class Board extends SignUpController  implements Initializable {

    @FXML
    public Group PlayerOneTagBox, PlayerTwoTagBox, PlayerThreeTagBox, PlayerFoursTagBox;
    public Text PlayerOneVP,PlayerTwoVP,PlayerThreeVP,PlayerFourVP;
    @FXML
    public AnchorPane DiceAnchor;
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
    @FXML

    public ImageView RoberImage, CityBTN, RoadBTN, SettlementBTN, WaterHex1, WaterHex10, WaterHex11, WaterHex12, WaterHex13, WaterHex14, WaterHex15,
            WaterHex16, WaterHex17, WaterHex18, WaterHex2, WaterHex3, WaterHex4, WaterHex5, WaterHex6, WaterHex7, WaterHex8, WaterHex9;

    // Button
    @FXML
    public Button QuitGame, TradeBTN, DiceRollBTN, NextTurn;

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
    private static Player gameWinner;

    /**
     This method is an implementation of the initialize() method from the Initializable interface.
     It is called when the corresponding FXML file is loaded and allows for initialization of
     the controller and its components.
     @param url The URL location of the FXML file.
     @param resourceBundle The ResourceBundle for the FXML file.
     @return void
     */
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
//        players.add(player1);
//        players.add(player2);
//        players.add(player3);
//        players.add(player4);
//        player1.setAi(true);
//        player2.setAi(true);
//        player3.setAi(true);
//        player4.setAi(true);
        diceController = new DiceController(dice1, dice2, DiceOutCome);
        assignPlayer();//TODO change the position of it put it back on top
        //Put's Robber on the desert
        RoberImage.setLayoutX(HexDesert.getLayoutX() - 30);
        RoberImage.setLayoutY(HexDesert.getLayoutY() - 43);
        if (players.get(0).isAi()) {
            System.out.println("YO YO");
            simulateMouseEvent();
        }
        DiceRollBTN.setVisible(false);
        DiceAnchor.setVisible(false);
    }

    //Everything AI Related is here


    /**
     * This method simulates a mouse click event on the screen. It creates a MouseEvent object
     * with the given coordinates, mouse button, and click count, and passes it to the NextPlayer
     * method multiple times.
     * @return void
     */
    public void simulateMouseEvent() {
        double x = 100; // X coordinate of the event
        double y = 100; // Y coordinate of the event
        MouseButton button = MouseButton.PRIMARY; // MouseButton.PRIMARY represents a left-click event
        int clickCount = 1; // Number of clicks (1 for single click, 2 for double click, etc.)

        MouseEvent fakeMouseEvent = new MouseEvent(MouseEvent.MOUSE_CLICKED, x, y, x, y, button, clickCount, false, false, false, false, true, false, false, true, false, false, null);

        // Call NextPlayer method multiple times with the fakeMouseEvent parameter
        NextPlayer(fakeMouseEvent);
        NextPlayer(fakeMouseEvent);
        NextPlayer(fakeMouseEvent);
        NextPlayer(fakeMouseEvent);

        // Uncomment below lines to execute additional methods with the fakeMouseEvent parameter
        //    AIMain();
        //    changeRoadColor(fakeMouseEvent);
    }
    /**
     * This method simulates a mouse click event on the screen to add a settlement for AI.
     * It creates a MouseEvent object with the given coordinates, mouse button, and click count,
     * and passes it to the addSettlement method.
     *
     * @return void
     */
    public void simulateMouseEventSettlementBTN() {
        double x = 100; // X coordinate of the event
        double y = 100; // Y coordinate of the event
        MouseButton button = MouseButton.PRIMARY; // MouseButton.PRIMARY represents a left-click event
        int clickCount = 1; // Number of clicks (1 for single click, 2 for double click, etc.)

        MouseEvent fakeMouseEvent = new MouseEvent(MouseEvent.MOUSE_CLICKED, x, y, x, y, button, clickCount, false, false, false, false, true, false, false, true, false, false, null);

        // Call addSettlement method with the fakeMouseEvent parameter
        addSettlement(fakeMouseEvent);
    }

    /**
     * This method simulates a mouse click event on the screen to select a radio button for AI.
     * It creates a MouseEvent object with the given coordinates, mouse button, and click count,
     * and passes it to the handleRadioButtonSettlementActionAI method.
     * @param randomVisibleButton The radio button to be selected.
     * @return void
     */
    public void simulateMouseEventRadioBTN(RadioButton randomVisibleButton) {
        double x = 100; // X coordinate of the event
        double y = 100; // Y coordinate of the event
        MouseButton button = MouseButton.PRIMARY; // MouseButton.PRIMARY represents a left-click event
        int clickCount = 1; // Number of clicks (1 for single click, 2 for double click, etc.)

        MouseEvent fakeMouseEvent = new MouseEvent(MouseEvent.MOUSE_CLICKED, x, y, x, y, button, clickCount, false, false, false, false, true, false, false, true, false, false, null);

        // Call handleRadioButtonSettlementActionAI method with the fakeMouseEvent parameter
        // and the given radio button and current player object
        handleRadioButtonSettlementActionAI(fakeMouseEvent, randomVisibleButton, players.get(currentPlayerIndex));
    }


    /**
     * This method handles the radio button click event for adding a settlement.
     * It checks if the player has remaining settlements and if they are allowed to add a settlement.
     * If yes, it updates the player's addSettlement field, hides the clicked button, and adds
     * the settlement image to the game board. If not, it shows an error message.
     * @param event The MouseEvent object representing the radio button click event.
     * @param BTN The RadioButton object that was clicked.
     * @param currentPlayer The Player object representing the current player.
     * @return void
     */
    private void handleRadioButtonSettlementActions(MouseEvent event, RadioButton BTN, Player currentPlayer) {
        if (currentPlayer.getSettlements() != 5) {
            if (currentPlayer.isAddSettlement()) {
                currentPlayer.setAddSettlement(false);
            }
            double tempX = BTN.getLayoutX();
            double tempY = BTN.getLayoutY();
            if (currentPlayer.isAddSettlement()) {
                BTN.setVisible(false);
                addImageSettlement(currentPlayer.getPlayerColour(), tempX, tempY);
            } else {
                ImageView settlementButton = (ImageView) SettlementBTN;
                playSettlementAnimation(settlementButton);
                return;
            }
            showPlayerElements(currentPlayerIndex, currentPlayer);
        } else {
            showError("Cant add any Settlement, no more available");
        }
    }
    /**
     * Adds listeners to the radio buttons for the current player
     * @param currentPlayer the current player
     */
    private void addRadioButtonListenersAI(Player currentPlayer) {
        for (RadioButton BTN : ButtonForBuildings) {
            BTN.setOnMouseClicked(event -> handleRadioButtonSettlementActionAI(event, BTN, currentPlayer));
        }
    }

    /**
     * Handles the action when a settlement radio button is clicked for an AI player
     * @param event the MouseEvent when the radio button is clicked
     * @param btn the radio button that was clicked
     * @param currentPlayer the current player whose turn it is
     */
    private void handleRadioButtonSettlementActionAI(MouseEvent event, RadioButton btn, Player currentPlayer) {
        if (players.get(currentPlayerIndex).getSettlements() != 5) {
            // Get the source of the MouseEvent instead of casting the event itself
            RadioButton radioButton = (RadioButton) event.getPickResult().getIntersectedNode();
            double tempX = btn.getLayoutX();
            double tempY = btn.getLayoutY();

            // If the current player is an AI, add the settlement image automatically
            if (currentPlayer.isAi()) {
                addImageSettlement(currentPlayer.getPlayerColour(), tempX, tempY);
            }
            // If the current player is not an AI and is allowed to add a settlement, add the settlement image and hide the radio button
            else if (currentPlayer.isAddSettlement()) {
                radioButton.setVisible(false);
                addImageSettlement(currentPlayer.getPlayerColour(), tempX, tempY);
            }
            // If the current player is not an AI and is not allowed to add a settlement, play the settlement animation
            else {
                ImageView settlementButton = (ImageView) SettlementBTN;
                playSettlementAnimation(settlementButton);
            }
            showPlayerElements(currentPlayerIndex, currentPlayer);
            currentPlayer.setAddSettlement(false);
        } else {
            showError("Cannot add any more settlements. No more settlements left!");
        }
    }

    /**
     * Handles the AI turn
     */
    private void AIMain() {
        Random random = new Random();
//        if (gameCounter == 1) {
        simulateMouseEventSettlementBTN();
        int randomIndex = random.nextInt(ButtonForBuildings.size());
        RadioButton randomVisibleButton = ButtonForBuildings.get(randomIndex);
        while (!randomVisibleButton.isVisible()) {
            randomIndex = random.nextInt(ButtonForBuildings.size());
            randomVisibleButton = ButtonForBuildings.get(randomIndex);
        }
        simulateMouseEventRadioBTN(randomVisibleButton);
//        }
    }


    /**
     * This method assigns player names to the respective PlayerID labels.
     * It sets the text of each PlayerID label to the name of the corresponding player
     * in the players list and fills the corresponding PlayerTagBoxColor with the player's color.
     * @return void
     */
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


    /**
     * This method shuffles the positions of the hexagons on the board.
     * It creates copies of the original coordinates lists, saves the original coordinates of hexagons,
     * shuffles the hexagons using a random index, and updates the x and y layout positions of the hexagons.
     * @return void
     */
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


    /**
     * This method returns the x-coordinate layout position of the "HexDesert" hexagon.
     * @return The double value of the x-coordinate layout position of the "HexDesert" hexagon.
     */
    private double getHexDesertX() {
        return hexagonsById.get("HexDesert").getLayoutX();
    }

    /**
     * This method returns the y-coordinate layout position of the "HexDesert" hexagon.
     * @return The double value of the y-coordinate layout position of the "HexDesert" hexagon.
     */
    private double getHexDesertY() {
        return hexagonsById.get("HexDesert").getLayoutY();
    }



    /**
     * This method shuffles the number tokens around the board.
     * It hides the desert number token (Num_19) since the desert hexagon has no number,
     * removes Num_19 from the TextNumbers list, iterates through each number token in TextNumbers,
     * generates random coordinates for the number tokens, checks if the number token is too close to the desert hexagon,
     * and sets the layout position of the number token to the randomly chosen coordinates.
     * @return void
     */
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




    /**
     * This method checks the dice outcome and distributes resources accordingly.
     * It iterates through each number token and checks if its value is equal to the dice outcome.
     * If it is, it stores the Text object in a temporary array of size 2, with the first element being the current Text object
     * and the second element being the next Text object with the same value (if any).
     * If the dice outcome is 7, it displays a message indicating that the player can move the robber and sets event handlers for hexagons and number tokens.
     * It then calls the checksHexandNumber method with the temporary array of Text objects as a parameter.
     * @param diceOutcome The value of the dice outcome.
     * @return void
     */
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

    /**
     * This method displays a message indicating that the player can move the robber, and sets event handlers for hexagons and number tokens.
     * @param robberImage The ImageView of the robber to be moved.
     * @return void
     */
    private void changeRobberPosition(ImageView robberImage) {
        changeRobberMsg.setVisible(true);
        setHexagonsAndTextEventHandlers();
    }

    /**
     * This method sets event handlers for hexagons and number tokens.
     * It iterates through each hexagon and number token and sets a mouse click event handler.
     * @return void
     */
    private void setHexagonsAndTextEventHandlers() {
        for (Map.Entry<Polygon, String> entry : hexagonsResources.entrySet()) {
            Polygon polygon = entry.getKey();
            polygon.setOnMouseClicked(event -> elementPressed(polygon));
        }
        for (Text nums : TextNumbers) {
            nums.setOnMouseClicked(event -> elementPressed(nums));
        }
    }

    /**
     * Checks if the hexagon is the same as the number so when a player presses the hex or number it will send an event
     * @param element the element that has been pressed, either a Polygon or Text object.
     */
    private void elementPressed(Object element) {
        // checks if the robber move is allowed, if not it returns
        if (!isRobberMoveAllowed) {
            return;
        }

        // If the element is a Polygon, move the robber to that location.
        if (element instanceof Polygon) {
            System.out.println("Polygon pressed: " + element);
            double x = ((Polygon) element).getLayoutX();
            double y = ((Polygon) element).getLayoutY();
            moveRobber(x, y);
        }
        // If the element is a Text object, move the robber to the corresponding hexagon location.
        else if (element instanceof Text) {
            System.out.println("Hex/Numbers is pressed");
            double x = ((Text) element).getLayoutX();
            double y = ((Text) element).getLayoutY();
            moveRobber(x, y);
        }
    }

    /**
     * Moves the robber to the hexagon that has been pressed
     * @param x the x-coordinate of the hexagon that was pressed
     * @param y the y-coordinate of the hexagon that was pressed
     */
    private void moveRobber(double x, double y) {
        // Update the layout of the robber image based on the coordinates of the hexagon that was pressed
        RoberImage.setLayoutX(x - 30);
        RoberImage.setLayoutY(y - 43);
        // Hide the message that prompts the player to change the robber's location
        changeRobberMsg.setVisible(false);

        // Check each hexagon on the board to see if the robber is currently on it
        for (Polygon hex : hexagonsResources.keySet()) {
            // Convert the center coordinates of the robber image to local coordinates of the hexagon
            Point2D robber = hex.parentToLocal(
                    RoberImage.localToParent(
                            RoberImage.getBoundsInLocal().getCenterX(),
                            RoberImage.getBoundsInLocal().getCenterY()
                    )
            );
            // Check if the robber is inside the hexagon
            boolean robberInsideHex = hex.contains(robber);

            if (robberInsideHex) {
                // Print the ID of the hexagon the robber is on
                System.out.println("Robber is on the " + hex.getId());

                // Create a list of players who have settlements on the hexagon
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
                // If there is more than one player with settlements on the hexagon, prompt the user to choose which player to steal from
                if (playersWithSettlementOnHex.size() > 1) {
                    System.out.println("There are multiple players with settlements on this hex. Choose which player to steal from.");
                    pickPlayerMsg.setVisible(true);

                    // Call the getUserChoice method with a callback that will be executed when a player is chosen
                    getUserChoice(playersWithSettlementOnHex, chosenPlayer -> {
                        stealResourcesFromHex(chosenPlayer, hex);
                        updateRCounter(chosenPlayer);
                        updateRCounter(players.get(currentPlayerIndex));
                    });
                }
                // If there is only one player with a settlement on the hexagon, steal resources from them
                else if (playersWithSettlementOnHex.size() == 1) {
                    stealResourcesFromHex(playersWithSettlementOnHex.get(0), hex);
                }
            }
        }
        // Set the flag to prevent the player from moving the robber again in the same turn
        isRobberMoveAllowed = false;
    }

    /**
     * This method is called when the user wants to initiate a trade and opens a new window for trading.
     *
     * @param event The mouse event that triggers the trade method.
     * @throws IOException If there is an error loading the FXML file for the trading window.
     */
    public void Trade(MouseEvent event) throws IOException {
        // Create a new FXML loader to load the trading window
        FXMLLoader loader = new FXMLLoader(WelcomeController.class.getResource("/com/settlers/demotesty/tradeNew.fxml"));
        // Load the trading window FXML file
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Stage newStage = new Stage();
        // Set the scene for the trading window stage
        newStage.setScene(scene);
        newStage.initModality(Modality.APPLICATION_MODAL);
        // Show the trading window
        newStage.show();
    }

    /**
     * Returns the index of the current player.
     * @return The index of the current player.
     */
    public static int getCurrentPlayerIndex() {
        return currentPlayerIndex;
    }

    /**
     * This method is called when the mouse enters a UI element, but it does not do anything.
     * @param event The mouse event that triggered the hoverEnter method.
     */
    public void hoverEnter(MouseEvent event) {
        // This method intentionally left blank
    }

    /**
     * This method is called when the mouse exits a UI element, but it does not do anything.
     * @param event The mouse event that triggered the hoverExit method.
     */
    public void hoverExit(MouseEvent event) {
        // This method intentionally left blank
    }

    /**
     * An interface that defines a callback for when a player is chosen in the getUserChoice method.
     */
    public interface PlayerChoiceCallback {
        /**
         * This method is called when a player is chosen in the getUserChoice method.
         * @param player The player that was chosen.
         */
        void onPlayerChosen(Player player);
    }


    /**
     * Prompts the user to choose a player from a list of players and executes the specified callback when a player is chosen.
     * @param playersWithSettlementOnHex The list of players who have settlements on the hexagon the robber is on.
     * @param callback                   The callback to execute when a player is chosen.
     */
    private void getUserChoice(ArrayList<Player> playersWithSettlementOnHex, PlayerChoiceCallback callback) {
        // Set up event handlers for each player's tag box
        PlayerOneTagBox.setOnMouseClicked(event -> {
            if (playersWithSettlementOnHex.contains(players.get(0))) {
                // Execute the callback with the chosen player
                callback.onPlayerChosen(players.get(0));
            }
        });
        PlayerTwoTagBox.setOnMouseClicked(event -> {
            if (playersWithSettlementOnHex.contains(players.get(1))) {
                // Execute the callback with the chosen player
                callback.onPlayerChosen(players.get(1));
            }
        });
        PlayerThreeTagBox.setOnMouseClicked(event -> {
            if (playersWithSettlementOnHex.contains(players.get(2))) {
                // Execute the callback with the chosen player
                callback.onPlayerChosen(players.get(2));
            }
        });
        PlayerFoursTagBox.setOnMouseClicked(event -> {
            if (playersWithSettlementOnHex.contains(players.get(3))) {
                // Execute the callback with the chosen player
                callback.onPlayerChosen(players.get(3));
            }
        });
    }

    /**
     * Steals resources from a player who has settlements on a specified hexagon.
     * @param cp  The player who has settlements on the specified hexagon.
     * @param hex The hexagon from which to steal resources.
     */
    private void stealResourcesFromHex(Player cp, Polygon hex) {
        // If either parameter is null, return without doing anything
        if (cp == null || hex == null) {
            return;
        }
        // Get the type of resource on the specified hexagon
        String hexResource = hexagonsResources.get(hex);
        // If the resource type is not found, print a message and return
        if (hexResource == null) {
            System.out.println("Resource type not found for the given hex parameter.");
            return;
        }
        // Print the type of resource on the hexagon
        System.out.println("Resource type for hex: " + hexResource);//TODO Remove the print statement
        // Steal resources from the specified player based on the type of resource on the hexagon
        stealResourcesFromPlayer(cp, hexResource);
    }


    /**
     * Steals a resource from a player and gives it to the current player.
     * @param cp          The player from whom to steal the resource.
     * @param hexResource The type of resource to steal.
     */
    private void stealResourcesFromPlayer(Player cp, String hexResource) {
        // Get the resource type for the given hex parameter
        String resourceType = hexResource;
        // If the resource type is not found, print a message and return
        if (resourceType == null) {
            System.out.println("Resource type not found for the given hex parameter.");
            return;
        }
        System.out.println("Resource type for hex: " + resourceType);
        // Loop through the resources of the specified player
        for (Map.Entry<String, Integer> entry : cp.getResources().entrySet()) {
            String hexResourceType = entry.getKey();
            Integer value = entry.getValue();

            // Check if the current resource type matches the resource type to steal
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
                    updateResourceCounters(currentPlayer);
                    updateRCounter(cp);
                } else {
                    System.out.println("No resources of this type available to steal.");
                }
                break; // Exit the loop since the resource type is found
            }
        }
    }

    /**
     * Updates the resource counter for a player in the UI.
     * @param player The player whose resource counter to update.
     */
    private void updateRCounter(Player player) {
        // Calculate the total number of non-desert resources the player has
        int totalResources = player.getResources().entrySet().stream()
                .filter(entry -> !entry.getKey().equalsIgnoreCase("desert"))
                .mapToInt(entry -> entry.getValue())
                .sum();
        // Get the index of the player
        int playerIndex = players.indexOf(player);

        // Update the resource counter for the player in the UI based on their index
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


    /**
     * Checks if a hexagon on the board matches a given number token, and if so, gives resources to the players
     * with settlements on that hexagon.
     * @param tempTexts An array of Text objects representing the number tokens on the board.
     */
    public void checksHexandNumber(Text[] tempTexts) {
        // Get the Text objects for the two number tokens
        Text TextOne = tempTexts[0];
        Text TextTwo = tempTexts[1];
        // If both Text objects are null, return immediately
        if (TextOne == null && TextTwo == null) {
            return;
        }
        // Loop through all players and their nearest hexagons
        for (Player allPlayers : players) {
            for (Map.Entry<String, ArrayList<Polygon>> entry : allPlayers.getNearestHexes().entrySet()) {
                ArrayList<Polygon> polygons = entry.getValue();
                // Loop through all hexagons in the current player's list of nearest hexagons
                for (Polygon polygon : polygons) {
                    System.out.println(polygon);
                    // Check if TextOne matches the current hexagon's coordinates
                    if (TextOne != null) {
                        System.out.println("TXT ONE");
                        System.out.println(TextOne.getText());
                        double TextOneX = TextOne.getLayoutX();
                        double TextOneY = TextOne.getLayoutY();
                        if ((polygon.getLayoutX() == TextOneX) && (polygon.getLayoutY() == TextOneY)) {
                            // Check if the current hexagon has a resource associated with it
                            if (hexagonsResources.get(polygon) == null) {
                                continue; // Skip the current iteration of the loop
                            }
                            // Give resources to the players with settlements on the current hexagon
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
                    // Check if TextTwo matches the current hexagon's coordinates
                    if (TextTwo != null) {
                        double TextTwoX = TextTwo.getLayoutX();
                        double TextTwoY = TextTwo.getLayoutY();
                        if ((polygon.getLayoutX() == TextTwoX) && (polygon.getLayoutY() == TextTwoY)) {
                            // Check if the current hexagon has a resource associated with it
                            if (hexagonsResources.get(polygon) == null) {
                                continue; // Skip the current iteration of the loop
                            }
                            // Give resources to the players with settlements on the current hexagon
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

    /**
     * Updates the resource GUI counter for the current player
     * @param currentPlayer the current player whose resource GUI counter needs to be updated
     */
    private void updateResourceCounters(Player currentPlayer) {
        BrickCardCounter.setText(String.valueOf(currentPlayer.getResources().get("brick")));
        GrainCardCounter.setText(String.valueOf(currentPlayer.getResources().get("grain")));
        OreCardCounter.setText(String.valueOf(currentPlayer.getResources().get("ore")));
        WoolCardCounter.setText(String.valueOf(currentPlayer.getResources().get("wool")));
        WoodCardCounter.setText(String.valueOf(currentPlayer.getResources().get("wood")));
    }

    /**
     * Gives resources to a player based on the resource type of given hexagon.
     * @param allPlayers The player to give resources to.
     * @param polygon    The hexagon to check for a resource type.
     * @return True if the player was given resources, false otherwise.
     */
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


    /**
     * Rolls the dice and distributes resources based on the outcome
     * @param mouseEvent the MouseEvent that triggers the method
     */
    public void roll(MouseEvent mouseEvent) {
        Player currentPlayer = players.get(currentPlayerIndex);
        if (!currentPlayer.hasRolledThisRound()) {
            // Roll the dice using the diceController
            int diceOutcome = diceController.roll();
            // Distribute resources based on the dice outcome
            distributeResources(diceOutcome);
            System.out.println("Dice Outcome: " + diceOutcome); //TODO Remove this print statement

            // Set hasRolledThisRound to true after rolling the dice
            currentPlayer.setHasRolledThisRound(true);
        } else {
            showError("You can only roll the dice once per round.");
        }
    }

    /**
     * Mouse Handler that switches players, changing the resource counters for each player's resources that they have
     * Also checks if a player has reached 10 victory points, and ends the game if necessary
     * @param mouseEvent the MouseEvent that triggers the method
     */
    public void NextPlayer(MouseEvent mouseEvent) {
        System.out.println("Game Round: " + gameCounter + " Current Player: " + currentPlayerIndex);
        if (players.isEmpty()) {
            System.out.println("The players list is empty!");
            return;
        }
        // Check if a player has reached 10 victory points
        for (Player player : players) {
            if (player.getVP() >= 10) {
                setGameWinner(player);
                endGame(anchorPane);
            }
        }
        // Switch to the next player
        currentPlayerIndex++;
        if (currentPlayerIndex >= players.size()) {
            currentPlayerIndex = 0;
        }
        for (Player player : players) {
            player.setHasRolledThisRound(false);
        }
        // Increment the game counter when the index is reset to 0 (i.e., when the first player starts their turn)
        if (currentPlayerIndex == 0) {
            gameCounter++;
            GameCounterID.setText(String.valueOf(gameCounter));
        }
        // If the current player is an AI, execute the AI turn
        if (players.get(currentPlayerIndex).isAi()) {
            AIMain();
        }
        // Update the UI to reflect the new current player
        updateCurrentPlayer();
        BrickCardCounter.setText("0");
        GrainCardCounter.setText("0");
        OreCardCounter.setText("0");
        WoolCardCounter.setText("0");
        WoodCardCounter.setText("0");
        changeRobberMsg.setVisible(false);
        pickPlayerMsg.setVisible(false);
        setPlayerVPs();

        // If the game is starting, reset the game counter and change the Next Turn button text
        if (NextTurn.getText().equals("Start Game")) {
            gameCounter = 1;
            GameCounterID.setText("1");
            NextTurn.setText("Next Turn");
        }
        if (gameCounter == 1 || gameCounter ==2){
            DiceRollBTN.setVisible(false);
            DiceAnchor.setVisible(false);

        }else {
            DiceRollBTN.setVisible(true);
            DiceAnchor.setVisible(true);

        }
        players.get(currentPlayerIndex).setHasRolledThisRound(false);

    }

    /**
     * Setter method for the game winner
     * @param player the player who has won the game
     */
    void setGameWinner(Player player) {
        this.gameWinner = player;
    }

    /**
     * Getter method for the game winner
     * @return the player who has won the game
     */
    static Player getGameWinner() {
        return gameWinner;
    }

    /**
     * Ends the game and opens the WinnerPage.fxml file
     * @param nodeInCurrentScene the Node in the current Scene to close before opening the new Scene
     */
    private void endGame(Node nodeInCurrentScene) {
        System.out.println("IM IN WINNER PAGE");
        try {
            // Load the WinnerPage.fxml file
            FXMLLoader loader = new FXMLLoader(WelcomeController.class.getResource("/com/settlers/demotesty/WinnerPage.fxml"));
            Parent root = loader.load();
            // Create a new Scene with the loaded root
            Scene scene = new Scene(root);
            // Get the current stage from the passed node
            Stage currentStage = (Stage) nodeInCurrentScene.getScene().getWindow();
            currentStage.close(); // Close the current stage
            // Create a new Stage and set the Scene to it
            Stage newStage = new Stage();
            newStage.setScene(scene);
            newStage.setResizable(false);
            newStage.show(); // Show the new stage
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




    /**
     * Updates the UI to reflect the current player
     */
    private void updateCurrentPlayer() {
        Player currentPlayer = players.get(currentPlayerIndex);
        ResourceCrdsPlayerName.setText(currentPlayer.getPlayerName());
        for (int i = 0; i < players.size(); i++) {
            Player player = players.get(i);
            player.setPlaying(i == currentPlayerIndex);
        }
        showPlayerElements(currentPlayerIndex, currentPlayer);
        addRadioButtonListeners(currentPlayer);
    }

    /**
     * Adds listeners to the radio buttons for the current player
     * @param currentPlayer the current player
     */
    private void addRadioButtonListeners(Player currentPlayer) {
        for (RadioButton BTN : ButtonForBuildings) {
            BTN.setOnMouseClicked(event -> handleRadioButtonSettlementAction(event, BTN, currentPlayer));
        }
    }


    /**
     * Handles adding a settlement for the current player
     * @param mouseEvent the MouseEvent that triggers the method
     */
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

    /**
     * Shows an error message with the given message
     * @param message the error message to display
     */
    private void showError(String message) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Error");
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    /**
     * Sets the victory points for each player
     */
    private void setPlayerVPs() {
        players.get(0).setVP();
        PlayerOneVP.setText(String.valueOf(players.get(0).getVP()));
        players.get(1).setVP();
        PlayerTwoVP.setText(String.valueOf(players.get(1).getVP()));
        players.get(2).setVP();
        PlayerThreeVP.setText(String.valueOf(players.get(2).getVP()));
        players.get(3).setVP();
        PlayerFourVP.setText(String.valueOf(players.get(3).getVP()));
    }

    /**
     * Handles the action for when a radio button is clicked to place a settlement
     *
     * @param event         the MouseEvent that triggers the method
     * @param BTN           the RadioButton that was clicked
     * @param currentPlayer the current player
     */
    private void handleRadioButtonSettlementAction(MouseEvent event, RadioButton BTN, Player currentPlayer) {
        if (currentPlayer.isAi() || currentPlayer.isAddSettlement()) {
            if ((gameCounter == 1 && currentPlayer.getSettlements() == 1) || (gameCounter == 2 && currentPlayer.getSettlements() == 2)) {
                showError("Cannot add any more settlements. Only one settlement allowed at this stage!");
                return;
            }
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
                currentPlayer.setAddSettlement(false);
            } else {
                showError("Cannot add any more settlements. No more settlements left!");
            }
        } else {
            playSettlementAnimation((ImageView) SettlementBTN);
        }
    }

    /**
     * Plays the settlement button animation
     * @param settlementButton the ImageView of the settlement button
     */
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

    /**
     * Adds a settlement image for the current player and gives resources depending on the settlement location
     * @param colour the color of the settlement
     * @param x      the x-coordinate of the settlement
     * @param y      the y-coordinate of the settlement
     */
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
        if (currentPlayer.isAi()) {
            System.out.println("HEHEHE ADDING AND GETTING RESOURCES FOR AI");
            currentPlayer.getAddedSettlements().put(imageView, currentPlayer.getPlayerColour());
        }else {
            currentPlayer.getAddedSettlements().put(imageView, currentPlayer.getPlayerColour());

        }
        currentPlayer.setSettlements();
        setPlayerVPs();
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
            }
        }
        updateRCounter(currentPlayer);
        updateResourceCounters(currentPlayer);
    }

    /**
     * Adds resources to the current player when a settlement is added in round two
     * @param currentPlayer the current player
     * @param polygons      the list of hexagon polygons on the game board
     */
    private void addResourcesFromSettlement(Player currentPlayer, ArrayList<Polygon> polygons) {
        if (gameCounter == 2) {
            for (Polygon polygon : polygons) {
                passedHexToResource(currentPlayer, polygon);
            }
            updateResourceCounters(currentPlayer);
        }
    }
    public Rectangle findNearestRoad(double x, double y) {
        double minDistance = Double.MAX_VALUE;
        Rectangle nearestRoad = null;

        System.out.println("Total roads in the Roads array: " + Roads.size());

        for (Rectangle road : Roads) {
            double roadCenterX = road.getX() + (road.getWidth() / 2);
            double roadCenterY = road.getY() + (road.getHeight() / 2);
            double distance = Math.sqrt(Math.pow(roadCenterX - x, 2) + Math.pow(roadCenterY - y, 2));
            System.out.println("Checking road at (" + road.getX() + ", " + road.getY() + "), distance: " + distance);
            if (distance < minDistance) {
                minDistance = distance;
                nearestRoad = road;
            }
        }
        return nearestRoad;
    }

    /**
     * Finds the nearest hex to the given coordinates and adds it to the player's nearestHexes map.
     * @param x             the x coordinate of the settlement
     * @param y             the y coordinate of the settlement
     * @param currentPlayer the player who is adding the settlement
     * @param imageView     the image view of the settlement being added
     */
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
        Rectangle nearestRoad = findNearestRoad(x, y);

        // Check if the nearest road exists
        if (nearestRoad != null) {
            System.out.println("Nearest road found at: (" + nearestRoad.getX() + ", " + nearestRoad.getY() + ")");
        } else {
            System.out.println("No roads found");
        }
    }


    /**
     * Checks for the nearest hex by going left and right.
     *
     * @param x             The x-coordinate of the current position.
     * @param y             The y-coordinate of the current position.
     * @param currentPlayer The current player.
     * @param direction     The direction to search in (left, right, or up).
     * @param polygons      A HashSet of polygons to store the nearest hexagons found.
     */
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

    /**
     * Checks for the nearest hex by going left and right.
     * @param x             The x-coordinate of the current position.
     * @param y             The y-coordinate of the current position.
     * @param currentPlayer The current player.
     * @param direction     The direction to search in (left, right, or down).
     * @param polygons      A HashSet of polygons to store the nearest hexagons found.
     */
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


    /**
     * Checks if there is a water hex near the settlement.
     *
     * @param circle The circle representing the settlement.
     * @return True if there is a water hex nearby, false otherwise.
     */
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


    /**
     * Handles the mouse event when the road button is pressed.
     *
     * @param mouseEvent The mouse event.
     */
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


    /**
     * Checks if the player has enough resources to build a certain building.
     *
     * @param building      The type of building to check resources for.
     * @param currentPlayer The current player.
     */
    private void checkResourcesForBuilding(String building, Player currentPlayer) {
        switch (building) {
            case "Road":
                checkRoadResources(currentPlayer);
                break;
            case "Settlement":
                checkSettlementResources(currentPlayer);
                break;
            case "City":
                checkCityResources(currentPlayer);
                break;
        }
    }


    /**
     * Checks if the player has enough resources to build a road.
     *
     * @param currentPlayer The current player.
     */
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


    /**
     * Checks if the player has enough resources to build a city.
     *
     * @param currentPlayer The current player.
     */
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

    /**
     * Checks if the player has enough resources to build a settlement.
     *
     * @param currentPlayer The current player.
     */
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

    /**
     * Checks if the player has enough resources to build a city.
     *
     * @param currentPlayer The current player.
     * @return True if the player has enough resources to build a city, false otherwise.
     */
    private boolean hasCityResources(Player currentPlayer) {
        return currentPlayer.getResources().get("grain") >= 2 && currentPlayer.getResources().get("ore") >= 3;
    }

    /**
     * Checks if the player has enough resources to build a settlement.
     *
     * @param currentPlayer The current player.
     * @return True if the player has enough resources to build a settlement, false otherwise.
     */
    private boolean hasSettlementResources(Player currentPlayer) {
        return currentPlayer.getResources().get("wood") >= 1 && currentPlayer.getResources().get("brick") >= 1
                && currentPlayer.getResources().get("grain") >= 1 && currentPlayer.getResources().get("wool") >= 1;
    }

    /**
     * Changes the color of the road when it is clicked by the player.
     *
     * @param mouseEvent The mouse event.
     */
    public void changeRoadColor(MouseEvent mouseEvent) {
        if (players.get(currentPlayerIndex).isAddRoad()) {

            Player currentPlayer = players.get(currentPlayerIndex);
            if ((gameCounter == 1 && currentPlayer.getRoads() == 1) || (gameCounter == 2 && currentPlayer.getRoads() == 2)) {
                showError("Cannot add any more roads. Only one road allowed at this stage!");
                return;
            }

            if (currentPlayer.getRoads() != 15) {

                Rectangle clickedRoad = (Rectangle) mouseEvent.getSource();
                if ("used".equals(clickedRoad.getUserData())) {
                    return;
                }

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
                updateLongestRoadLabel(currentPlayer);
                currentPlayer.setAddRoad(false);
            } else {
                showError("You don't have any more roads to build.");
            }

        } else {
            playRoadAnimation((ImageView) RoadBTN);
        }
    }

    /**
     * Plays an animation for the road button when it is clicked.
     *
     * @param roadButton The road button.
     */
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


    /**
     * Updates the label for the longest road for the current player.
     *
     * @param currentPlayer The current player.
     */
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


    /**
     * Handles the mouse event for adding a city.
     *
     * @param mouseEvent The mouse event.
     */
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

                if (currentPlayer.isAddCity()) {


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
                                        setPlayerVPs();
                                    } else {
                                        System.out.println("Cannot decrement resources. Not enough grain or ore resources.");
                                    }
                                } else {
                                    playCityAnimation((ImageView) CityBTN);
                                }
                            });
                        } else {
                            System.out.println("Not the right colour player");
                        }
                    }
                } else {
                    playCityAnimation((ImageView) CityBTN);
                }

            } else {
                showError("You can only build a city starting from round 3.");
            }

        }
    }


    /**
     * Plays an animation for the city button when it is clicked.
     *
     * @param cityBTN The city button.
     */
    private void playCityAnimation(ImageView cityBTN) {
        ScaleTransition scaleTransition = new ScaleTransition(Duration.millis(300), cityBTN);
        scaleTransition.setFromX(1);
        scaleTransition.setFromY(1);
        scaleTransition.setToX(1.2);
        scaleTransition.setToY(1.2);
        scaleTransition.setAutoReverse(true);
        scaleTransition.setCycleCount(2);
        scaleTransition.play();
    }

    /**
     * Handler for when adding a city, changes the settlement to an image
     *
     * @param event         The MouseEvent object for the event that triggers the handler
     * @param image         The ImageView object that represents the settlement to be upgraded to a city
     * @param currentPlayer The Player object representing the current player in the game
     */
    private void addCityHandler(MouseEvent event, ImageView image, Player currentPlayer) {
        if (currentPlayer.isAddCity()) {
            if (currentPlayer.getCity() != 4) {
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
                currentPlayer.setAddCity(false);
            } else {
                showError("You dont have any more cities to build");
            }
        }
    }

    /**
     * Adds a city image  in the position of the settlement
     *
     * @param colour The Colour object representing the player colour of the player who is adding the city
     * @param x      The x-coordinate of the settlement that is being upgraded to a city
     * @param y      The y-coordinate of the settlement that is being upgraded to a city
     */
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

    /**
     * Handles all the changes that happen to the player TagBox
     *
     * @param playerIndex   The integer representing the index of the player whose elements are being shown
     * @param currentPlayer The Player object representing the current player in the game
     * @throws IllegalArgumentException If the player index is not between 0 and 3 (inclusive)
     */
    private void showPlayerElements(int playerIndex, Player currentPlayer) throws IllegalArgumentException {
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
            }
            default -> throw new IllegalArgumentException("Invalid player index: " + playerIndex);
        }
    }

    /**
     * Handler to quit the game
     *
     * @param event The ActionEvent object for the event that triggers the handler
     */
    @FXML
    private void handleQuitGame(ActionEvent event) {
        Stage stage = (Stage) QuitGame.getScene().getWindow();
        stage.close();
    }

    /**
     * Debugging method for testing purposes
     * @param event The MouseEvent object for the event that triggers the handler
     */
    public void DEBUG(MouseEvent event) {
        System.out.println("///////////////");
//  Player cp = players.get(currentPlayerIndex);
        players.get(currentPlayerIndex).printNearestHexes();
        for (Player cp : players) {
            System.out.println("Player Name :" + cp.getPlayerName());
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





