/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;
import beans.*;
/**
 *
 * @author jeiso
 */
public class Atenticacion {
    private static Atenticacion instancia;
    
    public static Atenticacion getInstancia() {
        if (instancia == null) {
            instancia = new Atenticacion();
        }
        return instancia;
    }
    
    public boolean autenticarUsuario(String correo, String pass){
        for(Usuario user :RegistroUsuario.getInstancia().obtenerListaUsuarios()) {
            if(user.getCorreo().equals(correo) && user.getPassword().equals(pass)){
                return true;
            }
        }
        return false;
    }
    
    
}
