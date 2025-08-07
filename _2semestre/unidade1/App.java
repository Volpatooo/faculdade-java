package _2semestre.unidade1;

public class App {
    public static void main(String[] args) {
    // Declaração do  objeto
    Pessoa p1; 
    Pessoa p2;
    Pessoa p3;

    // Criação do objeto
    p1 = new Pessoa();

    p2=p1;

    // Utilização do objeto para atribuir valores
    p1.peso = 75;
    p1.altura = 1.75;
    p2.altura = 1.80;
    // Utilizando o objeto para leitura
    System.out.println("O peso da pessoa é: " + p1.peso + " e sua altura é: " + p1.altura);
    }
}
