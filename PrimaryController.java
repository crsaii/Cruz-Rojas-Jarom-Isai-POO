package com.mycompany.ej1;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class PrimaryController {

    @FXML private Button btnCalcular;
    @FXML private Button btnLimpiar;
    @FXML private TextField edad; 
    @FXML private Label edadT;   
    
    @FXML
    private void btnCalcular_click() throws IOException {

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate fechaNacimiento = LocalDate.parse(edad.getText().trim(), formato);

        Period periodo = Period.between(fechaNacimiento, LocalDate.now());

        int anios = periodo.getYears();
        int meses = periodo.getMonths();
        
        edadT.setText(anios + " años y " + meses + " meses");    
    }
        
    @FXML
    private void btnLimpiar_click() throws IOException {
        edad.clear();
        edadT.setText("");
    }
}