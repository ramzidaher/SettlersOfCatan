package com.settlers.demotesty.Fundamentals;

import com.settlers.demotesty.Fundimentals.Card;
import com.settlers.demotesty.Fundimentals.Deck;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.HashSet;
import static org.junit.jupiter.api.Assertions.*;

public class DeckTest {

    private Deck deck;

    @BeforeEach
    public void setUp() {
        deck = new Deck();
    }

    @Test
    public void testAddCard() {
        // Test adding a single card to the deck
        Card card = new Card("Ace of Spades");
        deck.addCard(card);
        assertEquals(1, deck.getSize());

        // Test adding multiple cards to the deck
        for (int i = 2; i <= 10; i++) {
            card = new Card(i + " of Hearts");
            deck.addCard(card);
        }
        assertEquals(10, deck.getSize());
    }

    @Test
    public void testGetRandomCard() {
        // Test getting a random card from the deck
        Card card = new Card("Queen of Diamonds");
        deck.addCard(card);
        Card randomCard = deck.getRandomCard();
        assertEquals(card, randomCard);
        assertTrue(deck.isEmpty());

        // Test getting random cards from the deck multiple times
        ArrayList<Card> addedCards = new ArrayList<>();
        addedCards.add(new Card("King of Clubs"));
        addedCards.add(new Card("10 of Spades"));
        addedCards.add(new Card("5 of Diamonds"));
        for (Card c : addedCards) {
            deck.addCard(c);
        }
        HashSet<Card> selectedCards = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            randomCard = deck.getRandomCard();
            selectedCards.add(randomCard);
        }
        assertEquals(3, selectedCards.size());
        for (Card c : addedCards) {
            assertTrue(selectedCards.contains(c));
        }
        assertTrue(deck.isEmpty());
    }

    @Test
    public void testIsEmpty() {
        // Test checking if the deck is empty
        assertTrue(deck.isEmpty());
        Card card = new Card("6 of Clubs");
        deck.addCard(card);
        assertFalse(deck.isEmpty());
        deck.getRandomCard();
        assertTrue(deck.isEmpty());
    }

    @Test
    public void testGetSize() {
        // Test getting the size of the deck
        assertEquals(0, deck.getSize());
        Card card = new Card("2 of Spades");
        deck.addCard(card);
        assertEquals(1, deck.getSize());
        deck.getRandomCard();
        assertEquals(0, deck.getSize());
    }
}