package amordoce.model.classCharacter;

import java.util.List;

import amordoce.model.classCharacter.utils.Dialog;
import java.util.ArrayList;

public class ClassCharacter {
    private String name;
    private String imgSrc;
    private int dificultLevel;
    private int relationPoints;
    private int ciumes;
    private int aversao;
    private int confianca;
    private List <Dialog> dialogs = new ArrayList<>();
    private String logOfDialogs;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String getImgSrc() {
        return this.imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }
    
    public int getDificultLevel() {
        return this.dificultLevel;
    }

    public void setDificultLevel(int dificultLevel) {
        this.dificultLevel = dificultLevel;
    }

    public int getRelationPoints() {
        return this.relationPoints;
    }

    protected void setRelationPoints(int relationPoints) {
        this.relationPoints = relationPoints;
    }
    
    public void changeRelationPoints(int changedPoints) {
        this.relationPoints += changedPoints;
    }
    
    public int getCiumes() {
        return this.ciumes;
    }

    public void setCiumes(int ciumes) {
        this.ciumes = ciumes;
    }
    
    public void changeCiumes(int changedCiumes) {
        this.ciumes += changedCiumes;
    }
    
    public int getAversao() {
        return this.aversao;
    }

    public void setAversao(int aversao) {
        this.aversao = aversao;
    }
    
    public void changeAversao(int changedAversao) {
        this.ciumes += changedAversao;
    }
    
    public int getConfianca() {
        return this.confianca;
    }

    public void setConfianca(int confianca) {
        this.confianca = confianca;
    }
    
    public void changeConfianca(int changedConfianca){
        this.confianca += changedConfianca;
    }

    public void setNewDialog(Dialog dialog) {
        this.dialogs.add(dialog);
    }

    public Dialog getDialog(int index) {
        return this.dialogs.get(index);
    }
    
    public void setLogOfDialogs(String statement, String option) {
        if(statement != null && option != null) {
            logOfDialogs += "\nEnunciado: " + statement + "\nResposta escolhida: " + option;
        }
    }
    
    public String getLogOfDialogs() {
        return logOfDialogs;
    }
    
    public void setResponse(int relationPointsToChange, String statement, String option) {
        this.changeRelationPoints(relationPointsToChange);
        this.setLogOfDialogs(statement, option);
    }
    
    @Override
    public String toString() {
        return "Nome: " + this.name + "\nRelacionamento: " + this.relationPoints + "\nCiúmes: " + this.ciumes + "\nAversão: " + this.aversao + "\nConfiança: " + this.confianca;
    }
}