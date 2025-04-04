package unidade4.Exercicios_Switch;

import java.util.Scanner;

public class exercicio22 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int escolhaDeGraduacao;

        System.out.println("Qual seu título de graduação: ");
        escolhaDeGraduacao = s.nextInt();

        s.close();

        switch (escolhaDeGraduacao) {
            case 1:
                System.out.println("Bacharel em Ciência da Computação");
                break;
            case 2:
                System.out.println("Licenciado em Computação");
                break;
            case 3:
                System.out.println("Bacharel em Sistemas de Informação");
                break;
            default:
                System.out.println("Sem títulos válidos!");
                break;
        }
    }
}
