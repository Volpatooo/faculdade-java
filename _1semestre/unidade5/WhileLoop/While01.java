package unidade5.WhileLoop;

public class While01 {
    public static void main(String[] args) {
        int vezes = 1;
        int soma = 0;

        while (vezes <= 5) {
            soma += vezes;
            vezes++;
        }
    System.out.println(soma); // = a 15 pois 1 + 2 + 3 + 4 + 5 = 15
    }
}
