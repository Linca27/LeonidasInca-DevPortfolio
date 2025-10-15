
package Entidades;

import Controladores.TListaEstudiantes;
import static Controladores.TListaLibros.lista;
import java.util.Calendar;
import javax.swing.JOptionPane;


public class Estudiante {
    private String Cedula;
    private String Nombre;
    private String Apellido;
    private String Sexo;
    private String FechaNacimiento;
    private String FechaSancion;
    private boolean sancionado;
    
    
    public Estudiante() {
        this.FechaSancion = "";
        this.sancionado = false;
    }

    public Estudiante(String Cedula, String Nombre, String Apellido, String Sexo, String FechaNacimiento) {
        this.Cedula = Cedula;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Sexo = Sexo;
        this.FechaNacimiento = FechaNacimiento;
        this.FechaSancion = "";
        
    }

    public String getFechaSancion() {
        return FechaSancion;
    }

    public void setFechaSancion(String FechaSancion) {
        this.FechaSancion = FechaSancion;
    }

    public boolean getSancionado(){
        return sancionado;
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

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public void setSancionado(boolean sancionado) {
        this.sancionado = sancionado;
    }
    
    
    
    public boolean isSancionado(){
        if (!FechaSancion.equals("")) {
            Calendar c = Calendar.getInstance();
            if (Integer.parseInt(FechaSancion.split("/")[2])>(c.get(Calendar.YEAR))) {
                this.FechaSancion = "";
                return true;
            }else if (Integer.parseInt(FechaSancion.split("/")[2])==(c.get(Calendar.YEAR)-18)) {
                if  (Integer.parseInt(FechaSancion.split("/")[1])<(c.get(Calendar.MONTH)+1)) {
                    if  (Integer.parseInt(FechaSancion.split("/")[0])+(c.get(Calendar.DATE)-15)>=Integer.parseInt(FechaSancion.split("/")[0])) {
                        this.FechaSancion = "";
                        return true;
                    }
                }else if (Integer.parseInt(FechaSancion.split("/")[1])==(c.get(Calendar.MONTH)+1)) {
                    if  (Integer.parseInt(FechaSancion.split("/")[0])<=(c.get(Calendar.DATE)-15)) {
                        this.FechaSancion = "";
                        return true;
                    }
                }
            }
            return false;
        } 
        return false;
    }
    
    public void Sancionar(){
        Calendar c = Calendar.getInstance();
        this.FechaSancion = c.get(Calendar.DATE)+"/"+c.get(Calendar.MONTH)+"/"+c.get(Calendar.YEAR);
        JOptionPane.showMessageDialog(null,"Entrega fuera de plazo, estudiante sancionado por 15 días.");
    }
    public void Cantidadporsexo(){
        int hombres = 0, mujeres = 0;
         for (int i = 0; i < lista.size(); i++) {
             if (!lista.get(i).isAlquilado()) {
                 for (int n = 0; n < TListaEstudiantes.lista.size() ; n++) {
                     if (TListaEstudiantes.getEstudiante(n).getSexo().equals("Masculino")) {
                         hombres++;
                     } else {
                         mujeres++;
                     }
                 }
             }
         }
        JOptionPane.showMessageDialog(null, "La cantidad de prestamos a hombres es: "+ hombres +"\n"
                + "La cantidad de prestamos a mujeres es: "+mujeres);
    }
    
}
