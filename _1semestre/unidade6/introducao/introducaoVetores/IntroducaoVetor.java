package unidade6.introducao.introducaoVetores;

public class IntroducaoVetor {
    public static void main(String[] args) {
        // Vetores são tipos estruturados de dados que suportam dados do mesmo tipo vetor de int so aceita números int etc...
        // Todo vetor começa em 0
        // O índice define a posição do elemento no vetor
        int vetorInteiros[] = new int[10];
        vetorInteiros[0] = 11;

        int valores[] = new int[15];
        for (int i = 0; i < 15; i++) {
            valores[i] = i;
            System.out.println(i);
        }
        
    }
}
