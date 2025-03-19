package unidade4.exerciciosAndOr;

import java.util.Scanner;

public class exercicio15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe os meses admitidos: ");
        int mesesAdmitidos = s.nextInt();

        s.close();

        if (mesesAdmitidos >= 1 && mesesAdmitidos <= 12) {
            System.out.println("O funcionario ira receber 5% de reajuste");
        } else if (mesesAdmitidos >= 13 && mesesAdmitidos <= 48) {
            System.out.println("O funcionario ira receber 7% de reajuste"); 
        } else {
            System.out.println("Reajuste não informado");
        }           
    }
}
