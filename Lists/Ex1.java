package Lists;

import java.util.ArrayList;
import java.util.Collections;

import lib.*;

public class Ex1 {

    public static void testes() {

        ArrayList<String> jedi = new ArrayList<String>();

        adicionarJedi(jedi);

        adicionarInicio(jedi);

        imprimir(jedi);

        removeJedis(jedi);

        adicionarfinal(jedi);

        imprimir(jedi);
        System.out.println();

        reverterJedis(jedi);

        imprimir(jedi);

    }

    private static void reverterJedis(ArrayList<String> jedi) {
        Collections.reverse(jedi);
    }

    private static void imprimir(ArrayList<String> jedi) {
        for (String i : jedi) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    private static void adicionarJedi(ArrayList<String> jedi){
        System.out.println(" Quantos jedis são: ");
        int n = Receba.LerNumero();

        for (int i = 0; i <= n; i++) {

            String j = Receba.LerString();
    
            jedi.add(j);

        }

    }

    private static void adicionarfinal(ArrayList<String> jedi) {
        System.out.println(" Quantos jedis adicionar no final: ");       
        int m = Receba.LerNumero();
        
        for (int i = 0; i <= m; i++) {

            String j = Receba.LerString();

            jedi.add(jedi.size(), j);

        }

    }

    private static void removeJedis(ArrayList<String> jedi) {
        jedi.remove(3);
    }

    private static void adicionarInicio(ArrayList<String> jedi) {
        jedi.add(1, "Edinmar");
    }

}
