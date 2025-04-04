package unidade4.exerciciosAndOr;

import java.util.Scanner;

public class exercicio19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe um quadrante: ");
        int x = s.nextInt();

        System.out.println("Informe outro quadrante: ");
        int y = s.nextInt();;

        if (x == 0 && y == 0) {
            System.out.println("Quadrante 0");
        } else if (x > 0 && y > 0) {
            System.out.println("Quadrante 1");
        } else if (x < 0 && y > 0) {
            System.out.println("Quadrante 2");
        } else if (x < 0 && y < 0) {
            System.out.println("Quadrante 3");
        } else if (x > 0 && y < 0) {
            System.out.println("Quadrante 4");
        }
    }
}
