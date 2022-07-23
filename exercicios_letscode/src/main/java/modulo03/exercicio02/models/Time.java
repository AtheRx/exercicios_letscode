package modulo03.exercicio02.models;

import java.util.Collections;
import java.util.List;

public class Time {
        private String nome;
        private List<Jogador> jogadores;

    public Time(String nome, List<Jogador> jogadores){
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public String getNome(){
        return this.nome;
    }

    public List<Jogador> getJogadores(){
        return Collections.unmodifiableList(this.jogadores);
    }

}
