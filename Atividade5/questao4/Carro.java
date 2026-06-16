package questao4;

public class Carro extends Transporte {

    private String combustivel;

    public Carro(int capacidade, String combustivel) {

        super(capacidade);
        this.combustivel = combustivel;
    }

    @Override
    public void MostrarDetalhes() {

        super.MostrarDetalhes();

        System.out.println("Combustível: " + combustivel);
    }
}