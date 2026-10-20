package com.mycompany.ej1_3;

import java.io.IOException;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;


public class PrimaryController {
    
    @FXML private TextField  num;
    @FXML private TextField  cantCifra;
    @FXML private TextField  impCifra;
    @FXML private TextField  parCifra;
    @FXML private TextField  totCifra;
    @FXML private TextField  mayCifra;
    @FXML private TextField  menCifra;
    @FXML private TextArea  divisores;
    
    
    @FXML
    private void analizar() {
        
        int numero  = Integer.parseInt(num.getText());
        numero  = Math.abs(numero);
         
        int conta = 0 ;
         
         for(int i = numero; i > 0; i /= 10){
             conta++;
        }
         if (conta == 0) {
            conta = 1;
        }
         
        cantCifra.setText(String.valueOf(conta));
        
        int rest = 0;
        for(int k = numero; k > 0; k /= 10){
            int cif = k % 10;
            if (cif % 2 != 0) {
                rest +=  cif;
            }
        }
        impCifra.setText(String.valueOf(rest));
        
        int sum = 0;
        for(int j = numero; j > 0; j /= 10){
            int cif = j % 10;
            if (cif % 2 == 0) {
                sum +=  cif;
            }
        }
        parCifra.setText(String.valueOf(sum));
    
        
        int sumT = 0;
        for(int r = numero; r > 0; r/= 10){
            int cif = r % 10;
            sumT += cif;
            
        }
        totCifra.setText(String.valueOf(sumT));
        
        int may = 0;
        int men = 9;

        for (int l = numero; l > 0; l /= 10) {
            int cif = l % 10;

            if (cif > may) {
                may = cif;
            }

            if (cif < men) {
                men = cif;
            }
        }
        mayCifra.setText(String.valueOf(may));
        menCifra.setText(String.valueOf(men));
        
        String div = "";
        
        for (int m = 1; m <= numero; m++) {
            if (numero % m == 0) {
                div += m + "\n";
            }
        }
        divisores.setText(div);
    }
    
    @FXML
    private void limpiar() {
        num.clear();
        cantCifra.clear();
        parCifra.clear();
        impCifra.clear();
        totCifra.clear();
        mayCifra.clear();
        menCifra.clear();
        divisores.clear();
    }
}
