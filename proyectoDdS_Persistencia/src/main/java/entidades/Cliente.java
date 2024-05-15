/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

//import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedList;
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

/**
 *
 * @author Gui26
 */
//@Entity
public class Cliente {//implements Serializable {

//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "idCliente")
//    private Long id;
//    @Column(name = "apodo", nullable = false, length = 200)
//    @Column(name = "contrasena", nullable = false, length = 200)
//    @Column(name = "correo", nullable = false, length = 500)
//    @Column(name = "nacimiento", nullable = false)
//    @ManyToMany
//    @JoinTable(name = "cliente_producto", joinColumns = @JoinColumn(name = "cliente_id"), inverseJoinColumns = @JoinColumn(name = "producto_id"))
    private ObjectId id;
    private String nombre;
    private String email;
    private String contrasena;
    private Date fechaNacimiento;
    private String estado;
    private List<Long> carrito;

    public Cliente() {
    }

    public Cliente(ObjectId id, String nombre, String email, String contrasena, Date fechaNacimiento, String estado, List<Long> carrito) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.contrasena = contrasena;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
        this.carrito = carrito;;
        //        this.historial= new LinkedList<Pago>();

    }

    public Cliente(String nombre, String email, String contrasena, Date fechaNacimiento, String estado, List<Long> carrito) {
        this.nombre = nombre;
        this.email = email;
        this.contrasena = contrasena;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
        this.carrito = carrito;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<Long> getCarrito() {
        return carrito;
    }

    public void setCarrito(List<Long> carrito) {
        this.carrito = carrito;
    }

    
    
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
    public void addProductoCarrito(Long producto) {
        carrito.add(producto);
    }

    public void clearProductoCarrito() {
        carrito.clear();
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
        if (!(object instanceof Cliente)) {
            return false;
        }
        Cliente other = (Cliente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Cliente[ id=" + id + " ]";
    }

}
