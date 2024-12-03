import java.util.Stack;
import Models.*;

public class AtendimentoClinica {
    public static void main(String[] args) {
        Stack<Paciente> cliente = new Stack<Paciente>();

        AdicionarPaciente(cliente);
        AtenderPaciente(cliente);
        MostrarPaciente(cliente);

    }

    private static void MostrarPaciente(Stack<Paciente> cliente) {
        cliente.peek().PrintPaciente();
    }

    private static void AdicionarPaciente(Stack<Paciente> cliente) {
        Paciente a = new Paciente();
        a.ReadPacienteUser();

        cliente.add(a);
    }

    private static void AtenderPaciente(Stack<Paciente> cliente) {
        System.out.println(" Este paciente foi removido ");
        cliente.pop().PrintPaciente();
    }
}
