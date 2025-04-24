package unidade5.WhileLoop;

import java.util.Scanner;

public class While19 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double valor = 0, desconto = 0, total = 0;
        double contValorTotal = 0;

        System.out.println("Valor da Compra, (0) para encerrar: ");
        valor = s.nextDouble();

        while (valor != 0) {
            if (valor > 500) {
                desconto = valor * 0.20;
                total = valor - desconto;
                System.out.println("Valor a pagar: R$ " + total);
                contValorTotal += total;
            } else {
                desconto = valor * 0.15;
                total = valor - desconto;
                System.out.println("Valor a pagar: R$ " + total);
                contValorTotal += total;
            }

            System.out.println("Valor da compra, (0) para encerrar: ");
            valor = s.nextDouble();
        }
        s.close();
        System.out.println("O valor total recebido foi de R$ " + contValorTotal);
    }
}
