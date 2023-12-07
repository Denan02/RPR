package com.example.lv6final;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    public TextField ispisBrojeva;
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void button7Click(ActionEvent actionEvent) {
        ispisBrojeva.appendText("7");
    }
    public void button8Click(ActionEvent actionEvent) {
        ispisBrojeva.appendText("8");
    }

    public void button9Click(ActionEvent actionEvent) {
        ispisBrojeva.appendText("9");
    }

    public void button4Click(ActionEvent actionEvent) {
        ispisBrojeva.appendText("4");
    }

    public void button5Click(ActionEvent actionEvent) {
        ispisBrojeva.appendText("5");
    }

    public void button6Click(ActionEvent actionEvent) {
        ispisBrojeva.appendText("6");
    }

    public void button1Click(ActionEvent actionEvent) {
        ispisBrojeva.appendText("1");
    }

    public void button2Click(ActionEvent actionEvent) {
        ispisBrojeva.appendText("2");
    }

    public void button3Click(ActionEvent actionEvent) {
        ispisBrojeva.appendText("3");
    }

    public void button0Click(ActionEvent actionEvent) {
        ispisBrojeva.appendText("0");
    }

    public void button10Click(ActionEvent actionEvent) {
        ispisBrojeva.appendText("%");
    }

    public void button11Click(ActionEvent actionEvent) {
        ispisBrojeva.appendText("/");
    }

    public void button12Click(ActionEvent actionEvent) {
        ispisBrojeva.appendText("*");
    }

    public void button13Click(ActionEvent actionEvent) {
        ispisBrojeva.appendText("-");
    }

    public void button14Click(ActionEvent actionEvent) {
        ispisBrojeva.appendText("+");
    }

    public void button15Click(ActionEvent actionEvent) {
        ispisBrojeva.appendText(".");
    }

    public void button16Click(ActionEvent actionEvent){
        
    }
}