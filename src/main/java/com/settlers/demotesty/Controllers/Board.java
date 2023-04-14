package com.settlers.demotesty.Controllers;

import com.settlers.demotesty.Fundimentals.Colour;
import com.settlers.demotesty.Fundimentals.Player;
import com.settlers.demotesty.Main;
import javafx.animation.Interpolatable;
import javafx.animation.ScaleTransition;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Bounds;
import javafx.geometry.Point2D;
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
import javafx.scene.shape.Circle;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.util.Duration;
import javafx.util.Pair;
import javafx.scene.shape.Shape;

import java.lang.invoke.StringConcatFactory;
import java.net.URL;
import java.util.*;
import java.util.stream.Collectors;


/**
 * This class represents the Board Controller which has the Board builder.
 * @version 1.0
 * @author Ramzi
 */
public class Board extends SignUpController  implements Initializable {

    @FXML
    public Text GameCounterID;
    public Button testDebug;
    @FXML
    public Circle CirclePointerHexes;
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
    private Text GrainCardCounter;

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
    public Text Num_19;

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
    public Text PlayerFourID;

    @FXML
    private Text PlayerFourLongestRoad;

    @FXML
    public Rectangle PlayerFourTagBoxColor;

    @FXML
    private Group PlayerFoursTagBox;

    @FXML
    public Text PlayerOneID;

    @FXML
    private Text PlayerOneLongestRoad;

    @FXML
    private Group PlayerOneTagBox;

    @FXML
    public Rectangle PlayerOneTagBoxColor;

    @FXML
    public Text PlayerThreeID;

    @FXML
    private Text PlayerThreeLongestRoad;

    @FXML
    private Group PlayerThreeTagBox;

    @FXML
    public Rectangle PlayerThreeTagBoxColor;

    @FXML
    public Text PlayerTwoID;

    @FXML
    private Text PlayerTwoLongestRoad;

    @FXML
    private Group PlayerTwoTagBox;

    @FXML
    public Rectangle PlayerTwoTagBoxColor;

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

    @FXML
    private ImageView WaterHex1;

    @FXML
    private ImageView WaterHex10;

    @FXML
    private ImageView WaterHex11;

    @FXML
    private ImageView WaterHex12;

    @FXML
    private ImageView WaterHex13;

    @FXML
    private ImageView WaterHex14;

    @FXML
    private ImageView WaterHex15;

    @FXML
    private ImageView WaterHex16;

    @FXML
    private ImageView WaterHex17;

    @FXML
    private ImageView WaterHex18;

    @FXML
    private ImageView WaterHex2;

    @FXML
    private ImageView WaterHex3;

    @FXML
    private ImageView WaterHex4;

    @FXML
    private ImageView WaterHex5;

    @FXML
    private ImageView WaterHex6;

    @FXML
    private ImageView WaterHex7;

    @FXML
    private ImageView WaterHex8;

    @FXML
    private ImageView WaterHex9;
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
    private int currentPlayerIndex = -1;

    private int gameCounter;
    private DiceController diceController;

    private ArrayList<Polygon> testHex = new ArrayList<>();


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
        //TODO remove later as its used for testing
        Player player1 = new Player("Ramzi", Colour.RED);
        Player player2 = new Player("Ahmad", Colour.BLUE);
        Player player3 = new Player("Shelly", Colour.YELLOW);
        Player player4 = new Player("Gheith", Colour.GREEN);
        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        diceController = new DiceController(dice1, dice2, DiceOutCome);
        assignPlayer();//TODO change the position of it put it back on top

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


    private double getHexDesertX() {
        return hexagonsById.get("HexDesert").getLayoutX();
    }

    private double getHexDesertY() {
        return hexagonsById.get("HexDesert").getLayoutY();
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
//    public void distributeResources(int diceOutcome) {
//        List<Point2D> matchingNumberCoords = new ArrayList<>();
//
//        // Find all Text objects with a matching number
//        for (Text textNumber : TextNumbers) {
//            if (Integer.parseInt(textNumber.getText()) == diceOutcome) {
//                matchingNumberCoords.add(new Point2D(textNumber.getLayoutX(), textNumber.getLayoutY()));
//            }
//        }
//
//        // Loop through each player and find their nearest hexes
//        for (Player currentPlayer : players) {
//            HashMap<String, ArrayList<Polygon>> playerNearestHexes = currentPlayer.getNearestHexes();
//
//            // Loop through each hex list in the HashMap
//            for (ArrayList<Polygon> hexList : playerNearestHexes.values()) {
//
//                // Loop through each hex in the hex list
//                for (Polygon hex : hexList) {
//
//                    // Get the center of the current hex
//                    Point2D hexCenter = new Point2D(hex.getBoundsInLocal().getCenterX(), hex.getBoundsInLocal().getCenterY());
//
//                    // Loop through each matching number coordinate
//                    for (Point2D numberCoord : matchingNumberCoords) {
//
//                        // Check if the hex center matches the number coordinate
//                        if (hexCenter.distance(numberCoord) < 1e-6) {
//
//                            // Get the resource type of the hex and add it to the player's resources
//                            String resourceType = hexagonsResources.get(hex);
//                            currentPlayer.getResources().put(resourceType, currentPlayer.getResources().get(resourceType) + 1);
//                        }
//                    }
//                }
//            }
//        }
//        System.out.println(matchingNumberCoords);
//    }


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

        checksHexandNumber(tempTexts);
    }



    public void checksHexandNumber(Text[] tempTexts) {
        Text TextOne = tempTexts[0];
        Text TextTwo = tempTexts[1];
        boolean foundOne = false;
        boolean foundTwo = false;

        for (Player allPlayers : players) {
            for (Map.Entry<String, ArrayList<Polygon>> entry : allPlayers.getNearestHexes().entrySet()) {
                ArrayList<Polygon> polygons = entry.getValue();
                for (Polygon polygon : polygons) {
                    System.out.println(polygon);
                    // process each polygon here
                    double TextOneX = TextOne.getLayoutX();
                    double TextOneY = TextOne.getLayoutY();
                    double TextTwoX = TextTwo.getLayoutX();
                    double TextTwoY = TextTwo.getLayoutY();

                    if ((polygon.getLayoutX() == TextOneX) && (polygon.getLayoutY() == TextOneY)) {
                        passedHexToResource(allPlayers,polygon);
                        System.out.println(" FOUND ONE");
//                        System.out.println(polygon);
                    }

                    if ((polygon.getLayoutX() == TextTwoX) && (polygon.getLayoutY() == TextTwoY)) {
                        passedHexToResource(allPlayers,polygon);
                        System.out.println(" FOUND ONE");
//                        System.out.println(polygon);
                    }
                }
            }
        }
    }

    private void passedHexToResource(Player allPlayers, Polygon polygon) {
        System.out.println("??????????");
        System.out.println(allPlayers.getPlayerName());

        for (Map.Entry<Polygon, String> entry : hexagonsResources.entrySet()) {
            Polygon key = entry.getKey();
            String value = entry.getValue();

            if (key.equals(polygon)) {
                System.out.println(value);
                // Increment the value of the resource in the player's resources map
                int currentValue = allPlayers.getResources().get(value);
                allPlayers.getResources().put(value, currentValue + 1);
            }
        }
    }




    public void roll(MouseEvent mouseEvent) {
        int diceOutcome = diceController.roll();
        distributeResources(diceOutcome);
        System.out.println("Dice Out Come" + diceOutcome);
    }


    public String getResourceTypeForHex(Polygon hex) {
        return hexagonsResources.get(hex);
    }



    public void click(MouseEvent mouseEvent) {
        System.out.println("Road is Clicked");
    }

    public void NextPlayer(MouseEvent mouseEvent) {
        if (players.isEmpty()) {
            System.out.println("The players list is empty!");
            return;
        }
        currentPlayerIndex++;
        if (NextTurn.getText().equals("Start Game")) {
            gameCounter = 1;
            GameCounterID.setText("1");
            NextTurn.setText("Next Turn");
        } else if (currentPlayerIndex >= players.size()) {
            currentPlayerIndex = 0;
            gameCounter++;
            GameCounterID.setText(String.valueOf(gameCounter));
        }
        updateCurrentPlayer();
    }


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

    private void addRadioButtonListeners(Player currentPlayer) {
        for (RadioButton BTN : ButtonForBuildings) {
            BTN.setOnMouseClicked(event -> handleRadioButtonSettlementAction(event, BTN, currentPlayer));
        }
    }

    public void addSettlement(MouseEvent mouseEvent) {
        if (currentPlayerIndex == -1) {
            PickATurnNote.setVisible(true);
        } else {
            PickATurnNote.setVisible(false);
            Player currentPlayer = players.get(currentPlayerIndex);
            currentPlayer.setAddSettlement(true);
            addRadioButtonListeners(currentPlayer);

        }
    }

    private void handleRadioButtonSettlementAction(MouseEvent event, RadioButton BTN, Player currentPlayer) {
        RadioButton radioButton = (RadioButton) event.getSource();
        double tempX = BTN.getLayoutX();
        double tempY = BTN.getLayoutY();
        if (currentPlayer.isAddSettlement()) {
            radioButton.setVisible(false);
            addImageSettlement(currentPlayer.getPlayerColour(), tempX, tempY);
//            storeNearestHexes(currentPlayer, tempX, tempY); // Add this line
        } else {
            AnimationHandler.settlementButtonAnimation((ImageView) SettlementBTN);
        }
    }


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
        // Add the image to the AnchorPane
        // Set the image position
        AnchorPane.setTopAnchor(imageView, y - 15);
        AnchorPane.setLeftAnchor(imageView, x - 10);
        Player currentPlayer = players.get(currentPlayerIndex);
        currentPlayer.getAddedSettlements().put(imageView, currentPlayer.getPlayerColour());
        anchorPane.getChildren().add(imageView);

        // Call the findNearestHexes method after adding the settlement
        double xx = imageView.getLayoutX();
        double yy = imageView.getLayoutY();

        findNearestHexes(x, y, currentPlayer, imageView);
    }

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
        currentPlayer.getNearestHexes().put("Settlement number: " + settlementNumber, new ArrayList<>(polygons));
    }



    private void OptionOneLeftandRight(double x, double y, Player currentPlayer, String direction, HashSet<Polygon> polygons) {
        System.out.println("IN OPTION ONE");

        if (direction.equals("right")) {
            CirclePointerHexes.setLayoutX(x + 50);
            CirclePointerHexes.setLayoutY(y + 40);
        } else if (direction.equals("left")) {
            CirclePointerHexes.setLayoutX(x - 50);
            CirclePointerHexes.setLayoutY(y + 40);
        }else if (direction.equals("up")){
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
    private void OptionTwoLeftandRight(double x, double y, Player currentPlayer, String direction, HashSet<Polygon> polygons) {
        System.out.println("IN OPTION TWO");

        if (direction.equals("right")) {
            CirclePointerHexes.setLayoutY(y - 40);
            CirclePointerHexes.setLayoutX(x + 50);
        } else if (direction.equals("left")) {
            CirclePointerHexes.setLayoutY(y - 40);
            CirclePointerHexes.setLayoutX(x - 50);
        }else if (direction.equals("down")){
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






    public List<Polygon> getAdjacentHexes(Polygon hex) {
        List<Polygon> adjacentHexes = new ArrayList<>();
        double hexLayoutX = hex.getLayoutX();
        double hexLayoutY = hex.getLayoutY();

        for (Polygon candidate : hexagonsResources.keySet()) {
            double candidateLayoutX = candidate.getLayoutX();
            double candidateLayoutY = candidate.getLayoutY();

            if ((Math.abs(hexLayoutX - candidateLayoutX) <= 50 && Math.abs(hexLayoutY - candidateLayoutY) <= 35) &&
                    (hexLayoutX != candidateLayoutX || hexLayoutY != candidateLayoutY)) {
                adjacentHexes.add(candidate);
            }
        }

        return adjacentHexes;
    }


    public void findHexLandR(double x, double y, Player currentPlayer){
        System.out.println("Checking left and right");

        CirclePointerHexes.setLayoutX(x);
        CirclePointerHexes.setLayoutY(y);
        for (Polygon hex : hexagonsResources.keySet()) {
            Point2D circleCenterInHex = hex.parentToLocal(
                    CirclePointerHexes.localToParent(
                            CirclePointerHexes.getBoundsInLocal().getCenterX(),
                            CirclePointerHexes.getBoundsInLocal().getCenterY()
                    )
            );

            boolean isCircleInsideHex = hex.contains(circleCenterInHex);

            if (isCircleInsideHex) {

                System.out.println("The Circle is inside the Hexagon.");
                System.out.println(                hex.getId()
                );
            } else{
//                findHexLandR(tempX,tempY, currentPlayer);
                System.out.println("The Circle is outside the Hexagon.");
                continue;
            }
        }

    }


    private void printNearestHexes(HashMap<String, Polygon[]> nearestHexes) {
        System.out.println("Nearest hexes to the settlement:");
        for (String position : nearestHexes.keySet()) {
            Polygon[] hexes = nearestHexes.get(position);
            for (Polygon hex : hexes) {
                System.out.println("Position: " + position + " - " + hex.toString());
            }
        }
    }
    private boolean findAndStoreHexes(double x, double y, double yOffset, HashMap<String, Polygon[]> nearestHexes) {
        boolean foundHex = false;

        double newY = y + yOffset;
        double newXLeft = x - 20;
        double newXRight = x + 20;

        Polygon hexUp = getHexAt(newXLeft, newY);
        if (hexUp != null) {
            nearestHexes.put("upLeft", new Polygon[] {hexUp});
            foundHex = true;
        }

        hexUp = getHexAt(newXRight, newY);
        if (hexUp != null) {
            nearestHexes.put("upRight", new Polygon[] {hexUp});
            foundHex = true;
        }

        double oppositeYOffset = -yOffset;
        Polygon hexDown = getHexAt(x, y + oppositeYOffset);
        if (hexDown != null) {
            nearestHexes.put("down", new Polygon[] {hexDown});
            foundHex = true;
        }

        return foundHex;
    }

    private Polygon getHexAt(double x, double y) {
        final double radius = 30; // Adjust this value to define how close a hex should be to be considered "near"

        Circle searchArea = new Circle(x, y, radius);
        for (Polygon hex : hexagonsResources.keySet()) {
            double hexCenterX = hex.getBoundsInLocal().getMinX() + hex.getBoundsInLocal().getWidth() / 2;
            double hexCenterY = hex.getBoundsInLocal().getMinY() + hex.getBoundsInLocal().getHeight() / 2;

            double distance = Math.sqrt(Math.pow(x - hexCenterX, 2) + Math.pow(y - hexCenterY, 2));

            if (distance <= radius) {
                return hex;
            }
        }

        return null;
    }







    //    public void findNearestHexes(double x, double y, Player currentPlayer) {
////        double upperY = y + threshold;
////        double lowerY = y - threshold;
////        double rightX = x + threshold;
////        double leftX = x - threshold;
//        double upperY = y + 10;
//        double lowerY = y - 10;
//        double rightX = x + 20;
//        double leftY = x -20;
//
//        // Iterate through the keys of hexagonsResources
//        for (Polygon hex : hexagonsResources.keySet()) {
////            double hexX = hexBounds.getCenterX();
////            double hexY = hexBounds.getCenterY();
////            if ((hexY >= lowerY && hexY <= upperY) && (hexX >= leftX && hexX <= rightX)) {
//
////            if ((hexY >= lowerY )) {
////                String resource = hexagonsResources.get(hex);
////                Polygon[] existingHexes = currentPlayer.getNearestHexes().get(resource);
////
////                if (existingHexes == null) {
////                    currentPlayer.getNearestHexes().put(resource, new Polygon[]{hex});
////                } else {
////                    Polygon[] updatedHexes = Arrays.copyOf(existingHexes, existingHexes.length + 1);
////                    updatedHexes[updatedHexes.length - 1] = hex;
////                    currentPlayer.getNearestHexes().put(resource, updatedHexes);
////                }
////            }
//        }
//    }



//    import javafx.geometry.Point2D;

//    public void findNearestHexes(double x, double y, Player currentPlayer, double threshold) {
//        double thresholdX = threshold * Math.sqrt(3) / 2; // Horizontal distance between hexagon centers
//        double thresholdY = threshold * 1.5; // Vertical distance between hexagon centers
//
//        double upperY = y + thresholdY;
//        double lowerY = y - thresholdY;
//        double rightX = x + thresholdX;
//        double leftX = x - thresholdX;
//
//        // Iterate through the keys of hexagonsResources
//        for (Polygon hex : hexagonsResources.keySet()) {
//            Bounds hexBounds = hex.getBoundsInParent();
//            double hexX = hexBounds.getCenterX();
//            double hexY = hexBounds.getCenterY();
//            Point2D hexCenter = new Point2D(hexX, hexY);
//
//            // Calculate the distance between the current hexagon and the input point (x, y)
//            Point2D inputPoint = new Point2D(x, y);
//            double distanceX = Math.abs(inputPoint.getX() - hexCenter.getX());
//            double distanceY = Math.abs(inputPoint.getY() - hexCenter.getY());
//
//            if ((distanceX <= thresholdX) && (distanceY <= thresholdY)) {
//                String resource = hexagonsResources.get(hex);
//                Polygon[] existingHexes = currentPlayer.getNearestHexes().get(resource);
//
//                if (existingHexes == null) {
//                    currentPlayer.getNearestHexes().put(resource, new Polygon[]{hex});
//                } else {
//                    Polygon[] updatedHexes = Arrays.copyOf(existingHexes, existingHexes.length + 1);
//                    updatedHexes[updatedHexes.length - 1] = hex;
//                    currentPlayer.getNearestHexes().put(resource, updatedHexes);
//                }
//            }
//        }
//    }


    public void addRoad(MouseEvent mouseEvent) {
        if (currentPlayerIndex == -1) {
            PickATurnNote.setVisible(true);
        } else {
            PickATurnNote.setVisible(false);
            Player currentPlayer = players.get(currentPlayerIndex);
            if (currentPlayer.isPlaying()) {
                currentPlayer.setAddRoad(true);
            }
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
//        int nearestHexId = findNearestHexId(clickedRoad);
//        System.out.println("Nearest Hex ID: " + nearestHexId);
        if (!currentPlayer.isPlaying() || !currentPlayer.isAddRoad()) {
            roadAnimation();
            return;
        }
        //TODO Add checker for the amount of resources
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

        // Get the nearest hexagons
        double roadX = clickedRoad.getLayoutX();
        double roadY = clickedRoad.getLayoutY();
        double roadAngle = clickedRoad.getRotate();

    }


    public void addCity(MouseEvent mouseEvent) {
        if (currentPlayerIndex == -1) {
            PickATurnNote.setVisible(true);
        } else {
            PickATurnNote.setVisible(false);
            System.out.println("Add city is pressed");
            Player currentPlayer = players.get(currentPlayerIndex);
            System.out.println(currentPlayer.getPlayerName() + currentPlayer.getAddedSettlements());
            System.out.println(currentPlayer.getPlayerName() + currentPlayer.getAddedCities());
            for (Map.Entry<ImageView, Colour> entry : currentPlayer.getAddedSettlements().entrySet()) {
                ImageView image = entry.getKey();
                Colour colour = entry.getValue();
                currentPlayer.setAddSettlement(true);
                if (entry.getValue().equals(currentPlayer.getPlayerColour())) {
                    image.setOnMouseClicked(event -> addCityHandler(event, image, currentPlayer));
                } else {
                    System.out.println("Not the right colour player");
                }
            }
        }

    }


    private void addCityHandler(MouseEvent event, ImageView image, Player currentPlayer) {
        System.out.println("HI works");
        image = (ImageView) event.getSource();
        double tempX = image.getLayoutX();
        double tempY = image.getLayoutY();
        if (currentPlayer.isPlaying() || currentPlayer.isAddSettlement()) {
            image.setVisible(false);
            addImageCity(currentPlayer.getPlayerColour(), tempX, tempY);
        } else {
            AnimationHandler.settlementButtonAnimation((ImageView) SettlementBTN);
        }
    }

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
        // Add the image to the AnchorPane
        anchorPane.getChildren().add(imageView);
    }


    //Simple animation for the buttons
    public void hoverEnter(MouseEvent mouseEvent) {
        ImageView imageView = (ImageView) mouseEvent.getSource();
        AnimationHandler.hoverEnter(imageView);
    }

    public void hoverExit(MouseEvent mouseEvent) {
        ImageView imageView = (ImageView) mouseEvent.getSource();
        AnimationHandler.hoverExit(imageView);
    }

    public void roadAnimation() {
        ImageView imageView = (ImageView) RoadBTN;
        AnimationHandler.roadAnimation(imageView);
    }


    private void updateResourceCounters(Player currentPlayer) {
        BrickCardCounter.setText(String.valueOf(currentPlayer.getResources().get("brick")));
        GrainCardCounter.setText(String.valueOf(currentPlayer.getResources().get("grain")));
        OreCardCounter.setText(String.valueOf(currentPlayer.getResources().get("ore")));
        WoolCardCounter.setText(String.valueOf(currentPlayer.getResources().get("wool")));
        WoodCardCounter.setText(String.valueOf(currentPlayer.getResources().get("wood")));
    }


    private void hideAllPlayerElements() {
        PlayerOneLongestRoad.setVisible(false);
        PlayerTwoLongestRoad.setVisible(false);
        PlayerThreeLongestRoad.setVisible(false);
        PlayerFourLongestRoad.setVisible(false);
    }

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

    public void DEBUG(MouseEvent event) {
        System.out.println("///////////////");
//        for (String key : currentPlayer.getNearestHexes().keySet()) {
//            Polygon polygonValue = currentPlayer.getNearestHexes().get(key);
//            System.out.println("Key: " + key + ", Polygon: " + polygonValue);
//        }
//        currentPlayer.printNearestHexes();
//        shuffleNumber();
//        shuffleHexagons();
//        updateResourceCounters(currentPlayer);

        for (Player player : players) {
            for (Map.Entry<String, Integer> resource : player.getResources().entrySet()) {
                String resources = resource.getKey();
                Integer valueOfResource = resource.getValue();
                System.out.println(resources + valueOfResource);
            }
        }

    }

}

//        for (Polygon i : pla){
//            System.out.println(i);
//        }
//        for (Player player : players) {
//            System.out.println("Player " + player.getPlayerColour() + "'s settlements and their nearest hexes:");
//            for (ImageView settlement : player.getAddedSettlements().keySet()) {
//                double x = settlement.getLayoutX();
//                double y = settlement.getLayoutY();
//                System.out.println("Settlement at (" + x + ", " + y + "):");
//                String key = "Settlement_" + x + "_" + y;
//                Polygon[] nearestHexes = player.getNearestHexes().get(key);
//                if (nearestHexes != null) {
//                    for (int i = 0; i < nearestHexes.length; i++) {
//                        if (nearestHexes[i] != null) {
//                            System.out.println("Nearest hex " + (i + 1) + ": " + hexagonsResources.get(nearestHexes[i]));
//                        }
//                    }
//                } else {
//                    System.out.println("No nearest hexes found for this settlement.");
//                }
//            }
//        }







