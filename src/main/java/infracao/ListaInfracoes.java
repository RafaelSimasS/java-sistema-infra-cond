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
    
    public boolean adicionarInfracao(Infracao infracao) {
        if(!existeInfracao(infracao)){
            infracoes.add(infracao);
            return true;
        }else{
            return false;
        } 
    }

    public List<Infracao> getInfracoes() {
        return infracoes;
    }
    private boolean existeInfracao(Infracao infracao){
        for (Infracao infra: infracoes){
            if ( infra.getNomeInfracao().equals(infracao.getNomeInfracao()) ) {
            // Já existe uma infração com esse nome
            return true;
            }
        }
        return false;
    }
}
