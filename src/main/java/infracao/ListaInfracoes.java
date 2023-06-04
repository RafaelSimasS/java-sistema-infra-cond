/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package infracao;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author leafar
 */
public class ListaInfracoes {
    private static List<Infracao> infracoes = new ArrayList<>();
    
    public void adicionarInfracao(Infracao infracao) {
        infracoes.add(infracao);
    }

    public List<Infracao> getInfracoes() {
        return infracoes;
    }
    
}
