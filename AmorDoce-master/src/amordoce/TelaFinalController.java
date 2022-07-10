/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package amordoce;

import amordoce.model.classCharacter.ClassCharacter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class TelaFinalController implements Initializable {

    private ClassCharacter character = App.game.getCharacter(App.game.getChosenCharacter());

    @FXML
    private Label log;

    @FXML
    private Label status;

    @FXML
    private ImageView characterScreen;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        status.setText(character.toString());
        log.setText(character.getLogOfDialogs());
        characterScreen.setImage(new Image(character.getImgSrc()));

    }
    
    public void next() throws IOException{
        App.setRoot("TelaCreditos");
    }
    
    public void GoToLog() throws IOException {
        App.game.setPreviousScreen("TelaFinal");
        App.setRoot("TelaLog");
    }
}
