/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistemaRegistroCliente;

import bo.ClienteBO;
import dto.ClienteDTO;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;

/**
 *
 * @author Gui26
 */
public class controlRegistroCliente {

    private ClienteDTO clienteDto;

    public controlRegistroCliente(ClienteDTO clienteDto) {
        this.clienteDto = clienteDto;
    }

    public boolean esValido() {
        LocalDate nacimiento = clienteDto.getNacimiento().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate hoy = LocalDate.now();

        if (hoy.isBefore(nacimiento)) {
            return false;
        }

        int edad = Period.between(nacimiento, hoy).getYears();
        // System.out.println(edad);
        return edad >= 18;
    }

    public void registrar() {
        ClienteBO cliente = new ClienteBO(clienteDto);
        cliente.crearCuenta(clienteDto);
    }

 

}
