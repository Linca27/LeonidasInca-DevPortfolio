/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import Datos.Conexion;
import Entidades.Registros;
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
public class TLista_Registrostv {
    private static final String Listar="select * from registrostv";
    private static final String Insertar="insert into registrostv values (?,?,?,?,?,?,?,?,?,?,?)";
    private static final String Modificar="update registrostv set idcodigo=?, cedula=?, nombre=?,celular=?,direccion=?, fecha=?, descripcion=?, saldo=?, abono=?, total=?, estado=? where idcodigo=?" ;
    private static final String Eliminar="DELETE from registrostv where idcodigo=?" ;
    
    public List<Registros> ListarRegistros()
    {
        List<Registros> Lista= new ArrayList<Registros>();
        try{
           Conexion con= new Conexion();
           Connection conexion = con.ObtenerConexion();
           Statement st= conexion.createStatement();
           
           ResultSet res = st.executeQuery(Listar);
           while(res.next())
           {
              Registros oc= new Registros();
              oc.setCodigo(res.getInt(1));
               oc.setCedula(res.getInt(2));
               oc.setNombre(res.getString(3));
               oc.setCelular(res.getInt(4));
               oc.setDireccion(res.getString(5));
               oc.setFecha(res.getString(6));
               oc.setDescripcion(res.getString(7));
               oc.setSaldo(res.getInt(8));
               oc.setAbono(res.getInt(9));
               oc.setTotal(res.getInt(10));
               oc.setEstado(res.getString(11));
               Lista.add(oc);
               
           }
            
        }catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,ex.getMessage());
        
        }
        return Lista;
    }
    
    public DefaultTableModel MostrarTablaRegistros()
    {
        String[] Titulos={"codigo","Cedula","Nombre","Celular","Direccion","Fecha","Descripción","Saldo","Abono","Total","Estado"};
        String[] Datos= new String[11];
        DefaultTableModel dt= new DefaultTableModel(null,Titulos);
        for(Registros ot:ListarRegistros())
        {
            Datos[0]= String.valueOf(ot.getCodigo());
            Datos[1]= String.valueOf(ot.getCedula());
            Datos[2]= ot.getNombre();
            Datos[3]= String.valueOf(ot.getCelular());
            Datos[4]= ot.getDireccion();
            Datos[5]= ot.getFecha();
            Datos[6]= ot.getDescripcion();
            Datos[7]= String.valueOf(ot.getSaldo());
            Datos[8]= String.valueOf(ot.getAbono());
            Datos[9]= String.valueOf(ot.getSaldo()-ot.getAbono());
            Datos[10]= ot.getEstado();
            dt.addRow(Datos);
            
        }
        return dt;
    }
    
    public boolean InsertarRegistros(Registros ot)
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
            ps.setInt(8, ot.getSaldo());
            ps.setInt(9, ot.getAbono());
            ps.setInt(10, ot.getTotal());
            ps.setString(11, ot.getEstado());
            
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
    public boolean modificarResgitros(Registros oc){
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
            ps.setInt(8, oc.getSaldo());
            ps.setInt(9, oc.getAbono());
            ps.setInt(10, oc.getTotal());
            ps.setString(11, oc.getEstado());
            ps.setInt(12, oc.getCodigo());
            
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
    
    public boolean eliminarRegistros(Registros oc){
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
