
package Entidades;
 import Formularios.frmBase;
/**
 *
 * @author Inca y Dumes
 */
public class Facturas {

    public Facturas(int Codigo, int Cedula, String Nombre, int Celular, String Direccion, String Fecha, String TipoPago, String Producto, int TotalPago) {
        this.Codigo = Codigo;
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Celular = Celular;
        this.Direccion = Direccion;
        this.Fecha = Fecha;
        this.TipoPago = TipoPago;
        this.Producto = Producto;
        this.TotalPago = TotalPago;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getCelular() {
        return Celular;
    }

    public void setCelular(int Celular) {
        this.Celular = Celular;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getTipoPago() {
        return TipoPago;
    }

    public void setTipoPago(String TipoPago) {
        this.TipoPago = TipoPago;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public int getTotalPago() {
        return TotalPago;
    }

    public void setTotalPago(int TotalPago) {
        this.TotalPago = TotalPago;
    }

    public Facturas() {
    }

    private int Codigo;
    private int Cedula;
    private String Nombre;
    private int Celular;
    private String Direccion;
    private String Fecha;
    private String TipoPago;
    private String Producto;
    private int TotalPago;
    
    
    @Override
    public String toString(){
        return TipoPago;
    } 
    
}
