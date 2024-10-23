package Lists;

import Modelo.*;
import java.util.ArrayList;
import Biblioteca.*;

public class Pilha {
    public static void main(String[] args) {
        ArrayList<Cachorro> pilha = new ArrayList<Cachorro>();

        while (Receba.Has()) {

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
                case 4:
                    vazia(pilha);
                    break;
                case 5:
                    tamanho(pilha);
                    break;
                case 6:
                    imprimirPilha(pilha);
                    break;
                case 7:
                    transformarString(pilha);
                    break;
            }
        }
    }

    private static void transformarString(ArrayList<Cachorro> pilha) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'transformarString'");
    }

    private static void imprimirPilha(ArrayList<Cachorro> pilha) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'imprimirPilha'");
    }

    private static void tamanho(ArrayList<Cachorro> pilha) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'tamanho'");
    }

    private static void vazia(ArrayList<Cachorro> pilha) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'vazia'");
    }

    private static void retornarUltimo(ArrayList<Cachorro> pilha) {
        
    }

    private static void desempilhar(ArrayList<Cachorro> pilha) {

        //if (pilha.isEmpty()) {
        //    System.out.println("Você não tem pets na lista.");
        //    break;
        //}

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


            dog.receberCachorro();
            pilha.add(pilha.size(), dog);

        }

        System.out.println();
    }
}
