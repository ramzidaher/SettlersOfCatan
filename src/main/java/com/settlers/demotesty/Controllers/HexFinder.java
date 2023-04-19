//package com.settlers.demotesty.Controllers;
//
//import com.settlers.demotesty.Fundimentals.Player;
//import javafx.geometry.Bounds;
//import javafx.geometry.Point2D;
//import javafx.scene.image.ImageView;
//import javafx.scene.layout.AnchorPane;
//import javafx.scene.shape.Circle;
//import javafx.scene.shape.Polygon;
//
//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.Map;
//
//public class HexFinder {
//    private AnchorPane anchorPane;
//    private Map<Polygon, String> hexagonsResources;
//    private Map<ImageView, Integer> waterHex;
//    private Circle CirclePointerHexes;
//    private int gameCounter;
//    private HexToResourceProcessor passedHexToResource;
//    private ResourceCounterUpdater updateResourceCounters;
//
//    public HexFinder(AnchorPane anchorPane, Map<Polygon, String> hexagonsResources, Map<ImageView, Integer> waterHex, Circle CirclePointerHexes, int gameCounter, HexToResourceProcessor passedHexToResource, ResourceCounterUpdater updateResourceCounters) {
//        this.anchorPane = anchorPane;
//        this.hexagonsResources = hexagonsResources;
//        this.waterHex = waterHex;
//        this.CirclePointerHexes = CirclePointerHexes;
//        this.gameCounter = gameCounter;
//        this.passedHexToResource = passedHexToResource;
//        this.updateResourceCounters = updateResourceCounters;
//    }
//
//    public void findNearestHexes(double x, double y, Player currentPlayer, ImageView imageView) {
//        // ... method content ...
//        CirclePointerHexes.setLayoutX(x + 9);
//        CirclePointerHexes.setLayoutY(y + 9);
//        HashSet<Polygon> polygons = new HashSet<>();
//        boolean optionOneSuccessful = false;
//
//        CirclePointerHexes.setLayoutY(y - 40);
//        for (Polygon hex : hexagonsResources.keySet()) {
//            Point2D circleCenterInHex = hex.parentToLocal(
//                    CirclePointerHexes.localToParent(
//                            CirclePointerHexes.getBoundsInLocal().getCenterX(),
//                            CirclePointerHexes.getBoundsInLocal().getCenterY()
//                    )
//            );
//
//            boolean isCircleInsideHex = hex.contains(circleCenterInHex);
//
//            if (isWaterHex(CirclePointerHexes)) {
//                System.out.println("The circle is in bounds of a water hex ImageView.");
//
//            } else {
//                System.out.println("The circle is not in bounds of a water hex ImageView.");
//            }
//            if (isCircleInsideHex) {
//
//                polygons.add(hex);
//
//                OptionOneLeftandRight(x + 9, y + 9, currentPlayer, "up", polygons);
//                OptionOneLeftandRight(x + 9, y + 9, currentPlayer, "left", polygons);
//                OptionOneLeftandRight(x + 9, y + 9, currentPlayer, "right", polygons);
//                optionOneSuccessful = true;
//                break;
//            }
//        }
//
//        if (!optionOneSuccessful) {
//            CirclePointerHexes.setLayoutX(x + 9);
//            CirclePointerHexes.setLayoutY(x + 9);
//            OptionTwoLeftandRight(x + 9, y + 9, currentPlayer, "down", polygons);
//            OptionTwoLeftandRight(x + 9, y + 9, currentPlayer, "right", polygons);
//            OptionTwoLeftandRight(x + 9, y + 9, currentPlayer, "left", polygons);
//        }
//
//        int settlementNumber = currentPlayer.getNearestHexes().size() + 1;
//        ArrayList<Polygon> polygonsList = new ArrayList<>(polygons);
//        currentPlayer.getNearestHexes().put("Settlement number: " + settlementNumber, polygonsList);
//
//        addResourcesFromSettlement(currentPlayer, polygonsList);
//
//    }
//
//    private void addResourcesFromSettlement(Player currentPlayer, ArrayList<Polygon> polygons) {
//        if (gameCounter == 2) {
//            for (Polygon polygon : polygons) {
//                passedHexToResource.process(currentPlayer, polygon);
//            }
//            updateResourceCounters.update(currentPlayer);
//        }
//    }
//
//
//    private void OptionOneLeftandRight(double x, double y, Player currentPlayer, String direction, HashSet<Polygon> polygons) {
//        // ... method content ...
//        System.out.println("IN OPTION ONE");
//
//        if (direction.equals("right")) {
//            CirclePointerHexes.setLayoutX(x + 50);
//            CirclePointerHexes.setLayoutY(y + 40);
//        } else if (direction.equals("left")) {
//            CirclePointerHexes.setLayoutX(x - 50);
//            CirclePointerHexes.setLayoutY(y + 40);
//        } else if (direction.equals("up")) {
//            CirclePointerHexes.setLayoutY(y - 40);
//        }
//
//        for (Polygon hex : hexagonsResources.keySet()) {
//            Point2D circleCenterInHex = hex.parentToLocal(
//                    CirclePointerHexes.localToParent(
//                            CirclePointerHexes.getBoundsInLocal().getCenterX(),
//                            CirclePointerHexes.getBoundsInLocal().getCenterY()
//                    )
//            );
//
//            boolean isCircleInsideHex = hex.contains(circleCenterInHex);
//
//            if (isCircleInsideHex) {
//                System.out.println("YO HO");
//                polygons.add(hex);
//            }
//        }
//    }
//
//    private void OptionTwoLeftandRight(double x, double y, Player currentPlayer, String direction, HashSet<Polygon> polygons) {
//        // ... method content ...
//        System.out.println("IN OPTION TWO");
//
//        if (direction.equals("right")) {
//            CirclePointerHexes.setLayoutY(y - 40);
//            CirclePointerHexes.setLayoutX(x + 50);
//        } else if (direction.equals("left")) {
//            CirclePointerHexes.setLayoutY(y - 40);
//            CirclePointerHexes.setLayoutX(x - 50);
//        } else if (direction.equals("down")) {
//            CirclePointerHexes.setLayoutY(y + 40);
//        }
//
//        for (Polygon hex : hexagonsResources.keySet()) {
//            Point2D circleCenterInHex = hex.parentToLocal(
//                    CirclePointerHexes.localToParent(
//                            CirclePointerHexes.getBoundsInLocal().getCenterX(),
//                            CirclePointerHexes.getBoundsInLocal().getCenterY()
//                    )
//            );
//
//            boolean isCircleInsideHex = hex.contains(circleCenterInHex);
//
//            if (isCircleInsideHex) {
//                System.out.println("YO HO");
//                polygons.add(hex);
//            }
//        }
//    }
//
//    public boolean isWaterHex(Circle circle) {
//        // ... method content ...
//        for (ImageView waterHexImageView : waterHex.keySet()) {
//            Bounds waterHexBounds = waterHexImageView.localToScene(waterHexImageView.getBoundsInLocal());
//            Bounds circleBounds = circle.localToScene(circle.getBoundsInLocal());
//
//            if (waterHexBounds.intersects(circleBounds)) {
//                return true;
//            }
//        }
//        return false;
//    }
//}
