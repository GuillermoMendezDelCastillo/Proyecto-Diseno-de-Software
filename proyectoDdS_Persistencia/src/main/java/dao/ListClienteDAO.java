/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entidades.Cliente;
import entidades.Producto;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Gui26
 */
public class ListClienteDAO implements IClienteDAO{
    
    public ListClienteDAO() {
    }
    
    @Override
    public Cliente agregar(Cliente cliente){
        Tienda.tienda.getClientes().add(cliente);
        return cliente; //cambiar para que devuelva el 
    }
    
    @Override
    public Cliente buscar(String apodo){
        
        ListIterator<Cliente> listaClientes = Tienda.tienda.getClientes().listIterator();
        while (listaClientes.hasNext()) {
            Cliente buscado = listaClientes.next();
            if(buscado.getApodo().equals(apodo)){
                return buscado;
            }
        }
        return null;
        
    }
    
    @Override
    public Cliente buscarPorId(Long id){
        
        ListIterator<Cliente> listaClientes = Tienda.tienda.getClientes().listIterator();
        while (listaClientes.hasNext()) {
            Cliente buscado = listaClientes.next();
            if(buscado.getId().equals(id)){
                return buscado;
            }
        }
        return null;
        
    }
    
    @Override
    public Cliente iniciar(String apodo, String contrasena){
        
        ListIterator<Cliente> listaClientes = Tienda.tienda.getClientes().listIterator();
        while (listaClientes.hasNext()) {
            Cliente buscado = listaClientes.next();
            if(buscado.getApodo().equals(apodo) && buscado.getContrasena().equals(contrasena)){
                return buscado;
            }
        }
        return null;
        
    }
    
    @Override
    public List<Producto> obtenerCarrito(Cliente client){
        
        ListIterator<Cliente> listaClientes = Tienda.tienda.getClientes().listIterator();
        while (listaClientes.hasNext()) {
            Cliente buscado = listaClientes.next();
            if(buscado.equals(client)){
                return buscado.getCarrito();
            }
        }
        return null;
        
    }
    
}
