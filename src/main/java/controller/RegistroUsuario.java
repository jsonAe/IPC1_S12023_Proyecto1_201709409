/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package controller;
import java.util.ArrayList;
import beans.*;
/**
 *
 * @author jeiso
 */
public class RegistroUsuario {
    private static RegistroUsuario instancia;
    private ArrayList<Usuario>  listaUsuarios;
    private ArrayList<Rol>  listaRol;
    private ArrayList<String>  listaNacionalidad;
    
    
    public static RegistroUsuario getInstancia() {
        if (instancia == null) {
            instancia = new RegistroUsuario();
        }
        return instancia;
    }
    
    public RegistroUsuario(){
        listaUsuarios = new  ArrayList<Usuario>();
        listaRol = new  ArrayList<Rol>();
        listaNacionalidad = new  ArrayList<String>();
        
        listaUsuarios.add(new Usuario("ipc1_201709409@ipc1delivery.com", "Jeison", "Estrada", 
                "201709409", "2780349770101", "31/08/1995", "M", "Guatemalteco", 
                "Json", "45872050", "Administrador", ""));
        
        
        listaRol.add(new Rol(0,"Usuario individual"));
        listaRol.add(new Rol(1,"Usuario empresarial"));
        listaRol.add(new Rol(2,"Kiosko"));
        
        listaNacionalidad.add("Guatemala");
        listaNacionalidad.add("El Salvador");
        listaNacionalidad.add("Honduras");
        listaNacionalidad.add("Nicaragua");
        listaNacionalidad.add("Costa Rica");
        listaNacionalidad.add("Panama");
    }
    
    
    
    
    
    
    public void agregarUsuario(Usuario user){
        listaUsuarios.add(user);
    }
    
    public ArrayList<Rol> obtenerListaRol(){
        return this.listaRol;
    }
    public ArrayList<String> obtenerListaNacionalidad(){
        return this.listaNacionalidad;
    }
    public ArrayList<Usuario> obtenerListaUsuarios(){
        return this.listaUsuarios;
    }
    public boolean validarPassword(String texto){
        // Verificar si contiene letras mayúsculas
        boolean tieneMayusculas = texto.matches(".*[A-Z].*");
        
        // Verificar si contiene letras minúsculas
        boolean tieneMinusculas = texto.matches(".*[a-z].*");
        
        // Verificar si contiene números
        boolean tieneNumeros = texto.matches(".*\\d.*");
        
        // Verificar si contiene caracteres especiales
        boolean tieneCaracteresEspeciales = texto.matches(".*[!@#$%^&*()_+=\\-\\[\\]\\';,.\\/\\{\\}\\|\":<>?~\\\\].*");

        if(tieneMayusculas == false || tieneMinusculas == false || tieneNumeros==false || tieneCaracteresEspeciales == false){
            return false;
        }
        return true;
    }
}
