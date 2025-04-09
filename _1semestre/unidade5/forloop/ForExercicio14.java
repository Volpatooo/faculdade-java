package unidade5.forloop;

import java.util.Scanner;

public class ForExercicio14 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String nomeMercadoria = "";
        int contadorMercadorias10 = 0, contadorMercadorias10E20 = 0, contadorMercadorias20 = 0;
        float precoCompra = 0, precoVenda = 0, compraTotal = 0, vendaTotal = 0, lucroPorMercadoria = 0, lucroTotalFinal = 0;

        for (int i = 1; i <= 2; i++) {
            s.nextLine();

            System.out.println("Nome da Mercadoria: ");
            nomeMercadoria = s.nextLine();
            System.out.println("Preço de compra: ");
            precoCompra = s.nextFloat();
            System.out.println("Preço de venda: ");
            precoVenda = s.nextFloat();

            lucroPorMercadoria = (precoVenda - precoCompra) / precoCompra * 100;

            if (lucroPorMercadoria < 10) {
                contadorMercadorias10 += 1;
            } else if (lucroPorMercadoria >= 10 && lucroPorMercadoria <= 20) {
                contadorMercadorias10E20 += 1;
            } else if (lucroPorMercadoria > 20) {
                contadorMercadorias20 += 1;
            }

            compraTotal += precoCompra;
            vendaTotal += precoVenda;
            lucroTotalFinal += precoVenda - precoCompra;  
        }
        System.out.println("Quantidade de mercadorias com menos de 10% de lucro: " + contadorMercadorias10);
        System.out.println("Quantidade de mercadorias entre 10% e 20% de lucro: " + contadorMercadorias10E20);
        System.out.println("Quantidade de mercadorias com mais de 20% de lucro: " + contadorMercadorias20);
        System.out.println("Valor total de compra: " + compraTotal);
        System.out.println("Valor total de venda: " + vendaTotal);
        System.out.println("Lucro total somado: " + lucroTotalFinal);
    }
}
