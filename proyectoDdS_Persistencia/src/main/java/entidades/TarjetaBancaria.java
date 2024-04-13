/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Gui26
 */
public class TarjetaBancaria extends Pago{
    
    private String nombreUsuario;
    private String numTarjeta;
    private LocalDate caducidad;
    private String cvv;

    public TarjetaBancaria(String metodo, int total, String nombreUsuario, String numTarjeta,
            LocalDate caducidad, String cvv,List<Producto> carrito) {
        super(metodo, total, carrito);
        this.nombreUsuario = nombreUsuario;
        this.numTarjeta = numTarjeta;
        this.caducidad = caducidad;
        this.cvv = cvv;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getNumTarjeta() {
        return numTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numTarjeta = numTarjeta;
    }

    public LocalDate getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(LocalDate caducidad) {
        this.caducidad = caducidad;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }
    
}
