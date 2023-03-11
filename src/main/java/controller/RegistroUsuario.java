/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


package controller;
import java.util.ArrayList;
import beans.Usuario;
/**
 *
 * @author jeiso
 */
public class RegistroUsuario {
    ArrayList<Usuario>  listaUsuarios = new  ArrayList<Usuario>();
    
    
    
    public void agregarUsuario(Usuario user){
        listaUsuarios.add(user);
    }
    
}
