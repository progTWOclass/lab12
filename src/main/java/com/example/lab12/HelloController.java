package com.example.lab12;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label Text;
    @FXML
    protected void onHelloButtonClick() {
        Text.setText("Button Clicked!");
    }
}