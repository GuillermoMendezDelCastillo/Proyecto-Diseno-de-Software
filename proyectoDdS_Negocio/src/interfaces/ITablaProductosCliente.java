/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dto.ClienteDTO;
import dto.ProductoDTO;
import java.util.List;

/**
 *
 * @author Gui26
 */
public interface ITablaProductosCliente {
    public List<ProductoDTO> consulta(ClienteDTO clienteDto);
}
