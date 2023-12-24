package com.example.rezervacijadoktora;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DoktorController {
    public TextField mjesecText;
    public TextField danText;
    public TextField satiText;
    public TextField minuteText;
    public TextField opisText;
    public TextArea textNalaz;
    public TextField jmbgNalan;

    public void kreirajClick(ActionEvent actionEvent) {
        try {
            String url = "jdbc:sqlite:bazaPodataka.db";
            Connection conn = DriverManager.getConnection(url);
            Statement stm = conn.createStatement();
            String mjesec = mjesecText.getText();
            String dan = danText.getText();
            String sat = satiText.getText();
            String minute = minuteText.getText();
            String opis = opisText.getText();
            stm.execute("INSERT INTO termini(dan,mjesec,minute,sati,opis_pregleda,rezervisano) VALUES ("+dan+","+mjesec+","+minute+","+sat+",'"+opis+"',"+"0)");
            Alert a = new Alert(Alert.AlertType.NONE);
            a.setAlertType(Alert.AlertType.INFORMATION);
            a.setContentText("TERMIN USPIJESNO KREIRAN");
            a.show();
            mjesecText.setText("");danText.setText("");satiText.setText("");minuteText.setText("");opisText.setText("");
            conn.close();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    public void nalazClick(ActionEvent actionEvent) {
        try {
            String jmbg = jmbgNalan.getText();
            String nalaz = textNalaz.getText();
            String url = "jdbc:sqlite:bazaPodataka.db";
            Connection conn = DriverManager.getConnection(url);
            Statement st = conn.createStatement();
            st.execute("INSERT  INTO nalaz(jmbg_pacijenta, text_nalaza) VALUES('"+jmbg+"' , '"+nalaz+"')");
            Alert a = new Alert(Alert.AlertType.NONE);
            a.setAlertType(Alert.AlertType.INFORMATION);
            a.setContentText("NALAZ USPIJESNO KREIRAN");
            a.show();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
}
