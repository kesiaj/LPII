package Atividade6.questao3;
public class Tecnico extends Funcionarios {
    private float insalubridade;
    
    public Tecnico( int matricula, String nome, float salario, float insalubridade) {
        super(matricula, nome, salario);
        this.insalubridade = insalubridade;
    }

    @Override
    public float calcularSalario() {
        return salario + insalubridade;
    }
}