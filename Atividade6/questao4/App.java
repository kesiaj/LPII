package Atividade6.questao4;

public class App{

    public static void main(String[] args) {

        Corrente cc = new Corrente(1,"Ana",1000);

        Poupanca cp = new Poupanca(2,"José",2000);

        ContaInvestimento ci = new ContaInvestimento(3,"Pedro",5000);

        cc.depositar(500);
        cc.consultarSaldo();

        cp.sacar(300);
        cp.consultarSaldo();

        ci.renderJuros();
        ci.consultarSaldo();

    }

} 

