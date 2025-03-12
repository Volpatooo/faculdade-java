package exerciciosLogica;
import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe o total de galinhas na granja: ");
        int totalGalinhas = tec.nextInt();
        int valorTotal = totalGalinhas * 11;
        System.out.println("O gasto total na granja é de: R$ " + valorTotal + ",00");
        tec.close();
    }
}
