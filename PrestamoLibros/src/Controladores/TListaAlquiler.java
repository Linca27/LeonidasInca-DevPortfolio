
package Controladores;

import Entidades.Alquiler;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class TListaAlquiler {
    public static List<Alquiler> lista = new ArrayList<Alquiler>();

    public static boolean add(Alquiler obj){
        if (TListaLibros.get(TListaLibros.BuscarLibro(obj.getCodigoLibro())).isAlquilado()){
            if (!TListaEstudiantes.get(TListaEstudiantes.BuscarEstudiante(obj.getCedula())).getSancionado()){
                    TListaLibros.get(TListaLibros.BuscarLibro(obj.getCodigoLibro())).Alquilar();
                    lista.add(obj);
                    return true;
            }else{
                JOptionPane.showMessageDialog(null,"Estudiante Sancionado");
            }
        }else{
            JOptionPane.showMessageDialog(null,"Libro ya alquilado");
        }
        return false;
    }

   
    public static int BuscarAlquiler(String Codigo){
        for(int i=0;i<lista.size();i++){
            if(lista.get(i).getCodigoLibro().equals(Codigo)){
                return i;
            }
        }
        return -1;
    }
    public static void devolverLibro(String CodigoLibro){
        if (BuscarAlquiler(CodigoLibro)!=-1) {
            if (TListaAlquiler.lista.get(TListaAlquiler.BuscarAlquiler(CodigoLibro)).isInPlazo()) {
                TListaEstudiantes.get(TListaEstudiantes.BuscarEstudiante(TListaAlquiler.lista.get(TListaAlquiler.BuscarAlquiler(CodigoLibro)).getCedula())).setSancionado(true);
                TListaEstudiantes.get(TListaEstudiantes.BuscarEstudiante(TListaAlquiler.lista.get(TListaAlquiler.BuscarAlquiler(CodigoLibro)).getCedula())).Sancionar();
            }else{
                TListaLibros.get(TListaLibros.BuscarLibro(CodigoLibro)).librerar();
                lista.remove(BuscarAlquiler(CodigoLibro));
                JOptionPane.showMessageDialog(null, "El libro ha sido devuelto");
            
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "Libro No alquilado o no válido");
        }

    }
    
   
}
