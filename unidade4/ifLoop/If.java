package unidade4.ifLoop;

import java.util.Scanner;

public class If {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        int idadeUsuario = s.nextInt();
        if (idadeUsuario >= 18) {
            System.out.println("Já pode dirigir!");
        } else {
            System.out.println("AInda falta um pouco, desculpe!");
        }
    }

    public static void if2() {
        Scanner s = new Scanner(System.in);
        System.out.println("Está chovendo ou não?");
    }

}
