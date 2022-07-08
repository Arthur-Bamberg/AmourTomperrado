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

public class TelaDialogoController implements Initializable {

    private String statementText = "Olá! Sou chef Ramsey, comando a cozinha. E você o que veio fazer aqui?";
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
    private Button middle;

    @FXML
    private Button bottom;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        options.add("Vim trabalhar chefe!");
        options.add("Só comer!");
        options.add("Tomar o seu lugar!");

        status.setText(App.game.getCharacter(6).toString());
        statement.setText(statementText);
        top.setText(options.get(0));
        middle.setText(options.get(1));
        bottom.setText(options.get(2));
    }

    public void Top() throws IOException {
        App.game.getCharacter(6).changeRelationPoints(20);
        App.game.getCharacter(6).setLogOfDialogs(statementText, options.get(0));
        
        App.setRoot("TelaRodrigues");    
    }

    public void Middle() throws IOException {
        App.game.getCharacter(6).changeRelationPoints(-20);
        App.game.getCharacter(6).setLogOfDialogs(statementText, options.get(1));
        
        App.setRoot("TelaRodrigues");      
    }

    public void Bottom() throws IOException {
        App.game.getCharacter(6).changeRelationPoints(-50);
        App.game.getCharacter(6).setLogOfDialogs(statementText, options.get(2));
        
        App.setRoot("TelaRodrigues");
    }
}
