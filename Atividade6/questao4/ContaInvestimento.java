package Atividade6.questao4;

public class ContaInvestimento extends Conta implements Investimento{

    public ContaInvestimento(int numero, String titular, float saldo){

        super(numero,titular,saldo);

    }

    @Override
    public void renderJuros(){

        saldo += saldo * 0.10;

    }

}