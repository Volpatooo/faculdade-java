package unidade4.exerciciosAndOr;

import java.util.Scanner;

public class exercicio18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Qual o dia do vencimento: ");
        int diaVencimento = s.nextInt();

        System.out.println("Qual o dia do pagamento: ");
        int diaPagamento = s.nextInt();

        System.out.println("Qual o valor da parcela: ");
        int valorParcela = s.nextInt();

        s.close();

        if (diaPagamento <= diaVencimento) {
            double valorDesconto = valorParcela * 0.1; 
            double valorFinal = valorParcela - valorDesconto;
            System.out.println("O pagamento esta em dia. O valor da prestação = R$ " + valorFinal);
        } else if (diaPagamento <= diaVencimento + 5){
            System.out.println("Sem desconto R$ " + valorParcela);
        } else {
            int diasAtraso = diaPagamento - diaVencimento - 5;
            double multaDia = valorParcela * 0.02;
            double multaTotal = multaDia * diasAtraso;
            double valorFinalComJuros = valorParcela + multaTotal;
            System.out.println("O pagamento esta atrasado. Multa de 2% por dia de atraso. Valor da prestação = R$ " + valorFinalComJuros);
        }
    }
}
