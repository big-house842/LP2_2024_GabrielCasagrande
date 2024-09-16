package Lists;

import Biblioteca.*;

import java.util.Collections;
import java.util.LinkedList;

public class Ex2 {

    public static void testes() {
        LinkedList <Integer> pes = new LinkedList<Integer>();

        adicionarNum(pes);     
        
        imprimir(pes);
        
        System.out.println();
        maior(pes);

        media(pes);

    }

    private static void media(LinkedList<Integer> pes) {
        int soma = 0;

        for (Integer i : pes) {
            soma += i;
        }

        int media = soma/pes.size();

        System.out.println(" média de tamanhos: ");
        System.out.println(media);

    }

    private static void maior(LinkedList<Integer> pes) {
        System.out.println(" maior: ");
        System.out.println(Collections.max(pes));
    }

    private static void imprimir(LinkedList<Integer> pes) {
        System.out.println(" Tamanhos: ");
        for (Integer i : pes) {
            System.out.print(i + " ");
        }
    }

    private static void adicionarNum(LinkedList<Integer> pes) {
        System.out.println(" Quantos números de calçado você encontrou? ");
        int n = Receba.LerNumero();

        System.out.println(" Quais são eles: ");
        for (int i = 0; i < n; i++) {

            int j = Receba.LerNumero();

            pes.add(j);

        }

        System.out.println();
    }

}
