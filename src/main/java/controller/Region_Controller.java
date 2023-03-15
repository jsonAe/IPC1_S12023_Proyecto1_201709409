/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import beans.Region;
import beans.Rol;
import beans.Usuario;
import java.util.ArrayList;

/**
 *
 * @author jeiso
 */
public class Region_Controller {
    private static Region_Controller instancia;
    private ArrayList<Region>  listaRegion;
    
    public static Region_Controller getInstancia() {
        if (instancia == null) {
            instancia = new Region_Controller();
        }
        return instancia;
    }
    public Region_Controller(){
        listaRegion = new  ArrayList<Region>();
        
        this.listaRegion.add(new Region("M", "Metropolitana", 25,35));
        this.listaRegion.add(new Region("NT", "Norte", 45.55,68.50));
        this.listaRegion.add(new Region("NO", "Nororiente", 35.48,58.68));
        this.listaRegion.add(new Region("SO", "Suroriente", 32.48,38.68));
        this.listaRegion.add(new Region("SOC", "Suroccidente", 29.00,34.00));
        this.listaRegion.add(new Region("NOC", "Noroccidente", 40.00,44.50));
    }
    public void agregarRegion(Region reg){
        this.listaRegion.add(reg);
    }
    public void eliminarRegion(String codigoReg){
        for(Region reg :listaRegion) {
            if(reg.getCodigo().equals(codigoReg)){
                listaRegion.remove(reg);
                break;
            }
        }
    }
    public void actualizarRegion(Region regionEdit){
        for(Region reg :listaRegion) {
            if(reg.getCodigo().equals(regionEdit.getCodigo())){
                reg.setNombre(regionEdit.getNombre());
                reg.setPrecioEspecial((double)regionEdit.getPrecioEspecial());
                reg.setPrecioEstandar((double)regionEdit.getPrecioEstandar());
                break;
            }
        }  
    }
    public ArrayList<Region> obtenerListaRegion(){
        return this.listaRegion;
    }
}
