package unidade6.introducao.exerciciosVetores;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat def = new DecimalFormat("");
        int capacidade;

        System.out.println("Informe a capacidade do vetor: ");
        capacidade = s.nextInt();

        while (capacidade > 20 || capacidade < 1) {
            System.out.println("Informe a capacidade do vetor: ");
            capacidade = s.nextInt();
            s.nextLine();
        }

        double[] vetorReal = new double[capacidade];

        for (int i = 0; i < vetorReal.length; i++) {
            System.out.println("Informe um valor na posição ["+ i +"]");
            vetorReal[i] = s.nextDouble();
        }

        boolean[] achou = new boolean[capacidade];

        System.out.println("\nFrequência dos elementos do vetor Real: ");
        for (int i = 0; i < vetorReal.length; i++) {
            if (!achou[i]) {
                int cont = 1;
                for (int j = i + 1; j < vetorReal.length; j++) {
                    if (vetorReal[i] == vetorReal[j]) {
                        cont++;
                        achou[j] = true;
                    }
                }
                System.out.println(def.format(vetorReal[i]) + " apareceu " + cont + " vez(es)");
            }
        }
    }
}
