public class App {

    public static void main(String[] args) {

        // Criando produtos
        Produto produto1 = new Produto("Mouse", 50.0, 10);
        Produto produto2 = new Produto("Teclado", 120.0, 5);
        Produto produto3 = new Produto("Monitor", 800.0, 2);

        // Exibindo dados dos produtos
        System.out.println("Produto 1:");
        System.out.println("Nome: " + produto1.getNome());
        System.out.println("Preço: R$ " + produto1.getPreco());
        System.out.println("Quantidade: " + produto1.getQuantidade());
        System.out.println("Valor em estoque: R$ " + produto1.calcularValorEstoque());

        System.out.println();

        System.out.println("Produto 2:");
        System.out.println("Nome: " + produto2.getNome());
        System.out.println("Preço: R$ " + produto2.getPreco());
        System.out.println("Quantidade: " + produto2.getQuantidade());
        System.out.println("Valor em estoque: R$ " + produto2.calcularValorEstoque());

        System.out.println();

        System.out.println("Produto 3:");
        System.out.println("Nome: " + produto3.getNome());
        System.out.println("Preço: R$ " + produto3.getPreco());
        System.out.println("Quantidade: " + produto3.getQuantidade());
        System.out.println("Valor em estoque: R$ " + produto3.calcularValorEstoque());

        System.out.println();

        // Exibindo total de produtos criados
        System.out.println("Total de produtos criados: " + Produto.getTotalProdutos());

        System.out.println();

        // Testando valores inválidos
        produto1.setPreco(-20);
        produto2.setQuantidade(-5);

        Produto produto4 = new Produto("Notebook", -3000, -2);
    }
}