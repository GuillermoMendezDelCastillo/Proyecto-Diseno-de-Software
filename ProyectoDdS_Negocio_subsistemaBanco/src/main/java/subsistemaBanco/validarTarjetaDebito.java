/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistemaBanco;
import bo.TarjetaDebitoBO;
import entidades.TarjetaDebito;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 *
 * @author Hector
 */
public class validarTarjetaDebito {
    
    public List<String> validarTarjeta (String numeroTarjeta,String titular, Date fechaExpiracion, String codigoSeguridad){
        TarjetaDebitoBO TBO = new TarjetaDebitoBO();     
        
        TarjetaDebito tarjeta = TBO.buscarTarjetaDebito(numeroTarjeta);
                  
        List<String> discrepancias = new ArrayList<>();

        // Verificar si se encontró la tarjeta
        if (tarjeta != null) {
            // Verificar si los datos coinciden
            if (!tarjeta.getTitular().equals(titular)) {
                discrepancias.add("Error_Titular");
            }
            if (!tarjeta.getFechaExpiracion().equals(fechaExpiracion)) {
                discrepancias.add("Error_Fecha");
            }
            if (!tarjeta.getCodigoSeguridad().equals(codigoSeguridad)) {
                discrepancias.add("Error_Codigo");
            }
            if (tarjeta.getTitular().equals(titular) && tarjeta.getFechaExpiracion().equals(fechaExpiracion) && tarjeta.getCodigoSeguridad().equals(codigoSeguridad)) {
                discrepancias.add("Valido");
            }
        } else {
            discrepancias.add("Error_Numero");
        }

        // Retornar la lista de discrepancias
        return discrepancias;
    }                     
    
}
