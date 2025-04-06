package unidade5;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ForExercicio8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0");

        int acumulaPositivos = 0;
        int contadorDePositivos = 0;
        double menor = Double.POSITIVE_INFINITY;

        System.out.println("Informe o número de elementos (n): ");
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Informe um número inteiro: ");
            int numero = s.nextInt();

            if (numero >= 0) {
                contadorDePositivos += 1;
                acumulaPositivos += numero;
            } else {
                menor = Math.min(menor, numero);
            }
        }
        System.out.println( "O menor número é: "+ df.format(menor));
        double mediaPositivos = acumulaPositivos / contadorDePositivos;
        System.out.println("A média dos núemros positivos é: " + mediaPositivos);
    }
}
