/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaces;

import entidades.Cliente;
import entidades.Pago;

/**
 *
 * @author Gui26
 */
public interface IPagoDAO {
    public Pago nuevoPago(Cliente cliente, Pago pago);
}
