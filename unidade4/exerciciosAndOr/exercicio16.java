package unidade4.exerciciosAndOr;

import java.util.Scanner;

public class exercicio16 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int idadeHomem1, idadeHomem2, idadeMulher1, idadeMulher2, somaIdades, produtoIdades;

        System.out.println("Informe a idade do primeiro homem: ");
            idadeHomem1 = s.nextInt();

        System.out.println("Informe a idade do segundo homem: ");
            idadeHomem2 = s.nextInt();

        System.out.println("Informe a idade da primeira mulher: ");
            idadeMulher1 = s.nextInt();

        System.out.println("Informe a idade da segunda mulher: ");
            idadeMulher2 = s.nextInt();

            s.close();

        if (idadeHomem1 > idadeHomem2 && idadeMulher1 > idadeMulher2) {
            somaIdades = idadeHomem1 + idadeMulher2;
            produtoIdades = idadeHomem2 * idadeMulher1;
            System.out.println("Soma: " + somaIdades + " Produto: " + produtoIdades);

        } else if (idadeHomem1 > idadeHomem2 && idadeMulher1 < idadeMulher2) {
            somaIdades = idadeHomem1 + idadeMulher1;
            produtoIdades = idadeHomem2 * idadeMulher2;
            System.out.println("Soma: " + somaIdades + " Produto: " + produtoIdades);


        } else if (idadeHomem1 < idadeHomem2 && idadeMulher1 > idadeMulher2) {
            somaIdades = idadeHomem2 + idadeMulher2;
            produtoIdades = idadeHomem1 * idadeMulher1;
            System.out.println("Soma: " + somaIdades + " Produto: " + produtoIdades);

        } else {
            somaIdades = idadeHomem2 + idadeMulher1;
            produtoIdades = idadeHomem1 * idadeMulher2;
            System.out.println("Soma: " + somaIdades + " Produto: " + produtoIdades);
        }
    }
}
