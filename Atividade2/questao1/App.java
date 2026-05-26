package questao1;
public class App {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Civic", 0, 10, 1);

        carro1.ligar();
        carro1.acelerar();
        carro1.virarDireita();
        carro1.desligar();
    }
}
