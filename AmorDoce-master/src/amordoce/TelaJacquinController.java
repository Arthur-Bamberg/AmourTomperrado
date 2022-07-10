package amordoce;

import amordoce.model.classCharacter.ClassCharacter;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class TelaJacquinController implements Initializable {

    private String statementText = "Ow! Su Errick Jacquin, u rri do tomperro. U ristrrant j vi fcha i expediench ja paticamench cabo, vam sai?";
    private ArrayList<String> options = new ArrayList<>();
    private ClassCharacter character = App.game.getCharacter(4);

    @FXML
    private Label statement;

    @FXML
    private Label status;

    @FXML
    private Button top;
    
    @FXML
    private Button middle;

    @FXML
    private Button bottom;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        options.add("Claro, seu lindo!");
        options.add("Sai nojento!!!");
        options.add("Você é a vigonha da pofisson!!!");

        status.setText(character.toString());
        statement.setText(statementText);
        top.setText(options.get(0));
        middle.setText(options.get(1));
        bottom.setText(options.get(2));
    }

    public void Top() throws IOException {
        character.changeRelationPoints(20);
        character.setLogOfDialogs(statementText, options.get(0));
        
        next();    
    }
    
    public void Middle()throws IOException {
        character.changeRelationPoints(-20);
        character.setLogOfDialogs(statementText, options.get(1));
        
        next();
    }

    public void Bottom() throws IOException {
        character.changeRelationPoints(-5);
        character.setLogOfDialogs(statementText, options.get(2));
        
        next();
    }
    
    public void next() throws IOException{
        App.setRoot("TelaCarosella");      
    }
    
    public void GoToLog() throws IOException {
        App.game.setPreviousScreen("TelaJacquin");
        App.setRoot("TelaLog");
    }
}
