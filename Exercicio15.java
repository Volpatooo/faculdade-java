import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Digite um numero (Apenas 3 digitos): ");
        int numero = tec.nextInt();
        int centena = numero / 100; // arredonda o resultado para centena
        int dezena = (numero % 100) / 10; // % obtem o resto da divisao do numero por 100
        int unidade = numero % 10;
        System.out.println(centena + " centena(s) "+ dezena + " dezena(s) " + unidade + " unidade(s)");

    }
}
