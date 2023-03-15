/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author jeiso
 */
public class Departamento {
    private String codigoDepartamento;
    private String nombreDepartamento;
    private String codigoRegion;

    public Departamento(String codigoDepartamento,String nombreDepartamento,String codigoRegion){
        this.codigoDepartamento = codigoDepartamento;
        this.nombreDepartamento = nombreDepartamento;
        this.codigoRegion = codigoRegion;
    }
    
    public void setCodigoDep(String codigoDepartamento){
        this.codigoDepartamento = codigoDepartamento;
    }
    public void setNombreDep(String nombreDepartamento){
        this.nombreDepartamento = nombreDepartamento;
    }
    public void setCodigoRegion(String codigoRegion){
        this.codigoRegion = codigoRegion;
    }
    
    
    public String getCodigoDep(){
        return this.codigoDepartamento;
    }
    public String getNombreDep(){
        return this.nombreDepartamento;
    }
    public String getCodigoReg(){
        return this.codigoRegion;
    }
}
