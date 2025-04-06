// duas variaveis no mesmo loop primeiro declara cadauma depois o limite de cada e depois como é o incremento de cada uma por exemplo i += 2 siginifica que os valores de i serao incrementados pulando de 2 em 2 começa em 3 depois pula pra 5 7 9 11...

package unidade5.forloop;

public class ForExercicio4 {
    public static void main(String[] args) {
        double soma = 0.0;
        for (int i = 3, j = 2; i <= 21 && j <= 20; i += 2, j++) { 
            double denominadorPar = j * j + j;
            soma += i / denominadorPar;
        }

        System.out.println("A soma final é de: " + soma);
    }
}
