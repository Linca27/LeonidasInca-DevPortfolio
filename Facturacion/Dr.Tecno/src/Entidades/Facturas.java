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
public class Facturas {

    private int Codigo;
    private int Cedula;
    private String Nombre;
    private int Celular;
    private String Direccion;
    private String Fecha;
    private String Descripcion;
    private int total;
    
    public Facturas() {
    }

    public Facturas(int Codigo, int Cedula, String Nombre, int Celular, String Direccion, String Fecha, String Descripcion, int total) {
        this.Codigo = Codigo;
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Celular = Celular;
        this.Direccion = Direccion;
        this.Fecha = Fecha;
        this.Descripcion = Descripcion;
        this.total = total;
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

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    
    
}
