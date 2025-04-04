package unidade4.ifLoop;

import java.util.Scanner;

public class SwitchNew {
    public static void main(String[] args){
        String diaSemana = "";
        Scanner s = new Scanner(System.in);
        System.out.println("Informe um dia da semana");
        diaSemana = s.nextLine();
        s.close();
        switch(diaSemana) {
            case "Segunda", "Terça" -> System.out.println("6am");

            case "Quarta", "Quinta" -> System.out.println("7am");

            case "Sexta", "Sabado", "Domingo" -> System.out.println("Escal 4 x 1 pode dormir!");

            default ->  System.out.println("Dia da semana invalido!");
        }
    }
}
