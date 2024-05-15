/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import entidades.Cliente;
import entidades.Producto;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Gui26
 */
public interface IClienteDAO {
    public Cliente agregar(Cliente cliente);
    public Cliente buscar(String apodo);
    public Cliente iniciar(String apodo, String contrasena);
//    public Cliente buscarPorId(Long id);
    public List<Producto> obtenerCarrito(Cliente client);
    
    
    //------------METODOS MONGO---------------------
    public void insertarUsuario(Cliente cliente);
    
    public void ActualizarUsuario(Cliente cliente);

    public void eliminarUsuario( String correo, String contrasena);
    
    public Cliente obtenerporID (Cliente cliente);
    
    public Cliente obtenerPorContrasenaYCorreo(String contrasena, String correo);
    
     public void DesactivarUsuario( String correo, String contrasena);
     
     public void actualizarPerfil(String correo, String contrasena, String nuevoNombre, Date nuevaFechaNacimiento);
     
     public void ActualizarDatos(String correo, String contrasena, String nombre, Date fechaNacimiento);
     
}
