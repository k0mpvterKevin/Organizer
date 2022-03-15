package com.example.organizer;

import javafx.fxml.FXML;
import javafx.scene.control.Label;



public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected boolean onHelloButtonClick(){
        welcomeText.setText("Welcome to JavaFX Application!");
        return true;
    }
}