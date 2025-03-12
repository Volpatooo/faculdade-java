package exerciciosLogica;
import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Quantos dolares voçê deseja trocar: ");
        double totalDolares = tec.nextDouble();
        System.out.println("Qual a cotação do dolar hoje: ");
        double valorReal = tec.nextDouble();
        double valorTotal = totalDolares * valorReal;
        System.out.println("O valor total a ser recebido em reais e de R$ " + valorTotal);
        tec.close();
    }
}
