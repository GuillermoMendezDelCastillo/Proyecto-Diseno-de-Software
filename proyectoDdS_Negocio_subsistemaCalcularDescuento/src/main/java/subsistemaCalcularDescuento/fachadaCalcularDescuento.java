/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package subsistemaCalcularDescuento;

/**
 *
 * @author Gui26
 */
public class fachadaCalcularDescuento implements ICalcularDescuento{
    @Override
    public Float calcularDescuento(String codigo, float total){
        controlCalcularDescuento calcula = new controlCalcularDescuento();
        return calcula.calcular(codigo, total);
    }
}
