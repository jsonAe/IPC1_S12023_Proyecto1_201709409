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
    private double precioEspecial;
    private double precioEstandar;
    
    public Region(String codigo,String nombre,double precioEspecial,double precioEstandar){
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioEspecial = precioEspecial;
        this.precioEstandar = precioEstandar;
    }
    public Region(){
    
    }
    
    public void setCodigo(String codigo){
        this.codigo = codigo;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setPrecioEspecial(double precioEspecial){
        this.precioEspecial = precioEspecial;
    }
    public void setPrecioEstandar(double precioEstandar){
        this.precioEstandar = precioEstandar;
    }
    
    public String getCodigo(){
        return this.codigo;
    }
    public String getNombre(){
        return this.nombre;
    }
    public double getPrecioEspecial(){
        return this.precioEspecial;
    }
    public double getPrecioEstandar(){
        return this.precioEstandar;
    }
    
    
}
