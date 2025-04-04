package unidade3;
import java.util.Scanner;

public class Exercicio3 {
    
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe o preço da gasolina: ");
        double precoGasolina = tec.nextDouble();
        System.out.println("Informe o total do pagamento: ");
        double valorPagamento = tec.nextDouble();
        double quantidadeLitros = valorPagamento / precoGasolina;
        System.out.println("A quantidade de litros colocada foi de: " + quantidadeLitros + " litros.");
        tec.close();
    } 
}
