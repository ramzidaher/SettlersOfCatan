package com.settlers.demotesty;

import com.settlers.demotesty.GameRunner;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class GameLauncher extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        GameRunner gameRunner = new GameRunner();
        gameRunner.start(stage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
