package unidade4.Exercicios_And_Or;

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe uma gramatura: ");
        int gramaturaForncecida = s.nextInt();
        double precoFixo = 0.45;
        double valorTotal = 0;

        if (gramaturaForncecida <= 50) {
            System.out.println("Custo do selo e de: " + precoFixo);
        } else {
            int gramaturaAdicional = gramaturaForncecida - 50;
            double precoAdicional = (gramaturaAdicional / 20) + 1;
            valorTotal = precoFixo + 0.45 * precoAdicional;
            System.out.println("Custo do selo e de: " + valorTotal);
        }
    }
}
