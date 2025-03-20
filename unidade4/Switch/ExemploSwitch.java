package unidade4.Switch;

import java.util.Scanner;

public class ExemploSwitch {
    public static void main(String[] args) {
        int diaSemana;

        Scanner s = new Scanner(System.in);
        System.out.println("Informe um número de 1 a 7: ");
        diaSemana = s.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("Segunda-Feira");
                break;
            case 2:
                System.out.println("Terça-Feira");
                break;
            case 3:
                System.out.println("Quarta-Feira");
                break;
            case 4:
                System.out.println("Quinta-Feira");
                break;
            case 5:
                System.out.println("Sexta-Feira");
                break;
            case 6: // se for 6 ou 7 vai validar como final de semana
            case 7:
                System.out.println("Final de Semana!");
                break;
            default:
                System.out.println("Dia inválido!");
                break;
        }
    }
}
