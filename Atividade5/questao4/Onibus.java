package questao4;

public class Onibus extends Transporte {

    private String linha;

    public Onibus(int capacidade, String linha) {

        super(capacidade);
        this.linha = linha;
    }

    @Override
    public void MostrarDetalhes() {

        super.MostrarDetalhes();

        System.out.println("Linha: " + linha);
    }
}