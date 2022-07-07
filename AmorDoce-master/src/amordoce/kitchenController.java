package amordoce;

import static amordoce.App.game;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class kitchenController implements Initializable {

    @FXML
    private Label BecaLabel;

    @FXML
    private Label HilbertLabel;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        BecaLabel.setText(game.getCharacter(0).toString());
        HilbertLabel.setText(game.getCharacter(3).toString());
    }

    public void chooseBeca() throws IOException {
        game.response(6, 45, "Você terá uma semana de experiência, escolha seu instrutor!", "Beca");
        App.setRoot("TelaFinal");
    }

    public void chooseHilbert() throws IOException {
        game.response(6, 45, "Você terá uma semana de experiência, escolha seu instrutor!", "Hilbert");
        App.setRoot("TelaFinal");
    }
}
