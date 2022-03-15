package com.example.organizer;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader helloLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        FXMLLoader organizerLoader = new FXMLLoader(HelloApplication.class.getResource("organizer-view.fxml"));
        Scene helloScene = new Scene(helloLoader.load(), 500, 500);
        stage.setTitle("Hello!");
        stage.setScene(helloScene);
        stage.show();


    }

    public static void main(String[] args) {
        launch();
    }
}