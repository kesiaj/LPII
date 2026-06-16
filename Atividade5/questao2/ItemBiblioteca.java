package questao2;

public class ItemBiblioteca {

    protected String titulo;
    protected String codigo;

    public ItemBiblioteca(String titulo, String codigo) {

        this.titulo = titulo;
        this.codigo = codigo;
    }

    public void exibirInformacoes() {

        System.out.println("Título: " + titulo);
        System.out.println("Código: " + codigo);
    }
}