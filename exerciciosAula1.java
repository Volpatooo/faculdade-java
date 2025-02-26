import java.util.Scanner;

public class exerciciosAula1 {
        public static void main(String[] args) {
       /*  Scanner tec = new Scanner(System.in);
        System.out.println("Digite a altura do terreno: ");
        double altura = tec.nextDouble();
        System.out.println("Digite a largura do terreno: ");
        double largura = tec.nextDouble();
        double area = altura * largura;
        System.out.println("A  área total do terreno é de " + area); */

        // descontoLoja();
       // gasolinaTotal();
      // mediaPonderada();
      totalGranja();
    } 

    static void descontoLoja() {
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite o valor do produto: ");
        double valorProduto = tec.nextDouble();
        double desconto = valorProduto * 0.12;
        System.out.println("O valor do desconto é de R$ " + desconto);
        double valorFinal = valorProduto - desconto;
        System.out.println("O valor do produto com desconto é de " + valorFinal);
    }

    static void gasolinaTotal() {
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe o preço da gasolina: ");
        double precoGasolina = tec.nextDouble();
        System.out.println("Informe o total do pagamento: ");
        double valorPagamento = tec.nextDouble();
        double quantidadeLitros = valorPagamento / precoGasolina;
        System.out.println("A quantidade de litros colocada foi de: " + quantidadeLitros + " litros.");
    }

    static void mediaPonderada() {
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe a Primeira nota: ");
        double nota1 = tec.nextDouble();
        System.out.println("Informe a seguna nota: ");
        double nota2 = tec.nextDouble();
        System.out.println("Informe a terceira nota: ");
        double nota3 = tec.nextDouble();
        double media = ((nota1 * 5) + (nota2 * 3) + (nota3 * 2)) / (5 + 3 + 2);
        System.out.println("A média ponderada é de: " + media);
    }

    static void totalGranja() {
        Scanner tec = new Scanner(System.in);
        System.out.println("Informe o total de galinhas na granja: ");
        int totalGalinhas = tec.nextInt();
        int valorTotal = totalGalinhas * 11;
        System.out.println("O gasto total na granja é de: R$ " + valorTotal + ",00");
    }

    
}
