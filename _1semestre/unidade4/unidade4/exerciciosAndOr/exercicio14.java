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

       boolean dataValida = true;
       
       if (ano <= 0) {
            dataValida = false;
       } else if (mes < 1 || mes > 12) {
            dataValida = false;
       } else if (mes == 2) {
                boolean anoBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
                if (anoBissexto && dia >= 1 && dia <= 29) {
                        dataValida = true;
                } else if (!anoBissexto && dia >= 1 && dia <= 28) {
                        dataValida = true;
                } else {
                        dataValida = false;
                }
       }

       else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia >= 1 && dia <= 30) {
                        dataValida = true;
                } else {
                        dataValida = false;
                }
       }

       else {
                if (dia >= 1 && dia <= 31) {
                        dataValida = true;
                } else {
                        dataValida = false;
                }
       }

       if (dataValida) {
        System.out.println("Valida");
       } else {
        System.out.println("Não valida");
       }

       s.close();
    }
}


// ||
