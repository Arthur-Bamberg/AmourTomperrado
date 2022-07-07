/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package amordoce;

import static amordoce.App.game;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class TelaObamaController implements Initializable {

    @FXML
    private Label ObamaLabel;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObamaLabel.setText("Bem-vind@! Sou Michelle, dona do Bechamel. \n"
                + "Vou introduzir você ao restaurante. Vou levá-l@ à cozinha.");
    }

    public void goToKitchen() throws IOException {
        game.response(5, 10, "Bem-vind@! Sou Michelle, dona do Bechamel. \n"
        + "Vou introduzir você ao restaurante. Vou levá-l@ à cozinha.", "Cozinha");
        App.setRoot("TelaFinal");
    }
}
