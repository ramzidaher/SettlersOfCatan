package com.settlers.demotesty.Fundamentals;

public class RobberTest {
    @Test
    public void testCreateRobber() {
        Robber robber = new Robber();
        assertEquals(7, robber.find());
    }

    @Test
    public void testMoveRobber() {
        Robber robber = new Robber();
        robber.moveRobber(5);
        assertEquals(5, robber.find());
    }

    @Test
    public void testFindRobber() {
        Robber robber = new Robber();
        robber.moveRobber(5);
        assertEquals(5, robber.find());
        robber.moveRobber(3);
        assertEquals(3, robber.find());
        robber.moveRobber(11);
        assertEquals(11, robber.find());
    }
}