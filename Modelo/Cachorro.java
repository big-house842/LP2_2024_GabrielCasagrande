package Modelo;

import Biblioteca.Receba;

public class Cachorro {// Objeto

    private String nome = null;// criar os atributos
    private int idade = 0;
    private String apelido = null;
    private String racaFavorita = null;
    private int nota = 0;

    public void receberCachorro(){// lê os atributo

        this.nome = Receba.LerString();
        this.idade = Receba.LerNumero();
        this.apelido = Receba.LerString();
        this.racaFavorita = Receba.LerString();
        this.nota = Receba.LerNumero();

    }

    public void ReceberNome(){
        this.nome = Receba.LerString();
    }

    public void ReceberIdade(){
        this.idade = Receba.LerNumero();
    }

    public void ReceberApelido(){
        this.apelido = Receba.LerString();
    }

    public void ReceberRacaFavorita(){
        this.racaFavorita = Receba.LerString();
    }

    public void ReceberNota(){
        this.nota = Receba.LerNumero();
    }
// SEM STATIC, GERA OBJETO

    public void imprimirFavorito(){
        System.out.println("    RAÇA FAVORITA _ " + this.racaFavorita);
    }

    public void RemoverNome(){
        this.nome = null;
    }

    public void RemoverIdade(){
        this.idade = 0;
    }

    public void RemoverApelido(){
        this.apelido = null;
    }

    public void RemoverRaçaFavorita(){
        this.racaFavorita = null;
    }

    public void RemoverNota(){
        this.nota = 0;
    }

    public String VoltarNome(){// volta o atributo
        return this.nome;
    }

    public int VoltarIdade(){
        return this.idade;
    }

    public String VoltarApelido(){
        return this.apelido;
    }

    public String VoltarRacaFavorita(){
        return this.racaFavorita;
    }

    public int VoltarNota(){
        return this.nota;
    }

    public void imprimirCachorro(){// imprime o objeto

        System.out.print("   NOME _ " + this.nome + "   IDADE _ " + this.idade + "   APELIDO _ " + this.apelido);
        System.out.println();

    }

}
