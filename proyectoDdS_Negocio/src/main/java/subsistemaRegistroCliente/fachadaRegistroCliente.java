/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistemaRegistroCliente;

import dto.ClienteDTO;

/**
 *
 * @author Gui26
 */
public class fachadaRegistroCliente implements IRegistroCliente{
    @Override
    public boolean registroCliente(ClienteDTO clienteDto){
        RegistroCliente registro = new RegistroCliente(clienteDto);
        if (registro.esValido()){
            if (registro.buscar()){
                System.out.println("Ya existe el apodo");
                return false;
            }
            registro.registrar();
            return true;
        }
        return false;
    }
}
