package questao2;

public class Livro extends ItemBiblioteca {

    private String autor;
    private int numeroPaginas;

    public Livro(String titulo, String codigo,
                 String autor, int numeroPaginas) {

        super(titulo, codigo);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void exibirInformacoes() {

        super.exibirInformacoes();

        System.out.println("Autor do livro: " + autor);
        System.out.println("Número de páginas: " + numeroPaginas);
    }
}