package com.settlers.demotesty.Fundamentals;

import com.settlers.demotesty.Fundimentals.Colour;
import com.settlers.demotesty.Fundimentals.Road;
import org.junit.Test;
import static org.junit.Assert.*;

public class RoadTest {

    @Test
    public void testConstructor() {
        Colour colour = Colour.RED;
        Road road = new Road(colour);
        assertEquals(colour, road.toString());
    }
}