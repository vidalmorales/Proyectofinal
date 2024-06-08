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
public class AgregarPlatoNacionaloTipico extends javax.swing.JDialog {
    
    private Restaurante restaurante;
    private VentanaPrincipal ventanaPrincipal;
    /**
     * Creates new form AgregarPlato
     */
    public AgregarPlatoNacionaloTipico(java.awt.Frame parent, boolean modal, Restaurante restaurante,VentanaPrincipal ventana) {
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
        btnAgregar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtCostoFabricacion = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabel1.setText("Agregar Plato nacional");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

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
        jPanel2.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 230, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, -1, -1));

        btnVolver.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel2.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 90, 40));

        btnAgregar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 110, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Costo de fabricacion");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 130, -1, -1));

        txtCostoFabricacion.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtCostoFabricacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCostoFabricacionActionPerformed(evt);
            }
        });
        jPanel2.add(txtCostoFabricacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 120, 230, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 680, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        String Nombre = txtNombre.getText();
        if(txtNombre.getText().isEmpty()||txtCostoFabricacion.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Llene todos los campos ");
        }else{
            try {
                double costoFabricacion = Double.parseDouble(this.txtCostoFabricacion.getText());
                Plato plato = new PlatoNacionaloTipico(Nombre, costoFabricacion, costoFabricacion);
                if(this.restaurante.agregarPlato(plato)){
                JOptionPane.showMessageDialog(this, "El plato "+Nombre+ " ha sido agregado satisfactoriamente");
                this.dispose();
            }else{
               JOptionPane.showMessageDialog(this, "El plato "+Nombre+ "no ha sido agregado satisfactoriamente");
               this.dispose();
            }
            } catch (HeadlessException | NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Por favor ingrese un numero en el campo de texto ");
                this.txtCostoFabricacion.setText("");
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtCostoFabricacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCostoFabricacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCostoFabricacionActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtCostoFabricacion;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
