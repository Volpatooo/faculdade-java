package _2semestre.unidade1;

public class Pessoa {
    double peso;
    double altura;

    double calcularImc() {
        return peso / (altura * altura);
    }

    void comer(double quantidade) { // Método vazio sem retorno
        peso = peso + (quantidade / 1000);
    }
}
