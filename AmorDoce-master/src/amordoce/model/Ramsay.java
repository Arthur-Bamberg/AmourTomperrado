package amordoce.model;

import amordoce.model.classCharacter.ClassCharacter;

public class Ramsay extends ClassCharacter {
    public Ramsay() {
        setName("Gordon Ramsay");
        setImgSrc("/assets/gameCharacter/Ramsay.png");
        setRelationPoints(20);
        setCiumes(0);
        setAversao(30);
        setConfianca(100);
        setDificultLevel(20);
    }
}