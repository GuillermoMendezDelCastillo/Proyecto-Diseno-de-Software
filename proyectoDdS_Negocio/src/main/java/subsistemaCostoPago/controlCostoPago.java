/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistemaCostoPago;

import bo.ClienteBO;
import dto.ClienteDTO;
import dto.ProductoDTO;
import java.util.ListIterator;

/**
 *
 * @author Gui26
 */
public class controlCostoPago{

    public float costo(ClienteDTO clienteDto) {
        ClienteBO clienteBO = new ClienteBO(clienteDto);
        float costo = 0;
        ListIterator<ProductoDTO> listaProducto = clienteBO.buscaCarrito().listIterator();
        while (listaProducto.hasNext()) {
            ProductoDTO productoDTO = listaProducto.next();
            costo += productoDTO.getCosto();
        }

        return costo;
    }
    
}
