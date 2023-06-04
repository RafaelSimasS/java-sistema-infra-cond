/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package morador;

import telacondominio.Pessoa;

/**
 *
 * @author edjr
 */
public class Morador extends Pessoa{
    private int bloco;
    private int numAp;
    public Morador(String nome, String numero, String cpf, int bloco, int numAp) {
        super(nome, numero, cpf);
        this.bloco= bloco;
        this.numAp = numAp;
    }

    public Morador(String nome, String numero, String cpf) {
        super(nome, numero, cpf);
    }

    public int getBloco() {
        return bloco;
    }

    public void setBloco(int bloco) {
        this.bloco = bloco;
    }

    public int getNumAp() {
        return numAp;
    }

    public void setNumAp(int numAp) {
        this.numAp = numAp;
    }
    
    
    
}
