/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import entidades.Cliente;
import entidades.Producto;
import java.util.List;

/**
 *
 * @author Gui26
 */
public interface IProductoDAO {
    
    public List<Producto> listaProductos();
    public Producto buscarProducto(Long id);
    public Producto agregarCarrito(Cliente cliente, Producto producto);
    
}
