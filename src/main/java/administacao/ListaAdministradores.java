/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package administacao;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author leafar
 */
public class ListaAdministradores {
    private static List<Adm> administradores = new ArrayList<>();
    

    public boolean adicionarAdministrador(Adm adm) {
        if(!existeAdiminsistrador(adm)){
            administradores.add(adm);
            return true;
        }else{
            return false;
        }
    }

    public List<Adm> getAdministradores() {
        return administradores;
    }
    private boolean existeAdiminsistrador(Adm adimin){
        for (Adm ad: administradores){
            if (ad.getUsuario().equals(adimin.getUsuario())) {
            // Já existe um adiministrador com o mesmo nome
            return true;
            }
        }
        return false;
    }
}
