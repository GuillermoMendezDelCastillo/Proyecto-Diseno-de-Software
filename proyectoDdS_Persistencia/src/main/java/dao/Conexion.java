/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;
/**
 *
 * @author Gui26
 */
public class Conexion implements IConexion{
    
    @Override
    public EntityManager crearConexion(){
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("tienda_virtual");
        EntityManager entityManager = emFactory.createEntityManager();
        
        return entityManager;
    }

    @Override
    public MongoDatabase crearConexionMongo(){
        String cadenaConexion = "mongodb://127.0.0.1:27017";
        String nombreBaseDatos = "tienda_virtual";
        
        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
        
        MongoClientSettings settings = MongoClientSettings.builder()
        .applyConnectionString(new ConnectionString(cadenaConexion))
        .codecRegistry(pojoCodecRegistry)
        .build();
        MongoClient mongo = MongoClients.create(settings);
        
        MongoDatabase baseDatos = mongo.getDatabase(nombreBaseDatos);
        
        return baseDatos;
    }
    
}
