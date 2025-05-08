package unidade6.introducao.exerciciosVetores;

public class Exericicio2 {
    public static void main(String[] args) {
        double[] reais = new double[12];

        for (int idx = 0; idx < reais.length; idx++) {
            reais[idx] = idx + 1; 
        }

        double soma = 0;
        for (int i = 0; i < reais.length; i++) {
            soma += reais[i];
        }
        double media = soma / reais.length;

        System.out.println("Valores maiores que a média: ");
        for (int i = 0; i < reais.length; i++) {
            if (reais[i] > media) {
                System.out.println("Posição [" + i + "] = " + reais[i]);
            }
        }
    }
}
