package unidade6.introducao.introducaoVetores;

import java.util.Scanner;

public class IntroducaoVetor3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int qtNomes = s.nextInt();

        String[] nomes = new String[qtNomes];

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Informe um nome para a posição[" + i + "]: " + nomes[i]);
        }
    }
}
