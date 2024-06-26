/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

//import dao.ListClienteDAO;
//import dao.ClienteDAO;
import Interfaces.IClienteDAO;
import Interfaces.IProductoDAO;
import dao.MongoClienteDAO;
import dao.MongoProductoDAO;
//import dao.ListProductoDAO;
//import dao.ProductoDAO;
import dto.ClienteDTO;
import dto.ProductoDTO;
import entidades.Producto;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Gui26
 */
public class ProductoBO {
    
    private String nombre;
    private String urlImagen;
    private float costo;
    private int cantidad;

    public ProductoBO() {
    }
    
    public ProductoBO(String nombre, String urlImagen, float costo, int cantidad) {
        this.nombre = nombre;
        this.urlImagen = urlImagen;
        this.costo = costo;
        this.cantidad = cantidad;
    }
    
    public ProductoBO(Producto producto) {
        this.nombre = producto.getNombre();
        this.urlImagen = producto.getUrlImagen();
        this.costo = producto.getCosto();
        this.cantidad = producto.getCantidad();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public Producto producto(){
        Producto producto = new Producto(nombre, urlImagen, costo, cantidad);
        return producto;
    }
    
    public List<ProductoDTO> productosDTO(){
        List<ProductoDTO> productos = new LinkedList();
        
//        IProductoDAO productoDao = new ListProductoDAO();
        IProductoDAO productoDao = new MongoProductoDAO();
        
        ListIterator<Producto> lista = productoDao.listaProductos().listIterator();
        while (lista.hasNext()) {
            Producto producto = lista.next();
            productos.add(new ProductoDTO(producto.getIdentificador(), producto.getNombre(), producto.getUrlImagen(), producto.getCosto()));
        }
        return productos;
    }
    
    public void agregar(ClienteDTO clienteDto, Long idProducto){
//        IProductoDAO productoDao = new ListProductoDAO();
//        IClienteDAO clienteDao = new ListClienteDAO();
        IProductoDAO productoDao = new MongoProductoDAO();
        IClienteDAO clienteDao = new MongoClienteDAO();
        
        productoDao.agregarCarrito(clienteDao.buscar(clienteDto.getCorreo()), productoDao.buscarProducto(idProducto));
    }
}
