/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistemaRegistroCliente;

import bo.ClienteBO;
import dto.ClienteDTO;
import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Gui26
 */
public class controlRegistroCliente{
    
    private ClienteDTO clienteDto;

    public controlRegistroCliente(ClienteDTO clienteDto) {
        this.clienteDto = clienteDto;
    }
    
    public boolean esValido(){
        LocalDate nacimiento = clienteDto.getNacimiento();
        LocalDate hoy = LocalDate.now();
        
        if (hoy.compareTo(nacimiento)<0){
            return false;
        }
        
        int edad = Period.between(nacimiento, hoy).getYears();
        //System.out.println(edad);
        return edad>=18;
    }
    
    public void registrar() {
        ClienteBO cliente = new ClienteBO(clienteDto);
        cliente.registra();
    }
    
    public boolean buscar() {
        ClienteBO cliente = new ClienteBO(clienteDto);
        return cliente.busca();
    }
    
}
