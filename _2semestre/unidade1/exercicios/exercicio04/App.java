package _2semestre.unidade1.exercicios.exercicio04;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner  s = new Scanner(System.in);

        Pessoa[] pessoas = new Pessoa[3];

        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i] = new Pessoa();

            System.out.println("Nome: ");
            pessoas[i].nome = s.nextLine();

            System.out.println("Altura: (em metros)");
            pessoas[i].altura = s.nextDouble();

            
            System.out.println("Peso: (em KG)");
            pessoas[i].peso = s.nextDouble();
        }

        System.out.println("\n Dados na ordem inversa ---");
        for (int i = pessoas.length - 1; i >= 0; i--) {
            System.out.printf("Nome: %s | Altura: %f | Peso: %f | IMC: %f%n",
            pessoas[i].nome, pessoas[i].altura, pessoas[i].peso, pessoas[i].calcularImc()
            );
        }
    }
}
