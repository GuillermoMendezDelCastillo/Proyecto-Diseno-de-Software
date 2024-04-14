/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistemaRegistroCliente;

import dto.ClienteDTO;
import entidades.Cliente;
import static entidades.Tienda.TIENDA;
import java.time.LocalDate;
import java.time.Period;
import java.util.ListIterator;

/**
 *
 * @author Gui26
 */
public class RegistroCliente{
    
    private ClienteDTO clienteDto;

    public RegistroCliente(ClienteDTO clienteDto) {
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
        String nombre = clienteDto.getApodo();
        String contrasena = clienteDto.getContrasena();
        LocalDate nacimiento = clienteDto.getNacimiento();
        String correo = clienteDto.getCorreo();
        TIENDA.getClientes().add(new Cliente(nombre, contrasena, nacimiento, correo));
    }
    
    public boolean buscar() {
        String usuario = clienteDto.getApodo();
        Cliente cliente;
        ListIterator<Cliente> lista = TIENDA.getClientes().listIterator();
        while (lista.hasNext()) {
            cliente = lista.next();
            if(cliente.getApodo().equals(usuario)){
                return true;
            }
        }
        return false;
    }
    
}
