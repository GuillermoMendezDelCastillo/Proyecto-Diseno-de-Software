/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistemaTablaProductosCliente;

import dto.ClienteDTO;
import dto.ProductoDTO;
import java.util.List;

/**
 *
 * @author Gui26
 */
public class fachadaTablaProductosCliente implements ITablaProductosCliente{
    
    @Override
    public List<ProductoDTO> tablaProductosCliente(ClienteDTO clienteDto){
        controlTablaProductosCliente tabla = new controlTablaProductosCliente();
        return tabla.consulta(clienteDto);
    }
}
