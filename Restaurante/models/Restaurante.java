/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Restaurante.models;

import java.awt.List;
import com.Restaurante.models.Plato;
import com.Restaurante.models.Menu;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Restaurante {
    
    ////////////////////////////////////atributos
    private String nombre;
    private String direccion;
    private String telefono;
    private Menu menu;
    private ArrayList<Venta> ventas;

    ///////////////////////////////////////constructores

    public Restaurante(String nombre, String direccion, String telefono, Menu menu, ArrayList<Venta> ventas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.menu = menu;
        this.ventas = ventas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }

    public Plato buscarPlato(Plato plato){
        return this.menu.buscarPlato(plato);
    }
    
    public Plato buscarPlato(String nombre){
        return this.menu.buscarPlato(nombre);
    }
    
    public Plato buscarPlato(int id){
        return this.menu.buscarPlato(id);
    }
    
    public boolean agregarPlato(Plato plato){
        return this.menu.agregarPlato(plato);
    }
    
    public Plato actualizarPlato(int id, Plato plato){
        return this.menu.actualizarPlato(id, plato);
    }
    
    public Plato eliminarPlato(int id){
        return this.menu.eliminarPlato(id);
    }
    
    public String mostrarMenu(){
        return this.menu.mostrarMenu();
    }
    
    public ArrayList<Plato> obtenerTodosPlatos(){
        return this.menu.getPlatos();
    }

    public ArrayList<Venta> getVentas(){
        return ventas;
    }
//    ///////////////////CRUD
//    public String mostrarMenu(){
//       return this.menu.mostrarMenu();
//    }
//    
//    public boolean agregarPlato(Plato plato){
//        return this.menu.agregarPlato(plato);
//    }
//
//    public Plato buscarPlato(Plato plato){
//        return this.menu.buscarPlato(plato);
//    }
//    
//    public Plato buscarPlato(int id){
//        return this.menu.buscarPlato(id);
//    }
//    
//    public Plato buscarPlato(String nombre){
//        return this.menu.buscarPlato(nombre);
//    }
//    
//    public Plato actualizarPlato(int id, Plato plato)
//    {
//        return this.menu.actualizarPlato(id, plato);
//    }   
//    public Plato eliminarPlato(int id){  
//        return this.menu.eliminarPlato(id);
//    }
//    
//    public void agregarMenu() {
//        menus.add(menu);
//    }
//    
//    public void realizarVenta(Venta venta){
//        this.ventas.add(venta);
//    }
//    
//    public ArrayList<Plato> obtenerTodosPlatos(){
//        return this.menu.getPlatos();
//    }
//    
//    
//    public ArrayList<Venta> getVentas() {
//        return ventas;
//    }
//    
//    public EstadoFinanciero generarEstadoFinanciero(Date fechaGeneracion){
//        double totalRecaudado = 0;
//        double totalGanancias = 0;
//        
//        for (Venta venta: ventas){
//            totalRecaudado = venta.getValorTotal();
//            totalGanancias = venta.getValorGanancia();
//        }
//        return new EstadoFinanciero(fechaGeneracion,totalGanancias,totalRecaudado);
//    }
}
