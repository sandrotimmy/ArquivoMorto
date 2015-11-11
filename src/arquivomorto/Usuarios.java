/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arquivomorto;

/**
 *
 * @author Administrador
 */
public class Usuarios {
public int idUsuario;
public String nomeUsuario;
public String nickUsuario;
public String senhaUsuario;

    public Usuarios(int idUsuario, String nomeUsuario, String nickUsuario, String senhaUsuario) {
        this.idUsuario = idUsuario;
        this.nomeUsuario = nomeUsuario;
        this.nickUsuario = nickUsuario;
        this.senhaUsuario = senhaUsuario;
    }
    
    public Usuarios() {
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public void setNickUsuario(String nickUsuario) {
        this.nickUsuario = nickUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public String getNickUsuario() {
        return nickUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
}
