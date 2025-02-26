import java.util.Scanner;

public class exercicio12 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nomeFuncionario = tec.nextLine();
        System.out.println("Informe o total de horas trabalhadas no mês: ");
        double horasMensais = tec.nextDouble();
        System.out.println("Informe seu numero de dependentes: ");
        int numeroDependentes = tec.nextInt();
        double salarioBruto = (horasMensais * 10) + (numeroDependentes * 60);
        double descontoInss = salarioBruto * 0.085;
        double descImpostoRenda = salarioBruto * 0.05;
        double salarioLiquido = salarioBruto - (descontoInss + descImpostoRenda);
        System.out.println("O funcionario " + nomeFuncionario + "possui um salario bruto de R$" + salarioBruto + " e um salario liquido de R$ " + salarioLiquido + ".");

    }
}
