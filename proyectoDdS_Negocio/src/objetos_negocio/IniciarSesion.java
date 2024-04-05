/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos_negocio;

import dtos.ClienteDTO;
import entidades.Cliente;
import static entidades.Tienda.TIENDA;
import interfaces.IIniciarSesion;
import java.util.ListIterator;

/**
 *
 * @author Gui26
 */
public class IniciarSesion implements IIniciarSesion{

    @Override
    public boolean validar(String usuario, String contrasena) {
        if(usuario.isBlank()||usuario.isEmpty()||contrasena.isBlank()||contrasena.isEmpty()){
            return false;
        }
        return true;
    }

    @Override
    public boolean buscar(ClienteDTO clienteDto) {
        String usuario = clienteDto.getApodo();
        String contrasena = clienteDto.getContrasena();
        if(validar(usuario,contrasena)){
            Cliente cliente;
            ListIterator<Cliente> lista = TIENDA.getClientes().listIterator();
            while (lista.hasNext()) {
                cliente = lista.next();
                if(cliente.getApodo().equals(usuario)&&cliente.getContrasena().equals(contrasena)){
                    return true;
                }
            }
        }
        return false;
    }

}
