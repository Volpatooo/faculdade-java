package provas.prova1;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe um método de pagamento: ");
        System.out.println("C: para cartão de crédito: ");
        System.out.println("D; para cartão de débito: ");
        System.out.println("P: para Pix: ");
        System.out.println("B: para boleto: ");
        String metodoPagamento = s.nextLine().toUpperCase();

        if (metodoPagamento.equals("C")) {
            System.out.println("Cartão de Crédito");
        } else if (metodoPagamento.equals("D")) {
            System.out.println("Cartão de Débito");
        } else if (metodoPagamento.equals("P")) {
            System.out.println("Pix");
        } else if (metodoPagamento.equals("B")) {
            System.out.println("Boleto");
        } else {
            System.out.println("Entrada Incorreta");
        }
    }
}
