package com.settlers.demotesty.Fundamentals;

import com.settlers.demotesty.Fundimentals.Card;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CardTest {

    @Test
    public void testConstructorAndGetters() {
        // Test constructor and getters
        Card card = new Card("Ace of Spades");
        assertEquals("Ace of Spades", card.toString());
    }
    
    @Test
    public void testToString() {
        // Test toString method
        Card card = new Card("King of Hearts");
        assertEquals("King of Hearts", card.toString());
    }
}