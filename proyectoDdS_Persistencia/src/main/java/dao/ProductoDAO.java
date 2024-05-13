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
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;

/**
 *
 * @author Gui26
 */
public class ProductoDAO implements IProductoDAO{
    
    private IConexion conexionBD;
    
    public ProductoDAO() {
        IConexion conexion = new Conexion();
        this.conexionBD = conexion;
    }

    @Override
    public List<Producto> listaProductos() {
        EntityManager entityManager = conexionBD.crearConexion();
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        
        String jpqlQuery = "SELECT p FROM Producto p";
        TypedQuery<Producto> query = entityManager.createQuery(jpqlQuery, Producto.class);
        List<Producto> productos = query.getResultList();
        entityManager.close();
        
        return productos;
    }
    
    @Override
    public Producto buscarProducto(Long id){
        EntityManager entityManager = null;
        try {
            entityManager = conexionBD.crearConexion();
            Query query = entityManager.createQuery("SELECT p FROM Producto p WHERE p.id = :id", Producto.class);
            query.setParameter("id", id);
            return (Producto) query.getSingleResult();
        } catch (NoResultException e) {
            return null; // No se encontró ningún cliente con el apodo dado
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
    }
    
    @Override
    public Producto agregarCarrito(Cliente cliente, Producto producto){
        EntityManager entityManager = conexionBD.crearConexion();
        EntityTransaction transaction = null;

        try {
            transaction = entityManager.getTransaction();
            transaction.begin();
//            cliente.addProductoCarrito(producto);
            entityManager.merge(cliente);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace(); // Manejo de excepciones
        } finally {
            entityManager.close();
        }

        return producto; //cambiar para que devuelva el guardado
    }
    
}
