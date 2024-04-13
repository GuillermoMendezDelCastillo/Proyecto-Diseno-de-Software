/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistemaGenerarPago;

import dto.ClienteDTO;
import dto.PagoDTO;
import entidades.Cliente;
import entidades.Pago;
import entidades.TarjetaBancaria;
import entidades.TransferenciaBancaria;
import static entidades.Tienda.TIENDA;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 *
 * @author Gui26
 */
public class GenerarPago{
    
    private ClienteDTO clienteDTO;
    private PagoDTO pagoDTO;
    private Cliente cliente;
    private Pago pago;

    public GenerarPago(ClienteDTO clienteDTO, PagoDTO pagoDTO) {
        this.clienteDTO = clienteDTO;
        this.pagoDTO = pagoDTO;
        this.cliente = null;
        this.pago = null;
    }
    
    public boolean esValido() {
        return pagoDTO.getTotal() > 0;
    }

    public Cliente cliente(){
        String usuario = clienteDTO.getApodo();
        Cliente buscado;
        ListIterator<Cliente> listaClientes = TIENDA.getClientes().listIterator();
        while (listaClientes.hasNext()) {
            buscado = listaClientes.next();
            if(buscado.getApodo().equals(usuario)){
                this.cliente = buscado;
            }
        }
        return cliente;
    }
    
    public Pago pago(){
        if (pagoDTO.getMetodo().equals("Tarjeta Bancaria")){
            this.pago = new TarjetaBancaria(pagoDTO.getMetodo(), pagoDTO.getTotal(),
                    pagoDTO.getNombre(), pagoDTO.getNumero(), pagoDTO.getCaducidad(),
                    pagoDTO.getCvv(), cliente.getCarrito());
            return pago;
        }
        if (pagoDTO.getMetodo().equals("Transferencia Bancaria")){
            this.pago = new TransferenciaBancaria(pagoDTO.getMetodo(), pagoDTO.getTotal(),
                    pagoDTO.getCorreo(), pagoDTO.getNumero(), cliente.getCarrito());
        }
        return pago;
    }
    
    public boolean generar() {
        cliente.getHistorial().add(pago);
        cliente.setCarrito(new LinkedList());
//        historial(cliente);
        return true;
    }
    
//    private void historial(Cliente cliente){
//        Pago registrado;
//        ListIterator<Pago> iterador = cliente.getHistorial().listIterator();
//        while (iterador.hasNext()) {
//            registrado = iterador.next();
//            System.out.println(registrado.getClass());
//            System.out.println(registrado.getMetodo());
//            System.out.println(registrado.getTotal());
//            Producto producto;
//            ListIterator<Producto> iterador2 = registrado.getCarrito().listIterator();
//            while (iterador2.hasNext()) {
//                producto = iterador2.next();
//                System.out.println(producto.getNombre());
//                System.out.println(producto.getUrlImagen());
//                System.out.println(producto.getCosto());
//            }
//        }
//    }
    
}
