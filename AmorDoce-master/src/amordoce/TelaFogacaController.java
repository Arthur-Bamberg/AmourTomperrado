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

public class TelaFogacaController implements Initializable {

    private String statementText = "Ouvi alguém falando sobre interferências! Muito prazer sou Henrique Fogaça, é um prazer conhecer você!";
    private ArrayList<String> options = new ArrayList<>();
    private ClassCharacter character = App.game.getCharacter(2);

    @FXML
    private Label statement;

    @FXML
    private Label status;

    @FXML
    private Button top;

    @FXML
    private Button bottom;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        options.add("O prazer é todo meu! Ansios@ para trabalharmos juntos.");
        options.add("Sai enxerido!!!");

        status.setText(character.toString());
        statement.setText(statementText);
        top.setText(options.get(0));
        bottom.setText(options.get(1));
    }

    public void Top() throws IOException {
        character.changeRelationPoints(10);
        character.setLogOfDialogs(statementText, options.get(0));

        App.setRoot("TelaJacquin");
    }
    
    public void Bottom() throws IOException {
        character.changeRelationPoints(-20);
        character.setLogOfDialogs(statementText, options.get(1));

        App.setRoot("TelaJacquin");
    }
    
    public void GoToLog() throws IOException {
        App.game.setPreviousScreen("TelaFogaca");
        App.setRoot("TelaLog");
    }
}
