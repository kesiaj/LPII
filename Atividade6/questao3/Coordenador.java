package Atividade6.questao3;
public class Coordenador extends Funcionarios {

    private float gratificacao;

    public Coordenador(int matricula, String nome,
                       float salario, float gratificacao) {

        super(matricula, nome, salario);
        this.gratificacao = gratificacao;
    }

    @Override
    public float calcularSalario() {
        return salario + gratificacao;
    }
}