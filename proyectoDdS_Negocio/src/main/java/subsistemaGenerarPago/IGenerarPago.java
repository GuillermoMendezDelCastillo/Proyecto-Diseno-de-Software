/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package subsistemaGenerarPago;

import dto.ClienteDTO;

/**
 *
 * @author Gui26
 */
public interface IGenerarPago {
    public boolean esValido(String metodo, String codigoMetodo, int total);
    public boolean generar(ClienteDTO clienteDTO, String metodo, String codigoMetodo, int total);
}
