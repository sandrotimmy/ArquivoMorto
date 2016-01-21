
package arquivomorto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;


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

    public static  Statement conecta() {
        Statement st = null;
        try {
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
