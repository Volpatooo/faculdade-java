package unidade4.exerciciosAndOr;

import java.util.Scanner;

public class exercicio13 {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("Informe uma carta: ");
        int carta1 = s.nextInt();

        System.out.println("Informe outra carta: ");
        int carta2 = s.nextInt();

        System.out.println("Informe outra carta: ");
        int carta3 = s.nextInt();

        s.close();

        int qntdCartasBoas = 0;

        if (carta1 == 1 || carta1 == 2 || carta1 == 3) {
            qntdCartasBoas += 1;  
        }

        if (carta2 == 1 || carta2 == 2 || carta2 == 3) {
            qntdCartasBoas += 1;  
        }

        if (carta3 == 1 || carta3 == 2 || carta3 == 3) {
            qntdCartasBoas += 1;  
        }

        if (qntdCartasBoas == 1) {
            System.out.println("TRUCO");
        } else if (qntdCartasBoas == 2) {
            System.out.println("SEIS");
        } else if (qntdCartasBoas == 3) {
            System.out.println("NOVE");
        } else {
            System.out.println("");
        }
    }
}
