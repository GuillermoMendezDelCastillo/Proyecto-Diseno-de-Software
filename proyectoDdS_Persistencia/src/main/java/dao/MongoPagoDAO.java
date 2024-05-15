/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Interfaces.IConexion;
import Interfaces.IPagoDAO;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import entidades.Cliente;
import entidades.Pago;
import java.util.LinkedList;
import org.bson.Document;

/**
 *
 * @author Gui26
 */
public class MongoPagoDAO implements IPagoDAO{
    
    private IConexion conexionBD;
    
    public MongoPagoDAO() {
        IConexion conexion = new Conexion();
        this.conexionBD = conexion;
    }
    
    @Override
    public Pago nuevoPago(Cliente cliente, Pago pago){
        
        pago.setCliente(cliente);
        
        MongoDatabase mongoDatabase= conexionBD.crearConexionMongo();
        String nombreColeccion = "cliente";

        MongoCollection<Cliente> coleccionCliente = mongoDatabase.getCollection(nombreColeccion, Cliente.class);
        
        nombreColeccion = "pago";

        MongoCollection<Pago> coleccionPago = mongoDatabase.getCollection(nombreColeccion, Pago.class);
        
        coleccionPago.insertOne(pago);
        coleccionCliente.updateOne(eq("correo", cliente.getEmail()),
                new Document("$set",
                        new Document("carrito", new LinkedList()))
        );

        return pago; //cambiar para que devuelva el guardado
    }
    
}
