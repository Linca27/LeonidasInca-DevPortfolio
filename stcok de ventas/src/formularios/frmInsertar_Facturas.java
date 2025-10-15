/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import formularios.frm_Factura;
import Controladores.Listar_factura;
import Controladores.Listar_producto;
import Entidades.ExcepcionPersonalizada;
import Entidades.Factura;
import Entidades.Producto;
import static formularios.frm_Producto.jTable1;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class frmInsertar_Facturas extends javax.swing.JFrame {

    /**
     * Creates new form frmFacturas
     */
    int pos;
    
    public frmInsertar_Facturas() {
        initComponents();
    this.setLocationRelativeTo(this);
    }
    
    String funcion;
      public frmInsertar_Facturas(String funcion) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.funcion = funcion;
    }

      
      Listar_producto ocd = new Listar_producto();
    String producto;
    int cantidad;
    int precio;
    
    public void list_producto(){
        List<Producto> lista = ocd.listar();
        jTable1.setModel(ocd.MostrarTabla());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Facturas");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        jLabel2.setText("Codigo");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 46, -1, -1));
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 50, 109, -1));

        jLabel3.setText("Nombre");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 80, -1, -1));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, 109, -1));

        jLabel4.setText("Ciudad");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 114, -1, -1));
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 109, -1));

        jLabel5.setText("Producto");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 148, -1, -1));
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 109, -1));

        jLabel6.setText("Cantidad");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 182, -1, -1));

        jLabel7.setText("Precio");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 216, -1, -1));
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 170, 109, -1));
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 110, -1));

        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, -1, -1));

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        jButton3.setText("...");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, 40, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    Listar_producto opc= new Listar_producto();
    Producto pro= new Producto();
    private void Actualizar()
    {
        int codigo = Integer.parseInt(jTextField1.getText());
        int cantidad = Integer.parseInt(jTextField5.getText());
        pro = opc.Buscar(codigo) ;
        int StockActual = pro.getCantidad()-cantidad;
        opc.ActualizarStock(StockActual, codigo);
    }

    Listar_producto prolis = new Listar_producto();
    //Venta v = new Venta();
    Listar_factura Venlis = new Listar_factura();
    
    
    
    public void validarDatos()throws ExcepcionPersonalizada{
        if(jTextField1.getText().isEmpty() || jTextField2.getText().isEmpty() || jTextField3.getText().isEmpty() 
                || jTextField4.getText().isEmpty() || jTextField5.getText().isEmpty()|| jTextField6.getText().isEmpty()){
           throw new ExcepcionPersonalizada("Ha ingresado un dato incorrecto");
        }
    }
    public void establecerDatos(Factura estado){
        jTextField1.setText((String.valueOf(estado.getCodigo())));
        jTextField2.setText(estado.getNombre());
        jTextField3.setText(estado.getCiudad());
        jTextField4.setText(estado.getProducto());
        jTextField5.setText(String.valueOf(estado.getCantidad()));
        jTextField6.setText(String.valueOf(estado.getPrecio()));
        jTextField1.requestFocus();
    }
    
    public void obtenerDatos(){
        int codigo = Integer.valueOf(jTextField1.getText().trim());
        String nombre = jTextField2.getText().trim();
        String ciudad = jTextField3.getText().trim();
        String producto = jTextField4.getText().trim();
        int cantidad = Integer.valueOf(jTextField5.getText().trim());
        int precio = Integer.valueOf(jTextField6.getText().trim());
       
         Listar_factura estado = new Listar_factura();
        if(funcion.equals("Insertar")){
            estado.InsertarFacturas(new Factura(codigo, nombre, ciudad, producto, cantidad, precio));
//            precio = Integer.parseInt(jTable1.getValueAt(jTable1.getSelectedRow(),4).toString());
        }
        else{
           estado.modificarFactura(new Factura(codigo, nombre, ciudad, producto, cantidad, precio));
        }
        List<Factura> lista = estado.listar();
        frm_Factura.tabla.setModel(estado.MostrarTabla());
        //this.dispose();
        
    }
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
        validarDatos();
        obtenerDatos();
        
        Actualizar();
        
    }catch(ExcepcionPersonalizada e){
        JOptionPane.showMessageDialog(null, e.getMessage());
     
    
    }
//guardar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        frmagregarfactura fr = new frmagregarfactura(null, true);
        fr.setVisible(true);
        jTextField1.setText(String.valueOf(fr.codigo));
        jTextField4.setText(String.valueOf(fr.producto));
         jTextField6.setText(String.valueOf(fr.precio));
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(frmInsertar_Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmInsertar_Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmInsertar_Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmInsertar_Facturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmInsertar_Facturas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
