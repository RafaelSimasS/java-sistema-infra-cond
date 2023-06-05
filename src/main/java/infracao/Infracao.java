/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package infracao;

/**
 *
 * @author leafar
 */
public class Infracao {
    String nomeInfracao;
    double valor;
    
    public Infracao(String infracao, double valor) {
        this.nomeInfracao = infracao;
        this.valor = valor;
    }

    public String getNomeInfracao() {
        return nomeInfracao;
    }

    public void setNomeInfracao(String nomeInfracao) {
        this.nomeInfracao = nomeInfracao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    
}
