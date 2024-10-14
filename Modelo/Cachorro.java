package Modelo;

import Biblioteca.Receba;

public class Cachorro {// Objeto

    private String nome = null;// criar os atributos
    private int idade = 0;
    private String apelido = null;

    public void receberCachorro(){// lê os atributo

        this.nome = Receba.LerString();
        this.idade = Receba.LerNumero();
        this.apelido = Receba.LerString();

    }
// SEM STATIC, GERA OBJETO

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
        System.out.println("   NOME _ " + this.nome + "   IDADE _ " + this.idade + "   APELIDO _ " + this.apelido);
        System.out.println();
    }

}
