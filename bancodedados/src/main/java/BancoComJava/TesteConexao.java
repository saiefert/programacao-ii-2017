package BancoComJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TesteConexao {

    public static void main(String[] args) {

        final String URL = "jdbc:postgresql://localhost:5432/progii_bd";
        final String USUARIO = "postgres";
        final String SENHA = "toor";
        Connection conexao;

        System.out.println("Conectando ao banco de dados........\n");
        System.out.println("================================");
        System.out.println("Escolha uma das opções: \n1:Inserir um usuário \n2:Inserir um Perfil \n3:Inserir um endereço \n4:Sair");
        System.out.println("================================");
        int opcao = 0;
        Scanner sc = new Scanner(System.in);
        Usuario usuario = new Usuario();

        while (opcao != 4) {
            System.out.print("\nEscolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Insira ");
                    System.out.print("Nome:");
                    usuario.setNome(sc.next());
                    System.out.print("Sobrenome: ");
                    usuario.setSobrenome(sc.next());
                    try {
                        conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
                        String sql = "INSERT INTO tb_usuario(nome, sobrenome) VALUES('" + usuario.getNome() + " ',' " + usuario.getSobrenome() + "')";
                        Statement sttm = conexao.createStatement();

                        sttm.executeUpdate(sql);
                        System.out.println(usuario.getNome() + " inserido com sucesso!");
                        conexao.close();

                    } catch (SQLException ex) {
                        Logger.getLogger(TesteConexao.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                case 2:
                    System.out.println("Insira o perfil");
                    Perfil perfil = new Perfil();
                    sc.nextLine();
                    System.out.print("Nome: ");
                    perfil.setNome(sc.nextLine());
                    System.out.print("Descrição: ");
                    perfil.setDescricao(sc.nextLine());
                    try {
                        conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
                        String sql = "INSERT INTO tb_perfil(nome, descricao) VALUES('" + perfil.getNome() + " ',' " + perfil.getDescricao() + "')";
                        Statement sttm = conexao.createStatement();

                        sttm.executeUpdate(sql);
                        System.out.println(perfil.getNome() + " inserido com sucesso!");
                        conexao.close();

                    } catch (SQLException ex) {
                        Logger.getLogger(TesteConexao.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                case 3:
                    System.out.println("Insira um endereço: ");
                    Endereco endereco = new Endereco();
                    sc.nextLine();
                    System.out.print("Logradouro: ");
                    endereco.setLogradouro(sc.nextLine());
                    System.out.print("Bairro: ");
                    endereco.setBairro(sc.nextLine());
                    System.out.print("Numero: ");
                    endereco.setNumero(sc.nextLine());
                    System.out.print("CEP: ");
                    endereco.setCep(sc.nextLine());
                    System.out.print("Complemento: ");
                    endereco.setComplemento(sc.nextLine());
                    try {
                        conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
                        String sql = "INSERT INTO tb_endereco(logradouro, complemento, bairro, numero, cep) VALUES('" + endereco.getLogradouro() + " ',' "
                                + endereco.getComplemento() + " ',' " + endereco.getBairro() + " ',' " + endereco.getNumero() + " ',' " + endereco.getCep() + "')";
                        Statement sttm = conexao.createStatement();

                        sttm.executeUpdate(sql);
                        System.out.println(endereco.getLogradouro() + " inserido com sucesso!");
                        conexao.close();

                    } catch (SQLException ex) {
                        Logger.getLogger(TesteConexao.class.getName()).log(Level.SEVERE, null, ex);
                        break;
                    }
            }

        }

    }
}
