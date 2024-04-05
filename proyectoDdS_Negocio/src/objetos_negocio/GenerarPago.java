/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos_negocio;

import dtos.ClienteDTO;
import entidades.Cliente;
import entidades.Pago;
//import entidades.Producto;
import static entidades.Tienda.TIENDA;
import interfaces.IGenerarPago;
import java.util.LinkedList;
//import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Gui26
 */
public class GenerarPago implements IGenerarPago{

    @Override
    public boolean esValido(String metodo, String codigoMetodo, int total) {
        if (total<=0){
            return false;
        }
        if(metodo.isBlank()||metodo.isEmpty()||codigoMetodo.isBlank()||codigoMetodo.isEmpty()){
            return false;
        }
        return true;
    }

    @Override
    public boolean generar(ClienteDTO clienteDto, String metodo, String codigoMetodo, int total) {
        if (esValido(metodo,codigoMetodo,total)){
            String usuario = clienteDto.getApodo();
            Cliente cliente;
            ListIterator<Cliente> listaClientes = TIENDA.getClientes().listIterator();
            while (listaClientes.hasNext()) {
                cliente = listaClientes.next();
                if(cliente.getApodo().equals(usuario)){
                    Pago pago = new Pago(codigoMetodo, metodo, total, cliente.getCarrito());
                    cliente.getHistorial().add(pago);
                    cliente.setCarrito(new LinkedList());
//                    historial(cliente);
                    return true;
                }
            }
        }
        return false;
    }
    
//    private void historial(Cliente cliente){
//        Pago pago;
//        ListIterator<Pago> iterador = cliente.getHistorial().listIterator();
//        while (iterador.hasNext()) {
//            pago = iterador.next();
//            System.out.println(pago.getCodigoMetodo());
//            System.out.println(pago.getMetodo());
//            System.out.println(pago.getTotal());
//            Producto producto;
//            ListIterator<Producto> iterador2 = pago.getCarrito().listIterator();
//            while (iterador2.hasNext()) {
//                producto = iterador2.next();
//                System.out.println(producto.getNombre());
//                System.out.println(producto.getUrlImagen());
//                System.out.println(producto.getCosto());
//            }
//        }
//    }
    
}
