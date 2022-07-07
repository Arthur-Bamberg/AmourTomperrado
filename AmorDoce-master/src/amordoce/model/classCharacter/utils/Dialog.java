package amordoce.model.classCharacter.utils;

import java.util.ArrayList;

public class Dialog {//Ideia de um diálogo: texto e opções de resposta
    private String statement;
    private ArrayList <Option> options = new ArrayList<>();
    
    public Dialog (String statement, ArrayList <Option> options) {
        this.statement = statement;
        this.options = options;
    }

    public String getStatement() {
        return this.statement;
    }

    public Option getOption(int index) {
        return this.options.get(index);
    }
}
