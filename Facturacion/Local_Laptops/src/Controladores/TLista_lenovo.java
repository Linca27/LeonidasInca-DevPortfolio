
package Controladores;

import Datos.Conexion;
import Entidades.Facturas;
import Entidades.LaptopsLenovo;
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
public class TLista_lenovo {
    
    private static final String listar = "select * from lenovo";
    private static final String insertar = "insert into lenovo values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
    private static final String modificar = "update lenovo set CodigoLenovo=?, Nombre=?, Memoria=?, Procesador=?, Tipo=?, Capacidad=?, Pantalla=?, Windows=?, Garantia=?, PrecioEfectivo=?, PrecioTarjeta=? where CodigoLenovo=?";
    private static final String eliminar = "DELETE FROM lenovo WHERE CodigoLenovo=?";
    
    public List <LaptopsLenovo> listar(){
        List<LaptopsLenovo> Lista = new ArrayList<LaptopsLenovo>();
        try{
            Conexion con = new Conexion();
            Connection conexion = con.ObtenerConexion();
            Statement st = conexion.createStatement();
            ResultSet res = st.executeQuery(listar);
            while(res.next()){
                LaptopsLenovo oc = new LaptopsLenovo();
                oc.setCodigo(res.getInt(1));
                oc.setNombreLaptop(res.getString(2));
                oc.setMemoriaRam(res.getString(3));
                oc.setProcesador(res.getString(4));
                oc.setTipoDisco(res.getString(5));
                oc.setCapacidad(res.getString(6));
                oc.setPantalla(res.getString(7));
                oc.setWindows(res.getInt(8));
                oc.setGarantia(res.getString(9));
                oc.setPrecioEfectivo(res.getInt(10));
                oc.setPrecioTarjeta(res.getInt(11));
                Lista.add(oc);
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return Lista;
    }
    
    public DefaultTableModel mostrarTabla(){
        String titulos[] = {"Codigo","Nombre","Ram","Procesador","Tipo","Capacidad","Pantalla","Windows","Garantia","PrecioEfectivo","PrecioTarjeta"};
        String datos[] = new String[11];
        DefaultTableModel modelo = new DefaultTableModel(null,  titulos);
        
        for(LaptopsLenovo oc: listar()){
            datos[0] = String.valueOf(oc.getCodigo());
            datos[1] = oc.getNombreLaptop();
            datos[2] = oc.getMemoriaRam();
            datos[3] = oc.getProcesador();
            datos[4] = oc.getTipoDisco();
            datos[5] = oc.getCapacidad();
            datos[6] = oc.getPantalla();
            datos[7] = String.valueOf(oc.getWindows());
            datos[8] = oc.getGarantia();
            datos[9] = String.valueOf(oc.getPrecioEfectivo());
            datos[10] = String.valueOf(oc.getPrecioTarjeta());
            modelo.addRow(datos);
        }
        
        return modelo;
    }

    public boolean insertarlaptop(LaptopsLenovo oc){
        boolean op = false; 
        Conexion con = new Conexion();
        try(Connection conexion = con.ObtenerConexion())
        {
            PreparedStatement ps = conexion.prepareStatement(insertar);
            ps.setInt(1, oc.getCodigo());
            ps.setString(2, oc.getNombreLaptop());
            ps.setString(3, oc.getMemoriaRam());
            ps.setString(4, oc.getProcesador());
            ps.setString(5, oc.getTipoDisco());
            ps.setString(6, oc.getCapacidad());
            ps.setString(7, oc.getPantalla());
            ps.setInt(8, oc.getWindows());
            ps.setString(9, oc.getGarantia());
            ps.setInt(10, oc.getPrecioEfectivo());
            ps.setInt(11, oc.getPrecioTarjeta());
            int n = ps.executeUpdate();
            if(n != 0){
                op = true;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return op;
    }
    
    public boolean modificarlaptop(LaptopsLenovo oc){
        boolean op = false; 
        Conexion con = new Conexion();
        try(Connection conexion = con.ObtenerConexion())
        {
            PreparedStatement ps = conexion.prepareStatement(modificar);
            ps.setInt(1, oc.getCodigo());
            ps.setString(2, oc.getNombreLaptop());
            ps.setString(3, oc.getMemoriaRam());
            ps.setString(4, oc.getProcesador());
            ps.setString(5, oc.getTipoDisco());
            ps.setString(6, oc.getCapacidad());
            ps.setString(7, oc.getPantalla());
            ps.setInt(8, oc.getWindows());
            ps.setString(9, oc.getGarantia());
            ps.setInt(10, oc.getPrecioEfectivo());
            ps.setInt(11, oc.getPrecioTarjeta());
            ps.setInt(12, oc.getCodigo());
            
            int n = ps.executeUpdate();
            if(n != 0){
                op = true;
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return op;
    }
    
     public boolean eliminarLaptops(LaptopsLenovo oc){
        boolean op = false; 
        Conexion con = new Conexion();
        try(Connection conexion = con.ObtenerConexion())
        {
            PreparedStatement ps = conexion.prepareStatement(eliminar);
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
           PreparedStatement pst= conexion.prepareStatement(listar);
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
