/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Restaurante.models;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Menu {
    private String nombreRespresntativo;
    private int anoDeCreacion;
    private ArrayList<Plato> platos;
    
    //////////////////////////////////constructor

    public Menu(String nombreRespresntativo, int anoDeCreacion, ArrayList<Plato> platos) {
        this.nombreRespresntativo = nombreRespresntativo;
        this.anoDeCreacion = anoDeCreacion;
        this.platos = platos;
    }

    /////////////////////////////////////////////CRUD
    public boolean agregarPlato(Plato plato){
        return this.platos.add(plato);
    }
    
    public Plato buscarPlato(Plato plato){
        for(int i=0;i<this.platos.size();i++){
            Plato p = this.platos.get(i);
            if(p.equals(plato)){
                return p;
            }
        }
        return null;   
    }
    
    public Plato buscarPlato(int id){
        for(int i=0;i<this.platos.size();i++){
            Plato p = this.platos.get(i);
            if(p.getId() == id){
                return p;
            }
        }
        return null;   
    }
    
    public Plato buscarPlato(String nombre){
        for(int i=0;i<this.platos.size();i++){
            Plato p = this.platos.get(i);
            if(p.getNombre().equals(nombre)){
                return p;
            }
        }
        return null;   
    }
    
    private int buscarIndicePlato(int id){
        for(int i=0;i<this.platos.size();i++){
            Plato p = this.platos.get(i);
            if(p.getId() == id){
                return i;
            }
        }
        return -1;  
    }
    
    public Plato actualizarPlato(int id, Plato plato){
        int index = this.buscarIndicePlato(id);
        if(index>=0){
            return this.platos.set(index, plato);
        }else{
            return null;
        }
    }    
        
    public Plato eliminarPlato(int id){   
    int index = this.buscarIndicePlato(id);
        if(index>=0){
            return this.platos.remove(index);
        }else{
            return null;
        }
    }
    
    public String mostrarMenu(){
        String menu = "";
        for(int i=0;i<this.platos.size();i++){
            Plato p = this.platos.get(i);
            menu += p.toString()+"\n";
        }
        return menu;
    }
    public ArrayList<Plato> getPlatos(){
        return platos;
    }
}
