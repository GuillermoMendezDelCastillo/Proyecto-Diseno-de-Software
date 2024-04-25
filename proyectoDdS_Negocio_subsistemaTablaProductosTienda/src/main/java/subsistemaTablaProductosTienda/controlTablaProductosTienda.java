/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistemaTablaProductosTienda;

import bo.ProductoBO;
import dto.ProductoDTO;
import java.util.List;

/**
 *
 * @author Gui26
 */
public class controlTablaProductosTienda{
    
    public List<ProductoDTO> consulta(){
        ProductoBO productos = new ProductoBO();
        return productos.productosDTO();
    }
}
