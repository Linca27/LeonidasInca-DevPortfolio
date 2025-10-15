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
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Usuario
 */
public class TLista_Cliente {
    private static final String Listar="select * from cliente";
    private static final String Insertar="insert into cliente values (?,?,?,?,?)";
    private static final String Modificar="update cliente set idcliente=?,cedula=?,nombre=?,celular=?,direccion=? where idcliente=?" ;
    private static final String Eliminar="DELETE from cliente where idcliente=?" ;
    
    
    
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
               oc.setCodigo(res.getInt(1));
               oc.setCedula(res.getInt(2));
               oc.setNombre(res.getString(3));
               oc.setCelular(res.getInt(4));
               oc.setDireccion(res.getString(5));
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
        String[] Titulos={"Codigo","Cedula","Nombre","Celular","Direccion"};
        String[] Datos= new String[5];
        DefaultTableModel dt= new DefaultTableModel(null,Titulos);
        for(Clientes ot:ListarClientes())
        {
            Datos[0]= String.valueOf(ot.getCodigo());
            Datos[1]= String.valueOf(ot.getCedula());
            Datos[2]= ot.getNombre();
            Datos[3]= String.valueOf(ot.getCelular());
            Datos[4]= ot.getDireccion();
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
            ps.setInt(1,ot.getCodigo());
            ps.setInt(2, ot.getCedula());
            ps.setString(3, ot.getNombre());
            ps.setInt(4, ot.getCelular());
            ps.setString(5, ot.getDireccion());
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
            ps.setInt(1, oc.getCodigo());
            ps.setInt(2, oc.getCedula());
            ps.setString(3, oc.getNombre());
            ps.setInt(4, oc.getCelular());
            ps.setString(5, oc.getDireccion());
            ps.setInt(6, oc.getCodigo());
            
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
//    public Vector<Clientes> ListarCargosVector()
//    {
//        Vector<Clientes> Lista= new Vector<Clientes>();
//        Clientes oc=null;
//        try{
//           Conexion con= new Conexion();
//           Connection conexion = con.ObtenerConexion();
//           PreparedStatement pst= conexion.prepareStatement(Listar);
//           ResultSet res = pst.executeQuery();
//           oc= new Clientes();
//           oc.setCodigo(0);
//           oc.setCedula(0);
//           oc.setNombre("");
//           oc.setCelular(0);
//           oc.setDireccion("");
//           Lista.add(oc);
//           while(res.next())
//           {
//               oc= new Clientes();
//               oc.setCodigo(res.getInt(1));
//               oc.setCedula(res.getInt(2));
//               oc.setNombre(res.getString(3));
//               oc.setCelular(res.getInt(4));
//               oc.setDireccion(res.getString(5));
//               Lista.add(oc);
//               
//           }
//            
//        }catch(SQLException ex)
//        {
//            ex.printStackTrace();
//        
//        } 
//        return Lista;
//    }
      
//    public DefaultComboBoxModel mostrarComboCargo(){
//        DefaultComboBoxModel registro = new DefaultComboBoxModel(ListarCargosVector());
//        return registro;
//    }

    
}

