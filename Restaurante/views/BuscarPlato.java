/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.Restaurante.views;

import com.Restaurante.models.Plato;
import com.Restaurante.models.PlatoNacionaloTipico;
import com.Restaurante.models.Restaurante;
import java.awt.HeadlessException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class BuscarPlato extends javax.swing.JDialog {
    
    private Restaurante restaurante;
     private VentanaPrincipal ventanaPrincipal;
    /**
     * Creates new form BuscarPlato
     */
    public BuscarPlato(java.awt.Frame parent, boolean modal, Restaurante restaurante,VentanaPrincipal ventana) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        try{
            this.setIconImage(new ImageIcon(getClass().getResource("com.Restaurante.imagen.restaurante.png")).getImage());
        }catch(Exception e){
            
        }
        this.restaurante = restaurante;
        this.ventanaPrincipal = ventana;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        txtNombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnbUSCAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Buscar Plato");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jPanel3.setBackground(new java.awt.Color(153, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 100, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 90));

        jPanel2.setBackground(new java.awt.Color(0, 255, 153));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtNombre.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 230, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, -1, -1));

        btnVolver.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel2.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 90, 40));

        btnbUSCAR.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnbUSCAR.setText("Buscar");
        btnbUSCAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbUSCARActionPerformed(evt);
            }
        });
        jPanel2.add(btnbUSCAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 110, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 680, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnbUSCARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbUSCARActionPerformed
        String Nombre = txtNombre.getText();
        if(txtNombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Llene todos los campos ");
        }
        Plato p = this.restaurante.buscarPlato(Nombre);
        if(p == null){
            JOptionPane.showMessageDialog(this, "El producto " +Nombre+ " no se ha encontrado");
           }else{
            JOptionPane.showMessageDialog(this, "El producto fue encontrado: \n\n"+
                                                             "Producto: "+p.getId()+":"+p.getNombre()+"\n"+
                                                              "Precio: "+p.getCostoFabricacion());
        }
    }//GEN-LAST:event_btnbUSCARActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JButton btnbUSCAR;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
