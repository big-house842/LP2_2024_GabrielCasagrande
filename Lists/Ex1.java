package Lists;
import java.util.ArrayList;
import Biblioteca.*;

public class Ex1 {

    public static void testes() {

        ArrayList<String> jedi = new ArrayList<String>();

        adicionarNum(jedi);

        adicionarInicio(jedi);

        imprimir(jedi);

        removeNum(jedi);

        adicionarfinal(jedi);

        imprimir(jedi);
        System.out.println();

        reverterNumeros(jedi);

        imprimir(jedi);

    }

    private static void reverterNumeros(ArrayList<String> jedi) {
        jedi.reversed();
    }

    private static void imprimir(ArrayList<String> jedi) {
        for (String i : jedi) {
            System.out.print(i+" ");
        }
        System.out.println();
    }

    private static void adicionarNum(ArrayList<String> jedi){
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

    private static void removeNum(ArrayList<String> jedi) {
        jedi.remove(3);
    }

    private static void adicionarInicio(ArrayList<String> jedi) {
        jedi.add(1, "Edinmar");
    }

}
