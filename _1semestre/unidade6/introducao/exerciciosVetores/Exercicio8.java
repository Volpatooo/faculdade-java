package unidade6.introducao.exerciciosVetores;

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe um valor (N): ");
        int valor = s.nextInt();
        
        while (valor > 20 || valor <= 1) {
            System.out.println("Informe um valor (N): ");
            valor = s.nextInt();
        }

        double[] vetorReal = new double[valor];

        for (int i = 0; i < vetorReal.length; i++) {
            System.out.println("Valor para o vetor: ");
            vetorReal[i] = s.nextDouble();
        }
    }
}
