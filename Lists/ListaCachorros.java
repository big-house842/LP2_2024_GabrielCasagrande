package Lists;

import java.util.ArrayList;

import Biblioteca.*;
import Modelo.Cachorro;

public class ListaCachorros {

    public static void Lista() {

        System.out.println("    1 _ Criar vetor com os atributos do cachorro    ");
        System.out.println("    2 _ Mostrar as idade(crescente) dos cachorros   ");
        System.out.println("    3 _ ");
        ArrayList<Cachorro> listaCachorros = new ArrayList<Cachorro>();// Cria a lista
        int menu = Receba.LerNumero();

        while (menu > 0) {

            switch (menu) {
                case 1:

                    System.out.println(" Digite quantos cães você ainda quer adicionar: ");
                    System.out.print("    ");
                    int x = Receba.LerNumero();

                    for (int i = 0; i < x; i++) {// Preenche o vetor

                        Cachorro dog = new Cachorro();// Cria o objeto
                        if (x == 1) {
                            System.out.println(" Escreva o nome, idade e apelido do dog: ");
                            System.out.print("    ");
                        } else {
                            System.out.println(" Escreva o nome, idade e apelido de um dos seus dogs: ");
                            System.out.print("    ");
                        }
                        dog.receberCachorro();// Recebe os atributos do objeto

                        listaCachorros.add(dog);// Adiciona o objeto na lista

                    }

                case 2:

                    int[] idades = new int[listaCachorros.size()];
                    int i = 0;

                    for (Cachorro dog : listaCachorros) {// 6. Criando um vetor com as idades dos cachorros

                        idades[i] = dog.voltarIdade();
                        i++;
                    }

                    Ordenacao.Merge(idades);// 7. Ordenando as idades;

                    System.out.println();
                    if (idades.length == 1) {// octopus garden _ Hammer _
                        System.out.println(" Você só tem um doguinho, e tudo bem ;)");
                    } else {
                        System.out.println(" As idades organidas dos doguinhos: ");
                        System.out.print("    ");

                        for (int j = 0; j < idades.length; j++) {// 8. Imprime as idades ordenadas crescentemente
                            System.out.print(idades[j] + " ");
                        }
                    }
                    System.out.println();

                case 3:

            }
        }

        int j = 0;
        System.out.println();

        for (Cachorro dog : listaCachorros) {

            if (j % 2 == 0) {// 9. Imprimir esta mensagem, se par
                dog.imprimirCachorro();
            } else {// 10. Imprimir esta se ímpar
                dog.imprimirCachorro2();
            }

            System.out.println();
            j++;
        }

    }

}
