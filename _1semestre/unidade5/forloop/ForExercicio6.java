// Descreva um algoritmo que leia a altura de 20 pessoas e calcule a média de altura das mesmas.
// calculo da altura tem que ser feito fora do loop senao ele vai pegar cada altura e dividir po 20

package unidade5.forloop;

import java.util.Scanner;

public class ForExercicio6 {
    public static void main(String[] args) {
        double somaAlturas = 0.0;
        Scanner s = new Scanner(System.in);

        for (int i = 1; i <=20; i++) {
            System.out.println("Informe a altura em metros, Ex: (1,80) ");
            double alturaUsuario = s.nextDouble();
            somaAlturas += alturaUsuario;
        }
        double mediaAlturas = somaAlturas / 20; 
        System.out.println("A média final de altura é de: " + mediaAlturas);
    }

}
