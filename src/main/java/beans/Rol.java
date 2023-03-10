/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author jeiso
 */
public class Rol {
    private long id;
    private String nombre;
    
    public Rol(int id, String nombre){
        this.id = id;
        this.nombre = nombre;
    } 
    public void setNombreRol(String nombre){
        this.nombre = nombre;
    }
    public String getNombreRol(){
        return this.nombre;
    }
    public long getIdRol(){
        return this.id;
    }
}
