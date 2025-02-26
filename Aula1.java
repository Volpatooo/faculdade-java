import java.util.Scanner;

public class Aula1 {
    public static void main(String[] args) {
        // final String nome = "Mateus Volpato"; // Quando se tem final na frente de uma variável ela vira uma constante ou seja seu valor nunca mudará.
        // System.out.println(nome);
        // byte, short, int, long tipagem para dados númericos inteiros
        // float, double tipagem para dados númericos reais
        // char para núemros e string ao mesmo tempo
        // string para apenas texto
        // boolean armazena true or false

      /* byte idadeMedia = 10;
        short salarioMinimo = 1500;
        long idadeMumia = 1234543;
        int divisao = 10 / 3;
        System.out.println(10 % 3); // % mostra o resto de uma divisão não exata */ 
        
        
       /*  Scanner teclado = new Scanner (System.in); // permite o usuario interagir 
        System.out.println("Digite o comprimento: ");
        double comprimento = teclado.nextDouble(); // usuario vai digitar o comprimento
        System.out.println("Digite a largura: ");
        double largura = teclado.nextDouble(); // usuario vai digitar a largura
        double area = largura * comprimento; // area será calculada
        System.out.println("Área=" + area); // concatenação para aparecer a area 
        teclado.close(); // necessário para não ficar com espaço na memória */


        Scanner tec = new Scanner(System.in);
        System.out.println("Digite seu Nome: ");
        String nome = tec.nextLine();
        System.out.println("Digite seu Sobrenome: ");
        String sobrenome = tec.nextLine();
        System.out.println("Digite sua Idade: ");
        short idade = tec.nextShort();
        System.out.println("Bem-Vindo " + nome + " " + sobrenome + " voçê tem " + idade + " anos!"); 
    }
}