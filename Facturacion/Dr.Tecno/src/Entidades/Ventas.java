/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Usuario
 */
public class Ventas {

    public Ventas() {
    }
    private int Codigo;
    private String Cedula;
    private String Nombre;
    private int Celular;
    private String Direccion;
    private String Fecha;
    private String Producto;
    private int Total;
    
    public Ventas(int Codigo, String Cedula, String Nombre, int Celular, String Direccion, String Fecha, String Producto, int Total) {
        this.Codigo = Codigo;
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Celular = Celular;
        this.Direccion = Direccion;
        this.Fecha = Fecha;
        this.Producto = Producto;
        this.Total = Total;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
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

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }
    
}
