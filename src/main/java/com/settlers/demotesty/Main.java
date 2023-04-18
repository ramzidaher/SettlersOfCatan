package com.settlers.demotesty;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("test.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1920, 1080);
        stage.setTitle("Welcome To Settlers!!!");
        stage.setScene(scene);
        stage.setResizable(false); // set resizable property to false
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
