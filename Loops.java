import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Call das funções aqui
        // usoDoIf();

        double resultadoCalculadora = calculadora();
        if (!Double.isNaN(resultadoCalculadora)) {
            System.out.println("O resultado da operaçã é " + resultadoCalculadora);
        } else {
            System.out.println("Operação inválida ou erro durante a operação!");
        } 
    }

    public static double calculadora() {
        Scanner s = new Scanner(System.in);
        System.out.println("Qual operação voçê deseja? ");
        String escolhaUsuario = s.nextLine();
        System.out.println("Informe o primeiro número: ");
        double numero01 = s.nextDouble();
        System.out.println("Informe o segundo número: ");
        double numero02 = s.nextDouble();
        s.close();
        if (escolhaUsuario.equalsIgnoreCase("Soma") || escolhaUsuario.equalsIgnoreCase("+")) {
            return numero01 + numero02;
        } else if (escolhaUsuario.equalsIgnoreCase("Subtração") || escolhaUsuario.equalsIgnoreCase("-")) {
            return numero01 - numero02;
        } else if (escolhaUsuario.equalsIgnoreCase("Multiplicação") || escolhaUsuario.equalsIgnoreCase("*")) {
            return numero01 * numero02;
        } else if (escolhaUsuario.equalsIgnoreCase("Divisão") || escolhaUsuario.equalsIgnoreCase("/")) {
            if (numero02 != 0) {
                return numero01 / numero02;
            } else {
                System.out.println("Impossível dividir por 0!");
                return Double.NaN;
            }
        } else {
            System.out.println("A operação " + escolhaUsuario + " não existe!");
            return Double.NaN;
        }
    }
}








