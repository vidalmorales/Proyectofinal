/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Restaurante.models;

/**
 *
 * @author Usuario
 */
//public class PlatoInternacional extends Plato{
//    
//    /////////////////////////atributo
//    private String paisOrigen;
//    
//    ///////////////////////////////constructor
//
//    public PlatoInternacional(String paisOrigen, String nombre, double costoFabricacion) {
//        super(nombre, costoFabricacion);
//        this.paisOrigen = paisOrigen;
//    }
//
//    ///////////////////////////metodo de acceso
//
//    public String getPaisOrigen() {
//        return paisOrigen;
//    }
//
//    public void setPaisOrigen(String paisOrigen) {
//        this.paisOrigen = paisOrigen;
//    }
//    
//    @Override
//    public double calcularGanancia() {
//        return getCostoFabricacion() * 0.30;
//    }
public class PlatoInternacional extends Plato{
    private String paisOrigen;

    public PlatoInternacional(String paisOrigen) {
        this.paisOrigen = paisOrigen;
    }

    public PlatoInternacional(String paisOrigen, String nombre, double costoFabricacion, double precioVenta) {
        super(nombre, costoFabricacion, precioVenta);
        this.paisOrigen = paisOrigen;
    }

    @Override
    public double calcularGanancia(double costoDeFabricacion) {
        return costoDeFabricacion * 0.30;
    }
    
}

