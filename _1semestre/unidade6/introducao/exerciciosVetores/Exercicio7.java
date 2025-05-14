package unidade6.introducao.exerciciosVetores;

import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Valor (N): ");
        int valorN = s.nextInt();

        while (valorN > 20 || valorN <= 1) {
            System.out.println("Valor (N): ");
            valorN = s.nextInt();
        }

        int[] vetorInteiros = new int[valorN];
        for (int i = 0; i < vetorInteiros.length; i++) {
            System.out.println("Informe um valor: ");
            vetorInteiros[i] = s.nextInt();

            while (vetorInteiros[i] == i) {
                System.out.println("Informe um valor: ");
                vetorInteiros[i] = s.nextInt();
            }
        }
    }
}
