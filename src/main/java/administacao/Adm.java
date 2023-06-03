/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administacao;

import telacondominio.Pessoa;

/**
 *
 * @author edjr
 */
public class Adm extends Pessoa{
    private String usuario;
    private String senha;
    public Adm(){}
    public Adm(String nome, String numero, String cpf, String usuario, String senha) {
        super(nome, numero, cpf);
        this.usuario = usuario;
        this.senha = senha;
    }
    public Adm(String usuario, String senha){
        this.usuario = usuario;
        this.senha = senha;
    }
    
    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return this.senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
}
