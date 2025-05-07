package unidade6.introducao.introducaoVetores;

public class IntroducaoVetor4 {
    public static void main(String[] args) {
        String[] nomes = new String[3];

        nomes[0] = "Mateus Volpato";
        nomes[1] = "Guilherme Volpato";
        nomes[2] = "Getrudes Volpato";
        for (String nome : nomes) {
            System.out.println("Nome: " + nome);
        }

        System.out.println("_______________________");

        String[] nomes2 = new String[nomes.length + 2]; // cria um novo array e add mais 2 elementos ao vetor antigo nomes

        for (int i = 0; i < nomes.length; i++) {
            nomes2[i] = nomes[i];
        }

        nomes = nomes2;

        nomes[3] = "Alexandre Kewitz";
        nomes[4] = "Manuela Schuelter";

        for ( String nome : nomes) {
            System.out.println("Nomes: " + nome);
        }
    }

}
