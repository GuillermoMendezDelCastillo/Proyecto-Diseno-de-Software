/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Gui26
 */
public class Cliente {
    
    private String apodo;
    private String contrasena;
    private String correo;
    private LocalDate nacimiento;
    private List<Producto> carrito;
    private List<Pago> historial;

    public Cliente(String apodo, String contrasena, LocalDate nacimiento, String correo) {
        this.apodo = apodo;
        this.contrasena = contrasena;
        this.nacimiento = nacimiento;
        this.correo = correo;
        this.carrito = new LinkedList<Producto>();
        this.historial= new LinkedList<Pago>();
    }

    public Cliente(String apodo, String contrasena, String correo, LocalDate nacimiento, List<Producto> carrito, List<Pago> historial) {
        this.apodo = apodo;
        this.contrasena = contrasena;
        this.correo = correo;
        this.nacimiento = nacimiento;
        this.carrito = new LinkedList<Producto>();
        this.historial = new LinkedList<Pago>();
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }
    
    public List<Producto> getCarrito() {
        return carrito;
    }

    public void setCarrito(List<Producto> carrito) {
        this.carrito = carrito;
    }

    public List<Pago> getHistorial() {
        return historial;
    }

    public void setHistorial(List<Pago> historial) {
        this.historial = historial;
    }
    
}
