/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivomorto;

import Interfaces.CadastroEmpresa;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class CRUD {

    public Statement s;

    public CRUD() throws SQLException {
        this.s = ConexaoBanco.getStatement();
    }

    public void cadastrarEmpresa(String cod, String nome) {
        try {
            s.executeUpdate("INSERT INTO EMPRESA VALUES (" + cod + ",'" + nome + "')");
            s.execute("SELECT * FROM EMPRESA");
            ResultSet rs = s.getResultSet();
            String dados = "DADOS DA EMPRESA: \n =============== \n";
            while (rs.next()) {
                dados += "CAIXA: " + rs.getString("IDEMPRESA") + " EMPRESA: " + rs.getString("NOMEEMPRESA") + "\n";
            }
            JOptionPane.showMessageDialog(null, dados);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroEmpresa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void atualizaEmpresa(String cod, String nome) {
        try {
            s.executeUpdate("UPDATE EMPRESA SET NOMEEMPRESA = '" + nome + "' WHERE IDEMPRESA = " + cod);
            s.execute("SELECT * FROM EMPRESA");
            ResultSet rs = s.getResultSet();
            String dados = "DADOS DA EMPRESA: \n =============== \n";
            while (rs.next()) {
                dados += "ID EMPRESA: " + rs.getString("IDEMPRESA") + " EMPRESA: " + rs.getString("NOMEEMPRESA") + "\n";
            }
            JOptionPane.showMessageDialog(null, dados);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroEmpresa.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void deletaEmpresa(String cod) {
        try {
            s.executeUpdate("DELETE FROM EMPRESA WHERE IDEMPRESA = " + cod);
            s.execute("SELECT * FROM EMPRESA ORDER BY IDEMPRESA");
            ResultSet rs = s.getResultSet();
            String dados = "DADOS DAS EMPRESA: \n =============== \n";
            while (rs.next()) {
                dados += "EMPRESA: " + rs.getString("IDEMPRESA") + " EMPRESA: " + rs.getString("NOMEEMPRESA") + "\n";
            }
            JOptionPane.showMessageDialog(null, dados);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroEmpresa.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void cadastrarCaixa(String cod, String conteudo) {
        try {
            s.executeUpdate("INSERT INTO CAIXA VALUES (" + cod + ",'" + conteudo + "')");
            s.execute("SELECT * FROM CAIXA ORDER BY IDCAIXA");
            ResultSet rs = s.getResultSet();
            String dados = "DADOS DA CAIXA: \n =============== \n";
            while (rs.next()) {
                dados += "CAIXA: " + rs.getString("IDCAIXA") + " CONTEUDO: " + rs.getString("CONTEUDOCAIXA") + "\n";
            }
            JOptionPane.showMessageDialog(null, dados);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroEmpresa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void atualizaCaixa(String cod, String conteudo) {
        try {
            s.executeUpdate("UPDATE CAIXA SET CONTEUDOCAIXA = '" + conteudo + "' WHERE IDCAIXA = " + cod);
            s.execute("SELECT * FROM CAIXA ORDER BY IDCAIXA");
            ResultSet rs = s.getResultSet();
            String dados = "DADOS DA CAIXA: \n =============== \n";
            while (rs.next()) {
                dados += "ID CAIXA: " + rs.getString("IDCAIXA") + " CONTEUDO: " + rs.getString("CONTEUDOCAIXA") + "\n";
            }
            JOptionPane.showMessageDialog(null, dados);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroEmpresa.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void deletaCaixa(String cod) {
        try {
            s.executeUpdate("DELETE FROM CAIXA WHERE IDCAIXA = " + cod);
            s.execute("SELECT * FROM CAIXA ORDER BY IDCAIXA");
            ResultSet rs = s.getResultSet();
            String dados = "DADOS DAS CAIXA: \n =============== \n";
            while (rs.next()) {
                dados += "CAIXA: " + rs.getString("IDCAIXA") + " CONTEUDO: " + rs.getString("CONTEUDOCAIXA") + "\n";
            }
            JOptionPane.showMessageDialog(null, dados);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroEmpresa.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
        public void cadastrarUsuario(String cod, String nome, String nick, String senha) {
        try {
            s.executeUpdate("INSERT INTO USUARIOS VALUES (" + cod + ",'" + nome + "','"+nick+"','"+ senha+ "')");
            s.execute("SELECT * FROM USUARIOS ORDER BY IDUSUARIO");
            ResultSet rs = s.getResultSet();
            String dados = "DADOS DOS USUARIOS: \n =============== \n";
            while (rs.next()) {
                dados += "CODIGO: " + rs.getString("IDUSUARIO") + " NOME: " + rs.getString("NOMEUSUARIO") +" NICK: " + rs.getString("NICKUSUARIO") + " SENHA: " + rs.getString("SENHAUSUARIO") + "\n";
            }
            JOptionPane.showMessageDialog(null, dados);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroEmpresa.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void atualizaUsuario(String cod, String nome, String nick, String senha) {
        try {
            s.executeUpdate("UPDATE USUARIOS SET NOMEUSUARIO = '" + nome +", NICKUSUARIO"+nick+", SENHAUSUARIO" +senha+ "' WHERE IDCAIXA = " + cod);
            s.execute("SELECT * FROM USUARIOS ORDER BY IDUSUARIO");
            ResultSet rs = s.getResultSet();
            String dados = "DADOS DOS USUARIOS: \n =============== \n";
            while (rs.next()) {
                dados += "CODIGO: " + rs.getString("IDUSUARIO") + " NOME: " + rs.getString("NOMEUSUARIO") +" NICK: " + rs.getString("NICKUSUARIO") + " SENHA: " + rs.getString("SENHAUSUARIO") + "\n";
            }
            JOptionPane.showMessageDialog(null, dados);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroEmpresa.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public void deletaUsuario(String cod) {
        try {
            s.executeUpdate("DELETE FROM USUARIOS WHERE IDUSUARIO = " + cod);
            s.execute("SELECT * FROM USUARIOS ORDER BY IDUSUARIO");
            ResultSet rs = s.getResultSet();
            String dados = "DADOS DOS USUARIOS: \n =============== \n";
            while (rs.next()) {
                dados += "CODIGO: " + rs.getString("IDUSUARIO") + " NOME: " + rs.getString("NOMEUSUARIO") +" NICK: " + rs.getString("NICKUSUARIO") + " SENHA: " + rs.getString("SENHAUSUARIO") + "\n";
            }
            JOptionPane.showMessageDialog(null, dados);
        } catch (SQLException ex) {
            Logger.getLogger(CadastroEmpresa.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
