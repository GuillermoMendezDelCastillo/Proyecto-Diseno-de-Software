/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Interfaces.IClienteDAO;
import entidades.Cliente;
import entidades.Producto;
import java.util.Date;
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
    public Cliente buscar(String nombre){
        
        ListIterator<Cliente> listaClientes = Tienda.tienda.getClientes().listIterator();
        while (listaClientes.hasNext()) {
            Cliente buscado = listaClientes.next();
            if(buscado.getNombre().equals(nombre)){
                return buscado;
            }
        }
        return null;
        
    }
    
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
    public Cliente iniciar(String nombre, String contrasena){
        
        ListIterator<Cliente> listaClientes = Tienda.tienda.getClientes().listIterator();
        while (listaClientes.hasNext()) {
            Cliente buscado = listaClientes.next();
            if(buscado.getNombre().equals(nombre) && buscado.getContrasena().equals(contrasena)){
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
//                return buscado.getCarrito();
            }
        }
        return null;
        
    }

    @Override
    public void insertarUsuario(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void ActualizarUsuario(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminarUsuario(String correo, String contrasena) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Cliente obtenerporID(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Cliente obtenerPorContrasenaYCorreo(String contrasena, String correo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void DesactivarUsuario(String correo, String contrasena) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void actualizarPerfil(String correo, String contrasena, String nuevoNombre, Date nuevaFechaNacimiento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void ActualizarDatos(String correo, String contrasena, String nombre, Date fechaNacimiento) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
