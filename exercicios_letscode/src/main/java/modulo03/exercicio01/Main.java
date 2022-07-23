package modulo03.exercicio01;

import modulo03.exercicio01.conversoes.ConversorDeData;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static List<Map<String, String>> original = new ArrayList<>();
    public static List<Map<String, String>> listaCorrigida = new ArrayList<>();

    public static void main(String[] args) {

        carregarListaOriginal();
        corrigirListaOriginal();

        verificaMaisVelhoEMaisNovo();
    }

    public static void carregarListaOriginal() {
        original.add(Map.of("nome", "João", "nascimento", "1985-12-11 12:10:33"));
        original.add(Map.of("nome", "Maria", "nascimento", "24-07-1988 23:02:41"));
        original.add(Map.of("nome", "Ana", "nascimento", "03:58:26 14-02-1983"));
        original.add(Map.of("nome", "Pedro", "nascimento", "08:03:07 1989-11-02"));
    }
    public static void corrigirListaOriginal() {
        ConversorDeData conversor = new ConversorDeData();

        original.forEach((registro) -> {
            String adjustedDateTime = conversor.converter(registro.get("nascimento")).toString();
            listaCorrigida.add(Map.of("nome", registro.get("nome"), "nascimento", adjustedDateTime));
        });
    }

    public static void verificaMaisVelhoEMaisNovo() {
        long maxAge = Long.MIN_VALUE;
        long minAge = Long.MAX_VALUE;
        Map<String, String> olderRegister = new HashMap<>();
        Map<String, String> newsterRegister = new HashMap<>();

        for (Map<String, String> register: listaCorrigida){
            LocalDate birthDate = LocalDateTime.parse(register.get("nascimento")).toLocalDate();
            long daysSinceBirth = ChronoUnit.DAYS.between(birthDate, LocalDate.now());

            if (daysSinceBirth > maxAge) {
                maxAge = daysSinceBirth;
                olderRegister = register;
            }

            if (daysSinceBirth < minAge) {
                minAge = daysSinceBirth;
                newsterRegister = register;
            }
        }

        System.out.printf("A pessoa mais velha eh %s que possui %s anos, nascido(a) em %s. %n",
                olderRegister.get("nome"),
                pegarIdadeAtual(olderRegister.get("nascimento")),
                olderRegister.get("nascimento"));

        System.out.printf("A pessoa mais nova eh %s que possui %s anos, nascido(a) em %s. %n",
                newsterRegister.get("nome"),
                pegarIdadeAtual(newsterRegister.get("nascimento")),
                newsterRegister.get("nascimento"));

    }

    public static long pegarIdadeAtual(String birthDate) {
        LocalDateTime date = LocalDateTime.parse(birthDate);
        return Period.between(date.toLocalDate(), LocalDate.now()).getYears();
    }

}


