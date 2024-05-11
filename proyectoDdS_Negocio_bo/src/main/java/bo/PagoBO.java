/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;

import dao.ListClienteDAO;
import dao.ClienteDAO;
import dao.IClienteDAO;
import dao.ICuponDAO;
import dao.IPagoDAO;
import dao.ListCuponDAO;
import dao.CuponDAO;
import dao.ListPagoDAO;
import dao.PagoDAO;
import dto.ClienteDTO;
import dto.PagoDTO;
import entidades.Cliente;
import entidades.Cupon;
import entidades.Pago;
import entidades.Producto;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Gui26
 */
public class PagoBO {
    
    private String metodo;
    private float total;
    private List<ProductoBO> carrito;

    public PagoBO() {
    }
    
    public PagoBO(String metodo, float total, List<ProductoBO> carrito) {
        this.metodo = metodo;
        this.total = total;
        this.carrito = carrito;
    }

    public PagoBO(Pago pago) {
        this.metodo = pago.getMetodo();
        this.total = pago.getTotal();
        this.carrito = listaProductosPago(pago.getCarrito());
    }
    
    public PagoBO(PagoDTO pago) {
        this.metodo = pago.getMetodo();
        this.total = pago.getTotal();
    }
    
    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public List<ProductoBO> getCarrito() {
        return carrito;
    }

    public void setCarrito(List<ProductoBO> carrito) {
        this.carrito = carrito;
    }
    
    public List<ProductoBO> listaProductosPago(List<Producto> productos){
        List<ProductoBO> listaProductosBO = new LinkedList();
        ListIterator<Producto> listaProductos = productos.listIterator();
        while (listaProductos.hasNext()) {
            listaProductosBO.add(new ProductoBO(listaProductos.next()));
        }
        return listaProductosBO;
    }
    
    public boolean generarPago(ClienteDTO clienteDto){
        
//        IClienteDAO clienteDao = new ListClienteDAO();
        IClienteDAO clienteDao = new ClienteDAO();
        
        Cliente cliente = clienteDao.buscar(clienteDto.getApodo());
        clienteDao.obtenerCarrito(cliente);
        
//        IPagoDAO pagoDao = new ListPagoDAO();
        IPagoDAO pagoDao = new PagoDAO();
        Pago pago = new Pago(metodo, total, clienteDao.obtenerCarrito(cliente));
        
        return pagoDao.nuevoPago(cliente, pago)!=null;
    }
    
    public boolean generarPagoDescuento(PagoDTO pagoDto, ClienteDTO clienteDto){
        
//        IClienteDAO clienteDao = new ListClienteDAO();
        IClienteDAO clienteDao = new ClienteDAO();
        
        Cliente cliente = clienteDao.buscar(clienteDto.getApodo());
        List<Producto> carrito = clienteDao.obtenerCarrito(cliente);
        
//        ICuponDAO cuponDao = new ListCuponDAO();
        ICuponDAO cuponDao = new CuponDAO();
        Cupon cupon = cuponDao.buscar(pagoDto.getCodigoCupon());
        
//        IPagoDAO pagoDao = new ListPagoDAO();
        IPagoDAO pagoDao = new PagoDAO();
        Pago pago = new Pago(pagoDto.getMetodo(), pagoDto.getTotal(), carrito, cupon.getCodigo(), pagoDto.getTotalDescuento());
        
//        carrito(carrito);
        
        return pagoDao.nuevoPago(cliente, pago)!=null;
    }
    
//    private void carrito(List<Producto> carrito){
//        Producto guardado;
//        ListIterator<Producto> iterador = carrito.listIterator();
//        while (iterador.hasNext()) {
//            guardado = iterador.next();
//            System.out.println(guardado.getNombre());
//        }
//    }
    
}
