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
import interfaces.ICostoPago;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Gui26
 */
public class CostoPago implements ICostoPago{

    @Override
    public int costo(ClienteDTO clienteDto) {
        int costo = 0;
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
