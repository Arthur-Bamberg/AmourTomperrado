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

public class TelaRamsayController implements Initializable {

    private String statementText = ":Olá! Sou chef Ramsey, comando a cozinha e espero que trabalhe bem junto conosco. \n Você já conheceu quem irá coordenar você durante essa semana. Mas deve ser apresentado ao resto da equipe.";
    private ArrayList<String> options = new ArrayList<>();
    private ClassCharacter character = App.game.getCharacter(6);

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
        character.changeRelationPoints(50);
        character.setLogOfDialogs(statementText, options.get(0));
        
        App.setRoot("TelaJacquin");    
    }

    public void Bottom() throws IOException {
        character.changeRelationPoints(10);
        character.setLogOfDialogs(statementText, options.get(1));
        
        App.setRoot("TelaJacquin");      
    }
    
    public void GoToLog() throws IOException {
        App.game.setPreviousScreen("TelaRamsay");
        App.setRoot("TelaLog");
    }
}
