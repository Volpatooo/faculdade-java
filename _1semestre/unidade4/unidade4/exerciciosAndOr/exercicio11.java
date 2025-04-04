package unidade4.exerciciosAndOr;

import java.util.Scanner;

public class exercicio11 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Informe o nascimento de um filho: ");
        int nascimentoPrimeiroFilho = s.nextInt();

        System.out.println("Informe o nascimento de outro filho: ");
        int nascimentoSegundoFilho = s.nextInt();

        s.close();

        System.out.println("Informe o nascimento de outro filho: ");
        int nascimentoTerceiroFilho = s.nextInt();

        if (nascimentoPrimeiroFilho == nascimentoSegundoFilho && nascimentoPrimeiroFilho == nascimentoTerceiroFilho){
            System.out.println("TRIGÊMEOS");
        } else if (nascimentoPrimeiroFilho == nascimentoSegundoFilho && nascimentoPrimeiroFilho != nascimentoTerceiroFilho
                || nascimentoPrimeiroFilho == nascimentoTerceiroFilho && nascimentoPrimeiroFilho != nascimentoSegundoFilho
                || nascimentoSegundoFilho == nascimentoTerceiroFilho && nascimentoSegundoFilho != nascimentoPrimeiroFilho){
            System.out.println("GÊMEOS");
        } else {
            System.out.println("IRMÃOS");
        }
    }
}
