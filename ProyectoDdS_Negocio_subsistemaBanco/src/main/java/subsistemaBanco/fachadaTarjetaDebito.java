/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistemaBanco;

import entidades.TarjetaDebito;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Hector
 */
public class fachadaTarjetaDebito implements IValidarTarjetaDebito {

    @Override
    public List<String> validarTarjeta(String numeroTarjeta,String titular, Date fechaExpiracion, String codigoSeguridad) {
         validarTarjetaDebito VTD = new validarTarjetaDebito();        
           return VTD.validarTarjeta(numeroTarjeta,titular,fechaExpiracion,codigoSeguridad);
         
         
    }
    
}
