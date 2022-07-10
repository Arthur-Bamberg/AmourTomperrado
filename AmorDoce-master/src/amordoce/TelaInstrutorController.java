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
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class TelaInstrutorController implements Initializable {
    
    //Deixando claro que poder voltar da tela de log e poder ganhar mais pontuação não é bug, é uma secret feature

    private String statementText = "Pelo visto já conheceu Alice, gostou dela? Ela é bem amigável, mas também é nossa principal fonte de informações… Se você me entende.";
    private ArrayList<String> options = new ArrayList<>();
    private ClassCharacter character = App.game.getCharacter(App.game.getInstructor());

    @FXML
    private ImageView background;

    @FXML
    private ImageView characterScreen;

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
        bottom.setVisible(false);
        middle.setVisible(false);

        options.add("Gostei dela, me deu algumas informações sobre você!");
        options.add("Acho que pode ser bem relevante! Dependendo do rumo que a nossa relação tomar!");
        options.add("Sim, colegas de trabalho. Mas pode evoluir se mais ninguém interferir!");

        if (App.game.getInstructor() != 0) {
            characterScreen.setImage(new Image("/assets/gameCharacter/Hilbert.png"));
        }

        status.setText(character.toString());
        statement.setText(statementText);
        top.setText(options.get(0));
        bottom.setText(options.get(1));
        middle.setText(options.get(2));
    }

    public void Top() throws IOException {
        character.changeRelationPoints(5);
        character.setLogOfDialogs(statementText, options.get(0));

        statementText = "Ah, é mesmo? E você gostou do quê ouviu?";
        statement.setText(statementText);

        top.setVisible(false);
        bottom.setVisible(true);

        status.setText(character.toString());
    }

    public void Bottom() throws IOException {
        character.changeRelationPoints(10);
        character.setLogOfDialogs(statementText, options.get(1));

        bottom.setVisible(false);
        middle.setVisible(true);

        statementText = "Que relação?";
        statement.setText(statementText);

        status.setText(character.toString());
    }

    public void Middle() throws IOException {
        character.changeRelationPoints(10);
        character.setLogOfDialogs(statementText, options.get(2));

        status.setText(character.toString());

        App.setRoot("TelaFogaca");
    }
    
    public void GoToLog() throws IOException {
        App.game.setPreviousScreen("TelaInstrutor");
        App.setRoot("TelaLog");
    }
}
