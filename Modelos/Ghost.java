package Modelos;

public class Ghost {

    private String size = null;
    private int age = 0;
    private String strength = null;

    public void ReadGhost(String s1, int a, String s2){

        this.size = s1;
        this.age = a;
        this.strength = s2;

    }

    public String ReturnSize(){
        return this.size;
    }

    public int ReturnAge(){
        return this.age;
    }

    public String ReturnStrength(){
        return this.strength;
    }

    public void PrintGhost(){// imprime o objeto

        System.out.print("   Size _ " + this.size + "   AGE _ " + this.age + "   STRENGTH _ " + this.strength);
        System.out.println();

    }

}
