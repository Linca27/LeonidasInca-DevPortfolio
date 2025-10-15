/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Datos.Conexion;
import Entidades.Factura;
import Entidades.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Listar_factura {

    private static final String listar="select * from factura";
    private static final String Insertar="insert into factura values (?,?,?,?,?,?)";
    private static final String Modificar="update factura set idFactura=?,Nombre=?,Ciudad=?,Producto=?, Cantidad=?, Precio=? where idFactura=?" ;
    private static final String Eliminar="DELETE from factura where idFactura=?" ;
    
    
    public List<Factura> listar()
    {
        List<Factura> Lista= new ArrayList<Factura>();
        try{
           Conexion con= new Conexion();
           Connection conexion = con.ObtenerConexion();
           Statement st= conexion.createStatement();
           ResultSet res = st.executeQuery(listar);
           while(res.next())
           {
              Factura oc= new Factura();
               oc.setCodigo(res.getInt(1));
               oc.setNombre(res.getString(2));
               oc.setCiudad(res.getString(3));
               oc.setProducto(res.getString(4));
               oc.setCantidad(res.getInt(5));
               oc.setPrecio(res.getInt(6));
               Lista.add(oc);
               
           }
            
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        
        }
        return Lista;
    }

public DefaultTableModel MostrarTabla()
    {
        String[] Titulos={"Codigo","Nombre","Ciudad","Producto","Cantidad","Precio"};
        String[] Datos= new String[6];
        DefaultTableModel dt= new DefaultTableModel(null,Titulos);
        for(Factura ot:listar())
        {
            Datos[0]= String.valueOf(ot.getCodigo());
            Datos[1]= ot.getNombre();
            Datos[2]= ot.getCiudad();
            Datos[3]= ot.getProducto();
            Datos[4]= String.valueOf(ot.getCantidad());
            Datos[5]= String.valueOf(ot.getPrecio()*ot.getCantidad());
            dt.addRow(Datos);
            
        }
        return dt;
    } 

public boolean InsertarFacturas(Factura ot)
    {
        boolean op= false;
        Conexion con= new Conexion();
        try( Connection  conexion = con.ObtenerConexion())
        {
            PreparedStatement ps = conexion.prepareStatement(Insertar);
            ps.setInt(1,ot.getCodigo());
            ps.setString(2, ot.getNombre());
            ps.setString(3, ot.getCiudad());
            ps.setString(4, ot.getProducto());
            ps.setInt(5, ot.getCantidad());
            ps.setInt(6, ot.getPrecio());
           int n = ps.executeUpdate();
            
        
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return op;
    }




public boolean modificarFactura(Factura oc){
        boolean op = false; 
        Conexion con = new Conexion();
        try(Connection conexion = con.ObtenerConexion())
        {
            PreparedStatement ps = conexion.prepareStatement(Modificar);
            ps.setInt(1,oc.getCodigo());
            ps.setString(2, oc.getNombre());
            ps.setString(3, oc.getCiudad());
            ps.setString(4, oc.getProducto());
            ps.setInt(5, oc.getCantidad());
            ps.setInt(6, oc.getPrecio());
            ps.setInt(7,oc.getCodigo());
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

    public boolean eliminarFactura(Factura oc){
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
    
    
    public Vector<Factura> ListarCargosVector()
    {
        Vector<Factura> Lista= new Vector<Factura>();
        Factura oc=null;
        try{
           Conexion con= new Conexion();
           Connection conexion = con.ObtenerConexion();
           PreparedStatement pst= conexion.prepareStatement(listar);
           ResultSet res = pst.executeQuery();
           oc= new Factura();
           oc.setCodigo(0);
           oc.setNombre("");
           oc.setCiudad("");
           oc.setProducto("");
           oc.setCantidad(0);
           oc.setPrecio(0);
           Lista.add(oc);
           while(res.next())
           {
               oc= new Factura();
               oc.setCodigo(res.getInt(1));
               oc.setNombre(res.getString(2));
               oc.setCiudad(res.getString(3));
               oc.setProducto(res.getString(4));
               oc.setCantidad(res.getInt(5));
               oc.setPrecio(res.getInt(6));
               Lista.add(oc);
               
           }
            
        }catch(SQLException ex)
        {
            ex.printStackTrace();
        
        } 
        return Lista;
    }

    
    
    }
    

