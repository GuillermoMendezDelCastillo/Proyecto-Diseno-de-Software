/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistemaAgregarProducto;

import bo.ProductoBO;
import dto.ClienteDTO;

/**
 *
 * @author Gui26
 */
public class controlAgregarProducto{
    
    public void agregar(ClienteDTO clienteDto, Long idProducto) {
        
        ProductoBO productoBO = new ProductoBO();
        productoBO.agregar(clienteDto, idProducto);

    }
    
}
