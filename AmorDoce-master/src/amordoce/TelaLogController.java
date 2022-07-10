/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package amordoce;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class TelaLogController implements Initializable {

    private Game g = App.game;

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

    @FXML
    private Label log;

    @FXML
    private Label status;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        log.setVisible(false);
        status.setVisible(false);

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
    }

    public void Back() throws IOException {
        App.setRoot(g.getPreviousScreen());
    }

    public void c0() {
        clearButton();
        logAndStatus(0);
    }

    public void c1() {
        clearButton();
        logAndStatus(1);
    }

    public void c2() {
        clearButton();
        logAndStatus(2);
    }

    public void c3() {
        clearButton();
        logAndStatus(3);
    }

    public void c4() {
        clearButton();
        logAndStatus(4);
    }

    public void c5() {
        clearButton();
        logAndStatus(5);
    }

    public void c6() {
        clearButton();
        logAndStatus(6);
    }

    public void c7() {
        clearButton();
        logAndStatus(7);
    }

    public void c8() {
        clearButton();
        logAndStatus(8);
    }

    public void c9() {
        clearButton();
        logAndStatus(9);
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

    public void logAndStatus(int character) {
        log.setText(g.getCharacter(character).getLogOfDialogs());
        status.setText(g.getCharacter(character).toString());

        log.setVisible(true);
        status.setVisible(true);
    }
}
