/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistemaIniciarSesion;

import dto.ClienteDTO;
import entidades.Cliente;
import static entidades.Tienda.TIENDA;
import java.util.ListIterator;

/**
 *
 * @author Gui26
 */
public class IniciarSesion{

    public boolean buscar(ClienteDTO clienteDto) {
        String usuario = clienteDto.getApodo();
        String contrasena = clienteDto.getContrasena();
        Cliente cliente;
        ListIterator<Cliente> lista = TIENDA.getClientes().listIterator();
        while (lista.hasNext()) {
            cliente = lista.next();
            if(cliente.getApodo().equals(usuario)&&cliente.getContrasena().equals(contrasena)){
                return true;
            }
        }
        return false;
    }

}
