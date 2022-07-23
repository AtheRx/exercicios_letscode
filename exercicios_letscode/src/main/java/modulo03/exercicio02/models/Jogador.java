package modulo03.exercicio02.models;

public class Jogador {
    private String nome;
    private Tipo tipoJogador;
    public Jogador(String nome, Tipo tipoJogador){
        this.nome = nome;
        this.tipoJogador = tipoJogador;
    }

    public String getNome(){
        return this.nome;
    }
    public Tipo getTipoJogador(){
        return this.tipoJogador;
    }
}
