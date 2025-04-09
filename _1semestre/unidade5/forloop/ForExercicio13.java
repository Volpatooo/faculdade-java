package unidade5.forloop;

import java.util.Scanner;

public class ForExercicio13 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int qndReabastecimento;
        float kmTotaisPercorridos = 0;
        float litrosTotaisAbastecidos = 0;

        System.out.println("Quantas vezes abasteceu: ");
        qndReabastecimento = s.nextInt();

        for (int i = 1; i <= qndReabastecimento; i++) {
            System.out.println("Quantos litros foram colocados: ");
            float litrosColocados = s.nextFloat();
            System.out.println("Quantos km foram rodados: ");
            float kmRodados = s.nextFloat();

            float kmPorLitro = kmRodados / litrosColocados;
            System.out.println("Você percorreu " + kmPorLitro + " por litro.");

            kmTotaisPercorridos += kmRodados;
            litrosTotaisAbastecidos += litrosColocados;
        }

        float mediaTotalViagem = kmTotaisPercorridos / litrosTotaisAbastecidos;
        System.out.println("A km média por litro na viagem toda foi de: " + mediaTotalViagem);
    }
}
