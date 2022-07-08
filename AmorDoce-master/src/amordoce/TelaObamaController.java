package amordoce;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import amordoce.model.classCharacter.utils.Dialog;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

public class TelaObamaController implements Initializable {

    @FXML
    private Label ObamaLabel;
    
    @FXML
    private Label StatusLabel;
    
    private Dialog dialog = App.game.getCharacter(5).getDialog(0);

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        ObamaLabel.setText(dialog.getStatement());
        StatusLabel.setText(App.game.getCharacter(5).toString());
    }

    public void goToKitchen() throws IOException {
        App.game.response(5, dialog, 0);
        App.setRoot(dialog.getOption(0).getNextRoot());
    }
}
