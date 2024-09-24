package Lists;
import java.util.Scanner;

public class Cachorro {
    final static Scanner LER = new Scanner(System.in);

    private String nome = null;// criar os atributos
    private int idade = 0;
    private String apelido = null;

    public void receberCachorro(){// lê os atributo

        this.nome = LER.next();
        this.idade = LER.nextInt();
        this.apelido = LER.next();
    }

    public String voltarNome(){// volta o atributo
        return this.nome;
    }

    public int voltarIdade(){
        return this.idade;
    }

    public String voltarApelido(){
        return this.apelido;
    }

    public void imprimirCachorro(){// imprime o objeto
        System.out.println(" Seu cachorro "+ this.nome + " ta velin, tem "+ this.idade +" aninhos. Mais conhecido como "+ this.apelido);
    }



}
