/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivomorto;

import javax.swing.*;
import Interfaces.*;
import java.sql.SQLException;

/**
 *
 * @author Sandro
 */
public class Main {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException, SQLException {
        // TODO code application logic here
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");

//        new SplashJProgressBar();
        TelaLogin telaLogin = new TelaLogin();

    }
}
