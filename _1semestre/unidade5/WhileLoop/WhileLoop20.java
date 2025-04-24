package unidade5.WhileLoop;

import java.util.Scanner;

public class WhileLoop20 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        float massaInicial, massaFinal;
        int contSegundos = 0;

        System.out.println("Massa Inicial (em Kg): ");
        massaInicial = s.nextFloat();
        massaFinal = massaInicial * 1000; // Convertendo a massa para gramas

        while (massaFinal > 0.5) {
            massaFinal = massaFinal / 2;
            contSegundos += 50;
        }
        System.out.println("Massa Inicial: " + massaInicial + " Kg");
        System.out.println("Massa Final: " + massaFinal + " g");
        System.out.println("Tempo necessario (s): " + contSegundos + " s");

    }
}
