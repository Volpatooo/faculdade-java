package unidade4.Exercicios_And_Or;

import java.util.Scanner;

public class exercicio06 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe uma letra: ");
        String letraDigitada = s.nextLine();

        if (letraDigitada.equalsIgnoreCase("m")) {
            System.out.println("Masculino");
        } else if (letraDigitada.equalsIgnoreCase("f")) {
            System.out.println("Feminino");
        } else if (letraDigitada.equalsIgnoreCase("i")) {
            System.out.println("Não informado!");
        } else {
            System.out.println("Entrada incorreta!");
        }
    }
}
