/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos_negocio;

import dto.ClienteDTO;
import entidades.Cliente;
import static entidades.Tienda.TIENDA;
import interfaces.IRegistroCliente;

/**
 *
 * @author Gui26
 */
public class RegistroCliente implements IRegistroCliente{

    @Override
    public boolean validar(String nombre, String contrasena, String correo) {
        if(nombre.isBlank()||nombre.isEmpty()||contrasena.isBlank()||contrasena.isEmpty()||correo.isBlank()||correo.isEmpty()){
            return false;
        }
        return true;
    }

    @Override
    public boolean registrar(ClienteDTO clienteDto) {
        String nombre = clienteDto.getApodo();
        String contrasena = clienteDto.getContrasena();
        String correo = clienteDto.getCorreo();
        if(validar(nombre,contrasena, correo)){
            TIENDA.getClientes().add(new Cliente(nombre, contrasena, correo));
            return true;
        }
        return false;
    }
    
}
