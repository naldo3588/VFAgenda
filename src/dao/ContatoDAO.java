/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.ContatoBean;
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

/**
 *
 * @author ronaldo.pedro
 */
public class ContatoDAO {

    private Statement stmt;
    private ResultSet rsNavegar;
    private java.sql.ResultSet rsListar;
    private Connection con;

    public boolean inserir(ContatoBean contato) {

        try {

            con = ConexaoFactory.getConnection();
            String sql = "INSERT INTO cad_contato(nome,data_nasc,endereco,bairro,cep,cidade,estado,pais,telefone,fax,celular,email,skype,site,observacao,usuario) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            System.out.println("SQL");
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, contato.getNome());
            ps.setString(2, contato.getData_nasc());
            ps.setString(3, contato.getEndereco());
            ps.setString(4, contato.getBairro());
            ps.setString(5, contato.getCep());
            ps.setString(6, contato.getCidade());
            ps.setString(7, contato.getEstado());
            ps.setString(8, contato.getPais());
            ps.setString(9, contato.getTelefone());
            ps.setString(10, contato.getFax());
            ps.setString(11, contato.getCelular());
            ps.setString(12, contato.getEmail());
            ps.setString(13, contato.getSkype());
            ps.setString(14, contato.getSite());
            ps.setString(15, contato.getObservacao());
            ps.setString(16, contato.getUsuario());

            return ps.executeUpdate() != PreparedStatement.EXECUTE_FAILED;

        } catch (SQLException e) {

            return false;
        } catch (ClassNotFoundException e) {

            return false;
        }
    }

    public boolean altera(ContatoBean contato) throws ClassNotFoundException {
        try {

            con = ConexaoFactory.getConnection();
            Statement stmt = con.createStatement();
            stmt.executeUpdate("UPDATE cad_contato SET nome='" + contato.getNome() + "', data_nasc='" + contato.getData_nasc() + "', endereco='" + contato.getEndereco() + "', bairro='" + contato.getBairro() + "', cep='" + contato.getCep() + "', cidade='" + contato.getCidade() + "', estado='" + contato.getEstado() + "', pais='" + contato.getPais() + "', telefone='" + contato.getTelefone() + "', fax='" + contato.getFax() + "', celular='" + contato.getCelular() + "', email='" + contato.getEmail() + "', skype='" + contato.getSkype() + "', site='" + contato.getSite() + "', observacao='" + contato.getObservacao() + "' where id_contato='" + contato.getId() + "'");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);

        }
        return true;
    }

    public boolean exclui(ContatoBean contato) throws SQLException, ClassNotFoundException {
        con = ConexaoFactory.getConnection();
        Statement stmt = con.createStatement();

        try {

            Integer opcao = JOptionPane.showConfirmDialog(null, "Confirma a exclusão?", "Excluir Contato", JOptionPane.OK_CANCEL_OPTION);
            if (opcao == JOptionPane.YES_OPTION) {
                stmt.executeUpdate("DELETE FROM cad_contato WHERE id_contato='" + contato.getId() + "'");

            }
        } catch (HeadlessException | SQLException e) {

        }

        return false;
    }

//    public boolean inserirDpto(FilialBean contato) {
//        
//        try {
//           con = ConexaoFactory.getConnection();
//            String sql = "INSERT INTO cad_dpto(nome_dpto) VALUES (?)";
//            System.out.println("SQL");
//            PreparedStatement ps = con.prepareStatement(sql);
//            ps.setString(1, contato.getDepartamento());
//            
//         return ps.executeUpdate() != PreparedStatement.EXECUTE_FAILED;
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
