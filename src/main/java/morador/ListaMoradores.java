/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package morador;

import java.util.ArrayList;
import java.util.List;
import telacondominio.Cliente;

/**
 *
 * @author leafar
 */
public class ListaMoradores {
    private static List<Cliente> moradores = new ArrayList<>();
    

    public void adicionarAdministrador(Cliente morador) {
        moradores.add(morador);
    }

    public List<Cliente> getAdministradores() {
        return moradores;
    }
}
