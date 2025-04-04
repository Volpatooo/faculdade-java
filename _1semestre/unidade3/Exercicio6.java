package unidade3;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe o peso do prato: ");
        double pesoPrato = tec.nextDouble();
        double valorTotal = pesoPrato * 25;
        System.out.println("O valor total a pagar pelo prato é de: R$" + valorTotal);
        tec.close();
    }
}
