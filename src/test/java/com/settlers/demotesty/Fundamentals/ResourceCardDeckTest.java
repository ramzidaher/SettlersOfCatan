package com.settlers.demotesty.Fundamentals;

import static org.junit.Assert.*;

import com.settlers.demotesty.Fundimentals.Card;
import com.settlers.demotesty.Fundimentals.ResourceCardDeck;
import org.junit.*;

public class ResourceCardDeckTest {
    private ResourceCardDeck deck;

    @Before
    public void setUp() {
        deck = new ResourceCardDeck();
    }

    @Test
    public void testGet() {
        assertEquals(new Card("ore"), deck.get("ore"));
        assertEquals(new Card("wool"), deck.get("brick"));
        assertEquals(new Card("grain"), deck.get("wool"));
        assertEquals(new Card("brick"), deck.get("lumber"));
        assertEquals(new Card("lumber"), deck.get("grain"));
        assertNull(deck.get("ore")); // no more ore cards left
        assertEquals(18, deck.size("ore"));
    }

    @Test
    public void testPut() {
        deck.put(new Card("ore"));
        assertEquals(20, deck.size("ore"));
        deck.put(new Card("stone")); // unknown type
        assertEquals(20, deck.size("ore")); // deck not changed
    }

    @Test
    public void testSize() {
        assertEquals(19, deck.size("ore"));
        assertEquals(19, deck.size("brick"));
        assertEquals(19, deck.size("wool"));
        assertEquals(19, deck.size("lumber"));
        assertEquals(19, deck.size("grain"));
        assertEquals(0, deck.size("stone")); // unknown type
    }
}