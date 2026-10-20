package com.mycompany.ej3_2;

import java.io.IOException;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.Label;

public class PrimaryController {

    @FXML private Button iniciar;
    @FXML private ProgressBar liebre;
    @FXML private ProgressBar tortuga;
    @FXML private Label lblLiebre;
    @FXML private Label lblTortuga;
    
    private int contar;
    
    @FXML
        private void iniciar() {
        iniciar.setDisable(true);
        liebre.setProgress(0);
        tortuga.setProgress(0);
        contar = 0; 
        lblLiebre.setText("La liebre: ¡Corriendo!");
        lblTortuga.setText("La tortuga: ¡Está corriendo!");
    
    Thread hLiebre = new Thread(() -> {
            try {
                for (int i = 1; i <= 100; i++) {
                    Thread.sleep(20); 
                    
                    double progreso = i / 100.0;
                    Platform.runLater(() -> liebre.setProgress(progreso));
                    
                    
                    if (i == 50) {
                        Platform.runLater(() -> lblLiebre.setText("La liebre: ¡Se durmió!"));
                        Thread.sleep(4020); 
                        Platform.runLater(() -> lblLiebre.setText("La liebre: ¡Despertó!"));
                    }
                }
                
                Platform.runLater(() -> {
                    contar++;
                    if (contar == 2) iniciar.setDisable(false);
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
    
        Thread hTortuga = new Thread(() -> {
            try {
                for (int i = 1; i <= 100; i++) {
                    Thread.sleep(55); 
                    
                    double progreso = i / 100.0;
                    Platform.runLater(() -> tortuga.setProgress(progreso));
                }
                
                Platform.runLater(() -> {
                    contar++;
                    if (contar == 2) iniciar.setDisable(false);
                });
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        
        hLiebre.start();
        hTortuga.start();
    }
}
