import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // Call das funções aqui
        // usoDoIf();
    }

    public static void usoDoIf() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu nome");
        String nomeUsuario = scanner.nextLine();
        if (nomeUsuario.equalsIgnoreCase("Mateus")) {
            System.out.println("Acesso Concedido!");
        } else {
            System.out.println("Acesso negado!");
        }
        scanner.close();
    }

    public static void calculadora() {
        
    }
    
}






