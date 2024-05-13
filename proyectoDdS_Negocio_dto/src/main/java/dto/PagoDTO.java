/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.time.LocalDate;

/**
 *
 * @author Gui26
 */
public class PagoDTO {
    
    private String numero;
    private String metodo;
    private float total;
    
    private String nombre;
    private LocalDate caducidad;
    private String cvv;
    
    private String correo;
    
    private String codigoCupon;
    private float totalDescuento;
    
    
    public PagoDTO(String numero, String metodo, float total, String nombre, LocalDate caducidad, String cvv) {
        this.numero = numero;
        this.metodo = metodo;
        this.total = total;
        this.nombre = nombre;
        this.caducidad = caducidad;
        this.cvv = cvv;
    }

    public PagoDTO(String numero, String metodo, float total, String correo) {
        this.numero = numero;
        this.metodo = metodo;
        this.total = total;
        this.correo = correo;
    }
    
    public PagoDTO(String numero, String metodo, float total, String nombre, LocalDate caducidad, String cvv, String codigoCupon, float totalDescuento) {
        this.numero = numero;
        this.metodo = metodo;
        this.total = total;
        this.nombre = nombre;
        this.caducidad = caducidad;
        this.cvv = cvv;
        this.codigoCupon = codigoCupon;
        this.totalDescuento = totalDescuento;
    }

    public PagoDTO(String numero, String metodo, float total, String correo, String codigoCupon, float totalDescuento) {
        this.numero = numero;
        this.metodo = metodo;
        this.total = total;
        this.correo = correo;
        this.codigoCupon = codigoCupon;
        this.totalDescuento = totalDescuento;
    }
    
    public String getNumero() {
        return numero;
    }

    public String getMetodo() {
        return metodo;
    }

    public float getTotal() {
        return total;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getCaducidad() {
        return caducidad;
    }

    public String getCvv() {
        return cvv;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCodigoCupon() {
        return codigoCupon;
    }

    public float getTotalDescuento() {
        return totalDescuento;
    }
    
}
