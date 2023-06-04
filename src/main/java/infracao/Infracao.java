/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package infracao;

import morador.Morador;

/**
 *
 * @author Sparq
 */
public class Infracao {
    Morador cliente;
    float valor;
    String infracao;

    public Infracao(Morador cliente, float valor, String infracao) {
        this.cliente = cliente;
        this.valor = valor;
        this.infracao = infracao;
    }

    public Morador getCliente() {
        return cliente;
    }

    public void setCliente(Morador cliente) {
        this.cliente = cliente;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getInfracao() {
        return infracao;
    }

    public void setInfracao(String infracao) {
        this.infracao = infracao;
    }
    
}
