package _2semestre.unidade1.construtor;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private static int totalLivros;

    public Livro() {
        titulo = "Sem título";
        autor = "Desconhecido";
        anoPublicacao = 0;
        totalLivros++;
    }

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        anoPublicacao = ano;
        totalLivros++;
    }

    public String exibirInfo() {
        return "Título: " + titulo + ", Autor: " + autor + ", Ano de Publicação: " + anoPublicacao;
    }

    public String exibirInfo(boolean resumido) {
        if (resumido) {
            return "Título: " + titulo;
        } else {
            return exibirInfo();
        }
    }
    public static int getTotalLivros() {
            return totalLivros;
    }
}
