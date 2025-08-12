package _2semestre.unidade1.exercicios.exercicio04;

public class Pessoa {
    double altura;
    double peso;

    double calcularImc() {
        return peso / (altura * altura);
    }
}
