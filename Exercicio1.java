import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
         Scanner tec = new Scanner(System.in);
         System.out.println("Digite a altura do terreno: ");
         double altura = tec.nextDouble();
         System.out.println("Digite a largura do terreno: ");
         double largura = tec.nextDouble();
         double area = altura * largura;
         System.out.println("A  área total do terreno é de " + area); 
 

     }
}
