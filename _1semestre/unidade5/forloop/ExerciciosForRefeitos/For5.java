package unidade5.forloop.ExerciciosForRefeitos;

import java.util.Scanner;

public class For5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe quantos números você quer: ");
        int n = scanner.nextInt();

        int numero = 8;

        for (int i = 1; i <= n; i++) {
            System.out.print(numero + " ");

            if (i % 2 == 1) {
                numero += 2;
            } else {
                numero = numero - 2;
                numero *= 2;
            }
        }

        scanner.close();
    }
}
