/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multa;

import infracao.Infracao;
import morador.Morador;

/**
 *
 * @author leafar
 */
public class Multa {
    Morador cliente;
    Infracao infracao;
    String data;

    public Multa(Morador cliente, Infracao infracao, String data) {
        this.cliente = cliente;
        this.infracao = infracao;
        this.data = data;
    }
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public Morador getCliente() {
        return cliente;
    }

    public void setCliente(Morador cliente) {
        this.cliente = cliente;
    }
    
    public Infracao getInfracao() {
        return infracao;
    }

    public void setInfracao(Infracao infracao) {
        this.infracao = infracao;
    }
    
}
