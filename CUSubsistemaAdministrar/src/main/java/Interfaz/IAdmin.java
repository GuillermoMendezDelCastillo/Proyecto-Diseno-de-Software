/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaz;

//import DTO.UsuarioDTO;
import dto.ClienteDTO;
import java.util.Date;

/**
 *
 * @author jesus
 */
public interface IAdmin {

    public void crearCuenta(ClienteDTO clienteDTO);

    public void Editar(ClienteDTO clienteDTO);

    public void Eliminar(ClienteDTO clienteDTO, String contrasenaConfirmada);

    public void desactivar(ClienteDTO clienteDTO, String contraseñaConfirmada);

    public void actualizar(ClienteDTO clienteDTO);

    public void actualizarEstado(ClienteDTO clienteDTO);

    public ClienteDTO ObtenerInfo(String correoElectronico, String contrasena);

    public void actualizarDatosUsuario(String correo, String contrasena, String nombre, Date fechaNacimiento);

}
