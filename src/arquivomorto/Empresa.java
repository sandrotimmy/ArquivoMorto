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

public class Empresa {

    private int idEmpresa;
    private int cnpj;
    private String nomeEmpresa;
    private String endereco;
    private String complemento;
    private int numero;
    private String municipio;
    private String uf;
    private int cep;
    private int caixaPostal;
    private int ddd;
    private int fone;
    private int fax;
    private String email;

    public Empresa() {
    }
    
    public Empresa(int idEmpresa, String nomeEmpresa) {
        this.idEmpresa = idEmpresa;
        this.nomeEmpresa = nomeEmpresa;
    }

    public Empresa(int idEmpresa, int cnpj, String nomeEmpresa, String endereco, String complemento, int numero, String municipio, String uf, int cep, int caixaPostal, int ddd, int fone, int fax, String email) {
        this.idEmpresa = idEmpresa;
        this.cnpj = cnpj;
        this.nomeEmpresa = nomeEmpresa;
        this.endereco = endereco;
        this.complemento = complemento;
        this.numero = numero;
        this.municipio = municipio;
        this.uf = uf;
        this.cep = cep;
        this.caixaPostal = caixaPostal;
        this.ddd = ddd;
        this.fone = fone;
        this.fax = fax;
        this.email = email;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public int getCnpj() {
        return cnpj;
    }

    public int getDdd() {
        return ddd;
    }

    

}
