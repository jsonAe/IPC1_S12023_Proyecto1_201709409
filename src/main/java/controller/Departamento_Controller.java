/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import beans.Departamento;
import java.util.ArrayList;

/**
 *
 * @author jeiso
 */
public class Departamento_Controller {
    private static Departamento_Controller instancia;
    private ArrayList<Departamento>  listaDepartamento;
    
    public static Departamento_Controller getInstancia() {
        if (instancia == null) {
            instancia = new Departamento_Controller();
        }
        return instancia;
    }
    
    public Departamento_Controller(){
        listaDepartamento = new  ArrayList<Departamento>();
        this.listaDepartamento.add(new Departamento("GT", "Guatemala", "M"));
        this.listaDepartamento.add(new Departamento("CHI", "Chiquimula", "NO"));
        this.listaDepartamento.add(new Departamento("ZAP", "Zacapa", "NO"));  
    }
    
    public void agregarDepartamento(Departamento dep){
        this.listaDepartamento.add(dep);
    }
    public void eliminarDepartamento(String codigoDep){
        for(Departamento reg :listaDepartamento) {
            if(reg.getCodigoDep().equals(codigoDep)){
                listaDepartamento.remove(reg);
                break;
            }
        }
    }
    public void actualizarDepartamento(Departamento departamentoEdit){
        for(Departamento dep :listaDepartamento) {
            if(dep.getCodigoDep().equals(departamentoEdit.getCodigoDep())){
                dep.setNombreDep(departamentoEdit.getNombreDep());
                dep.setCodigoRegion(departamentoEdit.getCodigoReg());
                break;
            }
        }  
    }
    public ArrayList<Departamento> obtenerListaDepartamento(){
        return this.listaDepartamento;
    }
}
