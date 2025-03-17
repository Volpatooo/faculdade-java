package unidade4;

import java.util.Scanner;

public class ExercicioIf {
    public static void main(String[] args) {
        int numeroUsuario;
        Scanner s = new Scanner(System.in);

        System.out.println("Informe um numero: ");
        numeroUsuario = s.nextInt();

        if (numeroUsuario % 2 == 0) {
            System.out.println("O numero digitado e par!");
        } else if (numeroUsuario % 2 != 0) {
            System.out.println("O numero digitado e impar!");
        } else {
            System.err.println("Você não digitou um numero!");
        }
        s.close();
    }
}
