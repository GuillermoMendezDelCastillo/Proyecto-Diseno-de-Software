/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos_negocio;

import dtos.ClienteDTO;
import dtos.ProductoDTO;
import entidades.Cliente;
import entidades.Producto;
import static entidades.Tienda.TIENDA;
import interfaces.ITablaProductosCliente;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Gui26
 */
public class TablaProductosCliente implements ITablaProductosCliente{
    
    @Override
    public List<ProductoDTO> consulta(ClienteDTO clienteDto){
        List<ProductoDTO> productos = new LinkedList();
        String usuario = clienteDto.getApodo();
        Cliente cliente;
        ListIterator<Cliente> listaClientes = TIENDA.getClientes().listIterator();
        while (listaClientes.hasNext()) {
            cliente = listaClientes.next();
            if(cliente.getApodo().equals(usuario)){
                ListIterator<Producto> lista = cliente.getCarrito().listIterator();
                while (lista.hasNext()) {
                    Producto producto = lista.next();
                    productos.add(new ProductoDTO(producto.getNombre(), producto.getUrlImagen(), producto.getCosto()));
                }
            }
        }
        return productos;
    }
}
