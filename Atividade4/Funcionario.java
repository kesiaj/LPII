
public class Funcionario {

    String nome;
    String cpf;
    String rg;
    String dataContratacao;

    private double salario;
    private double salarioBase;
    private int horasTrabalhadas;

    private int matricula;

    private static int geraMatricula = 0;

    public Funcionario(String nome, double salarioBase, int horasTrabalhadas){

        this.nome = nome;
        this.salarioBase = salarioBase;
        this.horasTrabalhadas = horasTrabalhadas;

        geraMatricula++;
        matricula = geraMatricula;

        dataContratacao = "08/06/2026";
    }

    public void calculaSalario(){

        Calculo calculo = new Calculo();

        calculo.calculaSalario(salarioBase, horasTrabalhadas);

        salario = calculo.getTotalSalario();
    }

    public void imprimeDados(){

        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("RG: " + rg);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Data Contratação: " + dataContratacao);
        System.out.println("Salário: " + salario);
    }
}