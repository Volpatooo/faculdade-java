package unidade5.forloop.ExerciciosForRefeitos;

import java.util.Scanner;

public class For2 {
    public static void main(String[] args) {
        int contadorPares = 0, contadorImpares = 0;
        Scanner s = new Scanner(System.in);

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                contadorPares+= i;
            } else {
                contadorImpares+= i;
            }
        }
        System.out.println("Pares: " + contadorPares);
        System.out.println("Ímpares: " + contadorImpares);
    }
}
