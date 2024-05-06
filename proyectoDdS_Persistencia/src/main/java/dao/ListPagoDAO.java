/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entidades.Cliente;
import entidades.Pago;
import java.util.ListIterator;

/**
 *
 * @author Gui26
 */
public class ListPagoDAO implements IPagoDAO{
    
    public ListPagoDAO() {
    }
    
    @Override
    public Pago nuevoPago(Cliente cliente, Pago pago){
        pago.setCliente(cliente);
        Tienda.tienda.getPagos().add(pago);
        
        ListIterator<Cliente> listaClientes = Tienda.tienda.getClientes().listIterator();
        while (listaClientes.hasNext()) {
            Cliente buscado = listaClientes.next();
            if(buscado.equals(cliente)){
                buscado.getCarrito().clear();
            }
        }
        historial();
//        System.out.println(pago.getCliente().getApodo());
        return pago;
        
    }
    
    //Metodo de pruebas
    private void historial(){
        Pago registrado;
        ListIterator<Pago> iterador = Tienda.tienda.getPagos().listIterator();;
        while (iterador.hasNext()) {
            registrado = iterador.next();
            System.out.println(registrado.getCliente().getApodo());
            System.out.println(registrado.getMetodo());
            System.out.println(registrado.getTotal());
            if(registrado.getCupon()!=null){
                System.out.println(registrado.getCupon().getCodigo());
                System.out.println(registrado.getCupon().getDescuento());
            }
            System.out.println("");
        }
    }
    
}
