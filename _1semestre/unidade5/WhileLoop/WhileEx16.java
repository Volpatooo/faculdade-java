package unidade5.WhileLoop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class WhileEx16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        String genero = "";
        float somFeminino = 0, somMasculino = 0, somOutros = 0;
        float altura;
        int contFeminino = 0, contMasculino = 0, contOutros = 0;

        System.out.println("Informe a altura (0) para encerrar: ");
        altura = s.nextFloat();
        s.nextLine();   

        while (altura != 0) {
            System.out.println("Informe o gênero (M/F/O): ");
            genero = s.nextLine();

            if (genero.equalsIgnoreCase("F")) {
                somFeminino += altura;
                contFeminino++;
            } else if (genero.equalsIgnoreCase("M")) {
                somMasculino += altura;
                contMasculino++;
            } else if (genero.equalsIgnoreCase("O")) {
                somOutros += altura;
                contOutros++;
            } else {
                System.out.println("Gênero Inválido!");
            }

            System.out.println("Informe a altura (0) para encerrar: ");
            altura = s.nextFloat();
            s.nextLine();
        }

        s.close();

        System.out.println("Média F: " + df.format(somFeminino / contFeminino));
        System.out.println("Média M: " + df.format(somMasculino / contMasculino));
        System.out.println("Média O: " + df.format(somOutros / contOutros));
    }
}
