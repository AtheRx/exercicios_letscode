package modulo03.exercicio01.conversoes;

public class TempoEDataBrasil extends Conversor {

    public TempoEDataBrasil(Conversor proximo) {
        super(proximo);
        this.padraoString = "\\d{2}:\\d{2}:\\d{2} \\d{2}-\\d{2}-\\d{4}";
        this.formatoDateTime = "HH:mm:ss dd-MM-yyyy";
    }

}
