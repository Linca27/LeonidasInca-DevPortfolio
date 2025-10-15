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
public class Registros {

    private int Codigo;
    private int Cedula;
    private String Nombre;
    private int Celular;
    private String Direccion;
    private String Fecha;
    private String Descripcion;
    private int Saldo;
    private int Abono;
    private int total;
    private String Estado;
    
    public Registros() {
    }

    public Registros(int Codigo, int Cedula, String Nombre, int Celular, String Direccion, String Fecha, String Descripcion, int Saldo, int Abono, int total, String Estado) {
        this.Codigo = Codigo;
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Celular = Celular;
        this.Direccion = Direccion;
        this.Fecha = Fecha;
        this.Descripcion = Descripcion;
        this.Saldo = Saldo;
        this.Abono = Abono;
        this.total = total;
        this.Estado = Estado;
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

    public int getSaldo() {
        return Saldo;
    }

    public void setSaldo(int Saldo) {
        this.Saldo = Saldo;
    }

    public int getAbono() {
        return Abono;
    }

    public void setAbono(int Abono) {
        this.Abono = Abono;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    
}
