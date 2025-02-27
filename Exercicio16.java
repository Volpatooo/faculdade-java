import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Qual o valor da compra: ");
        int valorCompra = tec.nextInt();
        System.out.println("Qual o valor entregue pelo cliente: ");
        int valorEntregue = tec.nextInt();
        int valorTroco = valorEntregue - valorCompra;
        int trocoPor100 = valorTroco / 100;
        int trocoPor10 = (valorTroco % 100) / 10;
        int trocoPor1 = trocoPor10 % 10;
        System.out.println("Wuantidade de notas de 100 necessaria e: " + trocoPor100);
        System.out.println("Wuantidade de notas de 10 necessaria e: " + trocoPor10);
        System.out.println("Wuantidade de moedas de 1 real necessaria e: " + trocoPor1);
        
    }
}
