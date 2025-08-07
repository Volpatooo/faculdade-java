package _2semestre.unidade1;

public class pessoa {
    double peso;
    double altura;

    double calcularImc() {
        return peso / (altura * altura);
    }
}
