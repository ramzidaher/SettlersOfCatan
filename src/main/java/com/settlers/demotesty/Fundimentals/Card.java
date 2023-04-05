package com.settlers.demotesty.Fundimentals;

/**
 * Class to represent a card --- to add possibility of graphic representation
 * @version 1.0
 * @author Sean
 */
public class Card {
    //String to store card type --- to add possibility of graphic representation
     private String type;

    /**
     * Constructor for Card
     * @param String type
     */
     public Card(String type) {
         this.type = type;
     }

    /**
     * Get card type - returns string representation --- to add possibility of graphic representation
     * @return String type
     */
    public String toString() {
        return type;
    }
}
