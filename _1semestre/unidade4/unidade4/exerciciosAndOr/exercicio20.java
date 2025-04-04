package unidade4.exerciciosAndOr;

import java.util.Scanner;

public class exercicio20 {
    public static void main(String[] args) {
        float notaProva1, notaProva2, notaProva3, notaExercicios, media;
        Scanner s = new Scanner(System.in);

        System.out.println("Nota 1: ");
        notaProva1 = s.nextFloat();

        System.out.println("Nota 2: ");
        notaProva2 = s.nextFloat();

        System.out.println("Nota 3: ");
        notaProva3 = s.nextFloat();

        System.out.println("Nota Exercicios: ");
        notaExercicios = s.nextFloat();

        s.close();

        media = (notaProva1 + notaProva2 + notaProva3 + notaExercicios) / 4;

        if (media >= 9) {
            System.out.println("A media de aproveitamento foi " + media + " , Conceito A. Aprovado");
        } else if (media >= 7.5 && media < 9) {
            System.out.println("A media de aproveitamento foi " + media + " , Conceito B. Aprovado");
        } else if (media >= 6 && media < 7.5) {
            System.out.println("A media de aproveitamento foi " + media + " , Conceito C. Aprovado");
        } else if (media >= 4 && media < 6) {
            System.out.println("A media de aproveitamento foi " + media + " , Conceito D. Reprovado");
        } else if (media < 4) {
            System.out.println("A media de aproveitamento foi " + media + " , Conceito E. Reprovado");
        }
    }
}