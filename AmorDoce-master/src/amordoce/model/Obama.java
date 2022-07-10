package amordoce.model;

import amordoce.model.classCharacter.ClassCharacter;
import amordoce.model.classCharacter.utils.Dialog;
import amordoce.model.classCharacter.utils.Option;
import java.util.ArrayList;

public class Obama extends ClassCharacter {
    private ArrayList <Option> options = new ArrayList<Option>();
    
    public Obama(){
        setName("Michelle Obama");  
        setImgSrc("/assets/gameCharacter/Obama.png");
        setRelationPoints(45);
        setCiumes(0);
        setAversao(0);
        setConfianca(100);
        setDificultLevel(50);
        
        options.add(new Option("Cozinha", 10, "kitchen"));
        
        setNewDialog(new Dialog("Bem-vind@! Sou Michelle, dona do Bechamel. \n Vou introduzir você ao restaurante. Vou levá-l@ à cozinha.", options));
    }
}
