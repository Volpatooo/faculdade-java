package _2semestre.unidade1.construtor;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Quantos livros deseja cadastrar?");
        int qtdLivros = s.nextInt();

        Livro[] livros = new Livro[qtdLivros];

        for (int i = 0; i < livros.length; i++) {
            System.out.println("Informe o título do livro N." + i);
            String titulo = s.next();

            System.out.println("Informe o autor do livro N." + i);
            String autor = s.next();
            s.nextLine();

            System.out.println("Informe o ano de publicação do livro" + i);
            int anoPublicacao = s.nextInt();

            livros[i] = new Livro(titulo, autor, anoPublicacao);
        }

        for (int i = 0; i < livros.length; i++) {
            Livro livroCadastrado = livros[i];
            if (i % 2 == 0) {
                System.out.println(livroCadastrado.exibirInfo(true));
            } else {
                System.out.println(livroCadastrado.exibirInfo());
            }
        }

        System.out.println("Total de livros cadastrados: " + Livro.getTotalLivros());
    }
}
