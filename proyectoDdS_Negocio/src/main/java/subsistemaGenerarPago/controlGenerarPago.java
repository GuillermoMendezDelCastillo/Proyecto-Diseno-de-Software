/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistemaGenerarPago;

import bo.PagoBO;
import dto.ClienteDTO;
import dto.PagoDTO;
import java.time.LocalDate;

/**
 *
 * @author Gui26
 */
public class controlGenerarPago{
    
    private ClienteDTO clienteDTO;
    private PagoDTO pagoDTO;

    public controlGenerarPago(ClienteDTO clienteDTO, PagoDTO pagoDTO) {
        this.clienteDTO = clienteDTO;
        this.pagoDTO = pagoDTO;
    }
    
    public boolean esValido() {
        if (pagoDTO.getMetodo().equals("Tarjeta Bancaria")){
            if (pagoDTO.getCaducidad().compareTo(LocalDate.now())<0){
                return false;
            }
        }
        return pagoDTO.getTotal() > 0;
    }
    
    public boolean generar() {
        PagoBO pagoBO = new PagoBO(pagoDTO);
        return pagoBO.generarPago(clienteDTO);
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
