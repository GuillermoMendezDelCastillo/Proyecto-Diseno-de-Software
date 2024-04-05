/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dtos;

/**
 *
 * @author Gui26
 */
public class ClienteDTO {
    private String apodo;
    private String contrasena;

    public ClienteDTO(String apodo, String contrasena) {
        this.apodo = apodo;
        this.contrasena = contrasena;
    }

    public String getApodo() {
        return apodo;
    }

    public String getContrasena() {
        return contrasena;
    }
    
}
