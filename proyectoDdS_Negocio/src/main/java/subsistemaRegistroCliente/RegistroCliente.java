/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistemaRegistroCliente;

import dto.ClienteDTO;
import entidades.Cliente;
import static entidades.Tienda.TIENDA;
import java.time.LocalDate;

/**
 *
 * @author Gui26
 */
public class RegistroCliente{

    public boolean registrar(ClienteDTO clienteDto) {
        String nombre = clienteDto.getApodo();
        String contrasena = clienteDto.getContrasena();
        LocalDate nacimiento = clienteDto.getNacimiento();
        String correo = clienteDto.getCorreo();
        TIENDA.getClientes().add(new Cliente(nombre, contrasena, nacimiento, correo));
        return true;
    }
    
}
