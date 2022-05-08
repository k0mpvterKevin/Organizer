package com.example.organizer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.Statement;

public class SceneController {

    public Button calendarButton;
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
    @FXML
    Label timetableLabel;
    @FXML
    Label homeworkLabel;
    @FXML
    Label testsLabel;
    @FXML
    Label AddTimeTableTitle;
    @FXML
    TextField AddTimeTableNameInput;
    @FXML
    ChoiceBox AddTimeTableDayDropdown;
    @FXML
    TextField AddTimeTableStartTimeInput;
    @FXML
    TextField AddTimeTableEndTimeInput;
    @FXML
    ChoiceBox AddTimeTableReoccurenceDropdown;
    @FXML
    Button AddTimeTableCancelButton;
    @FXML
    Button AddTimeTableDoneButton;
    @FXML
    Pane dayDetailPane1;
    @FXML
    Pane AddTimeTablePane;
    @FXML
    Pane tbzMarkPanel;
    @FXML
    Button tbzSubject;
    @FXML
    Button tbzMark;
    @FXML
    Button tbzAverage;


    private Stage stage;
    private Scene scene;
    private Parent root;
    private String input;
    private Circle currentCircle;

    public void homePaneClicked(MouseEvent mouseEvent) {
    }

    public void calendarButtonClicked(ActionEvent actionEvent) throws IOException {
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
        AddTimeTablePane.setVisible(true);
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

    public void createNewTbzSubject(MouseEvent mouseEvent) {
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

    public void AddTimeTableDoneButtonHoverEnter(MouseEvent mouseDragEvent) {
    }

    public void AddTimeTableDoneButtonHoverExit(MouseEvent mouseDragEvent) {
    }

    public void AddTimeTableCancelButtonHoverEnter(MouseEvent mouseDragEvent) {
    }

    public void AddTimeTableCancelButtonHoverExit(MouseEvent mouseDragEvent) {
    }

    public void MarksButtonClicked(ActionEvent event) {
    }

    public void AddTimeTableCancelButtonClicked(ActionEvent event) {
        AddTimeTablePane.setVisible(false);
        dayDetailPane1.setVisible(true);
    }

    public void AddTimeTableClicked(MouseEvent mouseEvent) {
        AddTimeTablePane.setVisible(true);
        dayDetailPane1.setVisible(false);
        String query = "GET * FROM SCHÜLER WHERE Vorname = 'Kevin'";
        System.out.println(query);

    }

    public void AddTimeTableDoneButtonClicked(ActionEvent event) {
        AddTimeTablePane.setVisible(false);
        dayDetailPane1.setVisible(true);
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


    private void addTBZSubject(Button buttonClicked){
        //TextArea textArea = new TextArea();
        //textArea.setLayoutX(22);
        //textArea.setLayoutY(buttonClicked.getLayoutY());
        //textArea.setPrefHeight(17);
        //textArea.setMaxWidth(50);
        //textArea.setMinWidth(25);
        Label label = new Label();
        label.setLayoutX(22);
        label.setLayoutY(buttonClicked.getLayoutY());
        label.setPrefHeight(17);
        tbzMarkPanel.getChildren().add(label);
        label.setVisible(true);
        buttonClicked.setLayoutY(buttonClicked.getLayoutY() + 28);
        //buttonClicked.setEffect(null);

    }

    private boolean isCurrentCircleNull() {
        return currentCircle == null;
    }

    private boolean isCircleAlreadySelected(Circle circleHovered) {
        return circleHovered == currentCircle;
    }


    public void createNewTbzSubject(ActionEvent event) {
        addTBZSubject(tbzSubject);
    }
}
