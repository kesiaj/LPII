package questao4;

public class AppT {

    public static void main(String[] args) {

        Transporte[] transportes = new Transporte[3];

        transportes[0] = new Carro(5, "Gasolina");

        transportes[1] = new Onibus(40, "Feira-Salvador");

        transportes[2] = new Bicicleta(1, true);

        for (Transporte transporte : transportes) {

            transporte.MostrarDetalhes();

            System.out.println();
        }
    }
}