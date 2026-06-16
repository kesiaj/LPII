package questao1;

public class ProgramaF {

    public static void main(String[] args) {

        Funcionario[] funcionarios = new Funcionario[2];

        funcionarios[0] =
                new FuncionarioHorista("João", "111",
                        40, 25);

        funcionarios[1] =
                new FuncionarioMensalista("Maria", "222",
                        3000);

        for (Funcionario funcionario : funcionarios) {

            System.out.println("Nome: " + funcionario.nome);
            System.out.println("Pagamento: R$ " +
                    funcionario.calcularPagamento());
            System.out.println();
        }
    }
}
    

