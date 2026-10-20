package com.mycompany.ej1_2;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class PrimaryController {
    
    @FXML private TextField txDinero;
    @FXML private Button desglosar;
    @FXML private Button x;
    @FXML private TextArea txResul;
    
    
    
    
    @FXML
    private void desglosar() {
        
        int dinero = Integer.parseInt(txDinero.getText());
        int denomin [] = {500,200,100,50,20,10,5,2,1};
        String re = " ";
        
        for (int i = 0; i < denomin.length; i++) {
            int cantidad = dinero / denomin[i];
            re += denomin[i] + "$  " + cantidad + "\n";
            
            dinero = dinero % denomin[i];
        }
        txResul.setText(re);
    }
    
    @FXML
    private void x() throws IOException {
        txDinero.clear();
        txResul.clear();
        
    }
}
