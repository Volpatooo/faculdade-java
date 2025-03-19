package unidade4.exerciciosAndOr;

import java.util.Scanner;

public class exercicio08 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Informe uma letra: ");
        String letraUsuario = s.nextLine().toUpperCase();
        s.close();

        if (letraUsuario.equals("a")
            || letraUsuario.equals("e")
            || letraUsuario.equals("i")
            || letraUsuario.equals("o")
            || letraUsuario.equals("u")){

                    System.out.println("Voçê digitou uma vogal!");
        } else {
            System.out.println("Voçê digitou uma consoante!");
        }
    }
}
