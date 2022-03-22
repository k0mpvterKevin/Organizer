package com.example.organizer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class SceneController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToMarks(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("mark-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root, 600, 300);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToCalendar(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("calendar-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root, 600, 300);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToHelloScene(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root, 600, 300);
        stage.setScene(scene);
        stage.show();
    }
}
