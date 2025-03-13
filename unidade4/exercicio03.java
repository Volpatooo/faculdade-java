package unidade4;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe um número: ");
        int numero01 = s.nextInt();
        System.out.println("Informe outro número: ");
        int numero02 = s.nextInt();

        if (numero01 > numero02) {
            System.out.println("O número " + numero01 + " é maior que o número " + numero02);
        } else {
            System.out.println("O número " + numero02 + " é maior que o número " +  numero01);
        }
    }
}
