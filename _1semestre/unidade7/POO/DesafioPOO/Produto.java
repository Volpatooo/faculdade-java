package unidade7.POO.DesafioPOO;

public class Produto {
    int codigo;
    String nome;
    int quantidade;
    double preco;
    String categoria;
    public Produto(int codigo, String nome, int quantidade, double preco, String categoria) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
        this.categoria = categoria;
    }

    public void adicionarEstoque(int quantidade) {
        this.quantidade += quantidade;
    }

    public boolean removerEstoque(int quantidade) {
        if (quantidade <= this.quantidade) {
            this.quantidade-= quantidade;
            return true;
        } else {
            return false;
        }
    }

    public double calcularValorTotal() {
        return this.quantidade * this.preco;
    }

    public String toString() {
        return "";
    }
}
