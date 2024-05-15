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

    public String Nombre;
    public String Contrasena;
    public String Correo;
    public Date Nacimiento;
    public String estado;

    public ClienteDTO() {
    }

    public ClienteDTO(String Nombre, String Contrasena, String Correo, Date Nacimiento, String estado) {
        this.Nombre = Nombre;
        this.Contrasena = Contrasena;
        this.Correo = Correo;
        this.Nacimiento = Nacimiento;
        this.estado = estado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        this.Contrasena = Contrasena;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public Date getNacimiento() {
        return Nacimiento;
    }

    public void setNacimiento(Date Nacimiento) {
        this.Nacimiento = Nacimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }



}
