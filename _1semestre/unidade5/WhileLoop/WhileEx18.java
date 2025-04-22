package unidade5.WhileLoop;

import java.util.Scanner;

public class WhileEx18 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int canal = 0;
        int contCanal4 = 0, contCanal5 = 0, contCanal9 = 0, contCanal12 = 0;
        int totalPessoas = 0; 

        System.out.println("Informe o canal: ");
        canal = s.nextInt();

        while (canal != 0) {
            if (canal == 4) {
                contCanal4++;
                totalPessoas++;
            } else if (canal == 5) {
                contCanal5++;
                totalPessoas++;
            } else if (canal == 9) {
                contCanal9++;
                totalPessoas++;
            } else if (canal == 12) {
                contCanal12++;
                totalPessoas++;
            } else {
                System.out.println("Canal inesistente!");
            }

            System.out.println("Informe o canal: ");
            canal = s.nextInt();
        }

        System.out.println("Canal: ");
        System.out.println("4: " + contCanal4 + " pessoas assistindo.");
        System.out.println("5: " + contCanal5 + " pessoas assistindo.");
        System.out.println("9: " + contCanal9 + " pessoas assistindo.");
        System.out.println("12: " + contCanal12 + " pessoas assistindo.");

        double percCanal4 = (contCanal4 * 100.0) / totalPessoas;
        double percCanal5 = (contCanal5 * 100.0) / totalPessoas;
        double percCanal9 = (contCanal9 * 100.0) / totalPessoas;
        double percCanal12 = (contCanal12 * 100.0) / totalPessoas;

        System.out.println("Percentual de audiência do canal 4: " + percCanal4 + "%");
        System.out.println("Percentual de audiência do canal 5: " + percCanal5 + "%");
        System.out.println("Percentual de audiência do canal 9: " + percCanal9 + "%");
        System.out.println("Percentual de audiência do canal 12: " + percCanal12 + "%");
    }
}
