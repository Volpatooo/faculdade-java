package unidade4.exerciciosAndOr;

import java.util.Scanner;

public class exercicio17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe a renda anual: ");
        double rendaAnual = s.nextDouble();

        System.out.println("Informe a qntd de dependentes: ");
        double qntdDependentes = s.nextDouble();

        s.close();

        if (rendaAnual <= 2000) {
            System.out.println("Sem impostos.");
        } else if (rendaAnual > 2000 && rendaAnual <= 5000) {
            double impostoBruto = rendaAnual * 0.05;
            double descontoDependentes = impostoBruto * 0.02;
            double descontoTotalDependentes = descontoDependentes * qntdDependentes;
            double impostoFinal = impostoBruto - descontoTotalDependentes;
            System.out.println("O imposto e de: 5% " + "R$ " + impostoFinal);
        } else if (rendaAnual > 5000 && rendaAnual <= 10000) {
            double impostoBruto = rendaAnual * 0.10;
            double descontoDependentes = impostoBruto * 0.02;
            double descontoTotalDependentes = descontoDependentes * qntdDependentes;
            double impostoFinal = impostoBruto - descontoTotalDependentes;
            System.out.println("O imposto e de: 10% " + "R$ " + impostoFinal);
        } else {
            double impostoBruto = rendaAnual * 0.15;
            double descontoDependentes = impostoBruto * 0.02;
            double descontoTotalDependentes = descontoDependentes * qntdDependentes;
            double impostoFinal = impostoBruto - descontoTotalDependentes;
            System.out.println("O imposto e de: 15% " + "R$ " + impostoFinal);
        }
    }
}
