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
public class ClienteDTO {
    
    private String apodo;
    private String contrasena;
    private LocalDate nacimiento;
    private String correo;
    
    public ClienteDTO(String apodo, String contrasena) {
        this.apodo = apodo;
        this.contrasena = contrasena;
    }
    
    public ClienteDTO(String apodo, String contrasena, LocalDate nacimiento, String correo) {
        this.apodo = apodo;
        this.contrasena = contrasena;
        this.nacimiento = nacimiento;
        this.correo = correo;
    }
    
    public String getApodo() {
        return apodo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public String getCorreo() {
        return correo;
    }
    
}
