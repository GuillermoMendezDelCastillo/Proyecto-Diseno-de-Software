/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import entidades.Cliente;
import entidades.Producto;
import java.util.List;

/**
 *
 * @author Gui26
 */
public interface IClienteDAO {
    public Cliente agregar(Cliente cliente);
    public Cliente buscar(String apodo);
    public Cliente iniciar(String apodo, String contrasena);
    public Cliente buscarPorId(Long id);
    public List<Producto> obtenerCarrito(Cliente client);
}
