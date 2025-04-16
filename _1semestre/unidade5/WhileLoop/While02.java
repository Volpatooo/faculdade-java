package unidade5.WhileLoop;

import java.util.Scanner;

public class While02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe um texto para ser convertido para maiúsculo: ");
        String texto = s.nextLine();

        while (texto.length() != 0 && !texto.isBlank()) {
            System.out.println("Texto convertido: " + texto.toUpperCase());

            System.out.println("Informe um texto para ser convertido para maiúsculo: ");
            texto = s.nextLine(); // Precisamos colocar de novo estas duas linhas pois senão não vai cair em loop
        }
        s.close();
    }
}
