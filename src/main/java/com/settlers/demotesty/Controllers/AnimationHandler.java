package com.settlers.demotesty.Controllers;
import javafx.animation.ScaleTransition;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class AnimationHandler extends Board{
    public static void hoverEnter(ImageView imageView) {
        ScaleTransition scaleUp = new ScaleTransition(Duration.millis(200), imageView);
        scaleUp.setByX(0.1);
        scaleUp.setByY(0.1);
        scaleUp.setCycleCount(1);
        scaleUp.setAutoReverse(false);
        scaleUp.play();
    }

    public static void hoverExit(ImageView imageView) {
        ScaleTransition scaleDown = new ScaleTransition(Duration.millis(200), imageView);
        scaleDown.setByX(-0.1);
        scaleDown.setByY(-0.1);
        scaleDown.setCycleCount(1);
        scaleDown.setAutoReverse(false);
        scaleDown.play();
    }

    public static void roadAnimation(ImageView imageView) {
        ScaleTransition scaleUp = new ScaleTransition(Duration.millis(200), imageView);
        scaleUp.setByX(0.1);
        scaleUp.setByY(0.1);
        scaleUp.setCycleCount(2);
        scaleUp.setAutoReverse(true);
        scaleUp.play();
    }
    public static void settlementButtonAnimation(ImageView imageView) {
        ScaleTransition scaleUp = new ScaleTransition(Duration.millis(200), imageView);
        scaleUp.setByX(0.1);
        scaleUp.setByY(0.1);
        scaleUp.setCycleCount(2);
        scaleUp.setAutoReverse(true);
        scaleUp.play();
    }
}
