package amordoce.model;

import amordoce.model.classCharacter.ClassCharacter;
import amordoce.model.classCharacter.utils.Dialog;

public class Jacquin extends ClassCharacter {//Estou usando como fase de teste e exemplo de como deve ser feito
    //Ainda tem que implementar opções encadeadas dentro de um diálogo

    public Jacquin() {
        setName("Jacquin");//Nome do personagem
        setRelationPoints(-10);//Pontos de relação no início do jogo
        setCiumes(0);
        setAversao(5);
        setConfianca(0);
        setDificultLevel(0);
    }
}
