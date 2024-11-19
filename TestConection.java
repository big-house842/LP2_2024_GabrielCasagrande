import java.sql.*;

public class TestConection {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/BancoDeDados";
        String usuario = "aluno";
        String senha = "aluno";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão estabelecida com sucesso!");

            // Fechar a conexão após uso
            conexao.close();

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
