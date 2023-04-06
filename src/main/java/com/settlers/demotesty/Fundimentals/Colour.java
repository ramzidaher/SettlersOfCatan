package com.settlers.demotesty.Fundimentals;

import javafx.scene.paint.Color;

public enum Colour {
    RED(Color.RED),
    BLUE(Color.BLUE),
    GREEN(Color.GREEN),
    YELLOW(Color.YELLOW);

    private final Color fxColor;

    Colour(Color fxColor) {
        this.fxColor = fxColor;
    }

    public Color getFxColor() {
        return fxColor;
    }
}
