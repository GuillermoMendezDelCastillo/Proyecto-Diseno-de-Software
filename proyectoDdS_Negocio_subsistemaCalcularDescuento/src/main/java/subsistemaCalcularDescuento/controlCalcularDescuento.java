/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistemaCalcularDescuento;

import bo.CuponBO;
import dto.CuponDTO;

/**
 *
 * @author Gui26
 */
public class controlCalcularDescuento {
    public Float calcular(String codigo, float total) {
        System.out.println("");
        CuponBO cuponBO = new CuponBO();
        CuponDTO cuponDto = cuponBO.buscar(codigo);
        if(cuponDto!=null){
            if(cuponDto.isEstado()){
                Float descuento = cuponDto.getDescuento();
                Float descontado = total - (total*descuento/100);
                return descontado;
            }
            return null;
        }else{
            return null;
        }
        
    }
}
