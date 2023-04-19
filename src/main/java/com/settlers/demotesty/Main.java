package com.settlers.demotesty;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.input.KeyCombination;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("test.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 1920, 1080);
        if (isMacOS()) {
            scene.getRoot().setScaleX(0.65);
            scene.getRoot().setScaleY(0.65);
        }

//        stage.initStyle(StageStyle.UTILITY); // Set the stage style to UTILITY
        stage.setTitle("Welcome To Settlers!");

        stage.setScene(scene);
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    private static boolean isMacOS() {
        return System.getProperty("os.name").toLowerCase().contains("mac");
    }
}
