package unidade5.forloop.ForLoop;

import java.util.Scanner;

public class ForExercicio12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n;
        int contador = 1;

        System.out.println("Qual o número de linhas: ");
        n = s.nextInt();

        for (int i = 1; i <= n; i++) { // lê o número de linhas
            for (int j = 1; j <= i; j++) { // números por linha
                System.out.print(contador + " ");
                contador++;
            }
            System.out.println();
        }

    }
}
