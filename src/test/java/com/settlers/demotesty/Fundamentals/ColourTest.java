package com.settlers.demotesty.Fundamentals;

import org.junit.jupiter.api.Test;
import javafx.scene.paint.Color;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ColourTest {

    @Test
    public void testGetFxColor() {
        // Test getFxColor method
        assertEquals(Color.RED, Colour.RED.getFxColor());
        assertEquals(Color.BLUE, Colour.BLUE.getFxColor());
        assertEquals(Color.GREEN, Colour.GREEN.getFxColor());
        assertEquals(Color.YELLOW, Colour.YELLOW.getFxColor());
    }
}