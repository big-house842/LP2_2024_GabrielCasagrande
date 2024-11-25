package Conexao;

import java.sql.*;

public class Conectar {

    public Connection Conexao() {

        String url = "jdbc:mysql://localhost:3306/BancoDeDados";
        String usuario = "aluno";
        String senha = "aluno";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conexao = DriverManager.getConnection(url, usuario, senha);
            System.out.println("Conexão estabelecida com sucesso!");

            return conexao;

        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
            
        }

    }

}
