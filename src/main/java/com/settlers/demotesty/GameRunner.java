package com.settlers.demotesty;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class GameRunner extends Application {
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(GameRunner.class.getResource("WelcomePage.fxml"));
//        FXMLLoader fxmlLoader = new FXMLLoader(GameRunner.class.getResource("test.fxml"));
//        FXMLLoader fxmlLoader = new FXMLLoader(GameRunner.class.getResource("SignUpPage.fxml"));
//        FXMLLoader fxmlLoader = new FXMLLoader(GameRunner.class.getResource("WinnerPage.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 1920, 1080);
        if (isMacOS()) {
            scene.getRoot().setScaleX(0.75);
            scene.getRoot().setScaleY(0.75);
        }
        stage.setTitle("Welcome To Settlers!");
        stage.setScene(scene);
        stage.setResizable(false); // Prevent the window from being resized
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    private static boolean isMacOS() {
        return System.getProperty("os.name").toLowerCase().contains("mac");
    }
}
