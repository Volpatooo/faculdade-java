package unidade3;
import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        double pi = 3.141592653589793;
        Scanner tec = new Scanner(System.in);
        System.out.println("Qual o raio da lata de oleo: ");
        double raioLata = tec.nextDouble();
        System.out.println("Qual a altura da lata de oleo: ");
        double alturaLata = tec.nextDouble();
        double volumeLata = pi * (raioLata * raioLata) * alturaLata;
        System.out.println("O volume total da lata de oleo e de : " + volumeLata);
        tec.close();
    }
}
