package amordoce.model.classCharacter;

import java.util.List;

import amordoce.model.classCharacter.utils.Dialog;
import java.util.ArrayList;

public class ClassCharacter {
    private String name;
    private int relationPoints;
    private List <Dialog> dialogs;
    private List <String> logOfDialogs = new ArrayList<>();

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRelationPoints() {
        return this.relationPoints;
    }

    public void setRelationPoints(int relationPoints) {
        this.relationPoints = relationPoints;
    }
    
    public void changeRelationPoints(int changedPoints) {
        this.relationPoints += changedPoints;
    }

    public void setNewDialog(Dialog dialog) {
        this.dialogs.add(dialog);
    }

    public Dialog getDialog(int index) {
        return this.dialogs.get(index);
    }
    
    public void setLogOfDialogs(String statement, String option) {
        logOfDialogs.add("Enunciado: " + statement + "Resposta escolhida: " + option);
    }
    
    public List <String> getLogOfDialogs() {
        return logOfDialogs;
    }
    
    public void setResponse(int relationPointsToChange, String statement, String option) {
        this.changeRelationPoints(relationPointsToChange);
        this.setLogOfDialogs(statement, option);
    }
    
    @Override
    public String toString() {
        return "Nome: " + this.name + "\nRelacionamento: " + this.relationPoints;
    }
}