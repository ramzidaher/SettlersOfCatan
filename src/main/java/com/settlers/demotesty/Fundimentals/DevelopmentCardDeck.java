package com.settlers.demotesty.Fundimentals;

/**
 * Class to represent Development Cards in the Settlers game.
 * Subclass of Deck
 * @version 1.0
 * @author Sean
 */

public class DevelopmentCardDeck extends Deck {
    //Default starting number of each card in development deck
    private final int KNIGHTS = 14;
    private final int PROGRESSCARDS = 6;
    private final int VICTORYPOINTCARDS = 5;

    /**
     * Create development card deck
     */
    public DevelopmentCardDeck() {
        super();
        for (int i = 0; i < KNIGHTS; ++i) {
            super.addCard(new Card("knight"));
        }
        for (int i = 0; i < PROGRESSCARDS; ++i) {
            super.addCard(new Card("progress"));
        }
        for (int i = 0; i < VICTORYPOINTCARDS; ++i) {
            super.addCard(new Card("victory"));
        }
    }
}
