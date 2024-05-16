/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Interfaces.IConexion;
import Interfaces.IProductoDAO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import static com.mongodb.client.model.Updates.addToSet;
import entidades.Cliente;
import entidades.Producto;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import org.bson.Document;

/**
 *
 * @author Gui26
 */
public class MongoProductoDAO implements IProductoDAO{
    
    private IConexion conexionBD;
    
    public MongoProductoDAO() {
        IConexion conexion = new Conexion();
        this.conexionBD = conexion;
    }

    @Override
    public List<Producto> listaProductos() {
        
        MongoDatabase mongoDatabase= conexionBD.crearConexionMongo();
        String nombreColeccion = "producto";
        
        MongoCollection<Producto> coleccion = mongoDatabase.getCollection(nombreColeccion, Producto.class);
        
        List<Producto> productos = new LinkedList<>();
        coleccion.find().into(productos);
        
        return productos;
    }
    
    @Override
    public Producto buscarProducto(Long id){
        
        MongoDatabase mongoDatabase= conexionBD.crearConexionMongo();
        String nombreColeccion = "producto";
        
        MongoCollection<Producto> coleccion = mongoDatabase.getCollection(nombreColeccion, Producto.class);
        
        Producto producto = coleccion.find(eq("identificador", id)).first();
        
        return producto;
        
    }
    
    @Override
    public Producto agregarCarrito(Cliente cliente, Producto producto){
        
        MongoDatabase mongoDatabase= conexionBD.crearConexionMongo();
        String nombreColeccion = "cliente";

        MongoCollection<Cliente> coleccionCliente = mongoDatabase.getCollection(nombreColeccion, Cliente.class);
        
        nombreColeccion = "producto";

        MongoCollection<Producto> coleccionProducto = mongoDatabase.getCollection(nombreColeccion, Producto.class);
        Producto buscado = coleccionProducto.find(eq("identificador", producto.getIdentificador())).first();
//        System.out.println(buscado.toString());
        coleccionCliente.updateOne(eq("email", cliente.getEmail()), addToSet("carrito", buscado.getIdentificador())
//                new Document("$addToSet",
//                        new Document("carrito",
//                                new Document("$each", Arrays.asList())))
        );
        
        //Cliente clienteBuscado = coleccion.find(eq("apodo", cliente.getApodo())).first();
        
        return producto; //cambiar para que devuelva el guardado
    }
    
}
