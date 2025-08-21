package _2semestre.unidade1.exercicios.exercicio04;

public class Pessoa {
    double altura;
    double peso;
    String nome;

    public double calcularImc () {
        return peso / (altura * altura);
    }
}
