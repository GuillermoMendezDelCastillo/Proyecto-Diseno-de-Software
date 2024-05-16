/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Interfaces.IClienteDAO;
import Interfaces.IConexion;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.in;
import entidades.Cliente;
import entidades.Producto;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Gui26
 */
public class MongoClienteDAO implements IClienteDAO {

    private IConexion conexionBD;

    private final MongoCollection<Cliente> ClienteCollection;

    public MongoClienteDAO() {
        IConexion conexion = new Conexion();
        this.conexionBD = conexion;

        this.ClienteCollection = conexionBD.crearConexionMongo().getCollection("cliente", Cliente.class);

    }

    @Override
    public Cliente agregar(Cliente cliente) {

        MongoDatabase mongoDatabase = conexionBD.crearConexionMongo();
        String nombreColeccion = "cliente";

        MongoCollection<Cliente> coleccion = mongoDatabase.getCollection(nombreColeccion, Cliente.class);

        coleccion.insertOne(cliente);

        return buscar(cliente.getEmail()); //cambiar para que devuelva el 
    }

    @Override
    public Cliente buscar(String correo) {

        MongoDatabase mongoDatabase = conexionBD.crearConexionMongo();
        String nombreColeccion = "cliente";

        MongoCollection<Cliente> coleccion = mongoDatabase.getCollection(nombreColeccion, Cliente.class);

        Cliente cliente = coleccion.find(eq("correo", correo)).first();

        return cliente;

    }
    
     public Cliente buscarCorreo(String correo) {

        MongoDatabase mongoDatabase = conexionBD.crearConexionMongo();
        String nombreColeccion = "cliente";

        MongoCollection<Cliente> coleccion = mongoDatabase.getCollection(nombreColeccion, Cliente.class);

        Cliente cliente = coleccion.find(eq("email", correo)).first();

        return cliente;

    }

//    @Override
//    public Cliente buscarPorId(Long id){
//        
//        EntityManager entityManager = null;
//        try {
//            entityManager = conexionBD.crearConexion();
//            Query query = entityManager.createQuery("SELECT c FROM Cliente c WHERE c.id = :id", Cliente.class);
//            query.setParameter("id", id);
//            return (Cliente) query.getSingleResult();
//        } catch (NoResultException e) {
//            return null; // No se encontró ningún cliente con el apodo dado
//        } finally {
//            if (entityManager != null) {
//                entityManager.close();
//            }
//        }
//    }
    @Override
    public Cliente iniciar(String correo, String contrasena) {

        MongoDatabase mongoDatabase = conexionBD.crearConexionMongo();
        String nombreColeccion = "cliente";

        MongoCollection<Cliente> coleccion = mongoDatabase.getCollection(nombreColeccion, Cliente.class);

        Cliente cliente = coleccion.find(and(eq("correo", correo), eq("contrasena", contrasena))).first();

        return cliente;

    }

    @Override
    public List<Producto> obtenerCarrito(Cliente client) {

        MongoDatabase mongoDatabase = conexionBD.crearConexionMongo();
        String nombreColeccion = "cliente";

        MongoCollection<Cliente> coleccionCliente = mongoDatabase.getCollection(nombreColeccion, Cliente.class);

        Cliente cliente = coleccionCliente.find(eq("correo", client.getEmail())).first();

        nombreColeccion = "producto";

        MongoCollection<Producto> coleccionProducto = mongoDatabase.getCollection(nombreColeccion, Producto.class);

        List<Producto> carrito = new LinkedList<>();

        coleccionProducto.find(in("identificador", client.getCarrito())).into(carrito);

        return carrito;

    }

    //---------------------------------------------------------------------------------------------------
    @Override
    public void insertarUsuario(Cliente cliente) {
        try {
            ClienteCollection.insertOne(cliente);
            System.out.println("Usuario insertado correctamente.");
        } catch (Exception e) {
            System.err.println("Error al insertar usuario: " + e.getMessage());
        }
    }

    @Override
    public void ActualizarUsuario(Cliente cliente) {
        try {
            // Buscar el usuario por correo electrónico (o cualquier otro identificador único)
            Document filtro = new Document("email", cliente.getEmail());
            Document actualizacion = new Document("$set", new Document("nombre", cliente.getNombre())
                    .append("estado", cliente.getEstado()));

            ClienteCollection.updateOne(filtro, actualizacion);
            System.out.println("Usuario actualizado correctamente.");
        } catch (Exception e) {
            System.err.println("Error al actualizar usuario: " + e.getMessage());
        }
    }

    @Override
    public void eliminarUsuario(String correo, String contrasena) {
        try {
            // Buscar el usuario por correo y contraseña
            Document filtro = new Document("email", correo)
                    .append("contrasena", contrasena);
            FindIterable<Cliente> resultado = ClienteCollection.find(filtro);

            if (resultado.iterator().hasNext()) {
                // Obtener el ID del usuario encontrado
                ObjectId idUsuario = resultado.first().getId();

                // Crear el filtro para actualizar el estado del usuario a eliminado
                Document filtroActualizar = new Document("_id", idUsuario);
                Document actualizacion = new Document("$set", new Document("estado", "eliminado"));

                ClienteCollection.updateOne(filtroActualizar, actualizacion);
                System.out.println("Usuario eliminado correctamente.");
            } else {
                System.out.println("Error: Usuario no encontrado.");
            }
        } catch (Exception e) {
            System.err.println("Error al eliminar usuario: " + e.getMessage());
        }
    }

    @Override
    public Cliente obtenerporID(Cliente cliente) {
        try {
            Document filtro = new Document("_id", cliente.getId());

            Cliente usuarioEncontrado = ClienteCollection.find(filtro).first();
            if (usuarioEncontrado != null) {
                return usuarioEncontrado;
            } else {
                System.out.println("Usuario no encontrado.");
                return null;
            }
        } catch (Exception e) {
            System.err.println("Error al obtener usuario por ID: " + e.getMessage());
            return null;
        }
    }

    @Override
    public Cliente obtenerPorContrasenaYCorreo(String contrasena, String correo) {
        try {
            Document filtro = new Document("contrasena", contrasena)
                    .append("email", correo);

            Cliente usuarioEncontrado = ClienteCollection.find(filtro).first();
            if (usuarioEncontrado != null) {
                return usuarioEncontrado;
            } else {
                System.out.println("Usuario no encontrado.");
                return null;
            }
        } catch (Exception e) {
            System.err.println("Error al obtener usuario por contraseña y correo: " + e.getMessage());
            return null;
        }
    }

    @Override
    public void DesactivarUsuario(String correo, String contrasena) {
        try {
            // Buscar el usuario por correo y contraseña
            Document filtro = new Document("email", correo)
                    .append("contrasena", contrasena);
            FindIterable<Cliente> resultado = ClienteCollection.find(filtro);

            // Verificar si se encontró un usuario
            if (resultado.iterator().hasNext()) {
                // Obtener el ID del usuario encontrado
                ObjectId idUsuario = resultado.first().getId();

                // Crear el filtro para actualizar el estado del usuario a eliminado
                Document filtroActualizar = new Document("_id", idUsuario);
                Document actualizacion = new Document("$set", new Document("estado", "desactivado"));

                // Actualizar el estado del usuario a eliminado
                ClienteCollection.updateOne(filtroActualizar, actualizacion);
                System.out.println("Usuario eliminado correctamente.");
            } else {
                System.out.println("Error: Usuario no encontrado.");
            }
        } catch (Exception e) {
            System.err.println("Error al eliminar usuario: " + e.getMessage());
        }
    }

    @Override
    public void actualizarPerfil(String correo, String contrasena, String nuevoNombre, Date nuevaFechaNacimiento) {
        try {
            // Buscar el usuario por correo y contraseña
            Document filtro = new Document("email", correo)
                    .append("contrasena", contrasena);
            FindIterable<Cliente> resultado = ClienteCollection.find(filtro);

            // Verificar si se encontró un usuario
            if (resultado.iterator().hasNext()) {
                // Obtener el ID del usuario encontrado
                ObjectId idUsuario = resultado.first().getId();

                // Crear el filtro para actualizar los datos del usuario
                Document filtroActualizar = new Document("_id", idUsuario);
                Document actualizacion = new Document("$set", new Document("nombre", nuevoNombre)
                        .append("fechaNacimiento", nuevaFechaNacimiento));

                // Actualizar los datos del usuario
                ClienteCollection.updateOne(filtroActualizar, actualizacion);
                System.out.println("Perfil de usuario actualizado correctamente.");
            } else {
                System.out.println("Error: Usuario no encontrado.");
            }
        } catch (Exception e) {
            System.err.println("Error al actualizar usuario: " + e.getMessage());
        }
    }

    @Override
    public void ActualizarDatos(String correo, String contrasena, String nombre, Date fechaNacimiento) {
        try {
            // Verificar que el correo y la contraseña coincidan para actualizar el usuario
            Document filtro = new Document("email", correo).append("contrasena", contrasena);
            Document actualizacion = new Document("$set", new Document("nombre", nombre)
                    .append("fechaNacimiento", fechaNacimiento));

            ClienteCollection.updateOne(filtro, actualizacion);
            System.out.println("Usuario actualizado correctamente.");
        } catch (Exception e) {
            System.err.println("Error al actualizar usuario: " + e.getMessage());
        }
    }

}
