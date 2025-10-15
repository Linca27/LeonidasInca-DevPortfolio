/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Formularios.ListarClientes1;
import Controladores.TLista_Factura;
import Controladores.TLista_lenovo;
import Entidades.Facturas;
import Entidades.LaptopsLenovo;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class frmIngresoFatura extends javax.swing.JDialog {

    /**
     * Creates new form frmIngresoFatura
     */
    public frmIngresoFatura(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
       // MostrarComboCargo();
    }
    

    
    TLista_lenovo ocd=new TLista_lenovo();
    
    TLista_Factura hell= new TLista_Factura();
    
    public void MostrarComboCargo()
    {
        
        DefaultComboBoxModel dc= new DefaultComboBoxModel(hell.ListarCargosVector());
        jComboBox1.setModel(dc);
    }
    public Facturas CrearObjeto()
    {
        int codigo= Integer.valueOf(jTextField5.getText());
        int cedula = Integer.valueOf(jTextField1.getText());
        String nombre = jTextField2.getText();
        int celular = Integer.valueOf(jTextField3.getText());
        String direccion = jTextField4.getText();
        String fecha = jTextField6.getText();
        
        String tipo = jComboBox1.getSelectedItem().toString();
        String producto = jTextField7.getText();
        
        int total = Integer.valueOf(jTextField8.getText());
        Facturas ot= new Facturas(codigo, cedula, nombre, celular, direccion, fecha, tipo, producto, total);
        return ot;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        jLabel7.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        jLabel7.setText("Datos de Cliente");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 264, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 48, 390, 20));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setText("Factura Cliente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 191, 22));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/factura.png"))); // NOI18N
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, -10, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 4, 390, 40));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel2.setText("Cedula:");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 90, -1));

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel3.setText("Nombre:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 90, -1));

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel4.setText("N° Celular:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 90, -1));

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel5.setText("Dirección:");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 90, -1));

        jLabel6.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel6.setText("Fecha: ");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 80, -1));

        jTextField1.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 60, 190, -1));

        jTextField2.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jPanel2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 240, -1));

        jTextField3.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jPanel2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 240, -1));

        jTextField4.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jPanel2.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, 240, -1));

        jLabel10.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel10.setText("Tipo Pago:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione →", "Efectivo", "Tarjeta" }));
        jPanel2.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, 240, -1));

        jLabel11.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel11.setText("Producto:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, -1, -1));

        jLabel8.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel8.setText("Codigo:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jTextField5.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel2.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 240, -1));

        jTextField6.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jTextField6.setText("00/00/00");
        jPanel2.add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 260, 240, -1));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/lupa.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, 40, 30));

        jTextField7.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jPanel2.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 350, 190, -1));

        jTextField8.setFont(new java.awt.Font("Comic Sans MS", 0, 13)); // NOI18N
        jPanel2.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 190, -1));

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jLabel9.setText("......");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 390, 60, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/lupa.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 50, 40, -1));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/money.png"))); // NOI18N
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 390, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 75, 390, 417));

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/GuardarTodo.png"))); // NOI18N
        jButton1.setText("Guardar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 140, -1));

        jButton3.setFont(new java.awt.Font("Comic Sans MS", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/atras.png"))); // NOI18N
        jButton3.setText("Volver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 499, 390, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void SetDatos(Facturas nn)
    {
        jTextField5.setText(String.valueOf(nn.getCodigo()));
        jTextField1.setText(String.valueOf(nn.getCedula()));
        jTextField2.setText(nn.getNombre());
        jTextField3.setText(String.valueOf(nn.getCelular()));
        jTextField4.setText(nn.getDireccion());
        jTextField6.setText(nn.getFecha());
        jComboBox1.setSelectedItem(nn.getTipoPago());
        jTextField7.setText(nn.getProducto());
        jTextField8.setText(String.valueOf(nn.getTotalPago()-nn.getCodigo()));
        
    }
    
    public String mensaje = " ";
    public boolean validarDatos(){
        if( jTextField5.getText().isEmpty() || jTextField2.getText().isEmpty() || jTextField3.getText().isEmpty() || jTextField4.getText().isEmpty() || jTextField1.getText().isEmpty() || 
                jComboBox1.getSelectedIndex() == 0 || jTextField6.getText().isEmpty() || jTextField7.getText().isEmpty() || jTextField8.getText().isEmpty()){
            return false;
        }
        return true;
    }
    
    public void guardar(){
        
        try{
            
            if(validarDatos()){
                mensaje = "datos correctos";
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "Faltan por ingresar datos");
            }
            
        }catch(Exception e){
            e.printStackTrace();
            
            //JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        frmListarLaptops frmLE = new frmListarLaptops(null, true);
        frmLE.setVisible(true);
        jTextField7.setText(String.valueOf(frmLE.Nombre));
        if(jComboBox1.getSelectedItem().toString().equals("Efectivo")){
            jLabel9.setText("Efectivo");
        jTextField8.setText((String.valueOf(frmLE.costo1)));
        
        }
        if(jComboBox1.getSelectedItem().toString().equals("Tarjeta")){
            jLabel9.setText("Tarjeta");
        jTextField8.setText(String.valueOf(frmLE.costo2));
        
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        guardar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ListarClientes pn =new ListarClientes(null, true);
        pn.setVisible(true);
        jTextField1.setText(String.valueOf(pn.Cedula));
        jTextField2.setText(String.valueOf(pn.Nombre));
        jTextField3.setText(String.valueOf(pn.Celular));
        jTextField4.setText(String.valueOf(pn.Direccion));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

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
            java.util.logging.Logger.getLogger(frmIngresoFatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmIngresoFatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmIngresoFatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmIngresoFatura.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                frmIngresoFatura dialog = new frmIngresoFatura(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
