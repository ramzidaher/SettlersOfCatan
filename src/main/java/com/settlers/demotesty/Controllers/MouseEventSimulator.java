package com.settlers.demotesty.Controllers;

import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;

public class MouseEventSimulator extends Board{

    public void simulateMouseEvent() {
        double x = 100; // X coordinate of the event
        double y = 100; // Y coordinate of the event
        MouseButton button = MouseButton.PRIMARY; // MouseButton.PRIMARY represents a left-click event
        int clickCount = 1; // Number of clicks (1 for single click, 2 for double click, etc.)

        MouseEvent fakeMouseEvent = new MouseEvent(MouseEvent.MOUSE_CLICKED, x, y, x, y, button, clickCount, false, false, false, false, true, false, false, true, false, false, null);

        NextPlayer(fakeMouseEvent);
    }
}
