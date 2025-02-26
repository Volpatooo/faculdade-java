import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double azulejoEstampado = 12.50;
        System.out.println("Informe a altura da parede: (em Metros) ");
        double alturaParede = tec.nextDouble();
        System.out.println("Informe o comprimento da parede: (em Metros) ");
        double comprimentoParede = tec.nextDouble();
        double areaParede = comprimentoParede * alturaParede;
        double quantidadeAzulejos = areaParede * 9;
        double totalPago = quantidadeAzulejos * 12.50;
        System.out.println("O total pago foi de R$ " + totalPago);
    }
}
