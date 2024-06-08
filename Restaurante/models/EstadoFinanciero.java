/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Restaurante.models;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Usuario
 */
public class EstadoFinanciero {
    
    
    private ArrayList<Plato> platosVendidos;

    public EstadoFinanciero(ArrayList<Plato> platosVendidos){
        this.platosVendidos = platosVendidos;
    }

    EstadoFinanciero(Date fechaGeneracion, double totalGanancias, double totalRecaudado) {
    }
    
    public double calcularTotalEstadoFinanciero(ArrayList<Plato> platosvendidos){
        double sumartotal= 0;
      

    for(Plato p : platosvendidos ){
        sumartotal=  p.getPrecioVenta()+ sumartotal;
    }  
        return sumartotal;
    }
    
    public String mostrarEstadoFinanciero(){
        String estadoFinanciero = "";
        for(int i=0;i<this.platosVendidos.size();i++){
            Plato p = this.platosVendidos.get(i);
            estadoFinanciero += p.toString()+"\n";
        }
        double total = calcularTotalEstadoFinanciero(platosVendidos);
        estadoFinanciero += "\n" + "Total Recaudado : " + total + "\n";
        estadoFinanciero += "Fecha Generacion Estado Financiero : " + new Date() + "\n";
        
        return estadoFinanciero;
    }

}
