package amordoce;

import amordoce.model.Beca;
import amordoce.model.Carosella;
import amordoce.model.Fogaca;
import amordoce.model.Hilbert;
import amordoce.model.Jacquin;
import amordoce.model.Obama;
import amordoce.model.Ramsay;
import amordoce.model.Rizzo;
import amordoce.model.Rodrigues;
import amordoce.model.Sangreal;
import amordoce.model.classCharacter.ClassCharacter;
import amordoce.model.classCharacter.utils.Dialog;

import java.util.ArrayList;

public class Game {
    private ArrayList<ClassCharacter> characterList = new ArrayList<>();
    
    public Game(){
        characterList.add(new Beca());//Indice 0
        characterList.add(new Carosella());//Indice 1
        characterList.add(new Fogaca());//Indice 2
        characterList.add(new Hilbert());//Indice 3
        characterList.add(new Jacquin());//Indice 4
        characterList.add(new Obama());//Indice 5
        characterList.add(new Ramsay());//Indice 6
        characterList.add(new Rizzo());//Indice 7
        characterList.add(new Rodrigues());//Indice 8
        characterList.add(new Sangreal());//Indice 9
    }
    
    public ClassCharacter getCharacter(int index) {
        return characterList.get(index);
    }
    
    public void response (int indexOfCharacter, Dialog dialog, int indexOfOption) {
        //ClassCharacter c = characterList.get(indexOfCharacter);
        characterList.get(indexOfCharacter).setResponse(dialog.getOption(indexOfOption).getChangeRelationPoints(), dialog.getStatement(), dialog.getOption(indexOfOption).getTextOption());
    }
}
