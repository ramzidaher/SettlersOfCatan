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

import java.lang.reflect.Array;
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
    private ResourceBundle resources;

    @FXML
    private URL location;

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
        Image img1_ore = new Image("https://i.postimg.cc/Dz1QK8zt/ore.png");
        Image img2_grain = new Image("https://i.postimg.cc/NfP5CBQm/Untitled-1-Recovered-Recovered.png");
        Image img3_clay = new Image("https://i.postimg.cc/htBP5jHJ/Clay.png");
        Image img4_wood = new Image("https://i.postimg.cc/283KN7NM/wood.png");
        Image img5_wool = new Image("https://i.postimg.cc/Y0zy2dCB/wool.png");
        Image img6_Desert = new Image("https://i.postimg.cc/G3TL3GR8/Desert.png");
        Image img7_water = new Image("https://i.postimg.cc/FRhmsM7h/Hex4-removebg-preview.png");
//        Hex121.setFill(new ImagePattern(img7_water));
//        Hex1211.setFill(new ImagePattern(img7_water));
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

    private void assignPlayer() {
        PlayerOneID.setText(players.get(0).getPlayerName());
        PlayerTwoID.setText(players.get(1).getPlayerName());
        PlayerThreeID.setText(players.get(2).getPlayerName());
        PlayerFourID.setText(players.get(3).getPlayerName());
        System.out.println("DEBUG");
    }


    private void shuffleHexagons() {
        ArrayList<Double> shuffledXCoordinates = new ArrayList<>();
        ArrayList<Double> shuffledYCoordinates = new ArrayList<>();
        ArrayList<Polygon> shuffledHexagons = new ArrayList<>();

        ArrayList<Double> xCoordinatesCopy = new ArrayList<>(xCoordinates);
        ArrayList<Double> yCoordinatesCopy = new ArrayList<>(yCoordinates);

        for (Polygon hexagon : hexagons) {
            Random rand = new Random();
            int randomIndex = rand.nextInt(xCoordinatesCopy.size());
            double newX = xCoordinatesCopy.get(randomIndex);
            double newY = yCoordinatesCopy.get(randomIndex);
            hexagon.setLayoutX(newX);
            hexagon.setLayoutY(newY);
            shuffledXCoordinates.add(newX);
            shuffledYCoordinates.add(newY);
            xCoordinatesCopy.remove(randomIndex);
            yCoordinatesCopy.remove(randomIndex);
            shuffledHexagons.add(hexagon);
        }

        hexagons.clear();
        hexagons.addAll(shuffledHexagons);

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
        Num_19.setLayoutY(getHexDesertY());
        Num_19.setLayoutX(getHexDesertX());
        Num_19.setVisible(false);
        TextNumbers.remove(Num_19);
        xCoordText.remove(getHexDesertX());
        yCoordText.remove(getHexDesertY());

        for (Text textNumber : TextNumbers) {
            Random rand = new Random();
            int randomIndex = rand.nextInt(xCoordText.size());
            textNumber.setLayoutX(xCoordText.get(randomIndex));
            textNumber.setLayoutY(yCoordText.get(randomIndex));
            xCoordText.remove(randomIndex);
            yCoordText.remove(randomIndex);
        }
    }
//        for (Text textNumber : TextNumbers) {
//            Random rand = new Random();
//            int randomIndex = rand.nextInt(xCoordText.size());
//
//            Num_19.setLayoutY(getHexDesertY());
//            Num_19.setLayoutX(getHexDesertX());
//            Num_19.setVisible(true);

//            TextNumbers.remove(Num_19);
//            TextNumbers.remove(18);
//            xCoordText.remove(getHexDesertX());
//            yCoordText.remove(getHexDesertY());
////            yCoordText.remove(getHexDesertY());
////
//            textNumber.setLayoutX(xCoordText.get(randomIndex));
//            textNumber.setLayoutY(yCoordText.get(randomIndex));
////
//            xCoordText.remove(randomIndex);
//            yCoordText.remove(randomIndex);



//            double newX = xCoordText.get(randomIndex);
//            double newY = yCoordText.get(randomIndex);
//            if (getHexDesertX() == newX && getHexDesertY() == newY) {
////                continue;
//                System.out.println();
//                HexDesert.getLayoutY();
//            } else {
//                textNumber.setLayoutX(randomIndex);
//                textNumber.setLayoutY(randomIndex);
//                xCoordText.remove(randomIndex);
//                yCoordText.remove(randomIndex);



//    }


//        for (int i = 0; i < TextNumbers.size(); i++) {
//            Text number = TextNumbers.get(i);
//            Random rand = new Random();
//            int randomIndex = rand.nextInt(xCoordText.size());
//
//            double newX = xCoordText.get(randomIndex);
//            double newY = yCoordText.get(randomIndex);
//            if (newX == getHexDesertX() && newY == getHexDesertY()) {
//                // skip assigning this number
//                continue;
//            } else {
//                // assign new coordinates
//                number.setLayoutX(newX);
//                number.setLayoutY(newY);
//                xCoordText.remove(randomIndex);
//                yCoordText.remove(randomIndex);
//            }
//
//            // check if this number is on the desert hexagon
//            if (number.getLayoutX() == getHexDesertX() && number.getLayoutY() == getHexDesertY()) {
//                // make a copy and add it to the end of the list
//                Text copy = new Text(number.getText());
//                TextNumbers.add(copy);
//            }
//        }


//    private void shuffleNumber() {
//        for (Text number : TextNumbers) {
//            Random rand = new Random();
//            int randomIndex = rand.nextInt(xCoordText.size());
//
//            number.setLayoutX(xCoordText.get(randomIndex));
//            number.setLayoutY(yCoordText.get(randomIndex));
//            xCoordText.remove(randomIndex);
//            yCoordText.remove(randomIndex);
//            System.out.println(getHexDesertX());
//            System.out.println(getHexDesertY());
//
//        }
//    }


//    private void shuffleHexagons() {
//        ArrayList<Double> xCoordinatesCopy = new ArrayList<>(xCoordinates);
//        ArrayList<Double> yCoordinatesCopy = new ArrayList<>(yCoordinates);
////        ArrayList<Polygon> shuffledHexagons = new ArrayList<>(); // create a new list to store shuffled hexagons
//        for (Polygon hexagon : hexagons) {
//            Random rand = new Random();
//            int randomIndex = rand.nextInt(xCoordinatesCopy.size());
//            double newX = xCoordinatesCopy.get(randomIndex);
//            double newY = yCoordinatesCopy.get(randomIndex);
//            hexagon.setLayoutX(newX);
//            hexagon.setLayoutY(newY);
//            xCoordinatesCopy.remove(randomIndex);
//            yCoordinatesCopy.remove(randomIndex);
//            shuffledHexagons.add(hexagon);
//        }
//        hexagons.clear(); // clear the original hexagons list
//        hexagons.addAll(shuffledHexagons); // add shuffled hexagons to the original hexagons list
//        System.out.println("New Coordinates:" + xCoordinatesCopy);
//        System.out.println("New Coordinates:" + yCoordinatesCopy);
//        System.out.println(xCoordinates);
//        System.out.println(yCoordinates);
//
//    }


    private void diceRoll() {
        //DiceIMages 1
        Image ImageDice1_1 = new Image("https://i.postimg.cc/HWyd8QJC/Dice-One-removebg-preview.png");
        Image ImageDice2_1 = new Image("https://i.postimg.cc/zGJrQ6xJ/Dice-Two-removebg-preview.png");
        Image ImageDice3_1 = new Image("https://i.postimg.cc/PqgVg8dm/dice-Three-removebg-preview.png");
        Image ImageDice4_1 = new Image("https://i.postimg.cc/SNP61bS9/Dice-Four-removebg-preview.png");
        Image ImageDice5_1 = new Image("https://i.postimg.cc/vTc15D6N/Dice-Five-removebg-preview.png");
        Image ImageDice6_1 = new Image("https://i.postimg.cc/JhxtgjNF/Dice-Six-removebg-preview.png");
        //DiceIMages 2
        Image ImageDice1_2 = new Image("https://i.postimg.cc/W1XhYM6H/Dice-One-removebg-preview-Yellow.png");
        Image ImageDice2_2 = new Image("https://i.postimg.cc/85kwQdqf/Dice-Two-removebg-preview-Yellow.png");
        Image ImageDice3_2 = new Image("https://i.postimg.cc/3NVZvsW2/Dice-Three-removebg-preview-Yellow.png");
        Image ImageDice4_2 = new Image("https://i.postimg.cc/TPfJgq2N/Dice-Four-removebg-preview-Yellow.png");
        Image ImageDice5_2 = new Image("https://i.postimg.cc/7PfNPHZ5/dice-Five-removebg-preview-Yellow.png");
        Image ImageDice6_2 = new Image("https://i.postimg.cc/MGHn0G4R/Dice-Six-removebg-preview-Yellow.png");

        //Adds both dices to own its own arrays
        diceImages_1.addAll(Arrays.asList(ImageDice1_1, ImageDice2_1, ImageDice3_1, ImageDice4_1, ImageDice5_1, ImageDice6_1));
        diceImages_2.addAll(Arrays.asList(ImageDice1_2, ImageDice2_2, ImageDice3_2, ImageDice4_2, ImageDice5_2, ImageDice6_2));
        dice1.setFill(new ImagePattern(ImageDice1_1));
        dice2.setFill(new ImagePattern(ImageDice1_2));
        Random randomImage = new Random();
        int diceOne = randomImage.nextInt(1, 7);
        int diceTwo = randomImage.nextInt(1, 7);
        DiceOutCome.setVisible(false);//Makes dice outcome text not visible

    }

    public void roll(MouseEvent mouseEvent) {
//        dice1.setStroke();
        Random randomImage = new Random();
        int diceOne = randomImage.nextInt(0, 6);
        int diceTwo = randomImage.nextInt(0, 6);
        dice1.setFill(new ImagePattern(diceImages_1.get(diceOne)));
        dice2.setFill(new ImagePattern(diceImages_2.get(diceTwo)));

        DiceOutCome.setVisible(true);
        for (Rectangle rectangle : Roads) {
//            if (rectangle != null) {
//                rectangle.setVisible(false);
//            }
            if (rectangle != null) {
                rectangle.setFill(Color.rgb(216, 213, 213));
            }

        }
        System.out.println(diceImages_1);
        int result = 0; // initialize the result to 0

        switch (diceImages_1.get(diceOne).getUrl()) {
            case "https://i.postimg.cc/HWyd8QJC/Dice-One-removebg-preview.png" -> {
                result += 1;
            }
            case "https://i.postimg.cc/zGJrQ6xJ/Dice-Two-removebg-preview.png" -> {
                result += 2;
            }
            case "https://i.postimg.cc/PqgVg8dm/dice-Three-removebg-preview.png" -> {
                result += 3;
            }
            case "https://i.postimg.cc/SNP61bS9/Dice-Four-removebg-preview.png" -> {
                result += 4;
            }
            case "https://i.postimg.cc/vTc15D6N/Dice-Five-removebg-preview.png" -> {
                result += 5;
            }
            case "https://i.postimg.cc/JhxtgjNF/Dice-Six-removebg-preview.png" -> {
                result += 6;
            }
        }

        switch (diceImages_2.get(diceTwo).getUrl()) {
            case "https://i.postimg.cc/W1XhYM6H/Dice-One-removebg-preview-Yellow.png" -> {
                result += 1;
            }
            case "https://i.postimg.cc/85kwQdqf/Dice-Two-removebg-preview-Yellow.png" -> {
                result += 2;
            }
            case "https://i.postimg.cc/3NVZvsW2/Dice-Three-removebg-preview-Yellow.png" -> {
                result += 3;
            }
            case "https://i.postimg.cc/TPfJgq2N/Dice-Four-removebg-preview-Yellow.png" -> {
                result += 4;
            }
            case "https://i.postimg.cc/7PfNPHZ5/dice-Five-removebg-preview-Yellow.png" -> {
                result += 5;
            }
            case "https://i.postimg.cc/MGHn0G4R/Dice-Six-removebg-preview-Yellow.png" -> {
                result += 6;
            }
        }
        String diceOutcomeSTR = String.valueOf(result);
        System.out.println("The result is: " + result);
//        DiceOutCome.setLayoutX(200.0);

        DiceOutCome.setText("Dice OutCome: " + diceOutcomeSTR);
    }

    public void click(MouseEvent mouseEvent) {
        System.out.println("Road is Clicked");
    }


}
