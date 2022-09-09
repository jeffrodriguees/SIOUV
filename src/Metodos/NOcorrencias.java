/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import Atributos.EOcorrencia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Atributos.EOcorrencia;

/**
 *
 * @author D'Artagnan
 */
public class NOcorrencias {

    Connection conexao;
    Statement stm;
    ResultSet rs;
    Statement statement;
    PreparedStatement PS;

    public Connection getConexao() {
        return conexao;
    }

    public void conexao() throws SQLException {
        conexao = DriverManager.getConnection("jdbc:mysql://192.168.2.138/SIOUV?user=root&password=Tudode15@");
//        conexao = DriverManager.getConnection("jdbc:mysql://192.168.2.138/TESTE?user=root&password=Tudode15@");
    }

    public NOcorrencias() {
        try {
            Class.forName("com.mysql.jdbc.Driver");

        } catch (ClassNotFoundException ex) {

        }

    }

    public String incluirExt(EOcorrencia ocorrencia) throws SQLException, ClassNotFoundException {
        try {
            conexao();
            PS = conexao.prepareStatement("insert into OCORRENCIA_ (REGISTRO,PACIENTE,TIPO_OCORRENCIA,"
                    + "DATA,ID,DATA_CONCLUSAO,"
                    + "CELULAR,FIXO,COMUNICANTE,EMAIL,RELATO,"
                    + "COMENTARIO,PROVIDENCIA,STATUS,DESTINATARIO,CATEGORIA) values ("
                    + "'" + ocorrencia.getRegistro().trim() + "'" + ","
                    + "'" + ocorrencia.getPaciente().trim().toUpperCase() + "'" + ","
                    + "'" + ocorrencia.getOcorrencia().trim() + "'" + ","
                    + "'" + ocorrencia.getData().trim() + "'" + ","
                    + "'" + ocorrencia.getId().trim() + "'" + ","
                    + "'" + ocorrencia.getConclusao().trim() + "'" + ","
                    + "'" + ocorrencia.getCelular().trim() + "'" + ","
                    + "'" + ocorrencia.getFixo().trim() + "'" + ","
                    + "'" + ocorrencia.getComunicante().trim().toUpperCase().replace("'","") + "'" + ","
                    + "'" + ocorrencia.getEmail().trim().toUpperCase().replace("'","") + "'" + ","
                    + "'" + ocorrencia.getRelato().trim().toUpperCase().replace("'","") + "'" + ","
                    + "'" + ocorrencia.getComentario().trim().toUpperCase().replace("'","") + "'" + ","
                    + "'" + ocorrencia.getProvidencia().trim().toUpperCase().replace("'","") + "'" + ","
                    + "'" + ocorrencia.getStatus().trim().toUpperCase() + "'" + ","
                    + "'" + ocorrencia.getDestinatario().trim().toUpperCase().replace("'","") + "'" + ","
                    + "'" + ocorrencia.getCategoria().trim().toUpperCase() + "'" + ")");            
             
            PS.executeUpdate();
           
            JOptionPane.showMessageDialog(null, "CADASTRO INCLUIDO!");

            conexao.close();

            //System.out.println();
        } catch (SQLException ex) {
            return ex.getMessage();
        }
        return null;
    }

    public String incluirInt(EOcorrencia ocorrencia) throws SQLException, ClassNotFoundException {
        try {
            conexao();
            PS = conexao.prepareStatement("insert into OCORRENCIA_ (ID,DATA,TIPO_OCORRENCIA,"
                    + "DATA_CONCLUSAO,COMUNICANTE,"
                    + "CELULAR,FIXO,EMAIL,RELATO,"
                    + "COMENTARIO,PROVIDENCIA,STATUS,DESTINATARIO,CATEGORIA) values ("
                    + "'" + ocorrencia.getId().trim() + "'" + ","
                    + "'" + ocorrencia.getData().trim() + "'" + ","
                    + "'" + ocorrencia.getOcorrencia().trim() + "'" + ","
                    + "'" + ocorrencia.getConclusao().trim() + "'" + ","
                    + "'" + ocorrencia.getComunicante().toUpperCase().replace("'","") + "'" + ","
                    + "'" + ocorrencia.getCelular().trim() + "'" + ","
                    + "'" + ocorrencia.getFixo().trim() + "'" + ","
                    + "'" + ocorrencia.getEmail().trim().toUpperCase().replace("'","") + "'" + ","
                    + "'" + ocorrencia.getRelato().trim().toUpperCase().replace("'","") + "'" + ","
                    + "'" + ocorrencia.getComentario().trim().toUpperCase().replace("'","") + "'" + ","
                    + "'" + ocorrencia.getProvidencia().trim().toUpperCase().replace("'","") + "'" + ","
                    + "'" + ocorrencia.getStatus().trim().toUpperCase().replace("'","") + "'" + ","
                    + "'" + ocorrencia.getDestinatario().trim().toUpperCase().replace("'","") + "'" + ","
                    + "'" + ocorrencia.getCategoria().trim().toUpperCase() + "'" + ")");
//            

    public String alterar(EOcorrencia ocorrencia) {

        PreparedStatement PS = null;
        try {

            conexao();
            PS = conexao.prepareStatement("UPDATE OCORRENCIA_ SET PACIENTE = " + "'" + ocorrencia.getPaciente().trim() + "'" + ","
                    + "TIPO_OCORRENCIA = " + "'" + ocorrencia.getOcorrencia().trim() + "'" + ","
                    + "DATA = " + "'" + ocorrencia.getData().trim() + "'" + ","
                    + "ID = " + "'" + ocorrencia.getId().trim() + "'" + ","
                    + "DATA_CONCLUSAO = " + "'" + ocorrencia.getConclusao().trim() + "'" + ","
                    + "CELULAR = " + "'" + ocorrencia.getCelular().trim().replace("'","") + "'" + ","
                    + "FIXO = " + "'" + ocorrencia.getFixo().trim().replace("'","") + "'" + ","
                    + "COMUNICANTE = " + "'" + ocorrencia.getComunicante().trim().toUpperCase().replace("'","") + "'" + ","
                    + "EMAIL = " + "'" + ocorrencia.getEmail().trim().toUpperCase().replace("'","") + "'" + ","
                    + "RELATO = " + "'" + ocorrencia.getRelato().trim().toUpperCase().replace("'","") + "'" + ","
                    + "COMENTARIO = " + "'" + ocorrencia.getComentario().trim().toUpperCase().replace("'","") + "'" + ","
                    + "PROVIDENCIA = " + "'" + ocorrencia.getProvidencia().trim().toUpperCase().replace("'","") + "'" + ","
                    + "STATUS = " + "'" + ocorrencia.getStatus().trim().toUpperCase() + "' " + ","
                    + "DESTINATARIO = " + "'" + ocorrencia.getDestinatario().trim().toUpperCase().replace("'","") + "' " + ","
                    + "CATEGORIA = " + "'" + ocorrencia.getCategoria().trim().toUpperCase() + "' "
                    + "WHERE ID = " + "'" + ocorrencia.getId().trim() + "'");
            PS.executeUpdate();
            JOptionPane.showMessageDialog(null, "CADASTRO ALTERADO!");

            conexao.close();

        } catch (SQLException ex) {
            return ex.getMessage();
        }

        return null;

    }

    public String excluir(EOcorrencia ocorrencia) {
        PreparedStatement PS = null;
        try {
            conexao();
            PS = conexao.prepareStatement("Delete from OCORRENCIA_ where ID = '" + ocorrencia.getId() + "'");
            PS.executeUpdate();
            JOptionPane.showMessageDialog(null, "CADASTRO EXCLUIDO!");

            conexao.close();

        } catch (SQLException ex) {
            Logger.getLogger(EOcorrencia.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public String teste(EOcorrencia ocorrencia) {
        return null;

    }
}
