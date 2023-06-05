/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package morador;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author leafar
 */
public class ListaMoradores {
    private static List<Morador> moradores = new ArrayList<>();
    public boolean adicionarMorador(Morador morador) {
        if(!existeMorador(morador)){
            moradores.add(morador);
            return true;
        }else{
            return false;
        }
    }

    public List<Morador> getMoradores() {
        return moradores;
    }
    private boolean existeMorador(Morador morador){
        
        for (Morador m : moradores) {
            if(m.getCpf().equals(morador.getCpf())){
                if(m.getNome().equals(morador.getNome())){
                    return m.getBloco() == morador.getBloco() && m.getNumAp() == morador.getNumAp();
                }else{
                    return true;
                }
            }else if( m.getBloco() == morador.getBloco() && m.getNumAp() == morador.getNumAp() ){
                return true;
            }
            
        }
    
        return false;
    }
}
