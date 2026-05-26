package questao2;

public class App {
    public static void main(String[] args) {

        Televisao tv1 = new Televisao(50, "Samsung", 220, 5);

        tv1.ligar();
        tv1.aumentarVolume();
        tv1.aumentarVolume();
        tv1.subirCanal();
        tv1.descerCanal();
        tv1.desligar();
    }
}