/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multa;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author leafar
 */
public class ListaMultas {
    private static List<Multa> multas = new ArrayList<>();
    
    public void adicionarMulta(Multa multa) {
        multas.add(multa);
    }

    public List<Multa> getMultas() {
        return multas;
    }
    
}
