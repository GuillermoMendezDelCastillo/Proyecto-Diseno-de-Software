/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

/**
 *
 * @author Gui26
 */
@Entity
public class Cliente implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCliente")
    private Long id;
    
    @Column(name = "apodo", nullable = false, length = 200)
    private String apodo;
    
    @Column(name = "contrasena", nullable = false, length = 200)
    private String contrasena;
    
    @Column(name = "correo", nullable = false, length = 500)
    private String correo;
    
    @Column(name = "nacimiento", nullable = false)
    private LocalDate nacimiento;
    
    @ManyToMany
    @JoinTable(name = "cliente_producto", joinColumns = @JoinColumn(name = "cliente_id"), inverseJoinColumns = @JoinColumn(name = "producto_id"))
    private List<Producto> carrito;
    
    public Cliente() {
    }
    
    public Cliente(String apodo, String contrasena, LocalDate nacimiento, String correo) {
        this.apodo = apodo;
        this.contrasena = contrasena;
        this.nacimiento = nacimiento;
        this.correo = correo;
        this.carrito = new LinkedList<Producto>();
//        this.historial= new LinkedList<Pago>();
    }
    
        public Cliente(Long id, String apodo, String contrasena, LocalDate nacimiento, String correo) {
        this.id = id;
        this.apodo = apodo;
        this.contrasena = contrasena;
        this.nacimiento = nacimiento;
        this.correo = correo;
        this.carrito = new LinkedList<Producto>();
//        this.historial= new LinkedList<Pago>();
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public List<Producto> getCarrito() {
        return carrito;
    }

    public void setCarrito(List<Producto> carrito) {
        this.carrito = carrito;
    }

    public void addProductoCarrito(Producto producto){
        carrito.add(producto);
    }
    
    public void clearProductoCarrito(){
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
