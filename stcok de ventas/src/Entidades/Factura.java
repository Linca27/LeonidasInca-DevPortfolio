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
public class Factura {

    
    
    int Codigo;
    String Nombre;
    String Ciudad;
    String Producto;
    int Cantidad;
    int Precio;
    
    public Factura() {
    }
    
    public Factura(int Codigo, String Nombre, String Ciudad, String Producto, int Cantidad, int Precio) {
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.Ciudad = Ciudad;
        this.Producto = Producto;
        this.Cantidad = Cantidad;
        this.Precio = Precio;
    }

    
    
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    public String getProducto() {
        return Producto;
    }

    public void setProducto(String Producto) {
        this.Producto = Producto;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public int getPrecio() {
        return Precio;
    }

    public void setPrecio(int Precio) {
        this.Precio = Precio;
    }

    
}
