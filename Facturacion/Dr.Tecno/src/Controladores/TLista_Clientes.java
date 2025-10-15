/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Datos.Conexion;
import Entidades.Clientes;
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
public class TLista_Clientes {
    private static final String Listar="select * from clientes";
    private static final String Insertar="insert into clientes values (?,?,?,?)";
    private static final String Modificar="update clientes set cedula=?,nombre=?,celular=?,direccion=? where cedula=?" ;
    private static final String Eliminar="DELETE from clientes where cedula=?" ;
    
    public List<Clientes> ListarClientes()
    {
        List<Clientes> Lista= new ArrayList<Clientes>();
        try{
           Conexion con= new Conexion();
           Connection conexion = con.ObtenerConexion();
           Statement st= conexion.createStatement();
           
           ResultSet res = st.executeQuery(Listar);
           while(res.next())
           {
              Clientes oc= new Clientes();
               oc.setCedula(res.getInt(1));
               oc.setNombre(res.getString(2));
               oc.setCelular(res.getInt(3));
               oc.setDireccion(res.getString(4));
               Lista.add(oc);
               
           }
            
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        
        }
        return Lista;
    }
    
    public DefaultTableModel MostrarTablaClientes()
    {
        String[] Titulos={"Cedula","Nombre","Celular","Direccion"};
        String[] Datos= new String[4];
        DefaultTableModel dt= new DefaultTableModel(null,Titulos);
        for(Clientes ot:ListarClientes())
        {
            
            Datos[0]= String.valueOf(ot.getCedula());
            Datos[1]= ot.getNombre();
            Datos[2]= String.valueOf(ot.getCelular());
            Datos[3]= ot.getDireccion();
            dt.addRow(Datos);
            
        }
        return dt;
    }
    
    public boolean InsertarClientes(Clientes ot)
    {
        boolean op= false;
        Conexion con= new Conexion();
        try( Connection  conexion = con.ObtenerConexion())
        {
            PreparedStatement ps = conexion.prepareStatement(Insertar);
            ps.setInt(1, ot.getCedula());
            ps.setString(2, ot.getNombre());
            ps.setInt(3, ot.getCelular());
            ps.setString(4, ot.getDireccion());
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
    public boolean modificarClientes(Clientes oc){
        boolean op = false; 
        Conexion con = new Conexion();
        try(Connection conexion = con.ObtenerConexion())
        {
            PreparedStatement ps = conexion.prepareStatement(Modificar);
            ps.setInt(1, oc.getCedula());
            ps.setString(2, oc.getNombre());
            ps.setInt(3, oc.getCelular());
            ps.setString(4, oc.getDireccion());
            ps.setInt(5, oc.getCedula());
            
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
    
    public boolean eliminarClientes(Clientes oc){
        boolean op = false; 
        Conexion con = new Conexion();
        try(Connection conexion = con.ObtenerConexion())
        {
            PreparedStatement ps = conexion.prepareStatement(Eliminar);
            ps.setInt(1, oc.getCedula());
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
