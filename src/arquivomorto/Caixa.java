/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivomorto;

import javax.persistence.Entity;
import javax.persistence.Id;



/**
 *
 * @author Administrador
 */

@Entity
public class Caixa {

    @Id
    public int idCaixa;
    public String conteudoCaixa;

    public Caixa(int idCaixa, String conteudoCaixa) {
        this.idCaixa = idCaixa;
        this.conteudoCaixa = conteudoCaixa;
    }
    
    public Caixa() {
    }

    public int getidCaixa() {
        return idCaixa;
    }

    public String getconteudoCaixa() {
        return conteudoCaixa;
    }

    public void setidCaixa(int idCaixa) {
        this.idCaixa = idCaixa;
    }

    public void setconteudoCaixa(String conteudoCaixa) {
        this.conteudoCaixa = conteudoCaixa;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
