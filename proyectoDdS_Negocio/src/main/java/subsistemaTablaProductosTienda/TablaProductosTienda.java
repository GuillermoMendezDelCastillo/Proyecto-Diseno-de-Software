/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistemaTablaProductosTienda;

import dto.ProductoDTO;
import entidades.Producto;
import static entidades.Tienda.TIENDA;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import subsistemaTablaProductosTienda.ITablaProductosTienda;

/**
 *
 * @author Gui26
 */
public class TablaProductosTienda implements ITablaProductosTienda{
    
    @Override
    public List<ProductoDTO> consulta(){
        List<ProductoDTO> productos = new LinkedList();
        
        ListIterator<Producto> lista = TIENDA.getProductos().listIterator();
            while (lista.hasNext()) {
                Producto producto = lista.next();
                productos.add(new ProductoDTO(producto.getNombre(), producto.getUrlImagen(), producto.getCosto()));
            }
        
        return productos;
    }
}
