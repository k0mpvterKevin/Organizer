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

    public void homePaneClicked(MouseEvent mouseEvent) {
    }

    public void calendarButtonClicked(ActionEvent actionEvent) {
    }

    public void teacherButtonClicked(ActionEvent actionEvent) {
    }

    public void MarksButtonClicked(ActionEvent actionEvent) {
        ;
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
        switchScene(event, "CalendarViewMonday");

    }

    public void switchToMarks(ActionEvent event) throws IOException {
        switchScene(event, "marks-view");
    }

    private void switchScene(ActionEvent event, String fileName) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(fileName + ".fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root, Const.SCREENWIDTH, Const.SCREENHEIGHT);
        stage.setScene(scene);
        stage.show();
    }

}
