package questao2;

public class AppB {

    public static void main(String[] args) {

        ItemBiblioteca[] itens = new ItemBiblioteca[3];

        itens[0] = new Livro("Java", "001",
                "Deitel", 500);

        itens[1] = new Revista("Veja", "002",
                120);

        itens[2] = new Dvd("Vingadores", "003",
                180);

        for (ItemBiblioteca item : itens) {

            item.exibirInformacoes();
            System.out.println();
        }
    }
}