package unidade3;
import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("Qual o valor do cateto oposto: ");
        double catetoOposto = tec.nextDouble();
        System.out.println("Qual o valor do cateto adjacente: ");
        double catetoAdjacente = tec.nextDouble();   
        double somaCatetos = (catetoOposto * catetoOposto) + (catetoAdjacente * catetoAdjacente);
        double hipotenusa = Math.sqrt(somaCatetos);
        System.out.println("A hipotenusa deste triangulo e: " + hipotenusa);
        tec.close();
    }
}
