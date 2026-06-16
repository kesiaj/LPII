package questao2;

public class Dvd extends ItemBiblioteca {

    private int duracao;

    public Dvd(String titulo, String codigo,
               int duracao) {

        super(titulo, codigo);
        this.duracao = duracao;
    }

    @Override
    public void exibirInformacoes() {

        super.exibirInformacoes();

        System.out.println("Duração: " + duracao + " minutos");
    }
}