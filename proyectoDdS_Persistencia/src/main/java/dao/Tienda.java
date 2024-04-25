/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entidades.*;
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
    private List<Pago> pagos;

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

    public static Tienda getTienda() {
        return tienda;
    }

    public static void setTienda(Tienda tienda) {
        Tienda.tienda = tienda;
    }

    public List<Pago> getPagos() {
        return pagos;
    }

    public void setPagos(List<Pago> pagos) {
        this.pagos = pagos;
    }
    
    public Tienda(){
        this.clientes = new LinkedList<>();
        this.productos = new LinkedList<>();
        this.pagos = new LinkedList<>();
        this.clientes.add(new Cliente(Long.valueOf(1),"Paco","12345", LocalDate.parse("2003-12-13"),"correo@gmail.com"));
        this.clientes.add(new Cliente(Long.valueOf(2),"Karen","12345", LocalDate.parse("2000-04-01"),"ejemplo@hotmail.com"));
        this.clientes.add(new Cliente(Long.valueOf(3),"Mario","12345", LocalDate.parse("2000-04-07"),"mario@gmail.com"));
        this.productos.add(new Producto(Long.valueOf(1), "Manzana",
                "https://www.recetasnestle.com.mx/sites/default/files/inline-images/tipos-de-manzana-royal-gala.jpg",
                10, 50));
        this.productos.add(new Producto(Long.valueOf(2), "Pelota",
                "https://lamariposa.com.mx/11704-large_default/pelota-de-pl%C3%A1stico.jpg",
                20, 30));
        this.productos.add(new Producto(Long.valueOf(3), "Flores",
                "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRdBC1SIqhr3x5uFIpbGu44QpKsbRC_YDxn7EPmou90XQ&s",
                30, 10));
        this.productos.add(new Producto(Long.valueOf(4), "Lapiz",
                "https://clipspapeleria.com.mx/wp-content/uploads/2020/06/90860_2-1-324x324.png",
                5, 60));
        this.productos.add(new Producto(Long.valueOf(5), "Reloj",
                "https://www.zurichvirtual.com.mx/wp-content/uploads/2023/07/TB09802OG_a.jpg",
                100, 5));
    }
    
    public static Tienda tienda = new Tienda();
    
}
