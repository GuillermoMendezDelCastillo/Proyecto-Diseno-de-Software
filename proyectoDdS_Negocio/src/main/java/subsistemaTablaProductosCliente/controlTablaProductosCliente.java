/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistemaTablaProductosCliente;

import bo.ClienteBO;
import dto.ClienteDTO;
import dto.ProductoDTO;
import java.util.List;

/**
 *
 * @author Gui26
 */
public class controlTablaProductosCliente{
    
    public List<ProductoDTO> consulta(ClienteDTO clienteDto){
        ClienteBO clienteBO = new ClienteBO(clienteDto);
        return clienteBO.buscaCarrito();
    }
}
