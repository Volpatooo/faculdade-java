import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Pessoa[] pessoas = new Pessoa[3];

        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i] = new Pessoa();

            System.out.println("Nome: ");
            pessoas[i].setNome(s.nextLine());

            System.out.println("Altura (em metros): ");
            pessoas[i].setaltura(s.nextDouble());

            System.out.println("Peso (em KG): ");
            pessoas[i].setPeso(s.nextDouble());

            s.nextLine();
        }

        System.out.println("\n--- Dados na ordem inversa ---");
        for (int i = pessoas.length - 1; i >= 0; i--) {
            System.out.printf(
                "Nome: %s | Altura: %.2f | Peso: %.2f | IMC: %.2f%n",
                pessoas[i].getNome(),
                pessoas[i].getAltura(),
                pessoas[i].getPeso(),
                pessoas[i].calcularImc()
            );
        }

        s.close();
    }
}

