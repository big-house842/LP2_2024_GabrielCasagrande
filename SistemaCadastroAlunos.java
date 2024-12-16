import java.util.HashMap;

public class SistemaCadastroAlunos {// DEU CERTO
    public static void main(String[] args) {

        HashMap<Integer, String> alunos = new HashMap<>();

        // Adicionar alunos
        alunos.put(12345, "João Silva");
        alunos.put(67890, "Maria Oliveira");
        alunos.put(54321, "Carlos Souza");

        // Buscar aluno
        buscarAluno(alunos, 12345);

        // Remover aluno
        removerAluno(alunos, 67890);

        // Exibir todos os alunos
        exibirAlunos(alunos);

    }

    // Exibir todos os alunos
    private static void exibirAlunos(HashMap<Integer, String> alunos) {

        System.out.println();
        System.out.println(" The students in the table: ");
        System.out.println(alunos.get(12345).toString());            
        System.out.println(alunos.get(54321).toString());       

    }

    private static void removerAluno(HashMap<Integer, String> alunos, int i) {// CERTO
        alunos.remove(i);

        System.out.println();
        System.out.println(" Removed ");
    }

    private static void buscarAluno(HashMap<Integer, String> alunos, int i) {// CERTO
        String name = alunos.get(i);
        System.out.println("This is the person :" + name);
    }

    // Método para remover aluno

    // Método para exibir todos os alunos

}