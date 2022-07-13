package modulo03.exercicio01.conversoes;

public class DataUniversalETempo extends Conversor {

    public DataUniversalETempo(Conversor proximo) {
        super(proximo);
        super.padraoString = "\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}";
        super.formatoDateTime = "YYYY-MM-DD HH:mm:ss";
    }
}
