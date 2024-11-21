package Connected;

import java.sql.*;

public class Linked {

    public Connection Link() {

        String url = "jdbc:mysql://localhost:3306/BancoDeDados";
        String usuario = "aluno";
        String senha = "aluno";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão estabelecida com sucesso!");

            // Fechar a conexão após uso
            conexao.close();
            return conexao;

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
            
        }

    }

}
