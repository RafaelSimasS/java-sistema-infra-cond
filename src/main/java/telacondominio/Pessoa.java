/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package telacondominio;

/**
 *
 * @author edjr
 */
public class Pessoa {
    private String nome;
    private String numero;
    private String cpf;

    public Pessoa(String nome, String numero, String cpf) {
        this.nome = nome;
        this.numero = numero;
        this.cpf = cpf;
    }
    public Pessoa(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
}
