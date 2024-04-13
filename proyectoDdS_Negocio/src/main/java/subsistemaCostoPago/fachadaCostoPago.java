/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistemaCostoPago;

import dto.ClienteDTO;

/**
 *
 * @author Gui26
 */
public class fachadaCostoPago implements ICostoPago{
    @Override
    public int costoPago(ClienteDTO clienteDto){
        CostoPago costo = new CostoPago();
        return costo.costo(clienteDto);
    }
}
