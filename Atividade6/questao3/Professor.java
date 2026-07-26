package Atividade6.questao3;
public class Professor extends Funcionarios {
    private float horasAula;
    private float valorHora;

    public Professor( int matricula, String nome, float salario, float horasAula, float valorHora) {
        super(matricula, nome, salario);
        this.horasAula = horasAula;
        this.valorHora = valorHora;
    }
    @Override
    public float calcularSalario() {
        return salario + (horasAula * valorHora);

    }
}