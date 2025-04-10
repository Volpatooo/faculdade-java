package unidade5.forloop.ExerciciosForRefeitos;

public class For4 {
    public static void main(String[] args) {
        double soma = 0.0;
        for (int i = 3, j = 1; i <= 20 && j <= 20; i += 2, j++) {
            double denominadorPar = j * j + j; // j vai de 1 ate 20; então j sendo 1 ====== 1 * 1 + 1 = 2; j sendo 2 ======= 2 * 2 + 2 = 6; assim por diante
            soma += i / denominadorPar;
        }
        System.out.println(soma);
    }
}
