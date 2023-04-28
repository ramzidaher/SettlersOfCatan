package com.settlers.demotesty.Fundamentals;

import com.settlers.demotesty.Fundimentals.Card;
import com.settlers.demotesty.Fundimentals.Colour;
import com.settlers.demotesty.Fundimentals.Player;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Polygon;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;

import static org.junit.Assert.*;

public class PlayerTest {

    Player player;

    @Before
    public void setUp() throws Exception {
        player = new Player("Player1", Colour.RED);
    }

    @Test
    public void testGetResourceCard() {
        player.getResources().put("brick", 2);
        Card card = player.getResourceCard("brick");
        assertEquals("brick", card.toString());
        assertEquals(1, player.getResources().get("brick").intValue());
    }

    @Test
    public void testAddResourceCard() {
        player.getResources().put("wood", 1);
        Card card = new Card("wood");
        player.addResourceCard(card);
        assertEquals(2, player.getResources().get("wood").intValue());
    }

    @Test
    public void testGetResourceCards() {
        player.getResources().put("brick", 2);
        player.getResources().put("ore", 1);
        ArrayList<Card> expectedResourceCards = new ArrayList<>();
        expectedResourceCards.add(new Card("brick"));
        expectedResourceCards.add(new Card("brick"));
        expectedResourceCards.add(new Card("ore"));
        ArrayList<Card> resourceCards = player.getResourceCard();
        assertEquals(expectedResourceCards.size(), resourceCards.size());
        for (int i = 0; i < expectedResourceCards.size(); i++) {
            assertEquals(expectedResourceCards.get(i).toString(), resourceCards.get(i).toString());
        }
    }

    @Test
    public void testSetAndGetNearestHexes() {
        HashMap<String, ArrayList<Polygon>> expectedNearestHexes = new HashMap<>();
        ArrayList<Polygon> polygons = new ArrayList<>();
        polygons.add(new Polygon());
        expectedNearestHexes.put("hex1", polygons);
        player.setNearestHexes(expectedNearestHexes);
        assertEquals(expectedNearestHexes, player.getNearestHexes());
    }

    @Test
    public void testSetAndGetAddedSettlements() {
        HashMap<ImageView, Colour> expectedAddedSettlements = new HashMap<>();
        ImageView imageView = new ImageView();
        expectedAddedSettlements.put(imageView, Colour.RED);
        player.setAddedSettlements(expectedAddedSettlements);
        assertEquals(expectedAddedSettlements, player.getAddedSettlements());
    }

    @Test
    public void testSetAndGetAddedCities() {
        HashMap<ImageView, Colour> expectedAddedCities = new HashMap<>();
        ImageView imageView = new ImageView();
        expectedAddedCities.put(imageView, Colour.RED);
        player.setAddedCities(expectedAddedCities);
        assertEquals(expectedAddedCities, player.getAddedCities());
    }

    @Test
    public void testSetAndGetAddRoad() {
        player.setAddRoad(true);
        assertTrue(player.isAddRoad());
    }

    @Test
    public void testSetAndGetPlaying() {
        player.setPlaying(true);
        assertTrue(player.isPlaying());
    }

    @Test
    public void testSetAndGetAddCity() {
        player.setAddCity(true);
        assertTrue(player.isAddCity());
    }

    @Test
    public void testSetAndGetAddSettlement() {
        player.setAddSettlement(true);
        assertTrue(player.isAddSettlement());
    }
}

