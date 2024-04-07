/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos_negocio;

import dto.ClienteDTO;
import entidades.Cliente;
import entidades.Producto;
import static entidades.Tienda.TIENDA;
import interfaces.IAgregarProducto;
import java.util.ListIterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Gui26
 */
public class AgregarProducto implements IAgregarProducto{

    @Override
    public void agregar(ClienteDTO clienteDto, String nombreProducto) {
        
        Producto producto = null;
        ListIterator<Producto> listaProductos = TIENDA.getProductos().listIterator();
        while (listaProductos.hasNext()) {
            producto = listaProductos.next();
            if(producto.getNombre().equals(nombreProducto)){
                break;
            }
        }
        if (producto!=null){
            String usuario = clienteDto.getApodo();
            Cliente cliente;
            ListIterator<Cliente> listaClientes = TIENDA.getClientes().listIterator();
            while (listaClientes.hasNext()) {
                cliente = listaClientes.next();
                if(cliente.getApodo().equals(usuario)){
                    cliente.getCarrito().add(producto);
                    //System.out.println(cliente.getCarrito().getLast().getNombre());
                    break;
                }
            }
        } else {
            System.out.println("Fallo inesperado: no se encontro el Producto");
        }
        
        
    }
    
}
