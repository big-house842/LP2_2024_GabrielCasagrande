import java.lang.reflect.Array;
import java.util.ArrayList;

import Lists.*;

public class codigo {
    
    public static void main(String[] args) {

        Cachorro lolozinho = new Cachorro();

        ArrayList<Cachorro> cachorros = new ArrayList<Cachorro>();

        System.out.println(" Escreva o nome, idade e apelido do seu dog: ");
        System.out.print("  ");
        lolozinho.receberCachorro();
        cachorros.add(lolozinho);

        System.out.println(cachorros.get(0).voltarApelido());


        System.out.println();
        lolozinho.imprimirCachorro();

    }
    
}
