package BancoComJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conecta {


    static final String URL = "jdbc:postgresql://localhost:5432/progii_bd";
    static final String USUARIO = "postgres";
    static final String SENHA = "toor";

    static Connection conexao;

    public static Connection getConexao() {
        try {
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conexao;
    }

}
