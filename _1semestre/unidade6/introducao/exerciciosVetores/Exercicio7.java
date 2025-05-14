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
        int contador = 0;

        while (contador < valorN) {
            System.out.println("Informe um valor: ");
            int valor = s.nextInt();

            boolean repetido = false;
            for (int i = 0; i < contador; i++) {
                if (vetorInteiros[i] == valor) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                vetorInteiros[contador] = valor;
                contador++;
            } else {
                System.out.println("Valor já existe infomre outro: ");
            }
        }

        for (int i = 0; i < vetorInteiros.length - 1; i++) {
            for (int j = 0; j < vetorInteiros.length - 1 - i; j++) {
                if (vetorInteiros[j] > vetorInteiros[j + 1]) {
                    int temp = vetorInteiros[j];
                    vetorInteiros[j] = vetorInteiros[j + 1];
                    vetorInteiros[j + 1] = temp;
                }
            }
        }

        System.out.println("Vetor ordenado...");
        for (int valor : vetorInteiros) {
            System.out.println("["+ valor +"]");
        }

        s.close();
    }
}
