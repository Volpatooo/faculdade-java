// Descreva um algoritmo que calcule e escreva a soma da seguinte série de 100 termos:
// 1 Sobre 1 + 1 sobre 2 + 1 sobre 3 ate 1 sobre 100



package unidade5.forloop.ForLoop;

public class ForExercicio3 {
    public static void main(String[] args) {
        final double numeroUm = 1.0; // pois e divisao entao precisamos de casas decimais
        double soma = 0.0;

        for (int i = 1; i <= 100; i++) {
            soma += numeroUm / i;
        }

        System.out.println("A soma dos termos e " + soma);
    }
}
