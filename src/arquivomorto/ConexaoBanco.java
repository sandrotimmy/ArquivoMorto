/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivomorto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public final class ConexaoBanco {
    private static final ConexaoBanco conn = new ConexaoBanco();
    private static final Statement s = conecta();
    public ConexaoBanco() {
    }
    public static ConexaoBanco getConn() {
        return conn;
    }
    public static Statement getStatement (){
    return s;
    }
    /**
     *
     * @return 
     */
    public static  Statement conecta() {
        Statement st = null;
        try {
            //Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/BancoAM", "postgres", "Contec0332");
            Connection conn = DriverManager.getConnection("jdbc:firebirdsql:localhost/3050:C://users/Administrador/Documents/DOCUMENTOS SANDRO/Repositorio GIT/ArquivoMorto/dados/BancoAM.fdb", "sysdba", "masterkey");
            Statement s = conn.createStatement();
            st = s;
        } catch (SQLException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, ex);
        }

        return st;
    }

}
