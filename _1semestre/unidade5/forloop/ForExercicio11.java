// Uma máquina de biscoito está com problemas. Quando ligada, após 1 hora ela quebra 1 biscoito, na segunda hora ela quebra 3 biscoitos, na hora seguinte ela quebra 3 vezes a quantidade de biscoitos quebrados na hora anterior, e assim por diante. Faça um algoritmo que calcule quantos biscoitos são quebrados no final de cada dia (a máquina opera 16 horas por dia).
// elevamos 3 a cada hora comecando na hora 0 ate 15 totalizando 16 e acumulamos o resultado na variavel biscoitosTotais

package unidade5.forloop;

public class ForExercicio11 {
    public static void main(String[] args) {
        int biscoitosTototais = 0;

        for (int i = 0; i < 16; i++) {
            biscoitosTototais += (int) Math.pow(3, i); 
        }
        System.out.println("O total de biscoitos produzidos em 16 horas foi: " + biscoitosTototais);
    }
}  