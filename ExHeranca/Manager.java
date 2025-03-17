package ExHeranca;

public class Manager extends Employee {
    
    private int password, qtdWorkers;

    public Manager(String name, char cpf, int wage, int password, int qtdWorkers) {
        super(name, cpf, wage);
        this.password = password;
        this.qtdWorkers = qtdWorkers;
    }

    public Manager() {
        super();
        this.password = 0;
        this.qtdWorkers = 0;
    }

    public int getPassword(){
        return password;
    }

    public int getQtdWorkers(){
        return qtdWorkers;
    }

    public boolean autentification(){
        if (password == 1933) {
            System.out.println(" Permitido ");
            return true;
        }
        System.out.println(" Negado ");
        return false;

    }

}
