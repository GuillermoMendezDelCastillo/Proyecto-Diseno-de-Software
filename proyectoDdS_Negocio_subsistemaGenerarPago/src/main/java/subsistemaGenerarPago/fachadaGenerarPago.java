/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistemaGenerarPago;

import dto.ClienteDTO;
import dto.PagoDTO;

/**
 *
 * @author Gui26
 */
public class fachadaGenerarPago implements IGenerarPago{
    @Override
    public boolean generarPago(ClienteDTO clienteDTO, PagoDTO pagoDTO){
        controlGenerarPago genera = new controlGenerarPago(clienteDTO, pagoDTO);
        if(genera.esValido()){
            return genera.generar();
        }
        return false;
    }
    @Override
    public boolean generarPagoCupon(ClienteDTO clienteDTO, PagoDTO pagoDTO){
        controlGenerarPago genera = new controlGenerarPago(clienteDTO, pagoDTO);
        if(genera.esValido()&&genera.esValidoDescuento()){
            return genera.generarConDescuento();
        }
        return false;
    }
}
