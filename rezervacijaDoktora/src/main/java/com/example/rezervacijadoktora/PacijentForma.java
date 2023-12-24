package com.example.rezervacijadoktora;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class PacijentForma {

    public TableView tabela;
    public TableColumn id_termina;
    public TableColumn dan;
    public TableColumn mjesec;
    public TableColumn sati;
    public TableColumn minute;


    public void ucitajClick(ActionEvent actionEvent) {
        try {
            String url = "jdbc:sqlite:bazaPodataka.db";
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            ResultSet rez = stmt.executeQuery("SELECT id_termina, dan, mjesec, sati, minute FROM termini WHERE rezervisano = 0");
            while(rez.next()) {

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}