package Atividade6.questao5;

public class Coordenador extends Pessoa implements Autenticavel{

    public Coordenador(String nome, int matricula){

        super(nome,matricula);

    }

    public void aprovarPlanoEnsino(){

        System.out.println("Plano aprovado.");

    }

    @Override
    public void autenticar(){

        System.out.println("Coordenador autenticado.");

    }

    @Override
    public void exibirDados(){

        System.out.println("Coordenador: " + nome);

        System.out.println("Matrícula: " + matricula);

    }

}