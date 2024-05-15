/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Interfaces.IConexion;
import Interfaces.IPagoDAO;
import entidades.Cliente;
import entidades.Pago;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author Gui26
 */
public class PagoDAO implements IPagoDAO{
    
    private IConexion conexionBD;
    
    public PagoDAO() {
        IConexion conexion = new Conexion();
        this.conexionBD = conexion;
    }
    
    @Override
    public Pago nuevoPago(Cliente cliente, Pago pago){
        EntityManager entityManager = conexionBD.crearConexion();
        EntityTransaction transaction = null;

        try {
            transaction = entityManager.getTransaction();
            transaction.begin();
            pago.setCliente(cliente);
            entityManager.persist(pago);
            cliente.clearProductoCarrito();
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

        return pago; //cambiar para que devuelva el guardado
    }
    
}
