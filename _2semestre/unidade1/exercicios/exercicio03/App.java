package _2semestre.unidade1.exercicios.exercicio03;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Pessoa pessoa = new Pessoa();

        for (int i = 0; i < 3; i++) {
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
