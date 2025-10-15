/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Paneles.PanelBase;
import Paneles.PaneCatalogo;

import Paneles.PaneFacturar;
import Paneles.PaneClientes;
import frmTipos.frmLenovo;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Dumes, Inca
 */
public class frmBase extends javax.swing.JFrame {

    /**
     * Creates new form frmBase
     */
    public frmBase() {
        initComponents();
        
        setLocationRelativeTo(this);
        
        PanelBase pn= new PanelBase();
        LlamasPaneles(pn);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFijo = new javax.swing.JPanel();
        labelCatalogo = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        botonFactura3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        botonFactura1 = new javax.swing.JButton();
        botonCatalogo = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        botonFactura = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelFijo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labelCatalogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/aalapto_ccexpress (4).png"))); // NOI18N
        PanelFijo.add(labelCatalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-30, 120, 140, 70));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/salida2.png"))); // NOI18N
        PanelFijo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, 70, 70));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/usuario2.png"))); // NOI18N
        PanelFijo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 70, 70));

        botonFactura3.setBackground(new java.awt.Color(0, 102, 204));
        botonFactura3.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        botonFactura3.setText("Salir");
        botonFactura3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFactura3ActionPerformed(evt);
            }
        });
        PanelFijo.add(botonFactura3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 460, 150, 40));

        jButton1.setBackground(new java.awt.Color(0, 102, 204));
        jButton1.setForeground(new java.awt.Color(0, 102, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/casablanca.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        PanelFijo.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 40, 70, 60));

        botonFactura1.setBackground(new java.awt.Color(0, 102, 204));
        botonFactura1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        botonFactura1.setText("Clientes");
        botonFactura1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFactura1ActionPerformed(evt);
            }
        });
        PanelFijo.add(botonFactura1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 150, 40));

        botonCatalogo.setBackground(new java.awt.Color(0, 102, 204));
        botonCatalogo.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        botonCatalogo.setText("Catalogo");
        botonCatalogo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCatalogoActionPerformed(evt);
            }
        });
        PanelFijo.add(botonCatalogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 140, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/factura3.png"))); // NOI18N
        PanelFijo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 70, 70));

        botonFactura.setBackground(new java.awt.Color(0, 102, 204));
        botonFactura.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        botonFactura.setText("Facturar");
        botonFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonFacturaActionPerformed(evt);
            }
        });
        PanelFijo.add(botonFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 150, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/fondoahora (1).png"))); // NOI18N
        PanelFijo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 260, 520));

        getContentPane().add(PanelFijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 520));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 420, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 420, 520));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LlamasPaneles(JPanel pn){
        pn.setSize(420,530);
        pn.setLocation(0, 0);
        
        jPanel1.removeAll();
        jPanel1.add(pn , BorderLayout.CENTER);
        jPanel1.revalidate();
        jPanel1.repaint();
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        PanelBase pn= new PanelBase();
        LlamasPaneles(pn);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void botonCatalogoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCatalogoActionPerformed
        // TODO add your handling code here:
        
        PaneCatalogo pn= new PaneCatalogo();
        LlamasPaneles(pn);
         
        frmLenovo frm=new frmLenovo();
        frm.setVisible(true);
    }//GEN-LAST:event_botonCatalogoActionPerformed

    private void botonFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFacturaActionPerformed
        // TODO add your handling code here:
        PaneFacturar pn= new PaneFacturar();
        LlamasPaneles(pn);
        
        frmFacturas frm= new frmFacturas();
        frm.setVisible(true);
        
//        frmIngresoFatura frm=new frmIngresoFatura(this, rootPaneCheckingEnabled);
//        frm.setVisible(true);
    }//GEN-LAST:event_botonFacturaActionPerformed

    private void botonFactura1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFactura1ActionPerformed
        // TODO add your handling code here:
        PaneClientes pn= new PaneClientes();
        LlamasPaneles(pn);
        
        frmClientes frm=new frmClientes();
        frm.setVisible(true);
    }//GEN-LAST:event_botonFactura1ActionPerformed

    private void botonFactura3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonFactura3ActionPerformed
        // TODO add your handling code here:
        PanelBase pn= new PanelBase();
        LlamasPaneles(pn);
        int opcion = JOptionPane.showConfirmDialog(null,"Esta seguro de Salir?", "Salir",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
            if(opcion == JOptionPane.YES_OPTION)
            {
                this.dispose();
            }
    }//GEN-LAST:event_botonFactura3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmBase().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelFijo;
    private javax.swing.JButton botonCatalogo;
    private javax.swing.JButton botonFactura;
    private javax.swing.JButton botonFactura1;
    private javax.swing.JButton botonFactura3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelCatalogo;
    // End of variables declaration//GEN-END:variables
}
