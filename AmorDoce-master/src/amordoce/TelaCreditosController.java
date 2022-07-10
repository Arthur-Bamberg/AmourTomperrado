/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package amordoce;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class TelaCreditosController implements Initializable {
    @FXML
    private Label credits;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        credits.setText("Creditos:\n - Arthur Bamberg\n - Davi Boscardin\n - Isadora Aguiar\n Professor: Marcio Bigolindo!");
    }
    
    public void next() throws IOException{
        App.game = new Game();
        App.setRoot("TelaInicial");
    }
    
    public void GoToLog() throws IOException {
        App.game.setPreviousScreen("TelaCreditos");
        App.setRoot("TelaLog");
    }
}
