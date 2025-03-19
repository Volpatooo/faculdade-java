package unidade4.exerciciosAndOr;

import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);

        System.out.println("Informe um dia: ");
        int dia = s.nextInt();

        System.out.println("Informe um mes: ");
        int mes = s.nextInt();

        System.out.println("Informe um ano: ");
        int ano = s.nextInt();

        s.close();

        if (dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0 &&
        mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12){
                System.out.println("Válida");
        } else if (mes == 2 && dia == 29 && ano % 4 == 0 &&
                ano % 100 != 0 && ano % 400 != 0){
                System.out.println("Válida");
        } else if (mes == 2 && ano > 0 && dia > 0 && dia < 29 &&
        ano % 4 == 0 && ano % 100 != 0 && ano % 400 != 0){
                System.out.println("Não Válida");
        } else if (dia > 0 && dia < 31 &&
        mes == 4 || mes == 6 || mes == 7 || mes == 11){
                System.out.println("Válida");
        } else if (dia <= 0 && dia > 31 && mes < 1 && mes > 13 && ano < 0){
                System.out.println("Não Válida");
        }
        
    }
}
