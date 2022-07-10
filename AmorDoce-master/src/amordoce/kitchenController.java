package amordoce;

import amordoce.model.classCharacter.ClassCharacter;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class kitchenController implements Initializable {

    private ClassCharacter beca = App.game.getCharacter(0);
    private ClassCharacter hilbert = App.game.getCharacter(3);

    @FXML
    private Label BecaLabel;

    @FXML
    private Label HilbertLabel;

    @FXML
    private Label ObamaLabel;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        BecaLabel.setText(beca.toString());
        HilbertLabel.setText(hilbert.toString());
        ObamaLabel.setText(App.game.getCharacter(5).toString());
    }

    public void chooseBeca() throws IOException {
        beca.changeRelationPoints(5);
        beca.setLogOfDialogs("Escolha seu instrutor", "Beca");

        hilbert.changeRelationPoints(-5);
        hilbert.setLogOfDialogs("Escolha seu instrutor", "Beca");

        App.game.getCharacter(5).changeRelationPoints(5);
        App.game.getCharacter(5).setLogOfDialogs("Escolha seu instrutor!", "Beca");

        App.game.setInstructor(0);

        App.setRoot("TelaDialogo");
    }

    public void chooseHilbert() throws IOException {
        hilbert.changeRelationPoints(5);
        hilbert.setLogOfDialogs("Escolha seu instrutor", "Hilbert");

        beca.changeRelationPoints(-5);
        beca.setLogOfDialogs("Escolha seu instrutor", "Hilbert");

        App.game.getCharacter(5).changeRelationPoints(5);
        App.game.getCharacter(5).setLogOfDialogs("Escolha seu instrutor!", "Hilbert");

        App.game.setInstructor(3);

        App.setRoot("TelaDialogo");
    }

    public void GoToLog() throws IOException {
        App.game.setPreviousScreen("kitchen");
        App.setRoot("TelaLog");
    }
}
