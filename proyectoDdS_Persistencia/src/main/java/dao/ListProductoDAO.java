/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entidades.Cliente;
import entidades.Producto;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Gui26
 */
public class ListProductoDAO implements IProductoDAO{
    
    public ListProductoDAO() {
    }

    @Override
    public List<Producto> listaProductos() {
        return Tienda.tienda.getProductos();
    }
    
    @Override
    public Producto buscarProducto(Long id){
        
        ListIterator<Producto> listaProductos = Tienda.tienda.getProductos().listIterator();
        while (listaProductos.hasNext()) {
            Producto buscado = listaProductos.next();
            if(buscado.getId().equals(id)){
                return buscado;
            }
        }
        return null;
        
    }
    
    @Override
    public Producto agregarCarrito(Cliente cliente, Producto producto){
        
        ListIterator<Cliente> listaClientes = Tienda.tienda.getClientes().listIterator();
        while (listaClientes.hasNext()) {
            Cliente buscado = listaClientes.next();
            if(buscado.equals(cliente)){
//                buscado.getCarrito().add(producto);
            }
        }
        return producto;
        
    }
    
}
