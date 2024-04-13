/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package subsistemaGenerarPago;

import dto.ClienteDTO;
import dto.PagoDTO;

/**
 *
 * @author Gui26
 */
public interface IGenerarPago {
    
    public boolean generarPago(ClienteDTO clienteDTO, PagoDTO pagoDTO);
    
}
