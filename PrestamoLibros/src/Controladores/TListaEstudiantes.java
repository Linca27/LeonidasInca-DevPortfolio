
package Controladores;

import Entidades.Estudiante;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TListaEstudiantes {
    public static List<Estudiante> lista = new ArrayList<Estudiante>();

    public static void add(Estudiante obj){
        lista.add(obj);
    }

    public static Estudiante getEstudiante(int pos){
        return  lista.get(pos);
    }
    public static int BuscarEstudiante(String Cedula){
        for(int i=0;i<lista.size();i++){
            if(lista.get(i).getCedula().equals(Cedula)){
                return i;
            }
        }
        return -1;
    }
    
    public static DefaultTableModel MostrarDatosEstudiante(){
        String [] titulos={"Cedula","Nombre","Apellido","Sexo","FechaNacimiento"};
        String [] registro = new String[5];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        for(int i=0 ; i <lista.size(); i++){
            registro[0]= lista.get(i).getCedula();
            registro[1]= lista.get(i).getNombre();
            registro[2]= lista.get(i).getApellido();
            registro[3]= lista.get(i).getSexo();
            registro[4]= lista.get(i).getFechaNacimiento();
            modelo.addRow(registro);
        }
       return modelo;
    }
    public static Estudiante get(int index){
        return lista.get(index);
    }
    
    public static void cantidadSancionados(){
        int cantidad=0;
         for(int i=0;i<lista.size();i++){
            if(lista.get(i).getSancionado()){
                cantidad++;
            }
        }
         JOptionPane.showMessageDialog(null,"La cantidad de estudiantes sancionados es: " + cantidad);
    }
    

}
