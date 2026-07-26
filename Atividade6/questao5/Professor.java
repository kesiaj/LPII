package Atividade6.questao5;

public class Professor extends Pessoa implements Autenticavel{

    public Professor(String nome, int matricula){

        super(nome,matricula);

    }

    public void ministrarDisciplina(){

        System.out.println("Professor ministrando disciplina.");

    }

    @Override
    public void autenticar(){

        System.out.println("Professor autenticado.");

    }

    @Override
    public void exibirDados(){

        System.out.println("Professor: " + nome);

        System.out.println("Matrícula: " + matricula);

    }

}