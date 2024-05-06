/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bo;
import dao.ICuponDAO;
import dao.ListCuponDAO;
import dto.CuponDTO;
import entidades.Cupon;
/**
 *
 * @author Gui26
 */
public class CuponBO {
    
    public CuponDTO buscar(String codigo){
        ICuponDAO cuponDao = new ListCuponDAO();
        Cupon cupon = cuponDao.buscar(codigo);
        if(cupon!=null){
            return new CuponDTO(cupon.getDescuento());
        }else{
            return null;
        }
    }
    
}
