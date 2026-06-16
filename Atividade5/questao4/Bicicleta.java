package questao4;

public class Bicicleta extends Transporte {

    private boolean temMarchas;

    public Bicicleta(int capacidade, boolean temMarchas) {

        super(capacidade);
        this.temMarchas = temMarchas;
    }

    @Override
    public void MostrarDetalhes() {

        super.MostrarDetalhes();

        System.out.println("Possui marchas: " + temMarchas);
    }
}