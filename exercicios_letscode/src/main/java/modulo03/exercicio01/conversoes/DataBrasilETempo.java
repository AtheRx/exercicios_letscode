package modulo03.exercicio01.conversoes;

public class DataBrasilETempo extends Conversor {

    public DataBrasilETempo(Conversor proximo) {
        super(proximo);
        super.padraoString = "\\d{2}-\\d{2}-\\d{4} \\d{2}:\\d{2}:\\d{2}";
        super.formatoDateTime = "DD-MM-YYYY HH:mm:ss";
    }
}
