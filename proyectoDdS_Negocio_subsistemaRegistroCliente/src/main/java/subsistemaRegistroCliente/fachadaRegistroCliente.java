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
public class fachadaRegistroCliente implements IRegistroCliente {

    @Override
    public boolean registroCliente(ClienteDTO clienteDto) {
        controlRegistroCliente registro = new controlRegistroCliente(clienteDto);
        if (registro.esValido()) {
            registro.registrar();
            return true;
        }

        return false;
    }
}
