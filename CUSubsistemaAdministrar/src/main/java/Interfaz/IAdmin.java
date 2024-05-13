/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaz;

import DTO.UsuarioDTO;

/**
 *
 * @author jesus
 */
public interface IAdmin {
    
    public void Editar(UsuarioDTO usuarioDTO);
    
    public void Eliminar(UsuarioDTO usuarioDTO, String contraseñaConfirmada);
    
    public void desactivar(UsuarioDTO usuarioDTO, String contraseñaConfirmada);
    
    public void actualizar(UsuarioDTO usuarioDTO);
    
    public UsuarioDTO ObtenerInfo(String correoElectronico, String contrasena);
    
}
