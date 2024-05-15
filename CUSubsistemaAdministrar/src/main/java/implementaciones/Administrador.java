/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;


import Interfaz.IAdmin;
import bo.ClienteBO;
import dto.ClienteDTO;
import entidades.Cliente;
import java.util.Date;

/**
 *
 * @author jesus
 */
public class Administrador implements IAdmin {

    private ClienteBO perfilBO = new ClienteBO();

    public Administrador() {
    }

    @Override
    public void Editar(ClienteDTO clienteDTO) {
        // Validar que el DTO no sea nulo y contenga los datos necesarios
        if (clienteDTO == null || clienteDTO.getCorreo() == null || clienteDTO.getContrasena() == null) {
            System.out.println("Error: Datos de usuario incompletos.");
            return;
        }

        // Llamar al método de actualización de perfil en el BO
        perfilBO.actualizarPerfil(clienteDTO);
    }

    @Override
    public void desactivar(ClienteDTO clienteDTO, String contraseñaConfirmada) {
        if (clienteDTO == null || clienteDTO.getCorreo() == null || clienteDTO.getCorreo().isEmpty()
                || clienteDTO.getContrasena() == null || clienteDTO.getContrasena().isEmpty()) {
            System.out.println("Error: UsuarioDTO incompleto.");
            return;
        }

        // Llamar al método del BO para eliminar la cuenta
        perfilBO.desactivarCuenta(clienteDTO.getCorreo(), clienteDTO.getContrasena());
    }

    @Override
    public void actualizar(ClienteDTO clienteDTO) {
        perfilBO.actualizarPerfil(clienteDTO);

    }

    @Override
    public ClienteDTO ObtenerInfo(String correoElectronico, String contrasena) {
        if (correoElectronico == null || correoElectronico.isEmpty() || contrasena == null || contrasena.isEmpty()) {
            System.out.println("Error: El correo electrónico y la contraseña no pueden estar vacíos.");
            return null;
        }

        // Obtener la información utilizando el correo y la contraseña
        ClienteDTO clienteDTO = perfilBO.obtenerInfoUsuario(contrasena, correoElectronico);

        if (clienteDTO == null) {
            System.out.println("Error: No se encontró un usuario con esos credenciales.");
            return null;
        }

        // Devolver el usuarioDTO con la información obtenida
        return clienteDTO;

    }

    @Override
    public void crearCuenta(ClienteDTO clienteDTO) {
        // Validar que los campos obligatorios no estén en blanco
        if (clienteDTO != null && clienteDTO.getNombre() != null && !clienteDTO.getNombre().isEmpty()
                && clienteDTO.getCorreo() != null && !clienteDTO.getCorreo().isEmpty()
                && clienteDTO.getContrasena() != null && !clienteDTO.getContrasena().isEmpty()) {

            // Crear una instancia de Usuario a partir de UsuarioDTO
            Cliente usuario = new Cliente();
            usuario.setNombre(clienteDTO.getNombre());
            usuario.setEmail(clienteDTO.getCorreo());
            usuario.setFechaNacimiento(clienteDTO.getNacimiento());
            usuario.setContrasena(clienteDTO.getContrasena());
            usuario.setEstado("activo");

            // Insertar el nuevo usuario en la base de datos
            perfilBO.registra(usuario);
            System.out.println("Usuario registrado exitosamente.");
        } else {
            System.out.println("Error: Datos de usuario inválidos.");
        }
    }

    @Override
    public void Eliminar(ClienteDTO clienteDTO, String contrasenaConfirmada) {

        // Validar que el usuarioDTO no sea nulo y contenga correo y contraseña
        if (clienteDTO == null || clienteDTO.getCorreo() == null || clienteDTO.getCorreo().isEmpty()
                || clienteDTO.getContrasena() == null || clienteDTO.getContrasena().isEmpty()) {
            System.out.println("Error: UsuarioDTO incompleto.");
            return;
        }

        // Llamar al método del BO para eliminar la cuenta
        perfilBO.eliminarCuenta(clienteDTO.getCorreo(), clienteDTO.getContrasena());
    }

    @Override
    public void actualizarEstado(ClienteDTO clienteDTO) {
        if (clienteDTO == null || clienteDTO.getCorreo() == null || clienteDTO.getEstado() == null) {
            System.out.println("Error: Datos de usuario incompletos.");
            return;
        }

        // Llamar al método del BO para actualizar el estado del usuario
        perfilBO.actualizarEstado(clienteDTO);
    }
    
    @Override
     public void actualizarDatosUsuario(String correo, String contrasena, String nombre, Date fechaNacimiento) {
        if (correo == null || contrasena == null || nombre == null || fechaNacimiento == null) {
            System.out.println("Error: Datos de usuario incompletos.");
            return;
        }

        // Llamar al método de actualización del perfil en el BO
        perfilBO.actualizarDatosUsuario(correo, contrasena, nombre, fechaNacimiento);
    }

}
