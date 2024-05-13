/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import BO.PerfilBO;
import DTO.UsuarioDTO;
import Interfaz.IAdmin;
import java.util.Date;
import java.util.prefs.Preferences;

/**
 *
 * @author jesus
 */
public class Administrador implements IAdmin {

    private PerfilBO perfilBO = new PerfilBO();

    public Administrador() {
    }

    @Override
    public void Editar(UsuarioDTO usuarioDTO) {

        // Validar que los campos no estén en blanco y que la fecha de nacimiento no sea del mismo día de la ejecución
        if (usuarioDTO != null && usuarioDTO.getNombre() != null && !usuarioDTO.getNombre().isEmpty()
                && usuarioDTO.getCorreo() != null && !usuarioDTO.getCorreo().isEmpty()
                && usuarioDTO.getNacimiento() != null && !usuarioDTO.getNacimiento().equals(new Date())) {
            perfilBO.actualizarPerfil(usuarioDTO);
        } else {
            System.out.println("Error: Datos de usuario inválidos.");
        }
    }

    @Override
    public void Eliminar(UsuarioDTO usuarioDTO, String contraseñaConfirmada) {
        // Validar que el correo y la contraseña sean los mismos antes de eliminar
        if (usuarioDTO != null && contraseñaConfirmada != null && usuarioDTO.getCorreo() != null
                && usuarioDTO.getCorreo().equals(contraseñaConfirmada)) {
            perfilBO.eliminarCuenta(usuarioDTO, contraseñaConfirmada);
        } else {
            System.out.println("Error: Correo o contraseña incorrectos.");
        }
    }

    @Override
    public void desactivar(UsuarioDTO usuarioDTO, String contraseñaConfirmada) {
        // Validar que el correo y la contraseña sean los mismos antes de desactivar
        if (usuarioDTO != null && contraseñaConfirmada != null && usuarioDTO.getCorreo() != null
                && usuarioDTO.getCorreo().equals(contraseñaConfirmada)) {
            perfilBO.desactivarCuenta(usuarioDTO);
        } else {
            System.out.println("Error: Correo o contraseña incorrectos.");
        }
    }

    @Override
    public void actualizar(UsuarioDTO usuarioDTO) {
        // Validar que los campos no estén en blanco y que la fecha de nacimiento no sea del mismo día de la ejecución
        if (usuarioDTO != null && usuarioDTO.getNombre() != null && !usuarioDTO.getNombre().isEmpty()
                && usuarioDTO.getCorreo() != null && !usuarioDTO.getCorreo().isEmpty()
                && usuarioDTO.getNacimiento() != null && !usuarioDTO.getNacimiento().equals(new Date())) {
            perfilBO.actualizarPerfil(usuarioDTO);
        } else {
            System.out.println("Error: Datos de usuario inválidos.");
        }
    }

    @Override
    public UsuarioDTO ObtenerInfo(String correoElectronico, String contrasena) {

        if (correoElectronico == null || correoElectronico.isEmpty() || contrasena == null || contrasena.isEmpty()) {
            System.out.println("Error: El correo electrónico y la contraseña no pueden estar vacíos.");
            return null;
        }

        // Obtener la información utilizando el correo y la contraseña
        UsuarioDTO usuarioDTO = perfilBO.obtenerInfoUsuario(contrasena, correoElectronico);

        if (usuarioDTO == null) {
            System.out.println("Error: No se encontró un usuario con esos credenciales.");
            return null;
        }

        // Guardar la información en las preferencias del sistema
        Preferences prefs = Preferences.userRoot().node(this.getClass().getName());
        prefs.put("Nombre", usuarioDTO.getNombre());
        prefs.put("Correo", usuarioDTO.getCorreo());
        prefs.put("Nacimiento", usuarioDTO.getNacimiento().toString()); // Asegúrate de convertir la fecha a un formato adecuado

        // Devolver el usuarioDTO con la información obtenida
        return usuarioDTO;

    }

   

}
