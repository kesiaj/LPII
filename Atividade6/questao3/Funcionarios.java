package Atividade6.questao3;
public abstract class Funcionarios {
    protected int matricula;
    protected String nome;
    protected float salario;

    public Funcionarios(int matricula, String nome, float salario) {
        this.matricula = matricula;
        this.nome = nome;
        this.salario = salario;
    }

    public abstract float calcularSalario();

    public String getNome() {
        return nome;
    }
}