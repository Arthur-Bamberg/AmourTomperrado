/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amordoce;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class TelaInicialController implements Initializable {

    @FXML
    private Button startButton;

    public void click() throws IOException {
        App.setRoot("TelaObama");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
    }
}
