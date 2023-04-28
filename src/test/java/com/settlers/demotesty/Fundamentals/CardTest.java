package com.settlers.demotesty.Fundamentals;

import static org.junit.Assert.*;

import com.settlers.demotesty.Fundimentals.Card;
import org.junit.Test;

public class CardTest {

    @Test
    public void testtoString() {
        // Create a new Card with type "wood"
        Card card = new Card("lumber");

        // Check that the getType method returns "lumber"
        assertEquals("lumber", card.toString());
    }

    @Test
    public void testtoStringWithDifferentType() {
        // Create a new Card with type "ore"
        Card card = new Card("ore");

        // Check that the toString method returns "ore"
        assertEquals("ore", card.toString());
    }

    @Test(expected = NullPointerException.class)
    public void testCreateCardWithNullName() {
        // Try to create a new Card with a null name
        Card card = new Card(null);
    }
}