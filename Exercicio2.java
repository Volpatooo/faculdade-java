import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        double valorProduto = tec.nextDouble();
        double desconto = valorProduto * 0.12;
        System.out.println("O valor do desconto é de R$ " + desconto);
        double valorFinal = valorProduto - desconto;
        System.out.println("O valor do produto com desconto é de " + valorFinal);
        tec.close();
    }
}
