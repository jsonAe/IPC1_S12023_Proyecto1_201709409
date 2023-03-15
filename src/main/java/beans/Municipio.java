/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author jeiso
 */
public class Municipio {
    private String codigoMuni;
    private String nombreMuni;
    private String codigoDep;
    
    public Municipio(String codigoMuni, String nombreMuni,String codigoDep){
        this.codigoMuni = codigoMuni;
        this.nombreMuni = nombreMuni;
        this.codigoDep = codigoDep;
    }
    public Municipio(){
    
    }
    public void setCodigoMuni(String codigoMuni){
        this.codigoMuni = codigoMuni;
    }
    public void setNombreMuni(String nombreMuni){
        this.nombreMuni = nombreMuni;
    }
    public void setCodigoDep(String codigoDep){
        this.codigoDep = codigoDep;
    }
    
    public String getCodigoMuni(){
        return this.codigoMuni;
    }
    public String getNombreMuni(){
        return this.nombreMuni;
    }
    public String getCodigoDep(){
        return this.codigoDep;
    }
    
}
