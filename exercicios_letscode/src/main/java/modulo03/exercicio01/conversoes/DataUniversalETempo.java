package modulo03.exercicio01.conversoes;

public class DataUniversalETempo extends Conversor {

    public DataUniversalETempo(Conversor proximo) {
        super(proximo);
        this.padraoString = "\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}";
        this.formatoDateTime = "yyyy-MM-dd HH:mm:ss";
    }
}
