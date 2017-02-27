/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.ContatoBean;
import bean.UsuarioBean;
import factory.ConexaoFactory;
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import src.JFLogin;
import src.JFTelaPrincipal;

/**
 *
 * @author ronaldo.pedro
 */
public class UsuarioDAO {

    private Statement stmt;
    private ResultSet rsNavegar;
    private java.sql.ResultSet rsListar;
    private Connection con;

    public boolean inserir(UsuarioBean usuario) {

        try {

            con = ConexaoFactory.getConnection();
            String sql = "INSERT INTO usuario(nome,login,senha,ativo) VALUES (?,?,?,?)";
            System.out.println("SQL");
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getLogin());
            ps.setString(3, usuario.getSenha());
            ps.setInt(4, usuario.getAtivo());

            return ps.executeUpdate() != PreparedStatement.EXECUTE_FAILED;

        } catch (SQLException e) {

            return false;
        } catch (ClassNotFoundException e) {

            return false;
        }
    }

//    public boolean altera(UsuarioBean usuario) throws ClassNotFoundException {
//        try {
//
//            con = ConexaoFactory.getConnection();
//            Statement stmt = con.createStatement();
//            stmt.executeUpdate("UPDATE usuario SET login='" + usuario.getLogin() + "', data_nasc='" + usuario.getData_nasc() + "', endereco='" + usuario.getEndereco() + "' where id_contato='" + contato.getId() + "'");
//
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, e);
//
//        }
//        return true;
//    }
//    public boolean exclui(ContatoBean contato) throws SQLException, ClassNotFoundException {
//        con = ConexaoFactory.getConnection();
//        Statement stmt = con.createStatement();
//
//        try {
//
//            Integer opcao = JOptionPane.showConfirmDialog(null, "Confirma a exclusão?", "Excluir Contato", JOptionPane.OK_CANCEL_OPTION);
//            if (opcao == JOptionPane.YES_OPTION) {
//                stmt.executeUpdate("DELETE FROM cad_contato WHERE id_contato='" + contato.getId() + "'");
//
//            }
//        } catch (HeadlessException | SQLException e) {
//
//        }
//
//        return false;
//    }
    public boolean autenticar(String login, String senha) throws ClassNotFoundException {
        try {

            con = ConexaoFactory.getConnection();
            Statement stmt = con.createStatement();

            String sql = "SELECT login, senha FROM usuario WHERE login = ? and senha = ?";

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, login);
            ps.setString(2, senha);

            ResultSet result = ps.executeQuery();

            return result.next();

        } catch (SQLException e) {

            return true;
        }
    }

//    public boolean autenticar(UsuarioBean usuarioBean) {
//
//        try {
//
//            if (existeusuario(funcionario.getLogin(), funcionario.getSenha())) {
////                JOptionPane.showMessageDialog(null, "Funcionario " + funcionario.getLogin() + " autenticado com sucesso! ");
//                JFLogin telalogin = new JFLogin();
//                telalogin.setVisible(false);
//                JFTelaPrincipal tela = new JFTelaPrincipal();
//                tela.setLocationRelativeTo(null);
//                tela.setVisible(true);
//
//                return false;
//
//            } else {
//                JfLogin telalogin = new JfLogin();
//                telalogin.setVisible(true);
//            }
//
//            con = ConexaoFactory.getConnection();
//            String sql = "INSERT INTO funcionarios (login,senha) VALUES (?,?)";
//
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setString(1, funcionario.getLogin());
//            ps.setString(2, funcionario.getSenha());
//
//            return ps.executeUpdate() != PreparedStatement.EXECUTE_FAILED;
//
//        } catch (SQLException e) {
//
//            return false;
//        } catch (ClassNotFoundException e) {
//
//            return false;
//        }
//    }
}
