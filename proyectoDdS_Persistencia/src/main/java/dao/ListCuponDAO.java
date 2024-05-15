/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Interfaces.ICuponDAO;
import entidades.Cupon;
import java.util.ListIterator;

/**
 *
 * @author Gui26
 */
public class ListCuponDAO implements ICuponDAO{

    public ListCuponDAO() {
    }
    
    @Override
    public Cupon buscar(String codigo) {
        ListIterator<Cupon> listaCupones = Tienda.tienda.getCupones().listIterator();
        while (listaCupones.hasNext()) {
            Cupon buscado = listaCupones.next();
            if(buscado.getCodigo().equals(codigo)){
                return buscado;
            }
        }
        return null;
    }

    @Override
    public boolean usar(String codigo) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
