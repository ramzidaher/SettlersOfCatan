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
import java.util.ArrayList;

public class Player {
    //Default starting amounts for players
    private  int CITIES = 4;
    private  int SETTLEMENTS = 5;
    private  int ROADS = 15;
    //Player fields
    private Colour playerColour;
    private String playerName;
    private ArrayList<Settlement> settlements;
    private ArrayList<City> cities;
    private ArrayList<Road> roads;
    private int Roads;

    private boolean addCity;
    private boolean addSettlement;
    private boolean addRoad;
    private boolean isPlaying;

    /**
    * Create a player: assign name, colour and create ArrayLists of cities, settlements, and roads.
    * @param String name, Colour colour
    */
    public Player(String name, Colour colour) {
        playerName = name;
        playerColour = colour;
        settlements = new ArrayList<>();
        cities = new ArrayList<>();
        roads = new ArrayList<>();
        Roads =0;
        addRoad = false;
        addCity = false;
        addSettlement = false;
        isPlaying = false;
        for (int i = 0; i < SETTLEMENTS ; ++i ) {
            settlements.add(new Settlement(colour));
        }
        for (int i = 0; i < CITIES ; ++i) {
            cities.add(new City(colour));
        }
        for (int i = 0; i < ROADS; ++i) {
            roads.add(new Road(colour));
        }
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

    public void setRoads(){
        if (Roads != 14) {
            Roads++;
        }
    }
    public int getRoads(){
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
     * @return Colour colour
     */
    public Colour getPlayerColour() {
        return playerColour;
    }

    /**
     * @return cities.size()
     */
    public int getNumCities() {
        return cities.size();
    }
    /**
     * @return settlements.size()
     */
    public int getNumSettlements() {
        return settlements.size();
    }

    /**
     * @return roads.size()
     */
    public int getNumRoads() {
        return roads.size();
    }

    /**
     * Place road along edge of tile
     * @param
     */
    public void placeRoad() {
        roads.remove(0);
    }
    /**
     * Place settlement on vertex of tile
     * @param
     */
    public void placeSettlement() {
        settlements.remove(0);
    }
    /**
     * Place city on vertex of tile (ie. Upgrade settlement)
     * @param
     */
    public void placeCity() {
        cities.remove(0);
    }
    /**
     * Get player score
     */
    public int getScore() {
        int score = 0;
        score += (CITIES - getNumCities()) * 2;
        score += SETTLEMENTS - getNumSettlements();
        return score;
    }
}

