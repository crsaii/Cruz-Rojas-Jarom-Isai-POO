package com.mycompany.ej1_4;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private Button calcular;
    @FXML private Button limpiar;
    @FXML private TextField numero;
    @FXML private TextArea resultado;
    
    private int n;
    
    @FXML
    private void calcular() {
        n = Integer.parseInt(numero.getText());
        
        for (int i = 0; i < 11; i++) {
            
            resultado.appendText(n + "x" + i + " = " + n * i + "\n");
        }
    }
    
    @FXML
    private void limpiar(){
        resultado.clear();
        numero.clear();
    }
}
