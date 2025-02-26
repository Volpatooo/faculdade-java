import java.util.Scanner;

public class Exercicio7 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Quantos de 350ml voçê deseja: ");
        int ml350 = tec.nextInt();
        System.out.println("Quantos de 600ml voçê deseja: ");
        int ml600 = tec.nextInt();
        System.out.println("Quantos de 2L voçê deseja: ");
        int qtd2L = tec.nextInt();
        double totalLitros = (ml350 * 0.35) + (ml600 * 0.6) + (qtd2L * 2);
        System.out.println("A quantidade total de litros e de "+ totalLitros + " litros");

    }
}