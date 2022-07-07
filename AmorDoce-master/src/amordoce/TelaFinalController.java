/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package amordoce;

import static amordoce.App.game;
import amordoce.model.classCharacter.ClassCharacter;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Usuario
 */
public class TelaFinalController implements Initializable {
    private ClassCharacter obama = game.getCharacter(5);
    private String logInAString;
    private List <String> arrayOfLogs = obama.getLogOfDialogs();
    
    @FXML
    private Label log;
    
    @FXML
    private Label status;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        generateString();
        status.setText(obama.toString());
        log.setText(logInAString);
    }    
    
    public void generateString(){
        for(int i = 0; i < arrayOfLogs.size(); i++){
            logInAString += arrayOfLogs.get(i);
        }
    }
}