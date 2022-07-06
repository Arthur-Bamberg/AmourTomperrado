package amordoce.model.classCharacter.utils;

import java.util.List;

public class Dialog {//Ideia de um diálogo: texto e opções de resposta
    private String statement;
    private List <Options> options;
    
    public Dialog (String statement, List <Options> options) {
        this.statement = statement;
        this.options = options;
    }


    public String getStatement() {
        return this.statement;
    }

    public List<Options> getOptions() {
        return this.options;
    }
}
