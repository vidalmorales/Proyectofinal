/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Restaurante.models;

/**
 *
 * @author Usuario
 */
public class PlatoNacionaloTipico extends Plato{

    public PlatoNacionaloTipico() {
    }

    public PlatoNacionaloTipico(String nombre, double costoFabricacion, double precioVenta) {
        super(nombre, costoFabricacion, precioVenta);
    }
    
    @Override
    public double calcularGanancia(double costoDeFabricacion) {
       return costoDeFabricacion * 0.25;
    }

    

}
