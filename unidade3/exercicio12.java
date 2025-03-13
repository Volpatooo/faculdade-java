package unidade3;
import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nomeFuncionario = s.nextLine();
        System.out.println("Informe o total de horas trabalhadas no mês: ");
        double horasMensais = s.nextDouble();
        System.out.println("Informe seu numero de dependentes: ");
        int numeroDependentes = s.nextInt();
        double salarioBruto = (horasMensais * 10) + (numeroDependentes * 60);
        double descontoInss = salarioBruto * 0.085;
        double descImpostoRenda = salarioBruto * 0.05;
        double salarioLiquido = salarioBruto - (descontoInss + descImpostoRenda);
        DecimalFormat formatador = new DecimalFormat("0.00000");
        System.out.println("O funcionario " + nomeFuncionario + " possui um salario bruto de R$" + formatador.format(salarioBruto) + " e um salario liquido de R$ " + salarioLiquido + ".");
        s.close();
    }
}
