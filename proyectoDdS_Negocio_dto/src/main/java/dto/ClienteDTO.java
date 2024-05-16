/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Gui26
 */
public class ClienteDTO {

    public String nombre;
    public String contrasena;
    public String correo;
    public Date nacimiento;
    public String estado;

    public ClienteDTO() {
    }

    public ClienteDTO(String Nombre, String Contrasena, String Correo, Date Nacimiento, String estado) {
        this.nombre = Nombre;
        this.contrasena = Contrasena;
        this.correo = Correo;
        this.nacimiento = Nacimiento;
        this.estado = estado;
    }
    
    public ClienteDTO(String Nombre, String Contrasena, Date Nacimiento, String Correo) {
        this.nombre = Nombre;
        this.contrasena = Contrasena;
        this.correo = Correo;
        this.nacimiento = Nacimiento;
    }
    
    public ClienteDTO(String Correo, String Contrasena) {
        this.contrasena = Contrasena;
        this.correo = Correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String Nombre) {
        this.nombre = Nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.contrasena = Contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String Correo) {
        this.correo = Correo;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date Nacimiento) {
        this.nacimiento = Nacimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }



}
