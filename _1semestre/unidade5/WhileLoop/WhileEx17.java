package unidade5.WhileLoop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class WhileEx17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        DecimalFormat df = new DecimalFormat("0.00");

        double alturaAtleta = -1, maiorAltura = 0, menorAltura = Double.MAX_VALUE, mediaAlturas = 0, somadorAlturas = 0, contadorAlturas = 0;
        int numeroInscrcao = 0;
        int inscriçãoMenor = 0, inscriçãoMaior = 0;

        System.out.println("Número de inscrição, (0) para encerrar: ");
        numeroInscrcao = s.nextInt();

        while (numeroInscrcao != 0) {
            System.out.println("Altura do atleta: ");
            alturaAtleta = s.nextDouble();

            if (alturaAtleta > maiorAltura) {
                maiorAltura = alturaAtleta;
                inscriçãoMaior = numeroInscrcao;
            }

            if (alturaAtleta < menorAltura) {
                menorAltura = alturaAtleta;
                inscriçãoMenor = numeroInscrcao;
            }

            somadorAlturas += alturaAtleta;
            contadorAlturas++;

            System.out.println("Número de inscrição, (0) para encerrar: ");
            numeroInscrcao = s.nextInt();
        }

        mediaAlturas = somadorAlturas / contadorAlturas;

        System.out.println("Menor altura: " + menorAltura + " número inscrição: " + inscriçãoMenor);
        System.out.println("Maior altura: " + maiorAltura + " número inscrição: " + inscriçãoMaior);
        System.out.println("Médias das alturas: " + df.format(mediaAlturas));
    }
}
