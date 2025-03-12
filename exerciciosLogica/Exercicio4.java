package exerciciosLogica;
import java.util.Scanner;

public class Exercicio4 {
    
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe a Primeira nota: ");
        double nota1 = tec.nextDouble();
        System.out.println("Informe a seguna nota: ");
        double nota2 = tec.nextDouble();
        System.out.println("Informe a terceira nota: ");
        double nota3 = tec.nextDouble();
        double media = ((nota1 * 5) + (nota2 * 3) + (nota3 * 2)) / (5 + 3 + 2);
        System.out.println("A média ponderada é de: " + media);
        tec.close();
    } 
}
