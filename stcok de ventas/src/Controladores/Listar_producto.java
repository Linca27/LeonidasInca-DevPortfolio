/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Datos.Conexion;
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
public class Listar_producto {
 
    private static final String listar="select * from producto";
    private static final String Insertar="insert into producto values (?,?,?,?)";
    private static final String Modificar="update producto set idproducto=?,Producto=?, Cantidad=?, Precio=? where idproducto=?" ;
    private static final String Eliminar="DELETE from producto where idproducto=?" ;
    
    
    public List<Producto> listar()
    {
        List<Producto> Lista= new ArrayList<Producto>();
        try{
           Conexion con= new Conexion();
           Connection conexion = con.ObtenerConexion();
           Statement st= conexion.createStatement();
           ResultSet res = st.executeQuery(listar);
           while(res.next())
           {
              Producto oc= new Producto();
               oc.setCodigo(res.getInt(1));
               oc.setProducto(res.getString(2));
               oc.setCantidad(res.getInt(3));
               oc.setPrecio(res.getInt(4));
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
        String[] Titulos={"Codigo","Producto","Cantidad","Precio"};
        String[] Datos= new String[4];
        DefaultTableModel dt= new DefaultTableModel(null,Titulos);
        for(Producto ot:listar())
        {
            Datos[0]= String.valueOf(ot.getCodigo());
            Datos[1]= ot.getProducto();
            Datos[2]= String.valueOf(ot.getCantidad());
            Datos[3]= String.valueOf(ot.getPrecio());
            dt.addRow(Datos);
            
        }
        return dt;
    } 

public boolean InsertarProducto(Producto ot)
    {
        boolean op= false;
        Conexion con= new Conexion();
        try( Connection  conexion = con.ObtenerConexion())
        {
            PreparedStatement ps = conexion.prepareStatement(Insertar);
            ps.setInt(1,ot.getCodigo());
            ps.setString(2, ot.getProducto());
            ps.setInt(3, ot.getCantidad());
            ps.setInt(4, ot.getPrecio());
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

public boolean modificarProducto(Producto oc){
        boolean op = false; 
        Conexion con = new Conexion();
        try(Connection conexion = con.ObtenerConexion())
        {
            PreparedStatement ps = conexion.prepareStatement(Modificar);
            ps.setInt(1,oc.getCodigo());
            ps.setString(2, oc.getProducto());
            ps.setInt(3, oc.getCantidad());
            ps.setInt(4, oc.getPrecio());
            ps.setInt(5,oc.getCodigo());
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

    public boolean eliminarProducto(Producto oc){
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
    public static List<Producto> ListaProducto = new  ArrayList<Producto>();
    
    public Producto Buscar(int num){
        Producto producto = new Producto();
        String sql = "Select * from producto where idproducto=?";
        try {
            con = on.ObtenerConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, num);
            rs = ps.executeQuery();
            if(rs.next()){
                producto.setCodigo(rs.getInt("idproducto"));
                producto.setProducto(rs.getString("Producto"));
                producto.setCantidad(rs.getInt("Cantidad"));
                producto.setPrecio(rs.getInt("Precio"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return producto;
    }
    public static Producto getProductos(int pos){
        return ListaProducto.get(pos);
    }
    Connection con;
    Conexion on = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    public boolean ActualizarStock(int cantidad, int codigo)
    {
        String sql = "update producto set Cantidad=? where idproducto=?";
        try {
            con = on.ObtenerConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, cantidad);
            ps.setInt(2, codigo);
            ps.execute();
            return true;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            return false;
        }
    }
    
    
//    public Vector<Producto> ListarCargosVector()
//    {
//        Vector<Producto> Lista= new Vector<Producto>();
//        Producto oc=null;
//        try{
//           Conexion con= new Conexion();
//           Connection conexion = con.ObtenerConexion();
//           PreparedStatement pst= conexion.prepareStatement(listar);
//           ResultSet res = pst.executeQuery();
//           oc= new Producto();
//           oc.setCodigo(0);
//           oc.setProducto("");
//           oc.setCantidad(0);
//           oc.setPrecio(0);
//           Lista.add(oc);
//           while(res.next())
//           {
//               oc= new Producto();
//               oc.setCodigo(res.getInt(1));
//               oc.setProducto(res.getString(2));
//               oc.setCantidad(res.getInt(3));
//               oc.setPrecio(res.getInt(4));
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

    
    
    
}
