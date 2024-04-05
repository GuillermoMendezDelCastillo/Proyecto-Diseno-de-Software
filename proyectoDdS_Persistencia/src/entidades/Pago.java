/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.List;

/**
 *
 * @author Gui26
 */
public class Pago {
    
    private String codigoMetodo;
    private String metodo;
    private int total;
    private List<Producto> carrito;

    public Pago(String codigoMetodo, String metodo, int total, List<Producto> carrito) {
        this.metodo = metodo;
        this.codigoMetodo = codigoMetodo;
        this.total = total;
        this.carrito = carrito;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public String getCodigoMetodo() {
        return codigoMetodo;
    }

    public void setCodigoMetodo(String codigoMetodo) {
        this.codigoMetodo = codigoMetodo;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public List<Producto> getCarrito() {
        return carrito;
    }

    public void setCarrito(List<Producto> carrito) {
        this.carrito = carrito;
    }
    
}
