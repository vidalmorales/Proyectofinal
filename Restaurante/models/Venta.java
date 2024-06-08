/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Restaurante.models;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Usuario
 */
public class Venta {
    private static int contadorCodigos = 1;
    
    private int factura;
    private double valorTotal;
    private double valorGanancia;
    private Date fecha;
    private ArrayList<Plato> platosVendidos;
    private ArrayList<Venta> ventas;
    

    //////////////////////////////////constructores

    public Venta() {
        this.factura = contadorCodigos++;
        this.valorTotal = valorTotal;
        this.valorGanancia = valorGanancia;
        this.fecha = fecha;
        this.platosVendidos = platosVendidos;
        contadorCodigos++;
    }
    
    public Venta(double valorTotal, double valorGanancia, Date fecha){
        this.factura = Venta.contadorCodigos;
        this.valorTotal = valorTotal;
        this.valorGanancia = valorGanancia;
        this.fecha = fecha;
        contadorCodigos++;
    }
    
    public static int getcontadorCodigos(){
        return contadorCodigos;
    }

    public static void setcontadorCodigos(int contadorCodigos) 
    {
        Venta.contadorCodigos = contadorCodigos;
    }
    
    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorGanancia() {
        return valorGanancia;
    }

    /////////////////////////////////metodo acceso
    public void setValorGanancia(double valorGanancia) {    
        this.valorGanancia = valorGanancia;
    }

    public int getFactura() {
        return factura;
    }

    public void setFactura(int factura) {
        this.factura = factura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public ArrayList<Plato> getPlatosVendidos(){
        return platosVendidos;
    }
    
    public void setPlatosVendidos(ArrayList<Plato> platosVendidos){
        this.platosVendidos = platosVendidos;
    }

    public ArrayList<Venta> getVenta(){
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas){
        this.ventas = ventas;
    }

    public boolean agregarVenta(Venta venta){
       return this.ventas.add(venta);
    }
    public Venta buscarVenta(Venta venta){
        for(int i=0;i<this.ventas.size();i++)
        {
            Venta p= this.ventas.get(i);
            if(p.equals(venta))
            {
            return p;
            }
        }
      return null;
    }
    
    public Venta buscarVenta(int id){
        for(int i=0;i<this.ventas.size();i++)
        {
            Venta p= this.ventas.get(i);
            if(p.getId()== id)
            {
                return p;
            }
        }
      return null;
    }
    
    private int buscarIndiceVenta(int id){
        for(int i=0;i<this.ventas.size();i++)
        {
            Venta p= this.ventas.get(i);
            if(p.getId()== id)
            {
            return i;   
            }
        }
        return -1;
    }
    
   public Venta actualizarVenta(int id,Venta venta){
        int index = this.buscarIndiceVenta(id);
        if(index>=0){
            return this.ventas.set(index, venta);
        }else{
            return null;
        }
    } 
   
    public Venta eliminarVenta(int id){
        int index = this.buscarIndiceVenta(id);
        if(index>=0){
            return this.ventas.remove(index);
        }else{
          return null;
        }
    }
    
    public String mostrarVenta(){
        String menu="";
        for(int i=0;i<this.ventas.size();i++){
            Venta p= this.ventas.get(i);
            menu +=p.toString()+"\n";
        }
         return menu;
    }

    private int getId(){
        return 0;
    }

}
