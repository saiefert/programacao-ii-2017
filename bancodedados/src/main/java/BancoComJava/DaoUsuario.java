package BancoComJava;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DaoUsuario {

    Connection conexao;

    public void salvarUsuario(Usuario usuario){

        conexao = Conecta.getConexao();
        try {
            String sql = "INSERT INTO tb_usuario(nome, sobrenome) VALUES('" + usuario.getNome() + " ',' " + usuario.getSobrenome() + "')";
            Statement sttm = conexao.createStatement();

            sttm.executeUpdate(sql);
            System.out.println(usuario.getNome() + " inserido com sucesso!");
            conexao.close();

        } catch (SQLException ex) {
            Logger.getLogger(TesteConexao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
