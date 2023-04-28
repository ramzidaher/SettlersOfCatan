package com.settlers.demotesty.Fundamentals;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class DevelopmentCardDeckTest {
    @Test
    public void testDeckCreation() {
        DevelopmentCardDeck deck = new DevelopmentCardDeck();
        assertFalse(deck.isEmpty());
        assertEquals(25, deck.getSize());
    }

    @Test
    public void testGetRandomCard() {
        DevelopmentCardDeck deck = new DevelopmentCardDeck();
        Card card1 = deck.getRandomCard();
        assertFalse(deck.isEmpty());
        Card card2 = deck.getRandomCard();
        assertFalse(deck.isEmpty());
        assertTrue(card1 != card2); // Make sure the two cards are not the same
        Card card3 = null;
        for (int i = 0; i < 23; i++) {
            card3 = deck.getRandomCard();
        }
        assertFalse(deck.isEmpty());
        Card card4 = deck.getRandomCard();
        assertFalse(deck.isEmpty());
        assertTrue(card1 != card4 && card2 != card4 && card3 != card4); // Make sure the four cards are not the same
        assertTrue(deck.isEmpty());
    }

    @Test
    public void testEmptyDeck() {
        DevelopmentCardDeck deck = new DevelopmentCardDeck();
        for (int i = 0; i < 25; i++) {
            assertFalse(deck.isEmpty());
            deck.getRandomCard();
        }
        assertTrue(deck.isEmpty());
        assertNull(deck.getRandomCard());
    }

    @Test
    public void testCardDistribution() {
        DevelopmentCardDeck deck = new DevelopmentCardDeck();
        int numKnights = 0;
        int numProgress = 0;
        int numVictoryPoints = 0;
        for (int i = 0; i < 25; i++) {
            Card card = deck.getRandomCard();
            if (card.getType().equals("knight")) {
                numKnights++;
            } else if (card.getType().equals("progress")) {
                numProgress++;
            } else if (card.getType().equals("victory")) {
                numVictoryPoints++;
            }
        }
        assertEquals(14, numKnights);
        assertEquals(6, numProgress);
        assertEquals(5, numVictoryPoints);
    }
}