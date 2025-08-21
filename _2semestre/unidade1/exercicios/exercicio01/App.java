package _2semestre.unidade1.exercicios.exercicio01;

public class App {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.altura = 1.75;
        p1.peso = 78;

        double imc = p1.calcularImc();
        System.out.println("O IMC é de " + imc);
    }
}
