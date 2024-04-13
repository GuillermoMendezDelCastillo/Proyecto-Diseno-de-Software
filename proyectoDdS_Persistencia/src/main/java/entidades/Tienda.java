/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Gui26
 */
public class Tienda {
    private List<Cliente> clientes;
    private List<Producto> productos;

    public Tienda() {
        clientes = new LinkedList<Cliente>();
        productos = new LinkedList<Producto>();
    }

    public Tienda(List<Cliente> clientes, List<Producto> productos) {
        this.clientes = clientes;
        this.productos = productos;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
    
    public void agregarCliente(Cliente cliente){
        clientes.add(cliente);
    }
    
    public void agregarProducto(Producto producto){
        productos.add(producto);
    }
    
    public Tienda(int uno) {
        this.clientes = new LinkedList<Cliente>();
        this.productos = new LinkedList<Producto>();
        this.clientes.add(new Cliente("Paco", "12345", LocalDate.parse("2003-12-13"), "paco@gmail.com"));
        this.productos.add(new Producto("Manzana",
                "https://www.recetasnestle.com.mx/sites/default/files/inline-images/tipos-de-manzana-royal-gala.jpg",
                10, 50));
        this.productos.add(new Producto("Pelota",
                "https://lamariposa.com.mx/11704-large_default/pelota-de-pl%C3%A1stico.jpg",
                20, 30));
        this.productos.add(new Producto("Flores",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRdBC1SIqhr3x5uFIpbGu44QpKsbRC_YDxn7EPmou90XQ&s",
                30, 10));
        this.productos.add(new Producto("Lapiz",
                "https://clipspapeleria.com.mx/wp-content/uploads/2020/06/90860_2-1-324x324.png",
                5, 60));
        this.productos.add(new Producto("Reloj",
                "https://www.zurichvirtual.com.mx/wp-content/uploads/2023/07/TB09802OG_a.jpg",
                100, 5));
    }
    
    public static Tienda TIENDA = new Tienda(1);
    
}
