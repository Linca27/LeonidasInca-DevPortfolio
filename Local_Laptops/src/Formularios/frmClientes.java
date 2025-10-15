/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Controladores.TLista_Cliente;
import Datos.Conexion;
import Entidades.Clientes;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
//import com.itextpdf.text.Document;
//import com.itextpdf.text.DocumentException;
//import com.itextpdf.text.pdf.PdfPTable;
//import com.itextpdf.text.pdf.PdfWriter;
//import java.awt.HeadlessException;
//
//import com.itextpdf.text.Chunk;
//import com.itextpdf.text.Image;
//import com.itextpdf.text.Paragraph;
//import com.itextpdf.text.FontFactory;
//import com.itextpdf.text.BaseColor;
//import com.itextpdf.text.Font;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Usuario
 */
public class frmClientes extends javax.swing.JFrame {

    /**
     * Creates new form frmFacturas
     */
    public frmClientes() {
        initComponents();
        setLocationRelativeTo(this);
        ListarClientes();
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 960, 310));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/usuario2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 70, 80));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/editar_user.png"))); // NOI18N
        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 150, 50));

        jButton4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 20, 120, 50));

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/nuevo.png"))); // NOI18N
        jButton2.setText("Ingresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 120, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 530, 80));

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/print.png"))); // NOI18N
        jButton1.setText("Imprimir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 460, 150, 40));

        jButton5.setBackground(new java.awt.Color(255, 51, 51));
        jButton5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/atras.png"))); // NOI18N
        jButton5.setText("Volver");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 470, 110, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/utm.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setText("Gestion de Clientes");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fd1.png"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1010, -1));

        jButton6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/pdf.png"))); // NOI18N
        jButton6.setText("Reporte");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 460, 120, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    TLista_Cliente otd= new TLista_Cliente();
    
    public void ListarClientes()
    {
       jTable1.setModel(otd.MostrarTablaClientes());
        
        
    }
    public void Nuevo()
    {
         frmIngresoCliente frm= new frmIngresoCliente(null, true);
         frm.setVisible(true);
         
         if(frm.mensaje.equals("datos correctos")){
             Clientes hl= frm.CrearObjeto();
             otd.InsertarClientes(hl);
             JOptionPane.showMessageDialog(null, "Se ha ingresado correctamente la factura");
             
             ListarClientes();
         }
        
    }
   
    
    
    public void Modificar()
    {
         
                frmIngresoCliente modi= new frmIngresoCliente(null, true);
                int posicion = jTable1.getSelectedRow();
                if(posicion >= 0){
                int codigo= Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(),0).toString());
                int cedula= Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(),1).toString());
                String nombre= jTable1.getValueAt(jTable1.getSelectedRow(),2).toString();
                int celular= Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(),3).toString());
                String direccion= jTable1.getValueAt(jTable1.getSelectedRow(),4).toString();
                
                modi.SetDatos(new Clientes(codigo, cedula, nombre, celular, direccion));
                
                modi.setVisible(true);
                if(modi.mensaje.equals("datos correctos"))
                {
                    Clientes occ= modi.CrearObjeto();
                   // JOptionPane.showMessageDialog(null, occ.getCodigo() );
                    otd.modificarClientes(occ);
                    
                    
                    JOptionPane.showMessageDialog(null,"Factura modificada");
                    ListarClientes();
                }
                }else{
                    JOptionPane.showMessageDialog(null, "Seleccione todos los campos");
                }
      
            
          
    }
    
    public void Eliminar()
    {
        if(jTable1.getSelectedRow()>=0)
        {
            try{
                int res = JOptionPane.showConfirmDialog(null, "Eliminar Trabajador", "Desea elimnar de la BD", JOptionPane.YES_NO_OPTION);
                if(res ==JOptionPane.YES_OPTION)
                {
                    int codigo= Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(),0).toString());
                int ced= Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(),1).toString());
                String nom= jTable1.getValueAt(jTable1.getSelectedRow(),2).toString();
                int celular= Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(),3).toString());
                String direccion= jTable1.getValueAt(jTable1.getSelectedRow(),4).toString();
                Clientes oeno= new Clientes(codigo, celular, nom, celular, direccion);
                    otd.eliminarClientes(oeno);
                    JOptionPane.showMessageDialog(null,"Cliente eliminado");
                    ListarClientes();
                }
            }catch(Exception ex)
            {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
             }
        }
        else
            JOptionPane.showMessageDialog(null, "Seleccione la fila que desea eliminar");
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Nuevo();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       
Modificar();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
Eliminar();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
//        int opcion = JOptionPane.showConfirmDialog(null,"Esta seguro de Salir?", "Salir",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
//        if(opcion == JOptionPane.YES_OPTION)
//        {
            this.dispose();
       // }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
//        Document documento=new Document();
//        try {
//            String ruta= System.getProperty("user.home");
//            PdfWriter.getInstance(documento, new FileOutputStream(ruta+ "/Desktop/Reporte_Proyecto.pdf"));
//            
//            Image header= Image.getInstance("src/Img/header.png");
//            header.scaleToFit(650, 1000);
//            header.setAlignment(Chunk.ALIGN_CENTER);
//            Paragraph parrafo= new Paragraph();
//            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
//            parrafo.add("Formato Creado por Inca y Dumes © \n\n");
//            parrafo.setFont(FontFactory.getFont("Time New Roman",18,Font.BOLD,BaseColor.RED));
//
//            documento.open();
//            documento.add(header);
//            documento.add(parrafo);
//            
//            PdfPTable tabla= new PdfPTable(5);
//            tabla.addCell("Id Cliente");
//            tabla.addCell("Cedula");
//            tabla.addCell("Nombre");
//            tabla.addCell("Celular");
//            tabla.addCell("Direccion");
//            
//            try{
//                Connection cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/laptopsprofe","root","administrador");
//                PreparedStatement pst= cn.prepareStatement("select * from cliente");
//                ResultSet rs=pst.executeQuery();
//                
//                if(rs.next()){
//                    do{
//                        tabla.addCell(rs.getString(1));
//                        tabla.addCell(rs.getString(2));
//                        tabla.addCell(rs.getString(3));
//                        tabla.addCell(rs.getString(4));
//                        tabla.addCell(rs.getString(5));
//                    }while(rs.next());
//                    documento.add(tabla);
//                }
//                
//                
//            }catch (DocumentException | SQLException e) {
//                System.out.println("Error de conexion " +e);
//        }
//            documento.close();
//            JOptionPane.showMessageDialog(null, "Reporte creado");
//        } catch (DocumentException | HeadlessException | FileNotFoundException e) {
//            System.out.println("Error en PDF "+e);
//        }catch(IOException e){
//            System.out.println("Error en la imh"+e);
//        }
//            
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        try {
        Conexion con=new Conexion();
        Connection conn= con.ObtenerConexion();
        JasperReport reporte=null;
        String path="src\\Reportes\\Clientes.jasper";
        
        
            reporte = (JasperReport) JRLoader.loadObjectFromLocation(path);
            JasperPrint jprint= JasperFillManager.fillReport(reporte,null,conn);
            
            JasperViewer view=new JasperViewer(jprint, false);
            view .setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            view.setVisible(true);
        
        } catch (JRException ex) {
            Logger.getLogger(frmClientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmClientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmClientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
