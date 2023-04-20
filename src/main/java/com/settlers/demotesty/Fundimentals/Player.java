package com.settlers.demotesty.Fundimentals; /**

* Class to represent a Player in the Settlers game.
 * --- to finish:
 * --- getScore()
 * --- placeRoad()
 * --- placeSettlement()
 * --- placeCity()
 * @version 1.0
 * @author Sean
*/
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

public class Player {
    private boolean isAi;

    //Default starting amounts for players
    private int CITIES = 0;
    private int SETTLEMENTS = 0;
    private int ROADS = 0;
    //Player fields
    private Colour playerColour;
    private String playerName;
    private int Roads;
    private int Settlements;

    private boolean addCity;
    private boolean addSettlement;
    private boolean addRoad;
    private boolean isPlaying;
    private HashMap<ImageView, Colour> addedSettlements;
    private HashMap<ImageView, Colour> addedCities;
    private HashMap<String, Integer> resources;

    private HashMap<String, ArrayList<Polygon>> nearestHexes = new HashMap<>();

    /**
     * Create a player: assign name, colour and create ArrayLists of cities, settlements, and roads.
     * //    * @param String name, Colour colour
     */
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
        this.resources = new HashMap<>();
        this.resources.put("brick", 0);
        this.resources.put("grain", 0);
        this.resources.put("ore", 0);
        this.resources.put("wool", 0);
        this.resources.put("wood", 0);
        this.nearestHexes = new HashMap<>();
        isAi = false;


    }

    public int getSettlements() {
        return Settlements;
    }

    public void setSettlements() {
        if (Settlements != 14) {
            Settlements++;
        }
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

        // Sort the nearestHexes map by keys
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
        if (Roads != 14) {
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
}

