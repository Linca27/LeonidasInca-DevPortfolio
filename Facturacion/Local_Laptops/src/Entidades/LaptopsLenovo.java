
package Entidades;

/**
 *
 * @author Usuario
 */
public class LaptopsLenovo {
    
    private int Codigo;
    private String NombreLaptop;
    private String MemoriaRam;
    private String Procesador;
    private String TipoDisco;
    private String Capacidad;
    private String Pantalla;
    private int Windows;
    private String Garantia;
    private int PrecioEfectivo;
    private int PrecioTarjeta;
    
    
    
    public LaptopsLenovo() {
    }
    
    
    public LaptopsLenovo(int Codigo, String NombreLaptop, String MemoriaRam, String Procesador, String TipoDisco, String Capacidad, String Pantalla, int Windows, String Garantia, int PrecioEfectivo, int PrecioTarjeta) {
        this.Codigo = Codigo;
        this.NombreLaptop = NombreLaptop;
        this.MemoriaRam = MemoriaRam;
        this.Procesador = Procesador;
        this.TipoDisco = TipoDisco;
        this.Capacidad = Capacidad;
        this.Pantalla = Pantalla;
        this.Windows = Windows;
        this.Garantia = Garantia;
        this.PrecioEfectivo = PrecioEfectivo;
        this.PrecioTarjeta=PrecioTarjeta;
        
    }
    
    
    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getNombreLaptop() {
        return NombreLaptop;
    }

    public void setNombreLaptop(String NombreLaptop) {
        this.NombreLaptop = NombreLaptop;
    }

    public String getMemoriaRam() {
        return MemoriaRam;
    }

    public void setMemoriaRam(String MemoriaRam) {
        this.MemoriaRam = MemoriaRam;
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String Procesador) {
        this.Procesador = Procesador;
    }

    public String getTipoDisco() {
        return TipoDisco;
    }

    public void setTipoDisco(String TipoDisco) {
        this.TipoDisco = TipoDisco;
    }

    public String getCapacidad() {
        return Capacidad;
    }

    public void setCapacidad(String Capacidad) {
        this.Capacidad = Capacidad;
    }

    public String getPantalla() {
        return Pantalla;
    }

    public void setPantalla(String Pantalla) {
        this.Pantalla = Pantalla;
    }

    public int getWindows() {
        return Windows;
    }

    public void setWindows(int Windows) {
        this.Windows = Windows;
    }


    public String getGarantia() {
        return Garantia;
    }

    public void setGarantia(String Garantia) {
        this.Garantia = Garantia;
    }

   public int getPrecioEfectivo() {
        return PrecioEfectivo;
    }

    public void setPrecioEfectivo(int PrecioEfectivo) {
        this.PrecioEfectivo = PrecioEfectivo;
    }
   
    public int getPrecioTarjeta() {
        return PrecioTarjeta;
    }

    public void setPrecioTarjeta(int PrecioTarjeta) {
        this.PrecioTarjeta = PrecioTarjeta;
    }
    
    
}
