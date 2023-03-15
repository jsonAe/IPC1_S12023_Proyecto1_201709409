/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import beans.Municipio;
import java.util.ArrayList;

/**
 *
 * @author jeiso
 */
public class Municipio_Controller {
    private static Municipio_Controller instancia;
    private ArrayList<Municipio>  listaMunicipio;
    
    public static Municipio_Controller getInstancia() {
        if (instancia == null) {
            instancia = new Municipio_Controller();
        }
        return instancia;
    }
    
    public Municipio_Controller(){
        listaMunicipio = new  ArrayList<Municipio>();
        this.listaMunicipio.add(new Municipio("VN", "Villa Nueva", "GT"));
        this.listaMunicipio.add(new Municipio("MX", "Mixco", "GT"));
        this.listaMunicipio.add(new Municipio("MS", "Masagua", "ESC"));  
    }
    
    public void agregarMunicipio(Municipio muni){
        this.listaMunicipio.add(muni);
    }
    public void eliminarMunicipio(String codigoMuni){
        for(Municipio muni :listaMunicipio) {
            if(muni.getCodigoMuni().equals(codigoMuni)){
                listaMunicipio.remove(muni);
                break;
            }
        }
    }
    public void actualizarMunicipio(Municipio muniEdit){
        for(Municipio muni :listaMunicipio) {
            if(muni.getCodigoMuni().equals(muniEdit.getCodigoMuni())){
                muni.setNombreMuni(muniEdit.getNombreMuni());
                muni.setCodigoDep(muniEdit.getCodigoDep());
                break;
            }
        }  
    }
    public ArrayList<Municipio> obtenerListaMunicipios(){
        return this.listaMunicipio;
    }
}
