package modulo03.exercicio01.conversoes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Pattern;

public abstract class Conversor {

    protected String padraoString = "" ;
    protected String formatoDateTime = "";

    protected Conversor proximo;

    Conversor(Conversor proximo){
        this.proximo = proximo;
    }

    public LocalDateTime converter(String dateTime) {
        Pattern pattern = Pattern.compile(padraoString);
        if(pattern.matcher(dateTime).matches()){
            LocalDateTime localDateTime = LocalDateTime.parse(dateTime,
                    DateTimeFormatter.ofPattern(formatoDateTime));

            return localDateTime;
        }
        return proximo.converter(dateTime);
    }
}
