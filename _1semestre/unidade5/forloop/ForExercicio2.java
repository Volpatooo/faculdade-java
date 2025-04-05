// Descreva um algoritmo que calcule e escreva a soma dos números pares e a soma dos números ímpares entre 1 e 100.

package unidade5.forloop;

public class ForExercicio2 {
    public static void main(String[] args) {
        int somaPares = 0;
        int somaImpares = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                somaPares += i; // somaPares começa com 0 entao incrementamos com o valor dela ela mesmo + todos os valores de i que sao pares, para obter o resultado.
            } else {
                somaImpares += i;
            }
        }

        System.out.println("A soma dos pares e: " + somaPares);
        System.out.println("A soma dos impares e: " + somaImpares);
    }
}
