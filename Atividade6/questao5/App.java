package Atividade6.questao5;

public class App {

    public static void main(String[] args) {

        Professor professor = new Professor("Carlos",1001);

        Aluno aluno = new Aluno("Maria",2001);

        Coordenador coordenador = new Coordenador("Ana",3001);

        professor.exibirDados();
        professor.ministrarDisciplina();
        professor.autenticar();

        System.out.println();

        aluno.exibirDados();
        aluno.realizarMatricula();
        aluno.autenticar();

        System.out.println();

        coordenador.exibirDados();
        coordenador.aprovarPlanoEnsino();
        coordenador.autenticar();

    }

}