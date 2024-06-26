/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.Restaurante.views;

import com.Restaurante.models.Plato;
import com.Restaurante.models.Restaurante;
import com.Restaurante.models.Venta;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Usuario
 */
public class MostraVenta extends javax.swing.JDialog {
    
    private Restaurante restaurante;
    private VentanaPrincipal ventanaPrincipal;
    private ArrayList<Plato> platos;
    private ArrayList<Venta> vendidos;
    /**
     * Creates new form MostraVenta
     */
    public MostraVenta(java.awt.Frame parent, boolean modal,Restaurante restaurante,VentanaPrincipal ventana) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        try{
            this.setIconImage(new ImageIcon(getClass().getResource("com/Restaurante/imagen/mostrarventa.png")).getImage());
        }catch(Exception e){
            
        }
        this.platos = restaurante.obtenerTodosPlatos();
        this.vendidos = restaurante.getVentas();
        this.restaurante=restaurante;
        this.ventanaPrincipal = ventana;
        llenarTablaUno();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
        private void mouseEntered(JPanel panel){
        panel.setBackground(new Color(255, 131, 7));
    }
    
        
        
    public void llenarTablaUno(){
        DefaultTableModel modelDefault = new DefaultTableModel(new String[]{"Nombre","Precio"}, this.platos.size());
        this.jTable2.setModel(modelDefault);
        
        TableModel dataModel = jTable2.getModel();
        for (int i = 0; i < this.platos.size(); i++) {
            Plato p = this.platos.get(i);
            
            dataModel.setValueAt(p.getNombre(),i,0);
            dataModel.setValueAt(p.getPrecioVenta(),i,1);
            
        }
        
    }
    
    
    
    
    public void llenarTablaDos(){
        DefaultTableModel modelDefault = new DefaultTableModel(new String[]{"Fecha","Codigo","Total", "Ganancia"}, this.vendidos.size());
        this.jTable1.setModel(modelDefault);
        
        TableModel dataModel = jTable1.getModel();
        for (int i = 0; i < this.vendidos.size(); i++) {
            Venta v = this.vendidos.get(i);
            
            dataModel.setValueAt(v.getFecha(),i,0);
            dataModel.setValueAt(v.getFactura(),i,1);
            dataModel.setValueAt(v.getValorTotal(),i,2);
            dataModel.setValueAt(v.getValorGanancia(),i,3);
            
        }
        
    }
    
    private void mouseExited(JPanel panel)
    {
        panel.setBackground(new Color(240,240,240));
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnGeneraVenta = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnEliminarVenta = new javax.swing.JButton();
        btnMenuPrincipal = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 255, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnGeneraVenta.setText("Vender");
        btnGeneraVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGeneraVentaMouseClicked(evt);
            }
        });
        btnGeneraVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeneraVentaActionPerformed(evt);
            }
        });
        jPanel2.add(btnGeneraVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 60, -1, -1));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Precio"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jPanel2.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, 120));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Fecha", "Código", "Total", "Ganancia"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, 140));

        btnEliminarVenta.setText("Eliminar");
        btnEliminarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVentaActionPerformed(evt);
            }
        });
        jPanel2.add(btnEliminarVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, -1, -1));

        btnMenuPrincipal.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnMenuPrincipal.setText("Volver");
        btnMenuPrincipal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMenuPrincipalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenuPrincipalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenuPrincipalMouseExited(evt);
            }
        });
        btnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalActionPerformed(evt);
            }
        });
        jPanel2.add(btnMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 90, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 680, 370));

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("𝓥𝓮𝓷𝓽𝓪𝓼");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        jPanel3.setBackground(new java.awt.Color(94, 17, 213));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 90));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGeneraVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGeneraVentaMouseClicked

    }//GEN-LAST:event_btnGeneraVentaMouseClicked

    private void btnGeneraVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeneraVentaActionPerformed
    int fila = this.jTable2.getSelectedRow();
        if(fila>=0){
            Plato p = this.platos.get(fila);
            double ganancia = p.getPrecioVenta() - p.getCostoFabricacion();
            ganancia = ganancia - (ganancia* 0.19);
            Venta nuevaVenta = new Venta(p.getPrecioVenta(),ganancia , new Date());
            this.vendidos.add(nuevaVenta);
        }else{
            JOptionPane.showMessageDialog(this, "Por favor seleccione el producto que desea vender");
        }

        llenarTablaDos();
    }//GEN-LAST:event_btnGeneraVentaActionPerformed

    private void btnEliminarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVentaActionPerformed
    int fila = this.jTable1.getSelectedRow();
        if(fila>=0){
            Venta v = this.vendidos.get(fila);
            int option = JOptionPane.showConfirmDialog(this, "¿Desea eliminar la venta realizada de forma permanente?");
            if(option == 0){
                for (int i = 0; i < this.vendidos.size(); i++){
                    if(vendidos.get(i).equals(v)){
                        vendidos.remove(v);
                    }
                }
                this.llenarTablaDos();
                JOptionPane.showMessageDialog(this, "El venta fue eliminada de forma exitosa");
            }
        }else{
            JOptionPane.showMessageDialog(this, "Por favor seleccione la venta que desea eliminar");
        }
    }//GEN-LAST:event_btnEliminarVentaActionPerformed

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

    private void btnMenuPrincipalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuPrincipalMouseEntered
        this.mouseEntered(btnMenuPrincipal);
    }//GEN-LAST:event_btnMenuPrincipalMouseEntered

    private void btnMenuPrincipalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuPrincipalMouseExited
        this.mouseExited(btnMenuPrincipal);
    }//GEN-LAST:event_btnMenuPrincipalMouseExited

    private void btnMenuPrincipalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuPrincipalMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMenuPrincipalMouseClicked



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarVenta;
    private javax.swing.JButton btnGeneraVenta;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables

    private void mouseEntered(JButton btnMenuPrincipal) {
       
    }
    private void mouseExited(JButton btnMenuPrincipal) {
        
    }


}
