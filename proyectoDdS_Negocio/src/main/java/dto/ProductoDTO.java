/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author Gui26
 */
public class ProductoDTO {
    
    private String nombre;
    private String url;
    private float costo;

    public ProductoDTO(String nombre, String url, float costo) {
        this.nombre = nombre;
        this.url = url;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getUrl() {
        return url;
    }

    public float getCosto() {
        return costo;
    }
    
}
