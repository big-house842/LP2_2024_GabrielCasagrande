package Modelos;

public class Ghost {

    private String nameGhost;
    private int strength, size;

    public void ReadGhost(String a, int s1, int s2){

        this.nameGhost = a;
        this.strength = s2;
        this.size = s1;

    }

    public String ReturnNameGhost(){
        return this.nameGhost;
    }

    public int ReturnStrength(){
        return this.strength;
    }

    public int ReturnSize(){
        return this.size;
    }

    public void PrintGhost(){// imprime o objeto

        System.out.print( "   Name _ " + this.nameGhost + "   Strengh _ " + this.strength + "   Size _ " + this.size);
        System.out.println();

    }

}
