package com.settlers.demotesty.Fundimentals;

import java.util.ArrayList;

/**
 * Class to represent Resource Cards in the Settlers game.
 * Subclass of Deck
 * @version 1.1
 * @author Sean
 */

public class ResourceCardDeck extends Deck {
    //Default number of each card to start the game with.
    private final int NOC = 19;
    private ArrayList<Card> ore;
    private ArrayList<Card> lumber;
    private ArrayList<Card> brick;
    private ArrayList<Card> wool;
    private ArrayList<Card> grain;

    /**
     * Create resource cards deck with 19 of each card.
     */
    public ResourceCardDeck() {
        super();
        ore = new ArrayList<>();
        brick = new ArrayList<>();
        wool = new ArrayList<>();
        lumber = new ArrayList<>();
        grain = new ArrayList<>();
        for (int i = 0; i < NOC; ++i) {
            ore.add(new Card("ore"));
            brick.add(new Card("wool"));
            wool.add(new Card("grain"));
            lumber.add(new Card("brick"));
            grain.add(new Card("lumber"));
        }
    }
    /**
     * Get card
     * @param type String description of card
     * @return Card
     */
    public Card get(String type) {
        Card temp = null;
        if (size(type) != 0) {
            temp = switch (type) {
                case "ore" -> ore.remove(0);
                case "brick" -> brick.remove(0);
                case "lumber" -> lumber.remove(0);
                case "wool" -> wool.remove(0);
                case "grain" -> grain.remove(0);
                default -> null;
            };
        }
        return temp;
    }

    /**
     * Put card back in its deck
     * @param card
     */
    public void put(Card card) {
        String type = card.toString();
        switch (type) {
            case "ore" -> ore.add(card);
            case "brick" -> brick.add(card);
            case "lumber" -> lumber.add(card);
            case "wool" -> wool.add(card);
            case "grain" -> grain.add(card);
        }
    }

    /**
     * Get size of specific deck of resource cards
     * @param type
     * @return size
     */
    public int size(String type) {
        int size = switch (type) {
            case "ore" -> ore.size();
            case "brick" -> brick.size();
            case "lumber" -> lumber.size();
            case "wool" -> wool.size();
            case "grain" -> grain.size();
            default -> 0;
        };
        return size;
    }

}







