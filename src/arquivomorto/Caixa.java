/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivomorto;

import javax.swing.JOptionPane;

/**
 *
 * @author Administrador
 */
public class Caixa {

    public int idCaixa;
    public String NomeCaixa;

    public Caixa(int idCaixa, String NomeCaixa) {
        this.idCaixa = idCaixa;
        this.NomeCaixa = NomeCaixa;
    }

    public Caixa() {
    }

    public int getidCaixa() {
        return idCaixa;
    }

    public String getNomeCaixa() {
        return NomeCaixa;
    }

    public void setidCaixa(int idCaixa) {
        this.idCaixa = idCaixa;
    }

    public void setNomeCaixa(String NomeCaixa) {
        this.NomeCaixa = NomeCaixa;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
