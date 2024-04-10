/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author Gui26
 */
public class ClienteDTO {
    
    private String apodo;
    private String contrasena;
    private String correo;
    
    public ClienteDTO(String apodo, String contrasena) {
        this.apodo = apodo;
        this.contrasena = contrasena;
    }
    
    public ClienteDTO(String apodo, String contrasena, String correo) {
        this.apodo = apodo;
        this.contrasena = contrasena;
        this.correo = correo;
    }
    
    public String getApodo() {
        return apodo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public String getCorreo() {
        return correo;
    }
    
}
