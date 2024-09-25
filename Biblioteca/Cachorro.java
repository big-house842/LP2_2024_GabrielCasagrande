package Biblioteca;

public class Cachorro {// Objeto

    private String nome = null;// criar os atributos
    private int idade = 0;
    private String apelido = null;

    public void receberCachorro(){// lê os atributo

        this.nome = Receba.LerString();
        this.idade = Receba.LerNumero();
        this.apelido = Receba.LerString();

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

    public void imprimirCachorro2(){
        System.out.println(" Aii, meu deuzi; O "+ this.nome + " é muito fofo. E por mais que seu apelido seja "+ this.apelido +" ele é tem um corpo atlético, em pleno(s) "+ this.idade +" aninhos ;)" );
    }

}
