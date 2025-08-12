package _2semestre.unidade1.exercicios.exercicio04;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Pessoa[] pessoas = new Pessoa[3];

        for (int i = pessoas.length - 1; i < pessoas.length; i++) {
            System.out.println("Digite sua altura:");
            double altura = s.nextDouble();

            System.out.println("Digite seu peso:"); 
            double peso = s.nextDouble();

            pessoa.altura = altura;
            pessoa.peso = peso;

            System.out.println("IMC: " + pessoa.calcularImc());
        }

    }

}
