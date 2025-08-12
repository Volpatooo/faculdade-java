package _2semestre.unidade1.exercicios.exercicio02;

import java.util.Scanner;

public class App {    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Digite sua altura:");
        double altura = s.nextDouble();
        System.out.println("Digite seu peso:"); 
        double peso = s.nextDouble();
        Pessoa pessoa = new Pessoa();
        pessoa.altura = altura;
        pessoa.peso = peso;
        System.out.println("IMC: " + pessoa.calcularImc());
    }
}
