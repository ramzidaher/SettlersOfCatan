package com.settlers.demotesty.Fundimentals;

/**
 * This class represents the Robber in the Settlers game.
 * @version 1.0
 * @author Sean
 */
public class Robber {
    private int tileNumber;
    //Default starting tile number
    private final int START = 7;

    /**
     * Create robber, default starting position tile 7
     */
    public Robber() {
        tileNumber = START;
    }

    /**
     * Moves the robber to tile position chosen
     * @param newTileNumber
     * @return int tileNumber
     */
    public int moveRobber(int newTileNumber) {
        return tileNumber = newTileNumber;
    }

    /**
     * Find robber's position
     * @return int tileNumber
     */
    public int find() {
        return tileNumber;
    }
}
