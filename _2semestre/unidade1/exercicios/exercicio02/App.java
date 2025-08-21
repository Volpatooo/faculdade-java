package _2semestre.unidade1.exercicios.exercicio02;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Pessoa p = new Pessoa();

        System.out.println("Qual sua altura: (em metros)");
        p.altura = s.nextDouble();

        System.out.println("Qual seu peso (em KG)");
        p.peso = s.nextDouble();

        double imc = p.calcularImc();
        System.out.println("O IMC é de: " + imc);

    }
}
