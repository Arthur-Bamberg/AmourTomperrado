package amordoce.model.classCharacter.utils;

public class Options {//Ideia de uma opção de resposta de com seu texto e resultado nos pontos de relação (relationPoints)
    private String textOption;
    private int changeRelationPoints;

    public Options(String textOption, int changeRelationPoints) {
        this.textOption = textOption;
        this.changeRelationPoints = changeRelationPoints;
    }

    public String getTextOption() {
        return this.textOption;
    }

    public int getChangeRelationPoints() {
        return this.changeRelationPoints;
    }
}
