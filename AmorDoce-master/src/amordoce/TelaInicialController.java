/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amordoce;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;


public class TelaInicialController implements Initializable {

    @FXML
    private Label labelInit;

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
       App.setRoot("kitchen");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        labelInit.setText("Este é um projeto criado com base no jogo de múltipla escolha 'Amor Doce'. Onde VOCÊ descobrirá seu AMOUR TOMPERRADO!");
    }

}
