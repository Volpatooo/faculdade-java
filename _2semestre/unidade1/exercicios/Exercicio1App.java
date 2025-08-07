package _2semestre.unidade1.exercicios;

import _2semestre.unidade1.Pessoa;

public class Exercicio1App {
    public static void main(String[] args) {
        Pessoa p1;
        p1 = new Pessoa();
        p1.altura = 1.75;
        p1.peso = 78;

        System.out.println("O IMC é: " + p1.calcularImc());
        
    }
}
