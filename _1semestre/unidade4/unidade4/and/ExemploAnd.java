package unidade4.and;

import java.util.Scanner;

public class ExemploAnd {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Informe sua idade: ");
        int idadeUsuario = s.nextInt();

        s.nextLine();

        System.out.println("Infrorme se voçê possui CNH: ");
        String possuiCnh = s.nextLine();

        if (idadeUsuario >= 18 && possuiCnh.equalsIgnoreCase("Sim")){
            System.out.println("Já pode dirigir!");
        } else {
            System.out.println("AInda não pode dirigir!");
        }
    }
}
