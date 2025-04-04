package unidade4.exerciciosAndOr;

import java.util.Scanner;

public class exercicios10 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Informe a idade do primeiro filho: ");
        int idadePrimeiroFilho = s.nextInt();

        System.out.println("Informe a idade do segundo filho: ");
        int idadeSegundoFilho = s.nextInt();

        System.out.println("Informe a idade do terceiro filho: ");
        int idadeTerceiroFilho = s.nextInt();

        if (idadePrimeiroFilho < idadeSegundoFilho && idadePrimeiroFilho < idadeTerceiroFilho){
            System.out.println("O primeiro filho é o caçula!");
        } else if (idadeSegundoFilho < idadePrimeiroFilho && idadeSegundoFilho < idadeTerceiroFilho){
            System.out.println("O segundo filho é o caçula!");
        } else {
            System.out.println("O terceiro filho é o caçula!");
        }
    }
}
