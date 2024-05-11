/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Filters.in;
import entidades.Cliente;
import entidades.Producto;
import java.util.LinkedList;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author Gui26
 */
public class MongoClienteDAO implements IClienteDAO{
    
    private IConexion conexionBD;
    
    public MongoClienteDAO() {
        IConexion conexion = new Conexion();
        this.conexionBD = conexion;
    }
    
    @Override
    public Cliente agregar(Cliente cliente){
        
        MongoDatabase mongoDatabase= conexionBD.crearConexionMongo();
        String nombreColeccion = "cliente";
        
        MongoCollection<Cliente> coleccion = mongoDatabase.getCollection(nombreColeccion, Cliente.class);
        
        coleccion.insertOne(cliente);
        
        return buscar(cliente.getApodo()); //cambiar para que devuelva el 
    }
    
    @Override
    public Cliente buscar(String apodo){
        
        MongoDatabase mongoDatabase= conexionBD.crearConexionMongo();
        String nombreColeccion = "cliente";
        
        MongoCollection<Cliente> coleccion = mongoDatabase.getCollection(nombreColeccion, Cliente.class);
        
        Cliente cliente = coleccion.find(eq("apodo", apodo)).first();
        
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
    public Cliente iniciar(String apodo, String contrasena){
        
        MongoDatabase mongoDatabase= conexionBD.crearConexionMongo();
        String nombreColeccion = "cliente";
        
        MongoCollection<Cliente> coleccion = mongoDatabase.getCollection(nombreColeccion, Cliente.class);
        
        Cliente cliente = coleccion.find(and(eq("apodo", apodo),eq("contrasena", contrasena))).first();
        
        return cliente;
        
    }
    
    @Override
    public List<Producto> obtenerCarrito(Cliente client){
        
        MongoDatabase mongoDatabase= conexionBD.crearConexionMongo();
        String nombreColeccion = "cliente";
        
        MongoCollection<Cliente> coleccionCliente = mongoDatabase.getCollection(nombreColeccion, Cliente.class);
        
        Cliente cliente = coleccionCliente.find(eq("apodo", client.getApodo())).first();
        
        nombreColeccion = "producto";
        
        MongoCollection<Producto> coleccionProducto = mongoDatabase.getCollection(nombreColeccion, Producto.class);
        
        List<Producto> carrito = new LinkedList<>();
        
        coleccionProducto.find(in("identificador", client.getCarrito())).into(carrito);
        
        return carrito;
        
    }
    
}
