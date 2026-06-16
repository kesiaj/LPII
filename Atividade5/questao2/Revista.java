package questao2;

public class Revista extends ItemBiblioteca {

    private int edicao;

    public Revista(String titulo, String codigo,
                   int edicao) {

        super(titulo, codigo);
        this.edicao = edicao;
    }

    @Override
    public void exibirInformacoes() {

        super.exibirInformacoes();

        System.out.println("Número da edição: " + edicao);
    }
}