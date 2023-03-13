/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author jeiso
 */
public class Usuario {
    private String correo;
    private String nombre;
    private String apellido;
    private String password;
    private String DPI;
    private String fechaNac;
    private String genero;
    private String nacionalidad;
    private String alias;
    private String telefono;
    private String rol;
    private String foto;
            
    
    public Usuario(String correo,String nombre,String apellido,String password,String DPI,String fechaNac,
            String genero,String nacionalidad, String alias,String telefono,String rol,String foto){
        this.correo = correo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.password = password;
        this.DPI = DPI;
        this.fechaNac = fechaNac;
        this.genero = genero;
        this.nacionalidad = nacionalidad;
        this.alias = alias;
        this.telefono = telefono;
        this.rol = rol;
        this.foto = foto;
    }
    
    //SETS
    public void setCorreo(String correo){
        this.correo = correo;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setPassword(String password){
        this.password = password;
    }
    public void setDPI(String DPI){
        this.DPI = DPI;
    }
    public void setFecha(String fechaNac){
        this.fechaNac = fechaNac;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public void setNacionalidad(String nacionalidad){
        this.nacionalidad = nacionalidad;
    }
    public void setAlias(String alias){
        this.alias = alias;
    }
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }
    public void setRol(String rol){
        this.rol = rol;
    }
    public void setFoto(String foto){
        this.foto = foto;
    }
    
    //GETS         
    public String getCorreo(){
        return this.correo;
    }
    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public String getPassword(){
        return this.password;
    }
    public String getDPI(){
        return this.DPI;
    }
    public String getFechaNac(){
        return this.fechaNac;
    }
    public String getGenero(){
        return this.genero;
    }
    public String getNacionalidad(){
        return this.nacionalidad;
    }
    public String getAlias(){
        return this.alias;
    }
    public String getTelefono(){
        return this.telefono;
    }
    public String getTRol(){
        return this.rol;
    }
    public String getFoto(){
        return this.foto;
    }
}
