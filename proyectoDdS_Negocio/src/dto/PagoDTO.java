/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.util.List;

/**
 *
 * @author Gui26
 */
public class PagoDTO {
    
    private String codigoMetodo;
    private String metodo;
    private int total;
    private List<ProductoDTO> carrito;

    public PagoDTO(String codigoMetodo, String metodo, int total, List<ProductoDTO> carrito) {
        this.codigoMetodo = codigoMetodo;
        this.metodo = metodo;
        this.total = total;
        this.carrito = carrito;
    }

    public String getCodigoMetodo() {
        return codigoMetodo;
    }

    public String getMetodo() {
        return metodo;
    }

    public int getTotal() {
        return total;
    }

    public List<ProductoDTO> getCarrito() {
        return carrito;
    }
    
}
