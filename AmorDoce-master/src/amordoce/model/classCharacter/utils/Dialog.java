package amordoce.model.classCharacter.utils;

import java.util.List;

public class Dialog {//Ideia de um diálogo: texto e opções de resposta
    private String statement;
    private List <Options> options;
    private Next next;
    
    public Dialog (String statement, List <Options> options, Next next) {
        this.statement = statement;
        this.options = options;
        this.next = next;
    }


    public String getStatement() {
        return this.statement;
    }

    public List<Options> getOptions() {
        return this.options;
    }

    public Next getnext() {
        return this.next;
    }
}
