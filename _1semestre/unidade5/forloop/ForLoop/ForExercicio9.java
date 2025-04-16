//Uma turma tem n alunos. Dado n, o nome e idade de cada aluno descreva um algoritmo que:
//escreva os nomes dos alunos que tem 18 anos;
//escreva a quantidade de alunos que tem idade acima de 20 anos.
// Sempre se depois do nextInt ou nextDouble vir um dado que necessite de nextLine acrescentar um nextLine depois do nextInt ou Double pois senão o caractere da nova linha fica preso 

package unidade5.forloop.ForLoop;

import java.util.Scanner;

public class ForExercicio9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int contador20anos = 0;

        System.out.println("Informe o número de alunos (n): ");
        int n = s.nextInt();
        s.nextLine(); 

        for (int i = 1; i <= n; i++) {
            System.out.println("Informe o nome do aluno: ");
            String nomeAluno = s.nextLine();

            System.out.println("Informe a idade do aluno: ");
            int idadeAluno = s.nextInt();
            s.nextLine();

            if (idadeAluno == 18) {
                System.out.println("Aluno: " + nomeAluno);
            } else if (idadeAluno > 20) {
                contador20anos += 1; // se a idade for maisor que 20 acrescenta 1 cada vez que for maior
            }
        }
        System.out.println("Existem: " + contador20anos + " alunos com mais de 20 anos");
        s.close();
    }
}
