//package com.settlers.demotesty.Controllers;
//
//import com.settlers.demotesty.Fundimentals.Player;
//import javafx.scene.shape.Polygon;
//import javafx.scene.text.Text;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//public class BoardManager extends Board{
//    private List<Player> players;
//    private List<Polygon> hexagons;
//    private List<Text> TextNumbers;
//    private List<Double> xCoordinates;
//    private List<Double> yCoordinates;
//    private List<Double> xCoordText;
//    private List<Double> yCoordText;
//
//    public BoardManager(List<Player> players, List<Polygon> hexagons, List<Text> TextNumbers, List<Double> xCoordinates, List<Double> yCoordinates, List<Double> xCoordText, List<Double> yCoordText) {
//        this.players = players;
//        this.hexagons = hexagons;
//        this.TextNumbers = TextNumbers;
//        this.xCoordinates = xCoordinates;
//        this.yCoordinates = yCoordinates;
//        this.xCoordText = xCoordText;
//        this.yCoordText = yCoordText;
//    }
//
//    public void assignPlayer() {
//        // Set the text of PlayerOneID label to the first player's name
//        PlayerOneID.setText(players.get(0).getPlayerName());
//        // Set the fill color of PlayerOneTagBoxColor based on the first player's color
//        PlayerOneTagBoxColor.setFill(players.get(0).getPlayerColour().getFxColor());
//
//        // Set the text of PlayerTwoID label to the second player's name
//        PlayerTwoID.setText(players.get(1).getPlayerName());
//        // Set the fill color of PlayerTwoTagBoxColor based on the second player's color
//        PlayerTwoTagBoxColor.setFill(players.get(1).getPlayerColour().getFxColor());
//
//        // Set the text of PlayerThreeID label to the third player's name
//        PlayerThreeID.setText(players.get(2).getPlayerName());
//        // Set the fill color of PlayerThreeTagBoxColor based on the third player's color
//        PlayerThreeTagBoxColor.setFill(players.get(2).getPlayerColour().getFxColor());
//
//        // Set the text of PlayerFourID label to the fourth player's name
//        PlayerFourID.setText(players.get(3).getPlayerName());
//        // Set the fill color of PlayerFourTagBoxColor based on the fourth player's color
//        PlayerFourTagBoxColor.setFill(players.get(3).getPlayerColour().getFxColor());
//    }
//
//
//    // This method shuffles the positions of the hexagons on the board
//    public void shuffleHexagons() {
//        // Initialize new lists to store the shuffled coordinates and hexagons
//        ArrayList<Double> shuffledXCoordinates = new ArrayList<>();
//        ArrayList<Double> shuffledYCoordinates = new ArrayList<>();
//        ArrayList<Polygon> shuffledHexagons = new ArrayList<>();
//
//        // Create copies of the original coordinates lists
//        ArrayList<Double> xCoordinatesCopy = new ArrayList<>(xCoordinates);
//        ArrayList<Double> yCoordinatesCopy = new ArrayList<>(yCoordinates);
//
//        // Iterate through each hexagon
//        for (Polygon hexagon : hexagons) {
//            // Create a new Random object for generating random indices
//            Random rand = new Random();
//            // Generate a random index within the range of xCoordinatesCopy's size
//            int randomIndex = rand.nextInt(xCoordinatesCopy.size());
//            // Get the x-coordinate at the random index from xCoordinatesCopy
//            double newX = xCoordinatesCopy.get(randomIndex);
//            // Get the y-coordinate at the random index from yCoordinatesCopy
//            double newY = yCoordinatesCopy.get(randomIndex);
//            // Update the x and y layout positions of the hexagon
//            hexagon.setLayoutX(newX);
//            hexagon.setLayoutY(newY);
//            // Add the new x and y coordinates to the shuffled coordinates lists
//            shuffledXCoordinates.add(newX);
//            shuffledYCoordinates.add(newY);
//            // Remove the used coordinates from the coordinates copies
//            xCoordinatesCopy.remove(randomIndex);
//            yCoordinatesCopy.remove(randomIndex);
//            // Add the hexagon to the shuffled hexagons list
//            shuffledHexagons.add(hexagon);
//        }
//
//        // Clear the original hexagons list and add the shuffled hexagons
//        hexagons.clear();
//        hexagons.addAll(shuffledHexagons);
//
//        // Print the new x and y coordinates for debugging purposes
//        System.out.println("New X Coordinates: " + shuffledXCoordinates);
//        System.out.println("New Y Coordinates: " + shuffledYCoordinates);
//
//
//    }
//
//    public double getHexDesertX() {
//        return hexagons.get(18).getLayoutX();
//    }
//
//    public double getHexDesertY() {
//        return hexagons.get(18).getLayoutY();
//    }
//
//    public void shuffleNumber() {
//        // Hide the desert number token (Num_19) since the desert hexagon has no number
//        Num_19.setVisible(false);
//
//        // Remove Num_19 from the TextNumbers list as it's not needed for the shuffling process
//        TextNumbers.remove(Num_19);
//
//        // Iterate through each number token in TextNumbers
//        for (Text textNumber : TextNumbers) {
//            double newX, newY;
//            boolean validPosition;
//            do {
//                // Create a new Random object for generating random indices
//                Random rand = new Random();
//                // Generate a random index within the range of xCoordText's size
//                int randomIndex = rand.nextInt(xCoordText.size());
//                // Get the x and y coordinates for the current number token
//                newX = xCoordText.get(randomIndex);
//                newY = yCoordText.get(randomIndex);
//                // Check if the number token is too close to the desert hexagon
//                validPosition = Math.abs(newX - getHexDesertX()) > 1e-6 || Math.abs(newY - getHexDesertY()) > 1e-6;
//                if (validPosition) {
//                    // Set the layout position of the number token to the randomly chosen coordinates
//                    textNumber.setLayoutX(newX);
//                    textNumber.setLayoutY(newY);
//                    // Remove the used coordinates from xCoordText and yCoordText lists
//                    xCoordText.remove(randomIndex);
//                    yCoordText.remove(randomIndex);
//                }
//            } while (!validPosition);
//        }
//    }
//}
