/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package subsistemaTablaProductosTienda;

import dto.ProductoDTO;
import java.util.List;

/**
 *
 * @author Gui26
 */
public class fachadaTablaProductosTienda implements ITablaProductosTienda{
    
    @Override
    public List<ProductoDTO> tablaProductosTienda(){
        TablaProductosTienda tabla = new TablaProductosTienda();
        return tabla.consulta();
    }
    
}
