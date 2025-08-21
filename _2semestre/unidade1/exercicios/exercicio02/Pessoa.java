package _2semestre.unidade1.exercicios.exercicio02;

public class Pessoa {
    double altura;
    double peso;

    public double calcularImc () {
        return peso / (altura * altura);
    }
}
