package com.mycompany.ej3_1;

import java.io.IOException;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;

public class PrimaryController {

    @FXML private Button contar;
    @FXML private Button esperar;
    @FXML private TextField num;
    @FXML private ProgressBar bar;
    
    private int contador = 0;
    private int i;
    
    @FXML
    private void contar() throws IOException {
        contador++;
        num.setText(contador+"");
    }
    @FXML
    private void esperar() throws IOException {
        esperar.setDisable(true);
        contar.setDisable(true);
        
        Thread hilo = new Thread(() -> {
            
            for (int j = 1; j <= 10; j++) {
                try {
                    
                    Thread.sleep(1 * 1000); 
                    
                    
                    double progreso = j / 10.0;
                    
                    
                    Platform.runLater(() -> bar.setProgress(progreso));
                    
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            
            Platform.runLater(() -> esperar.setDisable(false));
            Platform.runLater(() -> contar.setDisable(false));
        });
        
        hilo.start(); 
    }
        
    
}
