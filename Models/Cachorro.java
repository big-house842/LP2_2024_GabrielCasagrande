package Models;

import lib.Receba;

public class Cachorro {// Objeto // faltou o comparable e compareTo

    private String nome = null;// criar os atributos
    private int idade = 0;
    private String apelido = null;
    private String racaFavorita = null;
    private int nota = 0;

    public void ReceberCachorro(){// lê os atributo
        System.out.println("------------------------------------------------");
        System.out.println("      ....::: Cachorro :::....");
        System.out.println("------------------------------------------------");

        System.out.print("      Nome: ");
        this.nome = Receba.LerString();
        System.out.print("      Idade: ");
        this.idade = Receba.LerNumero();
        System.out.print("      Apelido: ");
        this.apelido = Receba.LerString();
        System.out.print("      Raça Favorita: ");
        this.racaFavorita = Receba.LerString();
        System.out.print("      Nota de educação: ");
        this.nota = Receba.LerNumero();

        System.out.println("------------------------------------------------");
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
