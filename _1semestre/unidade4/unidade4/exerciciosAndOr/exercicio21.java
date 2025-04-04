package unidade4.exerciciosAndOr;

import java.util.Scanner;

public class exercicio21 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double altura, peso, imc;

        System.out.println("Informe sua altura: (Em metros)");
        altura = s.nextDouble();

        System.out.println("Informe seu peso: ");
        peso = s.nextDouble();

        s.close();

        imc = peso / Math.pow(altura, 2);

        if (imc < 18.5) {
            System.out.println("Magreza");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Saudavel");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println(("Sobrepeso"));
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obesiade Grau 1");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("Obesidade Grau 2 (severa)");
        } else if (imc >= 40) {
            System.out.println("Obesiade Grau 3 (morbida)");
        }
    }
}

// IMC=\frac{Massa}{Altura^2}
