package Atividade6.questao5;

public abstract class Pessoa {

    protected String nome;
    protected int matricula;

    public Pessoa(String nome, int matricula){

        this.nome = nome;
        this.matricula = matricula;

    }

    public abstract void exibirDados();

}