package unidade6.introducao.exerciciosVetores;

import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        double[] VetorReais = new double[12];
        Scanner s = new Scanner(System.in);
        
        System.out.println("Informe um valor");
        for (int i = 0; i < VetorReais.length; i++) {
            VetorReais[i] = s.nextDouble();
        }

        for (int i = 0; i < VetorReais.length; i++) {
            if (VetorReais[i] % 2 == 0) {
                VetorReais[i] = VetorReais[i] * 1.05;
            } else {
                VetorReais[i] = VetorReais[i] * 1.02;
            }
        }

        System.out.println("Valores att do vetor: ");
        for (int i = 0; i < VetorReais.length; i++) {
            System.out.println("Posição ["+ i +"] = " + VetorReais[i]);
        }
    }
}
