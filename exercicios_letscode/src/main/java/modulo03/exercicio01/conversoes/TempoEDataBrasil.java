package modulo03.exercicio01.conversoes;

public class TempoEDataBrasil extends Conversor {

    public TempoEDataBrasil(Conversor proximo) {
        super(proximo);
        super.padraoString = "\\d{2}:\\d{2}:\\d{2} \\d{2}-\\d{2}-\\d{4}";
        super.formatoDateTime = "HH:mm:ss YYYY-MM-DD";
    }

}
