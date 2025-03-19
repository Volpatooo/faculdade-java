package unidade4.or;

import java.util.Scanner;

public class ExemploOr {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Informe uma letra: ");
        String letraUsuario = s.nextLine();

        if (letraUsuario.equalsIgnoreCase("a")
            || letraUsuario.equalsIgnoreCase("e")
            || letraUsuario.equalsIgnoreCase("i")
            || letraUsuario.equalsIgnoreCase("o")
            || letraUsuario.equalsIgnoreCase("u")){

                    System.out.println("Voçê digitou uma vogal!");
        } else {
            System.out.println("Voçê digitou uma consoante!");
        }
    }
}
