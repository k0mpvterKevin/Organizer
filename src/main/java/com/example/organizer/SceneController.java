package com.example.organizer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;

public class SceneController {

    @FXML
    Circle mondayCircle;
    @FXML
    Circle tuesdayCircle;
    @FXML
    Circle wednesdayCircle;
    @FXML
    Circle thursdayCircle;
    @FXML
    Circle fridayCircle;
    @FXML
    Circle saturdayCircle;
    @FXML
    Circle sundayCircle;
    @FXML
    Pane dayExtension;
    @FXML
    Pane timetablePane;
    @FXML
    Pane homeworkPane;
    @FXML
    Pane testPane;


    private Stage stage;
    private Scene scene;
    private Parent root;
    private String input;
    private Circle currentCircle;

    public void homePaneClicked(MouseEvent mouseEvent) {
    }

    public void calendarButtonClicked(ActionEvent actionEvent) throws IOException{
        switchToCalendar(actionEvent);
    }

    public void teacherButtonClicked(ActionEvent actionEvent) throws IOException {
        switchToTeacher(actionEvent);
    }

    public void marksButtonClicked(ActionEvent actionEvent) throws IOException {
        switchToMarks(actionEvent);
    }

    public void calendarPaneClicked(MouseEvent mouseEvent) {
    }

    public void sundayClicked(MouseEvent mouseEvent) {
        changeTab(sundayCircle);
    }

    public void saturdayClicked(MouseEvent mouseEvent) {
        changeTab(saturdayCircle);
    }

    public void fridayClicked(MouseEvent mouseEvent) {
        changeTab(fridayCircle);
    }

    public void thursdayClicked(MouseEvent mouseEvent) {
        changeTab(thursdayCircle);
    }

    public void wednesdayClicked(MouseEvent mouseEvent) {
        changeTab(wednesdayCircle);
    }

    public void tuesdayClicked(MouseEvent mouseEvent) {
        changeTab(tuesdayCircle);
    }

    public void mondayClicked(MouseEvent mouseEvent) {
        changeTab(mondayCircle);
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
        switchScene(event, "mark-view");
    }

    public void switchToTeacher(ActionEvent event) throws IOException {
        switchScene(event, "teacher-view");
    }

    public void createNewTbzSubject(MouseEvent mouseEvent){
        TextArea textArea = new TextArea();
        textArea.setText("hi");


    }

    public void sundayHover(MouseEvent mouseEvent) {
        changeCircleColorOnHover(sundayCircle, true);
    }

    public void sundayHoverExit(MouseEvent mouseEvent) {
        changeCircleColorOnHover(sundayCircle, false);
    }

    public void saturdayHover(MouseEvent mouseEvent) {
        changeCircleColorOnHover(saturdayCircle, true);
    }

    public void saturdayHoverExit(MouseEvent mouseEvent) {
        changeCircleColorOnHover(saturdayCircle, false);
    }

    public void fridayHover(MouseEvent mouseEvent) {
        changeCircleColorOnHover(fridayCircle, true);
    }

    public void fridayHoverExit(MouseEvent mouseEvent) {
        changeCircleColorOnHover(fridayCircle, false);
    }

    public void thursdayHover(MouseEvent mouseEvent) {
        changeCircleColorOnHover(thursdayCircle, true);
    }

    public void thursdayHoverExit(MouseEvent mouseEvent) {
        changeCircleColorOnHover(thursdayCircle, false);
    }

    public void wednesdayHover(MouseEvent mouseEvent) {
        changeCircleColorOnHover(wednesdayCircle, true);
    }

    public void wednesdayHoverExit(MouseEvent mouseEvent) {
        changeCircleColorOnHover(wednesdayCircle, false);
    }

    public void tuesdayHover(MouseEvent mouseEvent) {
        changeCircleColorOnHover(tuesdayCircle, true);
    }

    public void tuesdayHoverExit(MouseEvent mouseEvent) {
        changeCircleColorOnHover(tuesdayCircle, false);
    }

    public void mondayHover(MouseEvent mouseEvent) {
        changeCircleColorOnHover(mondayCircle, true);
    }

    public void mondayHoverExit(MouseEvent mouseEvent) {
        changeCircleColorOnHover(mondayCircle, false);
    }

    public void timetablePaneHover(MouseEvent mouseEvent) {
        changePaneColorOnHover(timetablePane, true);
    }

    public void timetablePaneHoverExit(MouseEvent mouseEvent) {
        changePaneColorOnHover(timetablePane, false);
    }

    public void homeworkPaneHoverExit(MouseEvent mouseEvent) {
        changePaneColorOnHover(homeworkPane, false);
    }

    public void homeworkPaneHover(MouseEvent mouseEvent) {
        changePaneColorOnHover(homeworkPane, true);
    }

    public void testPaneHoverExit(MouseEvent mouseEvent) {
        changePaneColorOnHover(testPane, false);
    }

    public void testPaneHover(MouseEvent mouseEvent) {
        changePaneColorOnHover(testPane, true);
    }

    private void switchScene(ActionEvent event, String fileName) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(fileName + ".fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root, Const.SCREENWIDTH, Const.SCREENHEIGHT);
        stage.setScene(scene);
        stage.show();
    }

    private void changeCircleColorOnHover(Circle thisCircle, boolean onEnter) {
        if (isCurrentCircleNull()) {
            currentCircle = mondayCircle;
        }
        if (!isCircleAlreadySelected(thisCircle)) {
            if (onEnter) {
                thisCircle.setFill(Const.CIRCLEHOVERCOLOR);
            } else
                thisCircle.setFill(Const.CIRCLEBLUE);
        }
    }

    private void changePaneColorOnHover(Pane thisPane, boolean onEnter) {
        if (onEnter) {
            thisPane.setOpacity(Const.PANEHOVEROPACITY);
        } else
            thisPane.setOpacity(0.3);
    }

    private void initShadow() {
        Const.CIRCLESHADOW.setHeight(1);
        Const.CIRCLESHADOW.setOffsetY(5);
        Const.CIRCLESHADOW.setColor(Const.SHADOWCOLOR);
    }

    private void changeTab(Circle circleClicked) {
        if (isCurrentCircleNull()) {
            currentCircle = mondayCircle;
        }
        circleClicked.setFill(Const.LIGHTBLUE);
        currentCircle.setFill(Const.CIRCLEBLUE);
        dayExtension.setLayoutX(circleClicked.getLayoutX() - circleClicked.getRadius());
        circleClicked.setEffect(null);
        initShadow();
        currentCircle.setEffect(Const.CIRCLESHADOW);
        currentCircle = circleClicked;
    }

    private boolean isCurrentCircleNull() {
        return currentCircle == null;
    }

    private boolean isCircleAlreadySelected(Circle circleHovered) {
        return circleHovered == currentCircle;
    }


}
