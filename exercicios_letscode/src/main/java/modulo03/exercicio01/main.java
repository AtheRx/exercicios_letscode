package modulo03.exercicio01;

import modulo03.exercicio01.conversoes.Conversor;
import modulo03.exercicio01.conversoes.ConversorDeData;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class main {

    public static void main(String[] args) {
        List<Map<String, String>> original = new ArrayList<>();
        List<Map<String, String>> listaCorrigida = new ArrayList<>();
        ConversorDeData conversor = new ConversorDeData();

        original.add(Map.of("nome", "João", "nascimento", "1985-12-11 12:10:33"));
        original.add(Map.of("nome", "Maria", "nascimento", "24-07-1988 23:02:41"));
        original.add(Map.of("nome", "Ana", "nascimento", "03:58:26 14-02-1983"));
        original.add(Map.of("nome", "Pedro", "nascimento", "08:03:07 1989-11-02"));



    }

}


