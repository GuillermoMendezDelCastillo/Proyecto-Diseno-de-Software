/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author Gui26
 */
public class CuponDTO {
    
    private String codigo;
    
    private float descuento;

    public CuponDTO(String codigo) {
        this.codigo = codigo;
    }
    
    public CuponDTO(float descuento) {
        this.descuento = descuento;
    }
    
    public CuponDTO(String codigo, float descuento) {
        this.codigo = codigo;
        this.descuento = descuento;
    }

    public String getCodigo() {
        return codigo;
    }

    public float getDescuento() {
        return descuento;
    }
    
}
