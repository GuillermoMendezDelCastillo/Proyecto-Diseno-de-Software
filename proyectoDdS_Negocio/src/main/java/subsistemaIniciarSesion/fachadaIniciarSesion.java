/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistemaIniciarSesion;

import dto.ClienteDTO;

/**
 *
 * @author Gui26
 */
public class fachadaIniciarSesion implements IIniciarSesion{
    @Override
    public boolean iniciarSesion(ClienteDTO clienteDto){
        IniciarSesion inicio = new IniciarSesion();
        return inicio.buscar(clienteDto);
    }
}
