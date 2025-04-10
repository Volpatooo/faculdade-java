package unidade5.forloop.ExerciciosForRefeitos;

public class For3 {
    public static void main(String[] args) {
        final double denominador = 1.0; // denominador 1.0 double pois em java se dividimos 1 / 2, o java entende que 1 e int entao ele corta a parte decimal e fica so 0
        double resultado = 0;

        for (int i = 1; i <=100; i++) {
            resultado += denominador / i;
        }
        System.out.println(resultado);
    }
}
