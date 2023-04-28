package com.settlers.demotesty.Fundamentals;

import com.settlers.demotesty.Fundimentals.City;
import com.settlers.demotesty.Fundimentals.Colour;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CityTest {

    @Test
    public void testConstructorAndGetters() {
        // Test constructor and getters
        City city = new City(Colour.RED);
        assertEquals(Colour.RED, city.toString());
    }
}