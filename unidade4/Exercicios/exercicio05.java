package unidade4.Exercicios;

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("A cor é azul? ");
        String corAzul = s.nextLine();

        if (corAzul.equalsIgnoreCase("true")) {
            System.out.println("SIm");
        } else if (corAzul.equalsIgnoreCase("false")) {
            System.out.println("Não");
        } else {
            System.out.println("Resposta inválida!");
        }
    }
}
