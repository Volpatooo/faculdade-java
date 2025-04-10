package unidade5.forloop.ExerciciosForRefeitos;

import java.util.Scanner;

public class For1 {
    public static void main(String[] args) {
        int numero;
        Scanner s = new Scanner(System.in);

        for (int i = 1; i <= 20; i++) {
            System.out.println("Informe um número: ");
            numero = s.nextInt();

            if (numero % 2 == 0) {
                System.out.println("Par");
            } else {
                System.out.println("Ímpar");
            }
        }
    }
}
