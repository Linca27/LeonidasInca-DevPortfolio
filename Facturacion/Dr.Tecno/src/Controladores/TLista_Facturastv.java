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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class TLista_Facturastv {
    private static final String Listar="select * from facturastv";
    private static final String Insertar="insert into facturastv values (?,?,?,?,?,?,?,?)";
    private static final String Modificar="update facturastv set codigo=?, cedula=?, nombre=?,celular=?,direccion=?, fecha=?, descripcion=?,total=? where codigo=?" ;
    private static final String Eliminar="DELETE from facturastv where codigo=?" ;
    
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
               oc.setDescripcion(res.getString(7));
               oc.setTotal(res.getInt(8));
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
        String[] Titulos={"codigo","Cedula","Nombre","Celular","Direccion","Fecha","Descripción","Total"};
        String[] Datos= new String[8];
        DefaultTableModel dt= new DefaultTableModel(null,Titulos);
        for(Facturas ot:ListarFacturas())
        {
            Datos[0]= String.valueOf(ot.getCodigo());
            Datos[1]= String.valueOf(ot.getCedula());
            Datos[2]= ot.getNombre();
            Datos[3]= String.valueOf(ot.getCelular());
            Datos[4]= ot.getDireccion();
            Datos[5]= ot.getFecha();
            Datos[6]= ot.getDescripcion();
            Datos[7]= String.valueOf(ot.getTotal());
            dt.addRow(Datos);
            
        }
        return dt;
    }
    
    public boolean InsertarRegistros(Facturas ot)
    {
        boolean op= false;
        Conexion con= new Conexion();
        try( Connection  conexion = con.ObtenerConexion())
        {
            PreparedStatement ps = conexion.prepareStatement(Insertar);
            ps.setInt(1, ot.getCodigo());
            ps.setInt(2, ot.getCedula());
            ps.setString(3, ot.getNombre());
            ps.setInt(4, ot.getCelular());
            ps.setString(5, ot.getDireccion());
            ps.setString(6, ot.getFecha());
            ps.setString(7, ot.getDescripcion());
            ps.setInt(8, ot.getTotal());
            
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
    public boolean modificarResgitros(Facturas oc){
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
            ps.setString(7, oc.getDescripcion());
            ps.setInt(8, oc.getTotal());
            ps.setInt(9, oc.getCodigo());
            
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
    
    public boolean eliminarRegistros(Facturas oc){
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
}
