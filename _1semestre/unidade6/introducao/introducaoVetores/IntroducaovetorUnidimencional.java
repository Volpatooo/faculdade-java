package unidade6.introducao.introducaoVetores;

public class IntroducaovetorUnidimencional {
    public static void main(String[] args) {
        int[][] matriz = new int[0][1];

        int matriz2[][] = new int[0][1];

        int matriz3[][] = {
            {1, 2, 3}, // Linha
            {4, 5, 6}, // Coluna
            {7, 8, 9},
            {10, 11, 12},
            {13, 14, 15},
            {16, 17, 18},
        };

        for (int i = 0; i < matriz3.length; i++) {
            for (int j = 0; j < matriz3[i].length; j++) {
                System.out.print(matriz3[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
