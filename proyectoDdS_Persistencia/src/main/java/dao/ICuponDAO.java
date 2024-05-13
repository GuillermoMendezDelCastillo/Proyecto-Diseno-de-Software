/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package dao;

import entidades.Cupon;

/**
 *
 * @author Gui26
 */
public interface ICuponDAO {
    public Cupon buscar(String codigo);
    public boolean usar(String codigo);
}
