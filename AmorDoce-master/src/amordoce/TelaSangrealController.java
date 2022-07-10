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

public class TelaSangrealController implements Initializable {

    private String statementText = "Bom dia, sou Gabrielle Sangreal!\n Sou a responsável pelas sobremesas!";
    private ArrayList<String> options = new ArrayList<>();
    private ClassCharacter character = App.game.getCharacter(9);

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
        options.add("Você poderia ser a minha sobremesa... Quer dizer, suas sobremesas devem ser uma delícia!");
        options.add("Posso ajudar, sei fazer ganache no microondas!");
        options.add("Bah, não sou muito de doce. Poderia ter ficado sem te conhecer!");

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

    public void Middle() throws IOException {
        character.changeRelationPoints(-5);
        character.setLogOfDialogs(statementText, options.get(1));

        next();
    }

    public void Bottom() throws IOException {
        character.changeRelationPoints(-20);
        character.setLogOfDialogs(statementText, options.get(2));

        next();
    }

    public void next() throws IOException {
        App.setRoot("TelaRizzo");
    }

    public void GoToLog() throws IOException {
        App.game.setPreviousScreen("TelaSangreal");
        App.setRoot("TelaLog");
    }
}
