package Atividade6.questao4;

public abstract class Conta {
    int numero;
    String titular;
    float saldo;

    public Conta(int numero, String titular, float saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
    }
   public void depositar(float valor) {
        saldo += valor;
   }
    public void sacar(float valor) {
        saldo -=valor;
    }
     public void consultarSaldo(){

        System.out.println("Saldo: R$ " + saldo);

    }
}

