package provas.prova1;

import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o nome do médico: ");
        String nomeMedico = s.nextLine();

        System.out.println("Informe a especialidade do médico: ");
        String especialidadeMedico = s.nextLine();

        if (nomeMedico.equals("") && especialidadeMedico.equals("")) {
            System.out.println("Não é possível informar os dados");
            System.out.println("Vazio");
            System.out.println("Fim");
        } else {
            System.out.println("Médico: " + nomeMedico);
            if (especialidadeMedico.equals("")) {
                System.out.println("Especialidade vazio");
                System.out.println("Fim");
            } else {
                System.out.println("Especialidade: " + especialidadeMedico);
                System.out.println("Fim");
            }
        }
    }
}
