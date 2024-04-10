/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package subsistemaIniciarSesion;

import dto.ClienteDTO;

/**
 *
 * @author Gui26
 */
public interface IIniciarSesion {
    public boolean validar(String usuario, String contrasena);
    public boolean buscar(ClienteDTO clienteDto);
}
