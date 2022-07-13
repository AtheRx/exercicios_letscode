package modulo03.exercicio01.conversoes;

public class TempoEDataUniversal extends Conversor {

    public TempoEDataUniversal(Conversor proximo) {
        super(proximo);
        super.padraoString = "\\d{2}-\\d{2}-\\d{4} \\d{2}:\\d{2}:\\d{2}";
        super.formatoDateTime = "HH:mm:ss YYYY-DD-MM";
    }
}
