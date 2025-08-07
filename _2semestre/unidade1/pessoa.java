package _2semestre.unidade1;

public class Pessoa {
    public double peso;
    public double altura;

    public double calcularImc() {
        return peso / (altura * altura);
    }

    void comer(double quantidade) { // Método vazio sem retorno
        peso = peso + (quantidade / 1000);
    }
}
