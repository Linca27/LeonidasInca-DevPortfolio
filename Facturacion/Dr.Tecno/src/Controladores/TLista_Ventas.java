/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Datos.Conexion;
import Entidades.Ventas;
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
public class TLista_Ventas {
     private static final String Listar="select * from ventas";
    private static final String Insertar="insert into ventas values (?,?,?,?,?,?,?,?)";
    private static final String Modificar="update ventas set codigo=?,cedula=?,nombre=?,celular=?,direccion=?,fecha=?,producto=?,total=? where codigo=?" ;
    private static final String Eliminar="DELETE from ventas where codigo=?" ;
    
    public List<Ventas> ListarVentas()
    {
        List<Ventas> Lista= new ArrayList<Ventas>();
        try{
           Conexion con= new Conexion();
           Connection conexion = con.ObtenerConexion();
           Statement st= conexion.createStatement();
           
           ResultSet res = st.executeQuery(Listar);
           while(res.next())
           {
              Ventas oc= new Ventas();
               oc.setCodigo(res.getInt(1));
               oc.setCedula(res.getString(2));
               oc.setNombre(res.getString(3));
               oc.setCelular(res.getInt(4));
               oc.setDireccion(res.getString(5));
               oc.setFecha(res.getString(6));
               oc.setProducto(res.getString(7));
               oc.setTotal(res.getInt(8));
               
               Lista.add(oc);
               
           }
            
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        
        }
        return Lista;
    }
    
    public DefaultTableModel MostrarTablaVentas()
    {
        String[] Titulos={"Codigo","Cedula","Nombre","Celular","Direccion","Fecha","Producto","total"};
        String[] Datos= new String[8];
        DefaultTableModel dt= new DefaultTableModel(null,Titulos);
        for(Ventas ot:ListarVentas())
        {
            
            Datos[0]= String.valueOf(ot.getCodigo());
            Datos[1]= ot.getCedula();
            Datos[2]= ot.getNombre();
            Datos[3]= String.valueOf(ot.getCelular());
            Datos[4]= ot.getDireccion();
            Datos[5]= ot.getFecha();
            Datos[6]= ot.getProducto();
            Datos[7]= String.valueOf(ot.getTotal());
            dt.addRow(Datos);
            
        }
        return dt;
    }
    
    public boolean InsertarProductos(Ventas ot)
    {
        boolean op= false;
        Conexion con= new Conexion();
        try( Connection  conexion = con.ObtenerConexion())
        {
            PreparedStatement ps = conexion.prepareStatement(Insertar);
            ps.setInt(1, ot.getCodigo());
            ps.setString(2, ot.getCedula());
            ps.setString(3, ot.getNombre());
            ps.setInt(4, ot.getCelular());
            ps.setString(5, ot.getDireccion());
            ps.setString(6, ot.getFecha());
            ps.setString(7, ot.getProducto());
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
    public boolean modificarVentas(Ventas oc){
        boolean op = false; 
        Conexion con = new Conexion();
        try(Connection conexion = con.ObtenerConexion())
        {
            PreparedStatement ps = conexion.prepareStatement(Modificar);
            ps.setInt(1, oc.getCodigo());
            ps.setString(2, oc.getCedula());
            ps.setString(3, oc.getNombre());
            ps.setInt(4, oc.getCelular());
             ps.setString(5, oc.getDireccion());
            ps.setString(6, oc.getFecha());
            ps.setString(7, oc.getProducto());
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
    
    public boolean eliminarVentas(Ventas oc){
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
