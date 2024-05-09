/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistemaIniciarSesion;

import bo.ClienteBO;
import dto.ClienteDTO;

/**
 *
 * @author Gui26
 */
public class controlIniciarSesion{
    
    public boolean iniciar(ClienteDTO clienteDto) {
        ClienteBO cliente = new ClienteBO(clienteDto);
        return cliente.inicia();
    }
    
}
