package amordoce.model.classCharacter.utils;

public class Option {//Ideia de uma opção de resposta de com seu texto e resultado nos pontos de relação (relationPoints)
    private String textOption;
    private int changeRelationPoints;
    private String nextRoot;

    public Option(String textOption, int changeRelationPoints, String nextRoot) {
        this.textOption = textOption;
        this.changeRelationPoints = changeRelationPoints;
        this.nextRoot = nextRoot;
    }

    public String getTextOption() {
        return this.textOption;
    }

    public int getChangeRelationPoints() {
        return this.changeRelationPoints;
    }

    public String getNextRoot() {
        return this.nextRoot;
    }
}
