/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administacao;


/**
 *
 * @author edjr
 */
public class Adm{
    private String usuario;
    private String senha;
    public Adm(){}
    
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
