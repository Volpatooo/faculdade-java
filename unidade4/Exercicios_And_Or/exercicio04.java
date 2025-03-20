package unidade4.Exercicios_And_Or;

import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe um número: ");
        float numero = s.nextFloat();

        if (numero % 1 != 0) {  // este condição diz que se o numero dividido por 1 e o resto for diferente de 0 então ele é decimal e se a divisão do núemro por 1 der como resto 0 ele obviamente não e decimal
            System.out.println("O núemro " + numero + " é decimal!");
        } else {
            System.out.println("O número " + numero + " não é decimal!");
        }
    }
}

// % indica o resto de uma divisão é um macete muito bom!!!
