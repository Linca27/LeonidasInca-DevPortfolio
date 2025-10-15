/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frmTipos;

import Controladores.TLista_lenovo;
import Datos.Conexion;
import Entidades.LaptopsLenovo;
import Formularios.frmClientes;
import Formularios.frmIngresoLenovo;
//import com.itextpdf.text.BaseColor;
//import com.itextpdf.text.Chunk;
//import com.itextpdf.text.Document;
//import com.itextpdf.text.DocumentException;
//import com.itextpdf.text.Font;
//import com.itextpdf.text.FontFactory;
//import com.itextpdf.text.Image;
//import com.itextpdf.text.Paragraph;
//import com.itextpdf.text.pdf.PdfPTable;
//import com.itextpdf.text.pdf.PdfWriter;
import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
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
public class frmLenovo extends javax.swing.JFrame {

    /**
     * Creates new form frmLenovo
     */
    public frmLenovo() {
        //setIconImage(new ImageIcon(getClass().getResource("src/Img/empresa.png")).getImage());
        initComponents();
        
        setLocationRelativeTo(this);
        listarlenovo();
        
    }
    
    TLista_lenovo ocd = new TLista_lenovo();
    
    public void listarlenovo(){
        List<LaptopsLenovo> lista = ocd.listar();
        jTable1.setModel(ocd.mostrarTabla());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setFont(new java.awt.Font("Comic Sans MS", 0, 14)); // NOI18N
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 1090, 270));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton2.setText("Editar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 150, 50));

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/eliminar.png"))); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 130, 50));

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/nuevo.png"))); // NOI18N
        jButton1.setText("Añadir Producto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 170, 50));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 510, 100));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/aaaacompu (3).png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 250, 140));

        jButton5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/print.png"))); // NOI18N
        jButton5.setText("Imprimir");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 140, -1));

        jButton4.setBackground(new java.awt.Color(255, 51, 51));
        jButton4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/atras.png"))); // NOI18N
        jButton4.setText("Volver");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 490, 110, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/utm.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/producto.png"))); // NOI18N
        jLabel3.setText("Gestionar Productos");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/fd3_.png"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, -1));

        jButton6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/pdf.png"))); // NOI18N
        jButton6.setText("Reporte");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 460, 130, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
//        int opcion = JOptionPane.showConfirmDialog(null,"Esta seguro de Salir?", "Salir",JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
//            if(opcion == JOptionPane.YES_OPTION)
//            {
                this.dispose();
            //}
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int posicion = jTable1.getSelectedRow();
        if(posicion >= 0){
            frmIngresoLenovo modificar = new frmIngresoLenovo("Modificar");
            int codigo = Integer.parseInt(jTable1.getValueAt(posicion, 0).toString());
        String nombre = jTable1.getValueAt(posicion, 1).toString();
        String memoria = jTable1.getValueAt(posicion, 2).toString();
        String procesador = jTable1.getValueAt(posicion, 3).toString();
        String tipodisco = jTable1.getValueAt(posicion, 4).toString();
        String capacidad = jTable1.getValueAt(posicion, 5).toString();
        String pantalla = jTable1.getValueAt(posicion, 6).toString();
        int windows = Integer.valueOf(jTable1.getValueAt(posicion, 7).toString());
        String garantia = jTable1.getValueAt(posicion, 8).toString();
        int precioefectivo = Integer.valueOf(jTable1.getValueAt(posicion, 9).toString());
        int preciotarjeta = Integer.valueOf(jTable1.getValueAt(posicion, 10).toString());
            
            modificar.establecerDatos(new LaptopsLenovo(codigo, nombre, memoria, procesador, tipodisco, capacidad, pantalla, windows, garantia, precioefectivo, preciotarjeta));
            modificar.cambio.setText("Modificar Laptops");
            modificar.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "No ha seleccionado ningún Dato");
        }
       
        
    }//GEN-LAST:event_jButton2ActionPerformed
public void Eliminar()
    {
        if(jTable1.getSelectedRow()>=0)
        {
            try{
                int res = JOptionPane.showConfirmDialog(null, "Eliminar Producto ", "Desea elimnar de la BD", JOptionPane.YES_NO_OPTION);
                if(res ==JOptionPane.YES_OPTION)
                {
                int codigo= Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(),0).toString());
                String nom= jTable1.getValueAt(jTable1.getSelectedRow(),1).toString();
                String Ram= jTable1.getValueAt(jTable1.getSelectedRow(),2).toString();
                String Procesador=jTable1.getValueAt(jTable1.getSelectedRow(),3).toString();
                String Tipo= jTable1.getValueAt(jTable1.getSelectedRow(),4).toString();
                String Capacidad= jTable1.getValueAt(jTable1.getSelectedRow(),5).toString();
                String Pantalla= jTable1.getValueAt(jTable1.getSelectedRow(),6).toString();
                 int Windows= Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(),7).toString());
                String Garantia= jTable1.getValueAt(jTable1.getSelectedRow(),8).toString();
                 int PrecioEfectivo= Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(),9).toString());
                 int PrecioTarjeta= Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(),10).toString());
                 LaptopsLenovo oeno= new LaptopsLenovo(codigo, Garantia, Ram, Procesador, Tipo, Capacidad, Pantalla, Windows, Garantia, PrecioEfectivo, PrecioTarjeta);
                    ocd.eliminarLaptops(oeno);
                    JOptionPane.showMessageDialog(null,"Producto eliminado");
                    listarlenovo();
                }
            }catch(Exception ex)
            {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
             }
        }
        else
            JOptionPane.showMessageDialog(null, "Seleccione la fila que desea eliminar");
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        Eliminar();
    }//GEN-LAST:event_jButton3ActionPerformed

//    int posicion =jTable1.getSelectedRow();
//        TLista_lenovo cargo = new TLista_lenovo();
//        if(posicion >=0){
//            int codigo =Integer.valueOf(jTable1.getValueAt(posicion, 0).toString());
//            String nombre  = jTable1.getValueAt(posicion, 1).toString();
//            String memoria  = jTable1.getValueAt(posicion, 2).toString();
//            String procesador  = jTable1.getValueAt(posicion, 3).toString();
//            String tipo  = jTable1.getValueAt(posicion, 4).toString();
//            String capacidad  = jTable1.getValueAt(posicion, 5).toString();
//            String pantalla  = jTable1.getValueAt(posicion, 6).toString();
//            int windows  = Integer.valueOf(jTable1.getValueAt(posicion, 7).toString());
//            String garantia  = jTable1.getValueAt(posicion, 8).toString();
//            int precioefectivo  = Integer.valueOf(jTable1.getValueAt(posicion, 9).toString());
//            int preciotarjeta  = Integer.valueOf(jTable1.getValueAt(posicion, 10).toString());
//             cargo.eliminarCargo(new LaptopsLenovo(codigo, nombre, memoria, procesador, tipo, capacidad, pantalla, windows, garantia, precioefectivo, preciotarjeta));
//            jTable1.setModel(cargo.mostrarTabla(cargo.listar()));
//        }else{
//            JOptionPane.showMessageDialog(null, "No ha seleccionado ningún cargo");
//        
//        }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        frmIngresoLenovo insertar = new frmIngresoLenovo("Insertar");
        insertar.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
//        Document documento=new Document();
//        try {
//            String ruta= System.getProperty("user.home");
//            PdfWriter.getInstance(documento, new FileOutputStream(ruta+ "/Desktop/Reporte_Productos.pdf"));
//            
//            Image header= Image.getInstance("src/Img/header.png");
//            header.scaleToFit(650, 1000);
//            header.setAlignment(Chunk.ALIGN_CENTER);
//            Paragraph parrafo= new Paragraph();
//            parrafo.setAlignment(Paragraph.ALIGN_CENTER);
//            parrafo.add("Formato Creado por Inca y Dumes © \n\n");
//            parrafo.setFont(FontFactory.getFont("Times New Roman",18,Font.BOLD,BaseColor.RED));
//            parrafo.add("Registro Realizado \n\n");
//            
//            
//            
//            
//            
//            documento.open();
//            documento.add(header);
//            documento.add(parrafo);
//            
//            PdfPTable tabla= new PdfPTable(11);
//            tabla.addCell("Codigo");
//            tabla.addCell("Nombre");
//            tabla.addCell("Memoria");
//            tabla.addCell("Procesador");
//            tabla.addCell("Tipo");
//            tabla.addCell("Capacidad");
//            tabla.addCell("Pantalla");
//            tabla.addCell("Windows");
//            tabla.addCell("Garantia");
//            tabla.addCell("Precio en Efectivo");
//            tabla.addCell("Precio Targeta");
//            
//            
//            
//            
//            try{
//                Connection cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/laptopsss","root","administrador");
//                PreparedStatement pst= cn.prepareStatement("select * from lenovo");
//                ResultSet rs=pst.executeQuery();
//                
//                if(rs.next()){
//                    do{
//                        tabla.addCell(rs.getString(1));
//                        tabla.addCell(rs.getString(2));
//                        tabla.addCell(rs.getString(3));
//                        tabla.addCell(rs.getString(4));
//                        tabla.addCell(rs.getString(5));
//                        tabla.addCell(rs.getString(6));
//                        tabla.addCell(rs.getString(7));
//                        tabla.addCell(rs.getString(8));
//                        tabla.addCell(rs.getString(9));
//                        tabla.addCell(rs.getString(10));
//                        tabla.addCell(rs.getString(11));
//                    }while(rs.next());
//                    documento.add(tabla);
//                }
                
                
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
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        try {
        Conexion con=new Conexion();
        Connection conn= con.ObtenerConexion();
        JasperReport reporte=null;
        String path="src\\Reportes\\Productos.jasper";
        
        
            reporte = (JasperReport) JRLoader.loadObjectFromFile(path);
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
            java.util.logging.Logger.getLogger(frmLenovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmLenovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmLenovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmLenovo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmLenovo().setVisible(true);
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
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
