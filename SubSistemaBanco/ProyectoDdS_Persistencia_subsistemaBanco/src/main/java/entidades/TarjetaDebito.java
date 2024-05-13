/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Hector
 */
import java.util.Date;

public class TarjetaDebito {
    private String numeroTarjeta;
    private String titular;
    private Date fechaExpiracion;
    private String codigoSeguridad;
    private String banco;
 

    // Constructor
    public TarjetaDebito(String numeroTarjeta, String titular, Date fechaExpiracion, String codigoSeguridad, String banco) {
        this.numeroTarjeta = numeroTarjeta;
        this.titular = titular;
        this.fechaExpiracion = fechaExpiracion;
        this.codigoSeguridad = codigoSeguridad;
        this.banco = banco; 
    }

  // Getter y Setter para numeroTarjeta
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }
    
    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }
    
    // Getter y Setter para titular
    public String getTitular() {
        return titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
    
    // Getter y Setter para fechaExpiracion
    public Date getFechaExpiracion() {
        return fechaExpiracion;
    }
    
    public void setFechaExpiracion(Date fechaExpiracion) {
        this.fechaExpiracion = fechaExpiracion;
    }
    
    // Getter y Setter para codigoSeguridad
    public String getCodigoSeguridad() {
        return codigoSeguridad;
    }
    
    public void setCodigoSeguridad(String codigoSeguridad) {
        this.codigoSeguridad = codigoSeguridad;
    }
    
    // Getter y Setter para banco
    public String getBanco() {
        return banco;
    }
    
    public void setBanco(String banco) {
        this.banco = banco;
    }
    // Opcionalmente, puedes agregar métodos adicionales según las necesidades de tu aplicación
}

