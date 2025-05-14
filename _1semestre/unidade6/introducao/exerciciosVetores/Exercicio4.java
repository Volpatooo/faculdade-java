package unidade6.introducao.exerciciosVetores;

import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Valores para o primeiro vetor...");
        int[] inteiros1 = new int[10];
        for (int i = 0; i < inteiros1.length; i++) {
            System.out.println("Informe o "+ (i + 1) +" valor: ");
            inteiros1[i] = s.nextInt();
        }

        System.out.println("________________________");

        System.out.println("Valores para o segundo vetor...");
        int[] inteiros2 = new int[10];
        for (int i = 0; i < inteiros2.length; i++) {
            System.out.println("Informe o "+ (i + 1) +" valor: ");
            inteiros2[i] = s.nextInt();
        }

        int[] somaVetores = new int[10];
        for (int i = 0; i < somaVetores.length; i++) {
            somaVetores[i] = inteiros1[i] + inteiros2[i];
        }

        System.out.println("Valores somados: ");
        for (int i = 0; i < somaVetores.length; i++) {
            System.out.println("Vetor somado: Posição " + i + " -->"+ " " + somaVetores[i]);
        }

        s.close();
    }
}
