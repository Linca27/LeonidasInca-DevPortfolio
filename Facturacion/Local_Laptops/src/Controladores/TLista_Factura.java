/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Datos.Conexion;
import Entidades.Facturas;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class TLista_Factura {
    private static final String Listar="select * from factura_clientef";
    private static final String Insertar="insert into factura_clientef values (?,?,?,?,?,?,?,?,?)";
    private static final String Modificar="update factura_clientef set idFactura_ClienteF=?,Cedula=?,Nombre=?,N°_Celular=?,Dirección=?,Fecha=?,TPago=?, Producto=?, Totalpago=? where idFactura_ClienteF=?" ;
    private static final String Eliminar="DELETE from factura_clientef where idFactura_ClienteF=?" ;
    
    public List<Facturas> ListarFacturas()
    {
        List<Facturas> Lista= new ArrayList<Facturas>();
        try{
           Conexion con= new Conexion();
           Connection conexion = con.ObtenerConexion();
           Statement st= conexion.createStatement();
           ResultSet res = st.executeQuery(Listar);
           while(res.next())
           {
              Facturas oc= new Facturas();
               oc.setCodigo(res.getInt(1));
               oc.setCedula(res.getInt(2));
               oc.setNombre(res.getString(3));
               oc.setCelular(res.getInt(4));
               oc.setDireccion(res.getString(5));
               oc.setFecha(res.getString(6));
               oc.setTipoPago(res.getString(7));
               oc.setProducto(res.getString(8));
               oc.setTotalPago(res.getInt(9));
               Lista.add(oc);
               
           }
            
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        
        }
        return Lista;
    }
    
    public DefaultTableModel MostrarTablaFacturas()
    {
        String[] Titulos={"Codigo","Cedula","Nombre","Celular","Direccion","Fecha","TipoPago","Producto","Total"};
        String[] Datos= new String[9];
        DefaultTableModel dt= new DefaultTableModel(null,Titulos);
        for(Facturas ot:ListarFacturas())
        {
            Datos[0]= String.valueOf(ot.getCodigo());
            Datos[1]= String.valueOf(ot.getCedula());
            Datos[2]= ot.getNombre();
            Datos[3]= String.valueOf(ot.getCelular());
            Datos[4]= ot.getDireccion();
            Datos[5]= ot.getFecha();
            Datos[6]= ot.getTipoPago();
            Datos[7]= ot.getProducto();
            Datos[8]= String.valueOf(ot.getTotalPago()* ot.getCelular());
            dt.addRow(Datos);
            
        }
        return dt;
    }
    
    public boolean InsertarFacturas(Facturas ot)
    {
        boolean op= false;
        Conexion con= new Conexion();
        try( Connection  conexion = con.ObtenerConexion())
        {
            PreparedStatement ps = conexion.prepareStatement(Insertar);
            ps.setInt(1,ot.getCodigo());
            ps.setInt(2, ot.getCedula());
            ps.setString(3, ot.getNombre());
            ps.setInt(4, ot.getCelular());
            ps.setString(5, ot.getDireccion());
            ps.setString(6, ot.getFecha());
            ps.setString(7, ot.getTipoPago());
            ps.setString(8, ot.getProducto());
            ps.setInt(9, ot.getTotalPago());
           int n = ps.executeUpdate();
            if(n!=0)
            {
                op=true;
            }
        
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return op;
    }
    
    
    public boolean modificarFactura(Facturas oc){
        boolean op = false; 
        Conexion con = new Conexion();
        try(Connection conexion = con.ObtenerConexion())
        {
            PreparedStatement ps = conexion.prepareStatement(Modificar);
            ps.setInt(1, oc.getCodigo());
            ps.setInt(2, oc.getCedula());
            ps.setString(3, oc.getNombre());
            ps.setInt(4, oc.getCelular());
            ps.setString(5, oc.getDireccion());
            ps.setString(6, oc.getFecha());
            ps.setString(7, oc.getTipoPago());
            ps.setString(8, oc.getProducto());
            ps.setInt(9, oc.getTotalPago());
            ps.setInt(10, oc.getCodigo());
            
            int n = ps.executeUpdate();
            if(n != 0){
                op = true;
            }
        }catch(SQLException e){
            e.printStackTrace();
//            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return op;
    }
    
     public boolean eliminarFactura(Facturas oc){
        boolean op = false; 
        Conexion con = new Conexion();
        try(Connection conexion = con.ObtenerConexion())
        {
            PreparedStatement ps = conexion.prepareStatement(Eliminar);
            ps.setInt(1, oc.getCodigo());
            int n = ps.executeUpdate();
            if(n != 0){
                op = true;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return op;
    }
    public Vector<Facturas> ListarCargosVector()
    {
        Vector<Facturas> Lista= new Vector<Facturas>();
        Facturas oc=null;
        try{
           Conexion con= new Conexion();
           Connection conexion = con.ObtenerConexion();
           PreparedStatement pst= conexion.prepareStatement(Listar);
           ResultSet res = pst.executeQuery();
           oc= new Facturas();
           oc.setCodigo(0);
           oc.setCedula(0);
           oc.setNombre("");
           oc.setCelular(0);
           oc.setDireccion("");
           oc.setFecha("");
           oc.setTipoPago("");
           oc.setProducto("");
           oc.setTotalPago(0);
           Lista.add(oc);
           while(res.next())
           {
               oc= new Facturas();
               oc.setCodigo(res.getInt(1));
               oc.setCedula(res.getInt(2));
               oc.setNombre(res.getString(3));
               oc.setCelular(res.getInt(4));
               oc.setDireccion(res.getString(5));
               oc.setFecha(res.getString(6));
               oc.setTipoPago(res.getString(7));
               oc.setProducto(res.getString(8));
               oc.setTotalPago(res.getInt(9));
               Lista.add(oc);
               
           }
            
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        
        } 
        return Lista;
    }
      
    public DefaultComboBoxModel mostrarComboCargo(){
        DefaultComboBoxModel registro = new DefaultComboBoxModel(ListarCargosVector());
        return registro;
    }
    
    
}

