/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import com.mongodb.client.MongoDatabase;
import javax.persistence.EntityManager;

/**
 *
 * @author Gui26
 */
public interface IConexion {
    public EntityManager crearConexion();
    public MongoDatabase crearConexionMongo();
}
