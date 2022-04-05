package com.example.organizer;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import org.controlsfx.control.action.Action;

import java.io.IOException;
import java.util.Objects;

public class SceneController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToScene1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root, 600, 300);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToScene2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("CalendarViewMonday.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root, 731, 513);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToScene3(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("marks-view.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root, 600, 300);
        stage.setScene(scene);
        stage.show();
    }

    public void homePaneClicked(MouseEvent mouseEvent) {
    }

    public void calendarButtonClicked(ActionEvent actionEvent) {
    }

    public void teacherButtonClicked(ActionEvent actionEvent) {
    }

    public void MarksButtonClicked(ActionEvent actionEvent) {
    }

    public void calendarPaneClicked(MouseEvent mouseEvent) {
    }

    public void sundayClicked(MouseEvent mouseEvent) {
    }

    public void saturdayClicked(MouseEvent mouseEvent) {
    }

    public void fridayClicked(MouseEvent mouseEvent) {
    }

    public void thursdayClicked(MouseEvent mouseEvent) {
    }

    public void wednesdayClicked(MouseEvent mouseEvent) {
    }

    public void tuesdayClicked(MouseEvent mouseEvent) {
    }

    public void mondayClicked(MouseEvent mouseEvent) {
    }

    public void timetablePaneClicked(MouseEvent mouseEvent) {
    }

    public void homeworkPaneClicked(MouseEvent mouseEvent) {
    }

    public void testPaneClicked(MouseEvent mouseEvent) {
    }

    public void HelpClicked(MouseEvent mouseEvent) {
    }

    public void AboutUsClicked(MouseEvent mouseEvent) {
    }

    public void ContactClicked(MouseEvent mouseEvent) {
    }

    public void switchToCalendar(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("CalendarViewMonday.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root, 731, 513);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToMarks(ActionEvent actionEvent) {
    }

    private void switchScene(ActionEvent event, )
}
