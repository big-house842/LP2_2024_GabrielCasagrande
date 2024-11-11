package Lists;

import Modelo.*;
import java.util.ArrayList;
import Biblioteca.*;

public class Pilha {
    public static void main(String[] args) {
        ArrayList<Cachorro> pilha = new ArrayList<Cachorro>();

        while (true) {

            System.out.println("=============================================");
            System.out.println("           MENU DE INTERAÇÃO                ");
            System.out.println("=============================================");
            System.out.println("    0 - Sair da interação                    ");
            System.out.println("    1 - Adicionar na pilha");
            System.out.println("    2 - Tirar da pilha");
            System.out.println("    3 - Retornar o último valor");
            System.out.println("    4 - Retornar se a lista está vazia");
            System.out.println("    5 - Mostrar o tamanho da lista");
            System.out.println("    6 - Mostrar os itens da pilha");
            System.out.println("    7 - Imprimir a pilha em formato String");
            System.out.println("=============================================");
            System.out.print("Escolha uma opção: ");
            System.out.println();
            int menu = Receba.LerNumero();

            if (menu == 0) {
                break;
            }

            switch (menu) {

                case 1:// Adiciona na pilha
                    empilhar(pilha);
                    break;
                case 2:// Tira da pilha
                    desempilhar(pilha);
                    break;
                case 3:// Retorna o último valor
                    retornarUltimo(pilha);
                    break;
                case 4:// retorna se a lista está vazia
                    vazia(pilha);
                    break;
                case 5:// Mostra o tamanho da lista
                    tamanho(pilha);
                    break;
                case 6:// Mostra os itens da pilha
                    imprimirPilha(pilha);
                    break;
                case 7:// Imprime a pilha em formato String
                    transformarString(pilha);
                    break;
            }
        }
    }

    private static void transformarString(ArrayList<Cachorro> pilha) {

        System.out.println("Esta é a pilha em formato String:");
        System.out.println();
        System.out.println(pilha.toString());

    }

    private static void imprimirPilha(ArrayList<Cachorro> pilha) {

        System.out.println("A pilha é esta: ");
        System.out.println();
        for (int i = 0; i < pilha.size(); i++) {
            pilha.get(i).imprimirCachorro();
        }
        
    }

    private static void tamanho(ArrayList<Cachorro> pilha) {

        System.out.println(" O tamanho da pilha é: " +  pilha.size());

    }

    private static void vazia(ArrayList<Cachorro> pilha) {

        if (pilha.isEmpty()) {
            System.out.println("Você não tem pets na lista.");
        }

    }

    private static void retornarUltimo(ArrayList<Cachorro> pilha) {

        if (pilha.isEmpty()) {
            System.out.println("Você não tem pets na lista.");
        } else {
            System.out.println("Este é o último cachorro da pilha: ");
            pilha.get(pilha.size()).imprimirCachorro();
        }

    }

    private static void desempilhar(ArrayList<Cachorro> pilha) {

        if (pilha.isEmpty()) {
            System.out.println("Você não tem pets na lista.");
        } else {

            System.out.println("Quantos atributos de um cachorro você quer remover? ");
            int numRemovidos = Receba.LerNumero();
            System.out.println();

            for (int i = 0; i < numRemovidos; i++) {

                if (i >= 1) {
                    System.out.println("Agora do outro cachorro ");
                    System.out.println();
                }
                System.out.println("Qual a ordem do cachorro que você quer remover o atributo? (Ex: 1,2,3...)");
                int posicao = Receba.LerNumero();
                System.out.println();

                System.out.println("O que você quer remover do " + posicao + "° cachorro: ");
                String removido = Receba.LerString();
                System.out.println();

                posicao -= 1;

                if (removido.equals("nome")) {

                    pilha.get(posicao).RemoverNome();

                } else if (removido.equals("idade")) {

                    pilha.get(posicao).RemoverIdade();

                } else if (removido.equals("apelido")) {

                    pilha.get(posicao).RemoverApelido();

                } else if (removido.equals("raça favorita")) {

                    pilha.get(posicao).RemoverRaçaFavorita();

                }

            }
        }

    }

    private static void empilhar(ArrayList<Cachorro> pilha) {
        System.out.println("Digite quantos pets você ainda quer adicionar: ");

        int x = Receba.LerNumero();
        System.out.println();

        for (int i = 0; i < x; i++) {

            Cachorro dog = new Cachorro();
            if (x == 1) {
                System.out.println(
                        "Escreva o nome, idade, apelido, a raça favorita de doguinhos, e a nota de educação dele: ");
            } else {
                System.out.println(
                        "Escreva os nomes, idades, apelidos, a raça favorita de doguinhos, e a nota de educação dele: ");
            }

            dog.ReceberCachorro();
            pilha.add(pilha.size(), dog);

        }

        System.out.println();
    }
}
