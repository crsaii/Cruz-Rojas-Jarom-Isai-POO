package com.mycompany.ej1_5;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;


public class PrimaryController {

    @FXML private Button estadisticas;
    @FXML private Button limpiar;
    
    @FXML private TextField alim;
    @FXML private TextField refrig;
    @FXML private TextField transp;
    @FXML private TextField tel;
    @FXML private TextField otro;
    @FXML private TextField altTot;
    @FXML private TextField totSem;
    
    
    
    
    
    
    @FXML
    private void estadisticas()  {
        double gastos [] = {Double.parseDouble(alim.getText()), Double.parseDouble(refrig.getText()), Double.parseDouble(transp.getText()),
        Double.parseDouble(tel.getText()), Double.parseDouble(otro.getText())};
        
        String[] nomGastos = {"Alimentación", "Refrigerios","Transporte", "Telefonía", "Otros"};

        //        int alimento =Double.parseDouble(alim.getText());
        //        int refrigerio = Integer.parseInt(refrig.getText());
        //        int transporte = Integer.parseInt(transp.getText());
        //        int telefono = Integer.parseInt(alim.getText());
        //        int otros = Integer.parseInt(otro.getText()); 

        double total = 0;
        double may = gastos[0];
        String nomMay = nomGastos[0];
        
        for (int i = 0; i < gastos.length; i++) {
             total += gastos[i] ;
             
             if (gastos[i]  > may) {
                may = gastos[i];
                nomMay = nomGastos[i]; 
            }
        }
        
        totSem.setText(String.format("$%.2f", total));
        altTot.setText(nomMay);
    }
    @FXML
    private void limpiar()  {
        alim.clear();
        refrig.clear();
        transp.clear();
        tel.clear();
        otro.clear();
        altTot.clear();
        totSem.clear();
    }
}
