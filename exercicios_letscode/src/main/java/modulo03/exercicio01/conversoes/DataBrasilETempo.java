package modulo03.exercicio01.conversoes;

public class DataBrasilETempo extends Conversor {

    public DataBrasilETempo(Conversor proximo) {
        super(proximo);
        this.padraoString = "\\d{2}-\\d{2}-\\d{4} \\d{2}:\\d{2}:\\d{2}";
        this.formatoDateTime = "dd-MM-yyyy HH:mm:ss";
    }
}
