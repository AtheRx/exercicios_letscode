package modulo03.exercicio01.conversoes;

public class TempoEDataUniversal extends Conversor {

    public TempoEDataUniversal(Conversor proximo) {
        super(proximo);
        this.padraoString = "\\d{2}:\\d{2}:\\d{2} \\d{4}-\\d{2}-\\d{2}";
        this.formatoDateTime = "HH:mm:ss yyyy-MM-dd";
    }
}
