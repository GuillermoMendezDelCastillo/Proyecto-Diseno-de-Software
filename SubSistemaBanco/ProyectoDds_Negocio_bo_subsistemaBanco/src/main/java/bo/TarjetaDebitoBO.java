/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import dao.ITarjetaDebito;
import dao.TarjetaDebitoDao;
import entidades.TarjetaDebito;

/**
 *
 * @author Hector
 */
public class TarjetaDebitoBO {
    
    public TarjetaDebito buscarTarjetaDebito (String numeroTarjeta){
         ITarjetaDebito tarjetaDebitoDao = new TarjetaDebitoDao();
    TarjetaDebito tarjetaDebitoObjeto = tarjetaDebitoDao.obtenerTarjetaPorNumero(numeroTarjeta);
        if (tarjetaDebitoObjeto != null) {
            return  tarjetaDebitoObjeto;
        }else{
            return null;
        }
    
    }
   
    
    
    
}
