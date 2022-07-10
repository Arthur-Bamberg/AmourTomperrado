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

public class TelaRizzoController implements Initializable {

    private String statementText = "Oi , sou Helena Rizzo!\n Sou a recepcionista, caixa e segurança do restaurante!";
    private ArrayList<String> options = new ArrayList<>();
    private ClassCharacter character = App.game.getCharacter(7);

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
        options.add("Prazer, não sei se consiguiria fazer tudo isso.");
        options.add("Muito prazer, qualquer coisa posso lhe ajudar!");
        options.add("Segurança? Com esses braços?");

        status.setText(character.toString());
        statement.setText(statementText);
        top.setText(options.get(0));
        middle.setText(options.get(1));
        bottom.setText(options.get(2));
    }

    public void Top() throws IOException {
        character.changeRelationPoints(10);
        character.setLogOfDialogs(statementText, options.get(0));
        
        next();    
    }
    
    public void Middle()throws IOException {
        character.changeRelationPoints(15);
        character.setLogOfDialogs(statementText, options.get(1));
        
        next();
    }

    public void Bottom() throws IOException {
        character.changeRelationPoints(-20);
        character.setLogOfDialogs(statementText, options.get(2));
        
        next();
    }
    
    public void next() throws IOException{
        App.setRoot("TelaEscolhaFinal");      
    }
    
        public void GoToLog() throws IOException {
        App.game.setPreviousScreen("TelaRizzo");
        App.setRoot("TelaLog");
    }
}
