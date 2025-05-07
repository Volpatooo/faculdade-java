package unidade6.introducao.introducaoVetores;

public class IntroducaoVetor2 {
    public static void main(String[] args) {
        int vetor1[] = new int[10]; // Declaração de um vetor de tamanho 10

        int[] vetor2 = new int[5]; // Declaração de um vetor de tamanho 12
        vetor2[0] = 1;
        vetor2[1] = 2;
        vetor2[2] = 3;
        vetor2[3] = 4;
        vetor2[4] = 5;

        int[] vetor3 = {1, 2, 3, 4, 5, 6}; // Vetor com 6 posições mesma coisa que o de cima
        for (int i = 0; i < vetor3.length; i++) {
            System.out.println("Posição["+ i + "] = " + vetor3[i]); // Este for vai percorrer os valores do vetor e printar todos os valores dele em relação ao tamanho dele
        }

        System.out.println("--------------------------------");

        for (int i = vetor3.length - 1; i >= 0; i--) {
            System.out.println("Posição["+ i + "] = " + vetor3[i]);
        }

        int indice = 0;
        for (int numero : vetor3) {
            System.out.println(numero); // For-each muito mais fácil a sintaxe para informar os valores porem não tem como acessar as posições do vetor
            indice++;
        }
    }
}
