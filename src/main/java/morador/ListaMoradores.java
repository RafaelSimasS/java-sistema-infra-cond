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

    public List<Morador> getAdministradores() {
        return moradores;
    }
    private boolean existeMorador(Morador morador){
        for (Morador m: moradores){
            if (m.getNome().equals(morador.getNome())
                && m.getCpf().equals(morador.getCpf())) {
            // Já existe um morador com o mesmo nome e CPF
            return true;
            }
            if (m.getNumAp() == morador.getNumAp()
                    && m.getBloco() == morador.getBloco()) {
                // Já existe um morador no mesmo apartamento e bloco
                return true;
            }
        }
        return false;
    }
}
