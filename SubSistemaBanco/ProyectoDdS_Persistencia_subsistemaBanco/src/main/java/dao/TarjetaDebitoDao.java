/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import java.text.SimpleDateFormat;
import java.util.List;
import dao.ITarjetaDebito;
import entidades.TarjetaDebito;
import java.text.ParseException;
import java.util.Date;
/**
 *
 * @author Hector
 */
public class TarjetaDebitoDao implements ITarjetaDebito{

    private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection<Document> collection;
    
     // Conexión a la base de datos MongoDB
        public TarjetaDebitoDao() {
        mongoClient = MongoClients.create("mongodb://localhost:27017");
        database = mongoClient.getDatabase("local");
        collection = database.getCollection("tarjetas_debito");
    }

    @Override
    public TarjetaDebito obtenerTarjetaPorNumero(String numeroTarjeta) {
         // Realizar la búsqueda en la colección por el número de tarjeta
        Document query = new Document("numero_tarjeta", numeroTarjeta);
        Document result = collection.find(query).first();
        System.out.println(numeroTarjeta);
        // Verificar si se encontró la tarjeta
        if (result != null) {
            // Construir un objeto TarjetaDebito a partir del resultado de la consulta
            String titular = result.getString("titular");
//            Date fechaExpiracion = result.getDate("fecha_expiracion");

            // Obtén la fecha como una cadena
String fechaExpiracionComoCadena = result.getString("fecha_expiracion");

// Crea un SimpleDateFormat para el formato de tu fecha
SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

Date fechaExpiracion = null;
try {
    fechaExpiracion = formato.parse(fechaExpiracionComoCadena);
} catch (ParseException e) {
    e.printStackTrace();
}
            String codigoSeguridad = result.getString("codigo_seguridad");
            String banco = result.getString("banco");          
    System.out.println("Si se encontro tarjeta ");
            // Crear y devolver el objeto TarjetaDebito
            return new TarjetaDebito(numeroTarjeta, titular, fechaExpiracion, codigoSeguridad, banco);
        } else {
            System.out.println("No se encontro tarjeta ");
            // Devolver null si no se encontró la tarjeta
            return null;
        }
    }


}
