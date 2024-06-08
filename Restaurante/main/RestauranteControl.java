/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Restaurante.main;
import com.Restaurante.models.Menu;
import com.Restaurante.models.Plato;
import com.Restaurante.models.Restaurante;
import com.Restaurante.models.Venta;
import com.Restaurante.views.VentanaPrincipal;
import java.util.ArrayList;
import com.Restaurante.models.PlatoInternacional;
import com.Restaurante.models.PlatoNacionaloTipico;

/**
 *
 * @author Brayan Diaz
 * 
 */
public class RestauranteControl {
    
    public static void main(String[] args) {
        ArrayList<Plato> platos = new ArrayList<Plato>();
        

        Menu menu = new Menu("Comida Ancestral", 1995, platos);
        
        ArrayList<Venta> ventas = new ArrayList<Venta>();
        
        Restaurante restaurante = new Restaurante("El buen sabor", "Carrera 69 n 35 a 163", "8788623", menu, ventas);
        
        VentanaPrincipal ventana = new VentanaPrincipal(restaurante);
        ventana.setVisible(true);
    }
}
