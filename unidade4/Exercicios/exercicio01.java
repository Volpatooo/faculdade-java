package unidade4.Exercicios;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("QUal o núemro de horas trabalhadas no mês? ");
        int horasMensaiTrabalhadas = s.nextInt();
        System.out.println("Qual o valor pago por hora? ");
        double valorHora = s.nextDouble();
        double salarioTotal = horasMensaiTrabalhadas * valorHora;
        if (horasMensaiTrabalhadas > 160) {
            double salarioExtra = (horasMensaiTrabalhadas - 160) * (valorHora / 2);
            double salarioComAcrescimo = salarioTotal + salarioExtra;
            System.out.println("Você fez hora extra seu salário foi de R$ " + salarioComAcrescimo);
        } else {
            System.out.println("Salário total de R$ " + salarioTotal);
        }
    }
}
