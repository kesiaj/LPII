package questao3;

public class Gato extends Animal{
    String pelagem;

    public Gato(String nome, int idade, String pelagem) {
        super(nome, idade);
        this.pelagem = pelagem;

    }
    @Override
    public void emitirSom() {
        System.out.println("Miau Miau");
    }
}
