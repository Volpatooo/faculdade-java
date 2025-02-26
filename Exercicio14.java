import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe a distancia percorrida (Em Km): ");
        double distanciaPercorrida = tec.nextDouble();
        System.out.println("Informe o tempo gasto (Em Horas): ");
        double tempoGasto = tec.nextDouble();
        double velocidadeMedia = distanciaPercorrida / tempoGasto;
        double combustivelGasto = distanciaPercorrida / 12;
        System.out.println("A velocidade media foi de " + velocidadeMedia + " km/h " + "e a quantidade de combustivel usado foi de " + combustivelGasto + " litros.");
        tec.close();
    }
}

