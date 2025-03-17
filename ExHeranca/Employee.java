package ExHeranca;

public class Employee {
    private String name;
    private char cpf;
    private int wage;

    public Employee(String name, char cpf, int wage) {
        this.name = name;
        this.cpf = cpf;
        this.wage = wage;
    }

    private Employee(){
        this.name = null;
        this.cpf = ' ';
        this.wage = 0;
    }

    public String getName(){
        return name;
    }

    public char returnCpf(){
        return cpf;
    }

    public int returnWage(){
        return wage;
    }

}
