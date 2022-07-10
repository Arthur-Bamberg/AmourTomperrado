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
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;

public class TelaRodriguesController implements Initializable {

    private String statementText = "Bem- vinda! Sou Alice e já vi que não escolheu muito bem seu orientador.";
    private ArrayList<String> options = new ArrayList<>();
    private ClassCharacter character = App.game.getCharacter(8);

    @FXML
    private ImageView background;

    @FXML
    private ImageView characterImage;

    @FXML
    private Label statement;

    @FXML
    private Label status;

    @FXML
    private Button top;

    @FXML
    private Button letsContinue;

    @FXML
    private Button bottom;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        letsContinue.setVisible(false);

        options.add("Por que?");
        options.add("*Não dizer nada e fingir-se de surdo*");

        status.setText(App.game.getCharacter(8).toString());
        statement.setText(statementText);
        top.setText(options.get(0));
        bottom.setText(options.get(1));
    }

    public void Top() throws IOException {
        character.changeRelationPoints(10);
        character.setLogOfDialogs(statementText, options.get(0));

        next();
    }

    public void Bottom() throws IOException {
        character.changeRelationPoints(-5);
        character.setLogOfDialogs(statementText, options.get(1));

        next();
    }

    public void next() {
        letsContinue.setVisible(true);

        if (App.game.getInstructor() == 0) {
            App.game.getCharacter(0).changeRelationPoints(-5);
            statement.setText("Ela já namorou a filha da dona e ela trabalha aqui. Ela costuma não reagir muito bem quando interage com outras funcionárias.\n"
                    + "Há, mas a princípio é tudo profissionalmente, não vejo motivo para incomodo");
        } else {
            App.game.getCharacter(3).changeRelationPoints(-5);
            statement.setText("Ele já namorou a filha da dona e ela trabalha aqui. Ela costuma não reagir muito bem quando interage com outras funcionárias.\n"
                    + "Há, mas a princípio é tudo profissionalmente, não vejo motivo para incomodo");
        }

        bottom.setVisible(false);
        top.setVisible(false);
    }

    public void Continue() throws IOException {
        App.setRoot("TelaInstrutor");
    }

    public void GoToLog() throws IOException {
        App.game.setPreviousScreen("TelaRodrigues");
        App.setRoot("TelaLog");
    }
}
