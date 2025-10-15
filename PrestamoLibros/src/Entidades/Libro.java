
package Entidades;


public class Libro {
    private String Codigo;
    private String tipo;
    private String Categoria;
    private String Editorial;
    private String Nombre;
    private String Autor;
    private String anioPublicacion;
    private String Estado;

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }
    

    public Libro() {
        this.Estado = "Libre";
    }


    public Libro(String Codigo,String tipo, String Genero, String Editorial, String Nombre, String Autor, String anioPublicacion) {
        this.Codigo = Codigo;
        this.tipo=tipo;
        this.Categoria = Genero;
        this.Editorial = Editorial;
        this.Nombre = Nombre;
        this.Autor = Autor;
        this.anioPublicacion = anioPublicacion;
        this.Estado = "Libre";
    }

    public String getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(String anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public String getGénero() {
        return Categoria;
    }

    public void setGénero(String Genero) {
        this.Categoria = Genero;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }
    
    public boolean isErotico(){
        if (Categoria.equalsIgnoreCase("EROTICO")) {
            return true;
        }
        return false;
    }
    public boolean isAlquilado(){
        if (Estado.equalsIgnoreCase("ALQUILADO")) {
            return false;
        }
        return true;
    }
    public void librerar(){
        this.Estado = "Libre";
    }
    public void Alquilar(){
        this.Estado = "ALQUILADO";
    }
}
