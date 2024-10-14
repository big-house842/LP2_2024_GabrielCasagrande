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
            System.out.println("    1 - Criar vetor com os atributos do cachorro");
            System.out.println("    2 - Mostrar as idades (crescente) dos cachorros");
            System.out.println("    3 - Mostrar as informações               ");
            System.out.println("=============================================");
            System.out.print("Escolha uma opção: ");
            System.out.println();

            int menu = Receba.LerNumero();
            System.out.println();

            if (menu == 0) {  // Quebrar o HASNEXT
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
                            System.out.println("Escreva o nome, idade e apelido do dog: ");
                        } else {
                            System.out.println("Escreva o nome, idade e apelido de um dos seus dogs: ");
                        }
                        System.out.print("    ");
                        dog.receberCachorro(); // Recebe os atributos do objeto
                        listaCachorros.add(dog);
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
                        idades[i] = listaCachorros.get(i).voltarIdade(); // Preenchendo o array de idades
                    }

                    Ordenacao.Merge(idades); // Ordenando as idades

                    System.out.println("As idades organizadas dos doguinhos: ");
                    System.out.print("    ");

                    for (int idade : idades) {
                        System.out.print(idade + " ");
                    }

                    System.out.println();
                    System.out.println();

                    break;

                case 3: // Imprimir Objetos


                    for (Cachorro dog : listaCachorros) {
                        dog.imprimirCachorro();
                    }
                    break;

                case 4: // Remove os objetos da lista
                    
                    
                
                    break;
            }
        }
    }
}
