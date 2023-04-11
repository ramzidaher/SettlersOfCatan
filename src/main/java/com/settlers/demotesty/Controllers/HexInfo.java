package com.settlers.demotesty.Controllers;

import javafx.geometry.Point2D;
import javafx.scene.image.ImageView;

public class HexInfo {
    private ImageView hexImageView;
    private Point2D center;

    public HexInfo(ImageView hexImageView, Point2D center) {
        this.hexImageView = hexImageView;
        this.center = center;
    }

    public ImageView getHexImageView() {
        return hexImageView;
    }

    public Point2D getCenter() {
        return center;
    }
}
