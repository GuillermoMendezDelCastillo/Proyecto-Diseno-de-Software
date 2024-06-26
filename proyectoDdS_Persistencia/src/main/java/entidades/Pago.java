/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

//import java.io.Serializable;
import java.util.List;
import org.bson.types.ObjectId;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//import javax.persistence.ManyToOne;
//import javax.persistence.OneToOne;

/**
 *
 * @author Gui26
 */
//@Entity
public class Pago {//implements Serializable {
    
    private ObjectId id;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "idPago")
//    private Long id;
    
//    @Column(name = "metodo", nullable = false, length = 50)
    private String metodo;
    
//    @Column(name = "total", nullable = false)
    private float total;
    
//    @ManyToMany
//    @JoinTable(name = "pago_producto", joinColumns = @JoinColumn(name = "pago_id"), inverseJoinColumns = @JoinColumn(name = "producto_id"))
    private List<Producto> carrito;
    
//    @ManyToOne()
//    @JoinColumn(name = "idCliente", nullable = false)
    private Cliente cliente;
    
//    @Column(name = "codigoCupon", nullable = true, length = 50)
    private String codigoCupon;
    
//    @Column(name = "totalDescuento", nullable = true)
    private Float totalDescuento;
    
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }
    
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    public Pago() {
    }
    
    public Pago(String metodo, float total, List<Producto> carrito) {
        this.metodo = metodo;
        this.total = total;
        this.carrito = carrito;
    }
    
    public Pago(String metodo, float total, List<Producto> carrito, String codigoCupon, float totalDescuento) {
        this.metodo = metodo;
        this.total = total;
        this.carrito = carrito;
        this.codigoCupon = codigoCupon;
        this.totalDescuento = totalDescuento;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public List<Producto> getCarrito() {
        return carrito;
    }

    public void setCarrito(List<Producto> carrito) {
        this.carrito = carrito;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    public String getCodigoCupon() {
        return codigoCupon;
    }

    public void setCodigoCupon(String codigoCupon) {
        this.codigoCupon = codigoCupon;
    }

    public Float getTotalDescuento() {
        return totalDescuento;
    }

    public void setTotalDescuento(Float totalDescuento) {
        this.totalDescuento = totalDescuento;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pago)) {
            return false;
        }
        Pago other = (Pago) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Pago[ id=" + id + " ]";
    }
    
}
