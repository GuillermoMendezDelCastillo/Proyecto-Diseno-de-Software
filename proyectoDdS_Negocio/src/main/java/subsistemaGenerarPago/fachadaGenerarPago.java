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
        GenerarPago genera = new GenerarPago(clienteDTO, pagoDTO);
        if(genera.esValido()){
            if(genera.cliente()!=null){
                if(genera.pago()!=null){
                    return genera.generar();
                }
            }
        }
        return false;
    }
}
