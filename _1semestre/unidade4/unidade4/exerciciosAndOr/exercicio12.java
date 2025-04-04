package unidade4.exerciciosAndOr;

import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Informe um lado: ");
        int lado1 = s.nextInt();
        
        System.out.println("Informe um lado: ");
        int lado2 = s.nextInt();

        System.out.println("Informe um lado: ");
        int lado3 = s.nextInt();

        s.close();

        if (lado1 >= lado2 + lado3 || lado2 >= lado1 + lado3 || lado3 >= lado1 + lado2) {
            System.out.println("Não formam um triângulo.");
        } else if (lado1 == lado2 && lado1 == lado3){
            System.out.println("É equilátero.");
            
        } else if (lado1 == lado2 && lado1 != lado3
                || lado1 == lado3 && lado1 != lado2
                || lado2 == lado3 && lado2 != lado1){

            System.out.println("É isóceles.");
        } else if (lado1 != lado2 && lado2 != lado3){
            System.out.println("É escaleno.");
        }
    }
}
