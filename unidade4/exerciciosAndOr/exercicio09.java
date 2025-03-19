package unidade4.exerciciosAndOr;

import java.util.Scanner;

public class exercicio09 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero01 = s.nextInt();

        System.out.println("Informe outro número: ");
        int numero02 = s.nextInt();
        s.close();

        if ((numero01 % numero02 == 0) || (numero02 % numero01 == 0)){
            System.out.println("São multiplos!");
        } else {
            System.out.println("Não são multiplos!");
        }
    }
}
