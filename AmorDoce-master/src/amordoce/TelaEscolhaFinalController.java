/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package amordoce;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class TelaEscolhaFinalController implements Initializable {

    private Game g = App.game;
    private ArrayList<Integer> charactersAllowed = g.getCharactersAllowed();

    @FXML
    private Button c0;

    @FXML
    private Button c1;

    @FXML
    private Button c2;

    @FXML
    private Button c3;

    @FXML
    private Button c4;

    @FXML
    private Button c5;

    @FXML
    private Button c6;

    @FXML
    private Button c7;

    @FXML
    private Button c8;

    @FXML
    private Button c9;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        c0.setText(g.getCharacter(0).getName());
        c1.setText(g.getCharacter(1).getName());
        c2.setText(g.getCharacter(2).getName());
        c3.setText(g.getCharacter(3).getName());
        c4.setText(g.getCharacter(4).getName());
        c5.setText(g.getCharacter(5).getName());
        c6.setText(g.getCharacter(6).getName());
        c7.setText(g.getCharacter(7).getName());
        c8.setText(g.getCharacter(8).getName());
        c9.setText(g.getCharacter(9).getName());

        clearButton();

        showCharactersAllowed();
    }

    public void c0() throws IOException {
        next(0);
    }

    public void c1() throws IOException {
        next(1);
    }

    public void c2() throws IOException {
        next(2);
    }

    public void c3() throws IOException {
        next(3);
    }

    public void c4() throws IOException {
        next(4);
    }

    public void c5() throws IOException {
        next(5);
    }

    public void c6() throws IOException {
        next(6);
    }

    public void c7() throws IOException {
        next(7);
    }

    public void c8() throws IOException {
        next(8);
    }

    public void c9() throws IOException {
        next(9);
    }

    public void clearButton() {
        c0.setVisible(false);
        c1.setVisible(false);
        c2.setVisible(false);
        c3.setVisible(false);
        c4.setVisible(false);
        c5.setVisible(false);
        c6.setVisible(false);
        c7.setVisible(false);
        c8.setVisible(false);
        c9.setVisible(false);
    }

    public void showCharactersAllowed() {
        for (int i = 0; i < charactersAllowed.size(); i++) {
            switch (charactersAllowed.get(i)) {
                case 0:
                    c0.setVisible(true);
                    break;
                case 1:
                    c1.setVisible(true);
                    break;
                case 2:
                    c2.setVisible(true);
                    break;
                case 3:
                    c3.setVisible(true);
                    break;
                case 4:
                    c4.setVisible(true);
                    break;
                case 5:
                    c5.setVisible(true);
                    break;
                case 6:
                    c6.setVisible(true);
                    break;
                case 7:
                    c7.setVisible(true);
                    break;
                case 8:
                    c8.setVisible(true);
                    break;
                case 9:
                    c9.setVisible(true);
                    break;
            }
        }
    }

    public void next(int chosenCharacter) throws IOException {
        g.setChosenCharacter(chosenCharacter);
        App.setRoot("TelaFinal");
    }

    public void GoToLog() throws IOException {
        g.setPreviousScreen("TelaDialogo");
        App.setRoot("TelaLog");
    }
}
