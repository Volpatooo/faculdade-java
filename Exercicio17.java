import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Informe um número");
        int respostaUsuario = s.nextInt();
        int antecessor = respostaUsuario - 1;
        int sucessor = respostaUsuario + 1;
        System.out.println("O número " + respostaUsuario + " tem como antecessor " + antecessor + " e tem como sucessor " + sucessor + ".");
    }
}
