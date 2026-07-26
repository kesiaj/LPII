package Atividade6.questao5;

public class Aluno extends Pessoa implements Autenticavel{

    public Aluno(String nome, int matricula){

        super(nome,matricula);

    }

    public void realizarMatricula(){

        System.out.println("Aluno matriculado.");

    }

    @Override
    public void autenticar(){

        System.out.println("Aluno autenticado.");

    }

    @Override
    public void exibirDados(){

        System.out.println("Aluno: " + nome);

        System.out.println("Matrícula: " + matricula);

    }

}