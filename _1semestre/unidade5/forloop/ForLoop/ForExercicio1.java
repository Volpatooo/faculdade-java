// Descreva um algoritmo que leia 20 números inteiros e escreva, para cada número lido, se o mesmo é par ou ímpar.

package unidade5.forloop.ForLoop;
import java.util.Scanner;

public class ForExercicio1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

       System.out.println("Informe 20 numeros");

       for (int i = 1; i <= 20; i++) {
        int numero = s.nextInt();

        if (numero % 2 == 0) {
            System.out.println("O numero " + numero + " e par.");
        } else {
            System.out.println("O numero " + numero + " e impar.");
        }
       }

       System.out.println("FIm você digitou 20 numeros!");
        s.close();
    }
}


