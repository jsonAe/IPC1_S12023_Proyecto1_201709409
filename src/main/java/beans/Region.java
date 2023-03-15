/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author jeiso
 */
public class Region {
    private String codigo;
    private String nombre;
    private float precio;
    
    public Region(String codigo,String nombre,float precio){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setPrecio(float precio){
        this.precio = precio;
    }
    
    public String getCodigo(){
        return this.codigo;
    }
    public String getNombre(){
        return this.nombre;
    }
    public float getPrecio(){
        return this.precio;
    }
    
    
}
