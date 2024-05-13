/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entidades.Cliente;
import entidades.Producto;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;

/**
 *
 * @author Gui26
 */
public class ClienteDAO implements IClienteDAO{
    
    private IConexion conexionBD;
    
    public ClienteDAO() {
        IConexion conexion = new Conexion();
        this.conexionBD = conexion;
    }
    
    @Override
    public Cliente agregar(Cliente cliente){
        EntityManager entityManager = conexionBD.crearConexion();
        EntityTransaction transaction = null;

        try {
            transaction = entityManager.getTransaction();
            transaction.begin();

            entityManager.persist(cliente);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace(); // Manejo de excepciones
        } finally {
            entityManager.close();
        }

        return cliente; //cambiar para que devuelva el 
    }
    
    @Override
    public Cliente buscar(String apodo){
        
        EntityManager entityManager = null;
        try {
            entityManager = conexionBD.crearConexion();
            Query query = entityManager.createQuery("SELECT c FROM Cliente c WHERE c.apodo = :apodo", Cliente.class);
            query.setParameter("apodo", apodo);
            return (Cliente) query.getSingleResult();
        } catch (NoResultException e) {
            return null; // No se encontró ningún cliente con el apodo dado
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
    }
    
    public Cliente buscarPorId(Long id){
        
        EntityManager entityManager = null;
        try {
            entityManager = conexionBD.crearConexion();
            Query query = entityManager.createQuery("SELECT c FROM Cliente c WHERE c.id = :id", Cliente.class);
            query.setParameter("id", id);
            return (Cliente) query.getSingleResult();
        } catch (NoResultException e) {
            return null; // No se encontró ningún cliente con el apodo dado
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
    }
    
    @Override
    public Cliente iniciar(String apodo, String contrasena){
        
        EntityManager entityManager = null;
        try {
            entityManager = conexionBD.crearConexion();
            Query query = entityManager.createQuery("SELECT c FROM Cliente c WHERE "
                    + "c.apodo = :apodo AND "
                    + "c.contrasena = :contrasena", Cliente.class);
            query.setParameter("apodo", apodo);
            query.setParameter("contrasena", contrasena);
            return (Cliente) query.getSingleResult();
        } catch (NoResultException e) {
            return null; // No se encontró ningún cliente con el apodo y contraseña dada
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
        
    }
    
    @Override
    public List<Producto> obtenerCarrito(Cliente client){
        
        EntityManager entityManager = null;
        try {
            entityManager = conexionBD.crearConexion();
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        
        Query query = entityManager.createQuery("SELECT p FROM Producto p WHERE p.clientes = :client", Producto.class);
        query.setParameter("client", client);
        List<Producto> productos = query.getResultList();
        
        return productos;
        } catch (NoResultException e) {
            return null;
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
    }
    
}
