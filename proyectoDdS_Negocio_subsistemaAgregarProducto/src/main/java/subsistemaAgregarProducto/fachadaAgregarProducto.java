/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistemaAgregarProducto;

import dto.ClienteDTO;

/**
 *
 * @author Gui26
 */
public class fachadaAgregarProducto implements IAgregarProducto{
    @Override
    public void agregarProducto(ClienteDTO clienteDto, Long idproducto){
        controlAgregarProducto agrega = new controlAgregarProducto();
        agrega.agregar(clienteDto, idproducto);
    }
}
