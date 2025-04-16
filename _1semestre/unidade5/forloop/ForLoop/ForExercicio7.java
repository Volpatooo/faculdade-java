// Descreva um algoritmo que leia um número inteiro n e, dados n números inteiros, descreva um algoritmo que:
// escreva o menor valor negativo;
// escreva a média dos números positivos.

// a lógica usada para achar o maior e o menor valor é a seguinte:
// crio aas var maior =  Double.NEGATIVE_INFINITY; ou seja vou comparar os numeros que eu digitei com o menor numero possivel existente e achar o maior entre eles e para achar o menor numero vou fazer o contrario comparar cs numeros digitados com o maior nuemero existente para achar o menor


package unidade5.forloop.ForLoop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ForExercicio7 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0");

        System.out.println("Informe o número de elementos (n): "); 
        int n = s.nextInt();

        double maior = Double.NEGATIVE_INFINITY;
        double menor = Double.POSITIVE_INFINITY;

        for (int i = 1; i <= n; i++) {
            System.out.println("Informe um número real: ");
            double numero = s.nextDouble();

            maior = Math.max(maior, numero);
            menor = Math.min(menor, numero);
        }

        System.out.println("O maior número é: " + df.format(maior)); // formatando para nenhuma casa após a ,
        System.out.println("O menor número é: " + df.format(menor));
    }
}
