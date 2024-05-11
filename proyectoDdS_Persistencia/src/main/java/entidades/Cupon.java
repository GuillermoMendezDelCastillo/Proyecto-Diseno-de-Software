/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Date;
//import javax.persistence.Column;
import org.bson.types.ObjectId;

/**
 *
 * @author Gui26
 */
public class Cupon {
    
    private ObjectId id;
    
//    @Column(name = "codigo")
    private String codigo;
    
    private Date caducidad;
    
    private float descuento;
    
    private boolean estado;

    public Cupon() {
    }
    
    public Cupon(String codigo, float descuento) {
        this.codigo = codigo;
        this.descuento = descuento;
        this.estado = true;
    }

    public Cupon(String codigo, Date caducidad, float descuento) {
        this.codigo = codigo;
        this.caducidad = caducidad;
        this.descuento = descuento;
        this.estado = true;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Date getCaducidad() {
        return caducidad;
    }

    public void setCaducidad(Date caducidad) {
        this.caducidad = caducidad;
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
