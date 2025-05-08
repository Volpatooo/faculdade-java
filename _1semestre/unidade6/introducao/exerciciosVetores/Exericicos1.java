package unidade6.introducao.exerciciosVetores;

public class Exericicos1 {
    public static void main(String[] args) {
        int[] inteiros = new int[10]; // Cria um vetor com 10 posições

        for (int i = 0; i < inteiros.length; i++) {
            inteiros[i] = i + 1;
        }

        for (int i = inteiros.length - 1; i >= 0; i--) {
            System.out.println("Posição [" + i + "] = " + inteiros[i]);
        }
    }
}
