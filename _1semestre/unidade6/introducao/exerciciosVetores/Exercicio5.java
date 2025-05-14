package unidade6.introducao.exerciciosVetores;

import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String[] perguntas = {
            "Gosta de música sertaneja?",
            "Gosta de futebol?",
            "Gosta de seriados?",
            "Gosta de redes sociais?",
            "Gosta da Oktoberfest?"
        };

        System.out.println("Questionário homem...");
        String[] respostasHomem = new String[5];
        for (int i =0; i < respostasHomem.length; i++) {
            System.out.println(perguntas[i]);
            respostasHomem[i] = s.nextLine().toUpperCase();
        }

        System.out.println("");

        System.out.println("Questionário mulher...");
        String[] respostasMulher = new String[5];
        for (int i = 0; i < respostasMulher.length; i++) {
            System.out.println(perguntas[i]);
            respostasMulher[i] = s.nextLine().toUpperCase();
        }

        int afinidade = 0;

        for (int i = 0; i < perguntas.length; i++) {
            String respHomem = respostasHomem[i];
            String respMulher = respostasMulher[i];

            if (respHomem.equals(respMulher)) {
                afinidade += 3;
            } else if (respHomem.equals("Ind") || respMulher.equals("Ind")) {
                afinidade += 1;
            } else {
                afinidade -= 2;
            }
        }

        System.out.println("Índice de afinidade: " + afinidade);

        if (afinidade == 15) {
            System.out.println("Casem!");
        } else if (afinidade >= 10 && afinidade <= 14) {
            System.out.println("Vocês têm muita coisa em comum!");
        } else if (afinidade >= 5 && afinidade <= 9) {
            System.out.println("Talvez não dê certo :(");
        } else if (afinidade >= 0 && afinidade <= 4) {
            System.out.println("Vale um encontro.");
        } else if (afinidade >= -9 && afinidade <= -1) {
            System.out.println("Melhor não perder tempo");
        } else if (afinidade == -10) {
            System.out.println("Vocês se odeiam!");
        }

        s.close();


    }
}
