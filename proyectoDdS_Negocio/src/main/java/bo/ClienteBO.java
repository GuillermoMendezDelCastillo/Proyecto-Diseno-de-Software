/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import dao.ListClienteDAO;
import dao.ClienteDAO;
import dao.IClienteDAO;
import dao.IProductoDAO;
import dao.ListProductoDAO;
import dao.ProductoDAO;
import dto.ClienteDTO;
import dto.ProductoDTO;
import entidades.Cliente;
import entidades.Producto;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Gui26
 */
public class ClienteBO {
    
    private Long idCliente;
    private String apodo;
    private String contrasena;
    private String correo;
    private LocalDate nacimiento;
    private List<ProductoBO> carrito;
    private List<PagoBO> historial;
    
    public ClienteBO() {
    }
    
    public ClienteBO(String apodo, String contrasena, LocalDate nacimiento, String correo) {
        this.apodo = apodo;
        this.contrasena = contrasena;
        this.nacimiento = nacimiento;
        this.correo = correo;
        this.carrito = new LinkedList<ProductoBO>();
//        this.historial= new LinkedList<PagoBO>();
    }

    public ClienteBO(String apodo, String contrasena, String correo, LocalDate nacimiento, List<ProductoBO> carrito) {//, List<PagoBO> historial
        this.apodo = apodo;
        this.contrasena = contrasena;
        this.correo = correo;
        this.nacimiento = nacimiento;
        this.carrito = new LinkedList<ProductoBO>();
//        this.historial = new LinkedList<PagoBO>();
    }
    
    public ClienteBO(Cliente cliente) {
        this.idCliente = cliente.getId();
        this.apodo = cliente.getApodo();
        this.contrasena = cliente.getContrasena();
        this.nacimiento = cliente.getNacimiento();
        this.correo = cliente.getCorreo();
        this.carrito = listaProductosCliente(cliente.getCarrito());
//        this.historial= listaPagosCliente(cliente.getHistorial());
    }
    
    public ClienteBO(ClienteDTO cliente) {
        this.idCliente = cliente.getIdCliente();
        this.apodo = cliente.getApodo();
        this.contrasena = cliente.getContrasena();
        this.nacimiento = cliente.getNacimiento();
        this.correo = cliente.getCorreo();
    }
    
    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }
    
    public List<ProductoBO> getCarrito() {
        return carrito;
    }

    public void setCarrito(List<ProductoBO> carrito) {
        this.carrito = carrito;
    }

    public List<PagoBO> getHistorial() {
        return historial;
    }

    public void setHistorial(List<PagoBO> historial) {
        this.historial = historial;
    }
    
    public List<ProductoBO> listaProductosCliente(List<Producto> productos){
        List<ProductoBO> listaProductosBO = new LinkedList();
                ListIterator<Producto> listaProductos = productos.listIterator();
            while (listaProductos.hasNext()) {
                listaProductosBO.add(new ProductoBO(listaProductos.next()));
            }
        return listaProductosBO;
    }
    
    public void registra(){
//        IClienteDAO clienteDao = new ListClienteDAO();
        IClienteDAO clienteDao = new ClienteDAO();
        clienteDao.agregar(new Cliente(apodo, contrasena, nacimiento, correo));
    }
    
    public boolean busca(){
//        IClienteDAO clienteDao = new ListClienteDAO();
        IClienteDAO clienteDao = new ClienteDAO();
        Cliente cliente = clienteDao.buscar(apodo);
        
        return cliente!=null;
    }
    
    public boolean inicia(){
//        IClienteDAO clienteDao = new ListClienteDAO();
        IClienteDAO clienteDao = new ClienteDAO();
        Cliente cliente = clienteDao.iniciar(apodo, contrasena);
        return cliente!=null;
    }
    
    public List<ProductoDTO> buscaCarrito(){
        List<ProductoDTO> productos = new LinkedList();
//        IClienteDAO clienteDao = new ListClienteDAO();
//        IProductoDAO productoDao = new ListProductoDAO();
        IClienteDAO clienteDao = new ClienteDAO();
        IProductoDAO productoDao = new ProductoDAO();
        
        ListIterator<Producto> lista = clienteDao.obtenerCarrito(clienteDao.buscar(apodo)).listIterator();
        while (lista.hasNext()) {
            Producto producto = lista.next();
            productos.add(new ProductoDTO(producto.getId(), producto.getNombre(), producto.getUrlImagen(), producto.getCosto()));
        }

        return productos;
    }
    
}
