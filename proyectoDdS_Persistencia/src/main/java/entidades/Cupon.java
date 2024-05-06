/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Gui26
 */
public class Cupon {
    
    private String codigo;
    
    //private Date caducidad;
    
    private float descuento;
    
    private boolean estado;

    public Cupon() {
    }
    
    public Cupon(String codigo, float descuento) {
        this.codigo = codigo;
        this.descuento = descuento;
        this.estado = true;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
}
