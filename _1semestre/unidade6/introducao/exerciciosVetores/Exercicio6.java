package unidade6.introducao.exerciciosVetores;

import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Informe um valor inteiro N: ");
        int tamanho = s.nextInt();

        double[] vetorN = new double[tamanho];
        for (int i = 0; i < vetorN.length; i++) {
            System.out.println("Informe um valor: ");
            vetorN[i] = s.nextInt();
        }

        System.out.println("Informe outro valor: ");
        double valorVerifica = s.nextDouble();

        System.out.println("___________________________");

        boolean encontrado = false;
        for (int i = 0; i < vetorN.length;i++) {
            if (vetorN[i] == valorVerifica) {
                encontrado = true;
            }
        }

        if (encontrado) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
