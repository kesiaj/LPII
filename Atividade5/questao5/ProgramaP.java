package questao5;

public class ProgramaP {

    public static void main(String[] args) {

        Pessoa[] pessoas = new Pessoa[4];

        pessoas[0] = new Professor(
                "Carlos",
                "111.111.111-11",
                "Matemática");

        pessoas[1] = new Aluno(
                "Ana",
                "222.222.222-22",
                "2025001");

        pessoas[2] = new Professor(
                "Maria",
                "333.333.333-33",
                "Português");
        
        pessoas[3] = new Aluno(
                "João",
                "444.444.444-44",
                "2025002"
        );
        for (Pessoa pessoa : pessoas) {

            pessoa.exibirDados();

            System.out.println();
        }
    }
}