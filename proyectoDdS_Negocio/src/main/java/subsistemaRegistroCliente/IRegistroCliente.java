/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package subsistemaRegistroCliente;

import dto.ClienteDTO;

/**
 *
 * @author Gui26
 */
public interface IRegistroCliente {
    public boolean validar(String nombre, String contrasena, String correo);
    public boolean registrar(ClienteDTO clienteDto);
}
