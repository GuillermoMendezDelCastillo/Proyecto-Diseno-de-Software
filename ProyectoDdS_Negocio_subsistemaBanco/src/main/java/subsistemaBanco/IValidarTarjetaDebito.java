/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package subsistemaBanco;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Hector
 */
public interface IValidarTarjetaDebito {
    public List<String> validarTarjeta(String numeroTarjeta, String titular, Date fechaExpiracion, String codigoSeguridad);
    
}
