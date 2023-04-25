package com.settlers.demotesty.Fundimentals;

import java.util.*;

import javafx.geometry.Point2D;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.paint.ImagePattern;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;

/**
 * Class to represent a Player in the Settlers game.
 * @version 1.0
 * @author Sean
 */
public class Player {
    private boolean isAi;
    private Colour playerColour;
    private String playerName;
    private int Roads;
    private int Settlements;
    private int City;
    private int VP;
    private boolean addCity;
    private boolean addSettlement;
    private boolean addRoad;
    private boolean isPlaying;
    private HashMap<ImageView, Colour> addedSettlements;
    private HashMap<ImageView, Colour> addedCities;
    private HashMap<String, Integer> resources;
    private HashMap<String, ArrayList<Polygon>> nearestHexes;

    public Player(String name, Colour colour) {
        playerName = name;
        playerColour = colour;
        Roads = 0;
        addRoad = false;
        addCity = false;
        addSettlement = false;
        isPlaying = false;
        addedSettlements = new HashMap<>();
        addedCities = new HashMap<>();
        resources = new HashMap<>();
        resources.put("brick", 0);
        resources.put("grain", 0);
        resources.put("ore", 0);
        resources.put("wool", 0);
        resources.put("wood", 0);
        nearestHexes = new HashMap<>();
        isAi = false;
    }
//    public ArrayList<Card> getResourceCard() {
//        ArrayList<Card> resourceCards = new ArrayList<>();
//        for (Map.Entry<String, Integer> entry : resources.entrySet()) {
//            String key = entry.getKey();
//            int value = entry.getValue();
//            for (int i = 0; i < value; i++) {
//                resourceCards.add(new Card(key));
//            }
//        }
//        return resourceCards;
//    }

    public Card getResourceCard(String type) {
        Integer count = resources.get(type);
        Card card = null;
        if (count != 0) {
            resources.put(type, count - 1);
            card = new Card(type);
        }
        return card;
    }
    public int getSettlements() {
        return Settlements;
    }


    public boolean isAi() {
        return isAi;
    }

    public void setAi(boolean ai) {
        isAi = ai;
    }

    public HashMap<String, ArrayList<Polygon>> getNearestHexes() {
        return nearestHexes;
    }

    public void setNearestHexes(HashMap<String, ArrayList<Polygon>> nearestHexes) {
        this.nearestHexes = nearestHexes;
    }

    public HashMap<ImageView, Colour> getAddedSettlements() {
        return addedSettlements;
    }

    public void setAddedSettlements(HashMap<ImageView, Colour> addedSettlements) {
        this.addedSettlements = addedSettlements;
    }

    public void printNearestHexes() {
        System.out.println("Nearest Hexes:");
        Map<String, ArrayList<Polygon>> sortedNearestHexes = new TreeMap<>(nearestHexes);

        for (Map.Entry<String, ArrayList<Polygon>> entry : sortedNearestHexes.entrySet()) {
            String key = entry.getKey();
            List<Polygon> polygons = entry.getValue();
            System.out.println("Key: " + key);
            System.out.println("Polygons:");
            for (Polygon polygon : polygons) {
                System.out.println(polygon);
            }
        }
    }

    public HashMap<String, Integer> getResources() {
        return resources;
    }

    public void setResources(HashMap<String, Integer> resources) {
        this.resources = resources;
    }

    public HashMap<ImageView, Colour> getAddedCities() {
        return addedCities;
    }

    public void setAddedCities(HashMap<ImageView, Colour> addedCities) {
        this.addedCities = addedCities;
    }

    public boolean isAddRoad() {
        return addRoad;
    }

    public void setAddRoad(boolean addRoad) {
        this.addRoad = addRoad;
    }

    public boolean isPlaying() {
        return isPlaying;
    }

    public void setPlaying(boolean playing) {
        isPlaying = playing;
    }

    public void setAddCity(boolean addCity) {
        this.addCity = addCity;
    }

    public void setAddSettlement(boolean addSettlement) {
        this.addSettlement = addSettlement;
    }

    public boolean isAddCity() {
        return addCity;
    }

    public boolean isAddSettlement() {
        return addSettlement;
    }

    public void setRoads() {
        if (Roads != 15) {
            Roads++;
        }
    }

    public int getRoads() {
        return Roads;
    }

    /**
     * @return playerName
     */
    public String getPlayerName() {
        return playerName;
    }

    /**
     * Get player colour
     *
     * @return Colour colour
     */
    public Colour getPlayerColour() {
        return playerColour;
    }

    /**
     * Add resource card to resources data structure
     * It takes a card as parameter and gets the card type from it
     * @param card
     */
    public void addResourceCard(Card card) {
        String type = card.toString();
        Integer count = resources.get(type);
        resources.put(type, count+1);
    }
    public int getVP() {
        return VP;
    }

    public int getCity() {
        return City;
    }

    public void setCity() {
        if (City != 4) {
            City++;
        }
    }

    public void setSettlements() {
        if (Settlements != 5) {
            Settlements++;
        }
    }

    public int setVP() {
        int SettleVp = 1*getSettlements();
        int CityVp = 2*getCity();
        VP = SettleVp+CityVp;
        return VP;
    }
}

