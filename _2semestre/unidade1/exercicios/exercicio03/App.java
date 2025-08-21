package _2semestre.unidade1.exercicios.exercicio03;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Pessoa[] pessoas = new Pessoa[3];

            for (int i = 0; i < 3; i++) {
                pessoas[i] = new Pessoa();
                System.out.println("Informe a altura (em metros)");
                pessoas[i].altura = s.nextDouble();

                System.out.println("Informe o peso (em KG)");
                pessoas[i].peso = s.nextDouble();

                System.out.println("IMC da pessoa " + (i + 1) + ": " + pessoas[i].calcularImc());
            }
            s.close();
    }
}
