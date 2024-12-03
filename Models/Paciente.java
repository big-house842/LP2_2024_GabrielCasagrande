package Models;

import lib.Receba;

public class Paciente {

    private String name;
    private int idade,gravidade;

    public void ReadPacienteUser(){

        System.out.println("------------------------------------------------");
        System.out.println("             ....::: Paciente :::....              ");
        System.out.println("------------------------------------------------");

        System.out.print("      Name: ");
        this.name = Receba.LerString();
        System.out.print("      Idade: ");
        this.idade = Receba.LerNumero();
        System.out.print("      Gravidade: ");
        this.gravidade = Receba.LerNumero();

        System.out.println("------------------------------------------------");
        System.out.println();

    }

    public void PrintPaciente(){

        System.out.println("------------------------------------------------");
        System.out.print( " |  Name _ " + this.name + "\n" + " |  Idade _ " + this.idade + "\n" + " |  Gravidade _ " + this.gravidade + "\n");
        System.out.println("------------------------------------------------");
        System.out.println();

    }

}
