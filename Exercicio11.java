import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Qual o valor em Celsius: ");
        double celsius = tec.nextDouble();
        double fahrenheit = (celsius * 9 / 5) + 32;
        System.out.println("A temperatura em Fahrenheit e de: " + fahrenheit);
    }
}
