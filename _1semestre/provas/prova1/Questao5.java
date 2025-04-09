package provas.prova1;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);

        System.out.println("Temperatura ano 1: ");
        float temperaturaPrimeiroAno = s.nextFloat();

        System.out.println("Temperatura ano 2: ");
        float temperaturaSegundoAno = s.nextFloat();

        System.out.println("Temperatura ano 3: ");
        float temperaturaTerceiroAno = s.nextFloat();
        
        System.out.println("Escolha uma opção do menu: ");
        System.out.println("a) Maior temperatura registrada");
        System.out.println("b) Menor temperatura registrada");
        System.out.println("c) Valores ordenados em ordem crescente");
        System.out.println("d) Média das temperaturas");
        String escolhaUsuario = s.next();

        switch (escolhaUsuario) {
            case "a":
                float maiorTemperatura = Math.max(temperaturaPrimeiroAno, Math.max(temperaturaSegundoAno, temperaturaTerceiroAno));
                System.out.println(maiorTemperatura + " C");
                break;
            case "b":
                float menorTemperatura = Math.min(temperaturaPrimeiroAno, Math.min(temperaturaSegundoAno, temperaturaTerceiroAno));
                System.out.println(menorTemperatura + " C");
                break;
            case "c":
                float minimo = 0, meio = 0, maximo = 0;
                if (temperaturaPrimeiroAno > temperaturaSegundoAno && temperaturaPrimeiroAno > temperaturaTerceiroAno) {
                    maximo = temperaturaPrimeiroAno;
                    if (temperaturaSegundoAno > temperaturaTerceiroAno) {
                        meio = temperaturaSegundoAno;
                        minimo = temperaturaTerceiroAno;
                    } else {
                        meio = temperaturaTerceiroAno;
                        minimo = temperaturaSegundoAno;
                    }
                }

                if (temperaturaSegundoAno > temperaturaPrimeiroAno && temperaturaSegundoAno > temperaturaTerceiroAno) {
                    maximo = temperaturaSegundoAno;
                    if (temperaturaPrimeiroAno > temperaturaTerceiroAno) {
                        meio = temperaturaPrimeiroAno;
                        minimo = temperaturaTerceiroAno;
                    } else {
                        meio = temperaturaTerceiroAno;
                        minimo = temperaturaPrimeiroAno;
                    }
                }

                if (temperaturaTerceiroAno > temperaturaPrimeiroAno && temperaturaTerceiroAno > temperaturaSegundoAno) {
                    maximo = temperaturaTerceiroAno;
                    if (temperaturaPrimeiroAno > temperaturaSegundoAno) {
                        meio = temperaturaPrimeiroAno;
                        minimo = temperaturaSegundoAno;
                    } else {
                        meio = temperaturaSegundoAno;
                        minimo = temperaturaPrimeiroAno;
                    }
                    }
                System.out.println("Mínimo: " + minimo + " Meio: " + meio + " Máximo: " + maximo);
                break;
            case "d":
                float mediaTemperaturas = (temperaturaPrimeiroAno + temperaturaSegundoAno + temperaturaTerceiroAno) / 3;
                System.out.println("A média das temperaturas é de: " + mediaTemperaturas + " C");
                break;
            default:
                System.out.println("Entrada Incorreta!");
                break;
        }
        s.close();
    }
}
