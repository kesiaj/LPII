package questao5;

public class Professor extends Pessoa {

    private String disciplina;

    public Professor(String nome, String cpf,
                     String disciplina) {

        super(nome, cpf);
        this.disciplina = disciplina;
    }

    @Override
    public void exibirDados() {

        super.exibirDados();

        System.out.println("Disciplina: " + disciplina);
    }
}