package unidade5.WhileLoop;

import java.util.Scanner;

public class WhileEx15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nomeAluno = "";
        float nota1 = 0, nota2 = 0, media;

        System.out.println("Nome: ");
        nomeAluno = s.nextLine(); // Verifica o primeiro nome para garantir que vai entrar no loop while

        while (!nomeAluno.equals("Fim")) {
            System.out.println("Nota 1: ");
            nota1 = s.nextInt();

            System.out.println("Nota 2: ");
            nota2 = s.nextInt();

            s.nextLine(); // para não sobrepor cada vez que se usa nextLine e depois vem um nextInt ou double usa-se s.nextLine para não sobrepor

            media = (nota1 + nota2) / 2;
            System.out.println("O aluno: " + nomeAluno.toUpperCase() + " teve a média: " + media);

            System.out.println("Nome: ");
            nomeAluno = s.nextLine();
        }

        System.out.println("Programa Encerrado!");
        s.close();
    } 
}
