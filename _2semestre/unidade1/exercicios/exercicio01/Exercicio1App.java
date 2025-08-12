package _2semestre.unidade1.exercicios.exercicio01;

public class Exercicio1App {
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa();

        pessoa.altura = 1.75;
        pessoa.peso = 78;

        System.out.println("IMC: " + pessoa.calcularImc());
        
    }
}
