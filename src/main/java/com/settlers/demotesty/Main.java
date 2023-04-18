package com.settlers.demotesty;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("WelcomePage.fxml"));
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("test.fxml"));
//        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("SignUpPage.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 1920, 1080);
        if (isMacOS()) {
            scene.getRoot().setScaleX(0.75);
            scene.getRoot().setScaleY(0.75);
        }
        stage.setTitle("Welcome To Settlers!!!");
        stage.setScene(scene);
        stage.setResizable(false); // Prevent the window from being resized
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }

    private static boolean isMacOS() {
        return System.getProperty("os.name").toLowerCase().contains("mac");
    }
}
