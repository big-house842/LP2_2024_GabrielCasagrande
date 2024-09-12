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

        reverterNumeros(jedi);// quick ao contrário;

        imprimir(jedi);
    }

    private static void imprimir(ArrayList<String> jedi) {
        for (String i : jedi) {
            System.out.print(i+" ");
        }
    }

    private static void adicionarNum(ArrayList<String> jedi){
        int n = lerN();

        for (int i = 0; i <= n; i++) {

            String j = Receba.LerString();
    
            jedi.add(j);

        }

    }

    private static void adicionarfinal(ArrayList<String> jedi) {
        int m = lerM();
        int final = 0;
        
        for (int i = 0; i < m; i++) {

            String j = Receba.LerString();

            final = jedi.get(jedi.size() - 1);

            jedi.add(final, j);

        }


    }

    private static int lerM() {
        System.out.println(" Quantos jedis adicionar no final: ");
        return Receba.LerNumero();
    }

    private static void removeNum(ArrayList<String> jedi) {
        jedi.remove(3);
    }

    private static void adicionarInicio(ArrayList<String> jedi) {
        jedi.add(1, "Edinmar");
    }

    private static int lerN() {
        System.out.println(" Quantos jedis são: ");
        return Receba.LerNumero();
    }

}
