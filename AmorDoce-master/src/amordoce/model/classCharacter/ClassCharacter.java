package amordoce.model.classCharacter;

import java.util.ArrayList;
import java.util.List;

import amordoce.model.classCharacter.utils.Dialog;

public class ClassCharacter {
    private String name;
    private int relationPoints;
    private List <Dialog> dialogs;

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
}