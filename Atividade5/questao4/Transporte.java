package questao4;

public class Transporte {
    protected int capacidade;

    public Transporte ( int capacidade) {
        this.capacidade = capacidade;
    }

    public void MostrarDetalhes() {
        System.out.println( "Capacidade do transporte: " + capacidade);
    }
}
