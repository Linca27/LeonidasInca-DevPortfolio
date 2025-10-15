/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Datos.Conexion;
import Entidades.Productos;
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
public class TLista_Productos {
    private static final String Listar="select * from productos";
    private static final String Insertar="insert into productos values (?,?,?)";
    private static final String Modificar="update productos set codigo=?,nombre=?,precio=? where codigo=?" ;
    private static final String Eliminar="DELETE from productos where codigo=?" ;
    
    public List<Productos> ListarProductos()
    {
        List<Productos> Lista= new ArrayList<Productos>();
        try{
           Conexion con= new Conexion();
           Connection conexion = con.ObtenerConexion();
           Statement st= conexion.createStatement();
           
           ResultSet res = st.executeQuery(Listar);
           while(res.next())
           {
              Productos oc= new Productos();
               oc.setCodigo(res.getInt(1));
               oc.setNombre(res.getString(2));
               oc.setPrecio(res.getInt(3));
               Lista.add(oc);
               
           }
            
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        
        }
        return Lista;
    }
    
    public DefaultTableModel MostrarTablaProductos()
    {
        String[] Titulos={"Cedula","Nombre","Precio"};
        String[] Datos= new String[3];
        DefaultTableModel dt= new DefaultTableModel(null,Titulos);
        for(Productos ot:ListarProductos())
        {
            
            Datos[0]= String.valueOf(ot.getCodigo());
            Datos[1]= ot.getNombre();
            Datos[2]= String.valueOf(ot.getPrecio());
            dt.addRow(Datos);
            
        }
        return dt;
    }
    
    public boolean InsertarProductos(Productos ot)
    {
        boolean op= false;
        Conexion con= new Conexion();
        try( Connection  conexion = con.ObtenerConexion())
        {
            PreparedStatement ps = conexion.prepareStatement(Insertar);
            ps.setInt(1, ot.getCodigo());
            ps.setString(2, ot.getNombre());
            ps.setInt(3, ot.getPrecio());
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
    public boolean modificarProductos(Productos oc){
        boolean op = false; 
        Conexion con = new Conexion();
        try(Connection conexion = con.ObtenerConexion())
        {
            PreparedStatement ps = conexion.prepareStatement(Modificar);
            ps.setInt(1, oc.getCodigo());
            ps.setString(2, oc.getNombre());
            ps.setInt(3, oc.getPrecio());
            ps.setInt(4, oc.getCodigo());
            
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
    
    public boolean eliminarProductos(Productos oc){
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
