package unidade4.Exercicios_Switch;

import java.util.Scanner;

public class exercicio25 {
    public static void main(String[] args) {
        int a, b, operacaoEscolhida;

        Scanner s = new Scanner(System.in);

        System.out.println("Informe um valor:");
        a = s.nextInt();

        System.out.println("Informe outro valor:");
        b = s.nextInt();

        System.out.println("Escolha uma operação:");
        operacaoEscolhida = s.nextInt();

        switch (operacaoEscolhida) {
            case 1:
                int soma = a + b;
                System.out.println(soma);
                break;
            case 2:
                int subtracao = a - b;
                System.out.println(subtracao);
                break;
            case 3:
                int produto = a * b;
                System.out.println(produto);
                break;
            case 4:
                if (b != 0) {
                float divisao = a / b;
                System.out.println(divisao);
                } else {
                    System.out.println("Não é possível dividr por 0!");
                }
                break;
            default:
                System.out.println("Nenhuma operação foi validada!");
                break;
        }
    }
}
