package amordoce;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

public class TelaSangrealController implements Initializable {

    private String statementText = "";
    private ArrayList<String> options = new ArrayList<>();

    @FXML
    private ImageView background;

    @FXML
    private ImageView character;

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
        options.add("Adoraria!");
        options.add("Só depois do serviço!");

        status.setText(App.game.getCharacter(8).toString());
        statement.setText(statementText);
        top.setText(options.get(0));
        bottom.setText(options.get(1));
    }

    public void Top() throws IOException {
        App.game.getCharacter(8).changeRelationPoints(50);
        App.game.getCharacter(8).setLogOfDialogs(statementText, options.get(0));
        
        App.setRoot("TelaJacquin");    
    }

    public void Bottom() throws IOException {
        App.game.getCharacter(8).changeRelationPoints(10);
        App.game.getCharacter(8).setLogOfDialogs(statementText, options.get(1));
        
        App.setRoot("TelaJacquin");      
    }
}
