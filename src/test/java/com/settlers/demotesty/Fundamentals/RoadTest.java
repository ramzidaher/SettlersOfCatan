package com.settlers.demotesty.Fundamentals;

import org.junit.Test;
import static org.junit.Assert.*;

public class RoadTest {

    @Test
    public void testConstructor() {
        Colour colour = Colour.RED;
        Road road = new Road(colour);
        assertEquals(colour, road.getColour());
    }
}