package unidade6.introducao.exerciciosVetores;

public class Exericicos1 {
    public static void main(String[] args) {
        int[] inteiros = new int[10];
        for (int i = inteiros.length - 1; i >= 0; i--) {
            System.out.println("Posição [" + i + "] = " + inteiros[i]);
        }
    }
}
