package com.settlers.demotesty.Fundimentals; /**
 * Class to represent a deck of cards.
 * @version 1.1
 * @author Sean
 */
import java.util.ArrayList;
import java.util.Random;

public class Deck {
    //Create arraylist of type card
    private ArrayList<Card> deck;

    /**
     * Create empty deck of cards
     */
    public Deck() {
        deck = new ArrayList<Card>();
    }

    /**
     * Add card to deck
     * @param card
     */
    public void addCard(Card card) {
        deck.add(card);
    }

    /**
     * Get random card from deck
     * @return rdmCard
     */
    public Card getRandomCard() {
        Random rdm = new Random();
        if (!deck.isEmpty()) {
            return deck.remove(rdm.nextInt(deck.size()));
        }
        else return null;
    }

    /**
     * Check if deck is empty
     * @return boolean flag
     */
    public boolean isEmpty() {
        return deck.isEmpty();
    }

    /**
     * Get size of the deck
     * @return int size of deck
     */
    public int getSize() {
        return deck.size();
    }
}
