/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistemaCostoPago;

import dto.ClienteDTO;
import entidades.Cliente;
import entidades.Producto;
import static entidades.Tienda.TIENDA;
import java.util.ListIterator;

/**
 *
 * @author Gui26
 */
public class CostoPago{

    public float costo(ClienteDTO clienteDto) {
        float costo = 0;
        String usuario = clienteDto.getApodo();
        Cliente cliente;
        ListIterator<Cliente> listaClientes = TIENDA.getClientes().listIterator();
        while (listaClientes.hasNext()) {
            cliente = listaClientes.next();
            if(cliente.getApodo().equals(usuario)){
                ListIterator<Producto> lista = cliente.getCarrito().listIterator();
                while (lista.hasNext()) {
                    Producto producto = lista.next();
                    costo += producto.getCosto();
                }
            }
        }
        return costo;
    }
    
}
