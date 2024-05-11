/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.eq;
import entidades.Cupon;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import org.bson.Document;
import static org.bson.codecs.configuration.CodecRegistries.fromProviders;
import static org.bson.codecs.configuration.CodecRegistries.fromRegistries;
import org.bson.codecs.configuration.CodecRegistry;
import org.bson.codecs.pojo.PojoCodecProvider;

/**
 *
 * @author Gui26
 */
public class MongoCuponDAO implements ICuponDAO{

    private IConexion conexionBD;
    
    public MongoCuponDAO() {
        IConexion conexion = new Conexion();
        this.conexionBD = conexion;
    }
    
    @Override
    public Cupon buscar(String codigo) {
        
        MongoDatabase mongoDatabase= conexionBD.crearConexionMongo();
        String nombreColeccion = "cupon";
        
        MongoCollection<Cupon> coleccion = mongoDatabase.getCollection(nombreColeccion, Cupon.class);
        
        List<Cupon> cupones = new LinkedList<>();
        coleccion.find().into(cupones);
        
        ListIterator<Cupon> listaCupones = cupones.listIterator();
        while (listaCupones.hasNext()) {
            Cupon buscado = listaCupones.next();
            if(buscado.getCodigo().equals(codigo)){
                return buscado;
            }
        }
        return null;
    }
    
    @Override
    public boolean usar(String codigo) {
        
        MongoDatabase mongoDatabase= conexionBD.crearConexionMongo();
        String nombreColeccion = "cupon";
        
        MongoCollection<Document> coleccion = mongoDatabase.getCollection(nombreColeccion);
        
        coleccion.updateOne(eq("codigo", codigo), new Document("$set", new Document("estado", false)));
        
        Document cupon = coleccion.find(eq("codigo", codigo)).first();
        
        if (cupon!=null){
            return cupon.getBoolean("estado");
        }
        
        return true;
        
    }
    
//    private MongoDatabase baseDatos(){
//        String cadenaConexion = "mongodb://127.0.0.1:27017";
//        String nombreBaseDatos = "tienda_virtual";
//        
//        CodecRegistry pojoCodecRegistry = fromRegistries(MongoClientSettings.getDefaultCodecRegistry(),
//                fromProviders(PojoCodecProvider.builder().automatic(true).build()));
//        
//        MongoClientSettings settings = MongoClientSettings.builder()
//        .applyConnectionString(new ConnectionString(cadenaConexion))
//        .codecRegistry(pojoCodecRegistry)
//        .build();
//        MongoClient mongo = MongoClients.create(settings);
//        
//        MongoDatabase baseDatos = mongo.getDatabase(nombreBaseDatos);
//        
//        return baseDatos;
//    }
    
}
