package Lists;

import java.util.ArrayList;

import Biblioteca.*;
import Modelo.Cachorro;

public class ListaCachorros {

    public static void Lista() {
        ArrayList<Cachorro> listaCachorros = new ArrayList<Cachorro>();

        while (Receba.Has()) {

            System.out.println("=============================================");
            System.out.println("           MENU DE INTERAÇÃO                ");
            System.out.println("=============================================");
            System.out.println("    0 - Sair da interação                    ");
            System.out.println("    1 - Adicionar atributos ao(s) cachorro(s)");
            System.out.println("    2 - Mostrar a(s) idade(s) (crescente) dos cachorro(s)");
            System.out.println("    3 - Mostrar os dados registrados               ");
            System.out.println("    4 - Remover atributo(s) ");
            System.out.println("    5 - Realiza uma busca por dog(s) com a nota que deseja");
            System.out.println("=============================================");
            System.out.print("Escolha uma opção: ");
            System.out.println();

            int menu = Receba.LerNumero();
            System.out.println();

            if (menu == 0) { // Quebrar o HASNEXT
                break;
            }

            switch (menu) {

                case 1: // Adiciona o objeto na lista

                    System.out.println("Digite quantos cães você ainda quer adicionar: ");

                    int x = Receba.LerNumero();
                    System.out.println();

                    for (int i = 0; i < x; i++) { // Preenche a lista


                        Cachorro dog = new Cachorro(); // Cria o objeto
                        if (x == 1) {
                            System.out.println(
                                    "Escreva o nome, idade, apelido, a raça favorita de doguinhos, e a nota de educação dele: ");
                        } else {
                            System.out.println(
                                    "Escreva os nomes, idades, apelidos, a raça favorita de doguinhos, e a nota de educação dele: ");
                        }


                        dog.ReceberCachorro(); // Recebe os atributos do objeto
                        listaCachorros.add(dog);


                        for (int j = 0; j < listaCachorros.size(); j++) {

                            String a = listaCachorros.get(j).VoltarApelido();

                            String name = listaCachorros.get(j).VoltarNome();

                            int ida = listaCachorros.get(j).VoltarIdade();

                            String rac = listaCachorros.get(j).VoltarRacaFavorita();

                            int not = listaCachorros.get(j).VoltarNota();

                            if (a.equals(dog.VoltarApelido())) {
                                System.out.println(" Você deseja adicionar mesmo o apelido igual? ");
                                String confirmacao = Receba.LerString();

                                if (confirmacao.equals("sim")) {

                                }else if (confirmacao.equals("não")){
                                    listaCachorros.get(j).RemoverApelido();
                                    System.out.println();
                                    System.out.println(" A apelido não foi criada ");
                                }

                            }

                            if (name.equals(dog.VoltarNome())) {
                                System.out.println(" Você deseja adicionar mesmo o apelido igual? ");
                                String confirmacao = Receba.LerString();

                                if (confirmacao.equals("sim")) {

                                }else if (confirmacao.equals("não")){
                                    listaCachorros.get(j).RemoverNome();
                                    System.out.println();
                                    System.out.println(" O nome não foi criada ");
                                }

                            }

                            if (ida == dog.VoltarIdade()) {
                                System.out.println(" Você deseja adicionar mesmo o apelido igual? ");
                                String confirmacao = Receba.LerString();

                                if (confirmacao.equals("sim")) {

                                }else if (confirmacao.equals("não")){
                                    listaCachorros.get(j).RemoverIdade();
                                    System.out.println();
                                    System.out.println(" A idade não foi criada ");
                                }

                            }

                            if (rac == dog.VoltarRacaFavorita()) {
                                System.out.println(" Você deseja adicionar mesmo o apelido igual? ");
                                String confirmacao = Receba.LerString();

                                if (confirmacao.equals("sim")) {

                                }else if (confirmacao.equals("não")){
                                    listaCachorros.get(j).RemoverRaçaFavorita();
                                    System.out.println();
                                    System.out.println(" A raça favorita não foi criada ");
                                }

                            }

                            if (not == dog.VoltarNota()) {
                                System.out.println(" Você deseja adicionar mesmo o apelido igual? ");
                                String confirmacao = Receba.LerString();

                                if (confirmacao.equals("sim")) {

                                }else if (confirmacao.equals("não")){
                                    listaCachorros.get(j).RemoverNota();
                                    System.out.println();
                                    System.out.println(" A nota não foi criada ");
                                }

                            }

                        }

                    }

                    System.out.println();

                    break;

                case 2: // Imprime as idades ordenadas crescentemente

                    if (listaCachorros.isEmpty()) {
                        System.out.println("Você não tem cachorros na lista.");
                        break;
                    }

                    int[] idades = new int[listaCachorros.size()];

                    for (int i = 0; i < listaCachorros.size(); i++) {
                        idades[i] = listaCachorros.get(i).VoltarIdade(); // Preenchendo o array de idades
                    }

                    Ordenacao.Merge(idades); // Ordenando as idades

                    System.out.println("As idades organizadas dos doguinhos: ");
                    System.out.println();

                    for (int idade : idades) {
                        System.out.print(idade + " ");
                    }

                    System.out.println();
                    System.out.println();

                    break;

                case 3: // Imprimir Objetos

                    if (listaCachorros.isEmpty()) {
                        System.out.println("Você não tem cachorros na lista.");
                        break;
                    }

                    for (Cachorro dog : listaCachorros) {
                        dog.imprimirCachorro();
                    }
                    break;

                case 4: // Remove os objetos da lista

                    if (listaCachorros.isEmpty()) {
                        System.out.println("Você não tem cachorros na lista.");
                        break;
                    }

                    System.out.println("Quantos atributos de um cahcorro você quer remover? ");
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

                            listaCachorros.get(posicao).RemoverNome();

                        } else if (removido.equals("idade")) {

                            listaCachorros.get(posicao).RemoverIdade();

                        } else if (removido.equals("apelido")) {

                            listaCachorros.get(posicao).RemoverApelido();

                        } else if (removido.equals("raça favorita")) {

                            listaCachorros.get(posicao).RemoverRaçaFavorita();

                        }

                    }

                    break;

                case 5:// encontrar por nota

                    if (listaCachorros.isEmpty()) {
                        System.out.println("Você não tem cachorros na lista.");
                        break;
                    }

                    System.out.println("Digite a nota pela qual busca os cachorros: ");
                    int nota = Receba.LerNumero();
                    System.out.println();

                    for (int i = 0; i < listaCachorros.size(); i++) {
                        int n = listaCachorros.get(i).VoltarNota();

                        if (n == nota) {
                            System.out.println("Aqui o(s) cachorro(s) com esta nota: ");
                            System.out.println();
                            listaCachorros.get(i).imprimirCachorro();
                        }

                    }

            }
        }
    }
}
