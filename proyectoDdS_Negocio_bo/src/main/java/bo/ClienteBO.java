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
import entidades.Cliente;
import entidades.Producto;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Gui26
 */
public class ClienteBO {

    IClienteDAO usuarioDAO = new MongoClienteDAO();

    private String apodo;
    private String contrasena;
    private String correo;
    private Date nacimiento;
    private List<Long> carrito;
//    private List<PagoBO> historial;

    public ClienteBO() {
    }

    public ClienteBO(String apodo, String contrasena, Date nacimiento, String correo) {
        this.apodo = apodo;
        this.contrasena = contrasena;
        this.nacimiento = nacimiento;
        this.correo = correo;
        this.carrito = new LinkedList<>();
//        this.historial= new LinkedList<PagoBO>();
    }

    public ClienteBO(String apodo, String contrasena, String correo, Date nacimiento, List<Long> carrito) {//, List<PagoBO> historial
        this.apodo = apodo;
        this.contrasena = contrasena;
        this.correo = correo;
        this.nacimiento = nacimiento;
        this.carrito = new LinkedList<>();
//        this.historial = new LinkedList<PagoBO>();
    }

    public ClienteBO(Cliente cliente) {
//        this.idCliente = cliente.getId();
        this.apodo = cliente.getNombre();
        this.contrasena = cliente.getContrasena();
        this.nacimiento = cliente.getFechaNacimiento();
        this.correo = cliente.getEmail();
        this.carrito = cliente.getCarrito();//listaProductosCliente(cliente.getCarrito());
//        this.historial= listaPagosCliente(cliente.getHistorial());
    }

    public ClienteBO(ClienteDTO cliente) {
        this.apodo = cliente.getNombre();
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

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }

    public List<Long> getCarrito() {
        return carrito;
    }

    public void setCarrito(List<Long> carrito) {
        this.carrito = carrito;
    }

//    public List<PagoBO> getHistorial() {
//        return historial;
//    }
//
//    public void setHistorial(List<PagoBO> historial) {
//        this.historial = historial;
//    }
    public List<Long> listaProductosCliente(List<Long> productos) {
        List<Long> listaProductosBO = new LinkedList();
        ListIterator<Long> listaProductos = productos.listIterator();
        while (listaProductos.hasNext()) {
            listaProductosBO.add(listaProductos.next());
        }
        return listaProductosBO;
    }

    public void registra(Cliente cliente) {
//        IClienteDAO clienteDao = new ListClienteDAO();
        IClienteDAO clienteDao = new MongoClienteDAO();
        clienteDao.insertarUsuario(cliente);

    }

    public boolean busca() {
//        IClienteDAO clienteDao = new ListClienteDAO();
        IClienteDAO clienteDao = new MongoClienteDAO();
        Cliente cliente = clienteDao.buscar(apodo);

        return cliente != null;
    }

    public boolean inicia() {
//        IClienteDAO clienteDao = new ListClienteDAO();
        IClienteDAO clienteDao = new MongoClienteDAO();
        Cliente cliente = clienteDao.iniciar(apodo, contrasena);
        return cliente != null;
    }

    public List<ProductoDTO> buscaCarrito() {
        List<ProductoDTO> productos = new LinkedList();
//        IClienteDAO clienteDao = new ListClienteDAO();
//        IProductoDAO productoDao = new ListProductoDAO();
        IClienteDAO clienteDao = new MongoClienteDAO();
        IProductoDAO productoDao = new MongoProductoDAO();

        ListIterator<Producto> lista = clienteDao.obtenerCarrito(clienteDao.buscar(apodo)).listIterator();
        while (lista.hasNext()) {
            Producto producto = lista.next();
            productos.add(new ProductoDTO(producto.getIdentificador(), producto.getNombre(), producto.getUrlImagen(), producto.getCosto()));
        }

        return productos;
    }

    //------------------------------METODOS GESTION PERFIL ----------------------------------------
    public void actualizarPerfil(ClienteDTO usuarioDTO) {
        if (usuarioDTO == null || usuarioDTO.getCorreo() == null || usuarioDTO.getContrasena() == null) {
            System.out.println("Error: Datos de usuario incompletos.");
            return;
        }

        // Llamar al método de actualización del DAO con los datos del DTO
        usuarioDAO.actualizarPerfil(usuarioDTO.getCorreo(), usuarioDTO.getContrasena(), usuarioDTO.getNombre(), usuarioDTO.getNacimiento());
    }

    public void actualizarEstado(ClienteDTO usuarioDTO) {
        if (usuarioDTO == null || usuarioDTO.getCorreo() == null || usuarioDTO.getEstado() == null) {
            System.out.println("Error: Datos de usuario incompletos.");
            return;
        }

        // Crear un objeto Usuario con los datos del DTO
        Cliente usuario = new Cliente();
        usuario.setEmail(usuarioDTO.getCorreo());
        usuario.setNombre(usuarioDTO.getNombre());
        usuario.setEstado(usuarioDTO.getEstado());

        // Llamar al método de actualización del DAO con el objeto Usuario
        usuarioDAO.ActualizarUsuario(usuario);
    }

    // Método para desactivar la cuenta
    public void desactivarCuenta(String correo, String contrasena) {

        // Validar que los campos no estén en blanco
        if (correo == null || correo.isEmpty() || contrasena == null || contrasena.isEmpty()) {
            System.out.println("Error: Correo electrónico y contraseña no pueden estar vacíos.");
            return;
        }

        // Llamar al método del DAO para eliminar la cuenta
        usuarioDAO.DesactivarUsuario(correo, contrasena);
    }

    public void eliminarCuenta(String correo, String contrasena) {
        // Validar que los campos no estén en blanco
        if (correo == null || correo.isEmpty() || contrasena == null || contrasena.isEmpty()) {
            System.out.println("Error: Correo electrónico y contraseña no pueden estar vacíos.");
            return;
        }

        // Llamar al método del DAO para eliminar la cuenta
        usuarioDAO.eliminarUsuario(correo, contrasena);
    }

    public ClienteDTO obtenerInfoUsuario(String contrasena, String correoElectronico) {
        // Obtener información del usuario desde la base de datos
        Cliente usuario = usuarioDAO.obtenerPorContrasenaYCorreo(contrasena, correoElectronico);

        // Crear un objeto UsuarioDTO con los datos obtenidos
        ClienteDTO usuarioDTO = new ClienteDTO();
        usuarioDTO.setNombre(usuario.getNombre());
        usuarioDTO.setCorreo(usuario.getEmail());
        usuarioDTO.setEstado(usuario.getEstado());
        usuarioDTO.setNacimiento(usuario.getFechaNacimiento());

        return usuarioDTO;
    }

    public void actualizarDatosUsuario(String correo, String contrasena, String nombre, Date fechaNacimiento) {
        if (correo == null || contrasena == null || nombre == null || fechaNacimiento == null) {
            System.out.println("Error: Datos de usuario incompletos.");
            return;
        }

        // Llamar al método de actualización del DAO con los datos del usuario
        usuarioDAO.ActualizarDatos(correo, contrasena, nombre, fechaNacimiento);
    }

    public void crearCuenta(ClienteDTO clienteDTO) {
        // Validar que los campos obligatorios no estén en blanco
        if (clienteDTO != null && clienteDTO.getNombre() != null && !clienteDTO.getNombre().isEmpty()
                && clienteDTO.getCorreo() != null && !clienteDTO.getCorreo().isEmpty()
                && clienteDTO.getContrasena() != null && !clienteDTO.getContrasena().isEmpty()) {

            // Verificar si el correo electrónico ya está registrado
            if (!correoExiste(clienteDTO.getCorreo())) {
                // Crear una instancia de Usuario a partir de UsuarioDTO
                Cliente usuario = new Cliente();
                usuario.setNombre(clienteDTO.getNombre());
                usuario.setEmail(clienteDTO.getCorreo());
                usuario.setFechaNacimiento(clienteDTO.getNacimiento());
                usuario.setContrasena(clienteDTO.getContrasena());
                usuario.setEstado("activo");

                // Insertar el nuevo usuario en la base de datos
                registra(usuario);
                System.out.println("Usuario registrado exitosamente.");
            } else {
                System.out.println("Error: El correo electrónico ya está registrado.");
            }
        } else {
            System.out.println("Error: Datos de usuario inválidos.");
        }
    }

    private boolean correoExiste(String correo) {
        // Simulación de verificación de existencia de correo
        List<String> correosRegistrados = obtenerCorreosRegistrados(); // Supongamos que esta función obtiene los correos registrados en la base de datos
        return correosRegistrados.contains(correo);
    }

    private List<String> obtenerCorreosRegistrados() {
        // Simulación de obtención de correos registrados en la base de datos
        List<String> correosRegistrados = new ArrayList<>();
        // Lógica para obtener los correos registrados, por ejemplo, consultando la base de datos
        return correosRegistrados;
    }
}
