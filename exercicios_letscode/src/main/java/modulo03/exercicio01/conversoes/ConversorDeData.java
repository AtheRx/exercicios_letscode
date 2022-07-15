package modulo03.exercicio01.conversoes;

import java.time.LocalDateTime;

public class ConversorDeData {
    public ConversorDeData(){
    }

    public LocalDateTime converter(String dateTime){
        Conversor conversorDeData = new DataUniversalETempo(
                new TempoEDataUniversal(
                        new DataBrasilETempo(
                                new TempoEDataBrasil(
                                        new PadraoDesconhecido()
                                )
                        )
                )
        );

        LocalDateTime localDateTime = conversorDeData.converter(dateTime);
        return localDateTime;
    }
}
