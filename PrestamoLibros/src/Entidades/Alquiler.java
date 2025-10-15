
package Entidades;

import java.util.Calendar;


public class Alquiler {
    private String CodigoLibro;
    private String Cedula;
    private String FechaPrestamo;
    private String FechaEntrega;

    public Alquiler() {
    }

    public Alquiler(String CodigoLibro, String Cedula, String FechaPrestamo, String FechaEntrega) {
        this.CodigoLibro = CodigoLibro;
        this.Cedula = Cedula;
        this.FechaPrestamo = FechaPrestamo;
        this.FechaEntrega = FechaEntrega;
    }

    public String getCodigoLibro() {
        return CodigoLibro;
    }

    public void setCodigoLibro(String CodigoLibro) {
        this.CodigoLibro = CodigoLibro;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getFechaPrestamo() {
        return FechaPrestamo;
    }

    public void setFechaPrestamo(String FechaPrestamo) {
        this.FechaPrestamo = FechaPrestamo;
    }

    public String getFechaEntrega() {
        return FechaEntrega;
    }

    public void setFechaEntrega(String FechaEntrega) {
        this.FechaEntrega = FechaEntrega;
    }
    
    /*
    public boolean isInPlazo(){
        Calendar c = Calendar.getInstance();
        if (Integer.parseInt(FechaEntrega.split("/")[2])>(c.get(Calendar.YEAR))) {
            return true;
        }else if (Integer.parseInt(FechaEntrega.split("/")[2])==(c.get(Calendar.YEAR))) {
            if  (Integer.parseInt(FechaEntrega.split("/")[1])>(c.get(Calendar.MONTH))) {
                return true;
            }else if (Integer.parseInt(FechaEntrega.split("/")[1])==(c.get(Calendar.MONTH))) {
                if  (Integer.parseInt(FechaEntrega.split("/")[0])>=(c.get(Calendar.DATE))) {
                    return true;
                }
            }
        }
        return false;
    }
    */
    
    public boolean isInPlazo(){
        Calendar c = Calendar.getInstance();
        if (Integer.parseInt(FechaEntrega.split("/")[2])>(c.get(Calendar.YEAR)) || 
                Integer.parseInt(FechaEntrega.split("/")[1])==(c.get(Calendar.MONTH)) || 
                Integer.parseInt(FechaEntrega.split("/")[0])>=(c.get(Calendar.DATE))) {
            return false;
        }
        
        return true;
    }
}
