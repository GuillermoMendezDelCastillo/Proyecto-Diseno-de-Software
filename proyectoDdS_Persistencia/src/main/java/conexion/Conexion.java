/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
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
    
}
