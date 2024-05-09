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
        controlIniciarSesion inicio = new controlIniciarSesion();
        return inicio.iniciar(clienteDto);
    }
}
