package questao1;

public class FuncionarioMensalista extends Funcionario {

    private double salarioFixo;

    public FuncionarioMensalista(String nome, String cpf,
                                 double salarioFixo) {

        super(nome, cpf);
        this.salarioFixo = salarioFixo;
    }

    @Override
    public double calcularPagamento() {
        return salarioFixo;
    }
}