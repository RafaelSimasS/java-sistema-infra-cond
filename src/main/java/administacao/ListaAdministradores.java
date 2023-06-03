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
    

    public void adicionarAdministrador(Adm adm) {
        administradores.add(adm);
    }

    public List<Adm> getAdministradores() {
        return administradores;
    }
    
}
