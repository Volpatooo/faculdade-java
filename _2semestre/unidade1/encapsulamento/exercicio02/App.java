package _2semestre.unidade1.encapsulamento.exercicio02;

public class App {
    public static void main(String[] args) {
        Produto produto = new Produto();

        produto.setNome("Iphone 13 Pro Max");
        produto.vender(1);
        System.out.println("---------------------");
        System.out.println("Quantidade em estoque: " + produto.getEstoque());

        produto.repor(15);

        produto.vender(4);
        produto.vender(5);

        System.out.println("-----------");
        System.out.println("Quantidade em estoque: " + produto.getEstoque());
        System.out.println("Preço do produto: R$" + produto.getPreco());
    }
}
