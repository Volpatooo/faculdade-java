package provas.Prova2;

import java.util.Scanner;

public class QuestaoPratica {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int contProdutos = 0;
        int volumeAtual=  0;
        int pesoMaximo;

        System.out.println("Informe a capacidade do armário: (volume)");
        int capacidade = s.nextInt();
        s.nextLine();

        String[] armario = new String[capacidade];
        int[] volume = new int[capacidade];

        int escolhaUsuario;
        do {
            System.out.println("1- Inserir um produto");
            System.out.println("2- Imprimir produtos armazenados");
            System.out.println("3- Produto mais volumoso");
            System.out.println("4- Ordenar produtos (por volume)");
            System.out.println("5- Excluir um produto");
            System.out.println("6- Sair do menu.");
            escolhaUsuario = s.nextInt();
            s.nextLine();

            switch (escolhaUsuario) {
                case 1:
                    if (contProdutos < armario.length) {
                        System.out.println("Nome do produto: ");
                        String nomeProduto = s.nextLine();
                        System.out.println("Volume do produto: ");
                        int volumeProduto = s.nextInt();
                        s.nextLine();

                        if (volumeAtual + volumeProduto <= armario.length) {
                            armario[contProdutos] = nomeProduto;
                            volume[contProdutos] = volumeProduto;
                            volumeAtual+= volumeProduto;
                            contProdutos++;
                            System.out.println("Produto adicionado com sucesso!");
                        } else {
                            System.out.println("Armário está cheio!");
                        }
                    } else {
                        System.out.println("Armário cheio!");
                    }
                    break;
                case 2:
                    if (contProdutos == 0) {
                        System.out.println("Armário vazio!");
                    } else {
                        System.out.println("Impressão dos produtos (em ordem inversa: )");
                        for (int i = contProdutos - 1; i >= 0; i--) {
                            System.out.println("Produto: " + armario[i] + " - " + " Volume: " + volume[i]);
                        }
                    }
                    break;
                case 3:
                    int maiorVolume = volume[0];
                    String produtoMaisPesado = armario[0];
                    for (int i = 1; i < contProdutos; i++) {
                        if (volume[i] > maiorVolume) {
                            maiorVolume = volume[i];
                            produtoMaisPesado = armario[i];
                        }
                        System.out.println("Item mais pesado --> " + produtoMaisPesado + " Volume: " + maiorVolume);
                    }
                    break;
                case 4:
                    if (contProdutos == 0) {
                        System.out.println("Armário vazio!");
                    } else {
                        int metodo = 0;
                        int indice = 0;
                        while (indice < volume.length - 1) {
                            if (volume[indice] > volume[indice + 1]) {
                                metodo = volume[indice];
                                volume[indice] = volume[indice + 1];
                                volume[indice + 1] = metodo;
                                indice = 0;
                            } else {
                                indice++;
                            }
                        }
                        System.out.println("Vetor ordenado (Maior volume para menor volume)");
                        for (int i = 0; i < volume.length; i++) {
                            System.out.println("Produto: " + armario[i] + " " + volume[i]);
                        }
                    }
                    break;
                case 5:
                    if (contProdutos == 0) {
                        System.out.println("Não há produtos para remover!");
                    } else {
                        System.out.println("Nome do produto (para exclusão): ");
                        String nomeProduto = s.nextLine();

                        for (int i = 0; i < contProdutos; i++) {
                            if (armario[i].equalsIgnoreCase(nomeProduto)) {
                                volumeAtual -= volume[i];
                                for (int j = 1; j < contProdutos - 1; j++) {
                                    armario[j] = armario[j + 1];
                                    volume[j] = volume[j + 1];
                                }
                                armario[contProdutos - 1] = null;
                                volume[contProdutos - 1] = 0;
                                contProdutos--;
                                System.out.println("Produto excluído!");
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.println("Saindo do armário.");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (escolhaUsuario != 6);
        s.close();
    }
}
