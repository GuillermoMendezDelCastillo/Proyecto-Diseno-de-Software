/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

//import java.io.Serializable;
import java.util.List;
import org.bson.types.ObjectId;
//import javax.persistence.CascadeType;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.ManyToMany;
//import javax.persistence.Table;

/**
 *
 * @author Gui26
 */
//@Entity
//@Table(name = "Producto")
public class Producto {//implements Serializable {

    private ObjectId id;
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "idProducto")
    private Long identificador;

//    @Column(name = "nombre", nullable = false, length = 200, unique = true)
    private String nombre;
    
//    @Column(name = "urlImagen", nullable = true, length = 500)
    private String urlImagen;
    
//    @Column(name = "costo", nullable = false)
    private float costo;
    
//    @Column(name = "cantidad", nullable = false)
    private int cantidad;
    
//    @ManyToMany(mappedBy = "carrito", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Pago> pagos;
    
//    @ManyToMany(mappedBy = "carrito", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<Cliente> clientes;
    
    public Producto(){
    }
    
    public Producto(String nombre, String urlImagen, float costo, int cantidad) {
        this.nombre = nombre;
        this.urlImagen = urlImagen;
        this.costo = costo;
        this.cantidad = cantidad;
    }
    
    public Producto(ObjectId id, Long identificador, String nombre, String urlImagen, float costo, int cantidad) {
        this.id = id;
        this.identificador = identificador;
        this.nombre = nombre;
        this.urlImagen = urlImagen;
        this.costo = costo;
        this.cantidad = cantidad;
    }
    
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }
    
    public Long getIdentificador() {
        return identificador;
    }

    public void setIdentificador(Long identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
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
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Producto{" + "id=" + id + ", identificador=" + identificador + ", nombre=" + nombre + ", urlImagen=" + urlImagen + ", costo=" + costo + ", cantidad=" + cantidad + ", pagos=" + pagos + ", clientes=" + clientes + '}';
    }
    
}