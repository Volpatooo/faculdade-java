package _2semestre.unidade1.exercicios.exercicio01;

public class Pessoa {
    double altura;
    double peso;

    double calcularImc() {
        return peso / (altura * altura);
    }   
}
