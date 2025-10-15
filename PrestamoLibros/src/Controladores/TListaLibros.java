
package Controladores;

import Entidades.Libro;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TListaLibros {
    public static List<Libro> lista = new ArrayList<Libro>();

    public static void add(Libro obj){
        lista.add(obj);
    }

    public static int BuscarLibro(String Codigo){
        for(int i=0;i<lista.size();i++){
            if(lista.get(i).getCodigo().equals(Codigo)){
                return i;
            }
        }
        return -1;
    }

    public static void EliminarLibro(int index){
        if(TListaAlquiler.BuscarAlquiler(lista.get(index).getCodigo())==-1){
            lista.remove(index);
        }else{
            JOptionPane.showMessageDialog(null,"Este libro tiene un alquiler pendiente");
        }
    }

    public static void modificar(Libro obj,int index){
        lista.set(index,obj);
    }
    
    public static Libro get(int index){
        return lista.get(index);
    }

    public static DefaultTableModel MostrarDatos(){
        String [] titulos={"Codigo","Tipo","Genero","Editorial","Nombre","Autor","Año Publicacion"};
        String [] registro = new String[7];
        DefaultTableModel modelo = new DefaultTableModel(null, titulos);
        for(int i=0 ; i <lista.size(); i++){
            registro[0]= lista.get(i).getCodigo();
            registro[1]= lista.get(i).getTipo();
            registro[2]= lista.get(i).getCategoria();
            registro[3]= lista.get(i).getEditorial();
            registro[4]= lista.get(i).getNombre();
            registro[5]= lista.get(i).getAutor();
            registro[6]= lista.get(i).getAnioPublicacion();
            modelo.addRow(registro);
        }
       return modelo;
    }
    
    
    public static void cantidadPrestamos(){
        int libros = 0, revistas = 0;
        for(int i=0;i<lista.size();i++){
            if(!lista.get(i).isAlquilado()){
                if(lista.get(i).getTipo().equalsIgnoreCase("Libro")){
                    libros++;
                }else if(lista.get(i).getTipo().equalsIgnoreCase("Revista")){
                    revistas++;
                }
            }
        }
        JOptionPane.showMessageDialog(null, "La cantidad de prestamos de libros es: "+ libros+"\n"
                + "La cantidad de prestamos de revistas es: "+revistas);
    }
    
    public static void porcentajePrestamos(){
        int totalAlquilados =0, literatura=0,salud=0,informatica=0,erotico=0;
        double porcentajeLiteratura =0, porcentajeSalud=0, porcentajeInformatica=0,porcentajeErotico=0;
        for(int i=0;i<lista.size();i++){
            if(!lista.get(i).isAlquilado()){
                totalAlquilados++;
                if(lista.get(i).getCategoria().equalsIgnoreCase("LITERATURA")){
                    literatura++;
                }
                if(lista.get(i).getCategoria().equalsIgnoreCase("SALUD")){
                    salud++;
                }
                if(lista.get(i).getCategoria().equalsIgnoreCase("INFORMATICA")){
                    informatica++;
                }
                if(lista.get(i).getCategoria().equalsIgnoreCase("EROTICO")){
                    erotico++;
                }
            }
        }
        
        porcentajeLiteratura = (literatura * 100)/totalAlquilados;
        porcentajeSalud = (salud*100)/totalAlquilados;
        porcentajeInformatica = (informatica*100)/totalAlquilados;
        porcentajeErotico = (erotico*100)/totalAlquilados;
        
        JOptionPane.showMessageDialog(null, "El porcentaje de prestamos de Literatura es: "+porcentajeLiteratura
                +"\nEl porcentaje de prestamos de Salud es: "+porcentajeSalud
        +"\nEl porcentaje de prestamos de Informatica es: "+porcentajeInformatica
        +"\nEl porcentaje de prestamos de Erotico es: " + porcentajeErotico);
        
    }
     public static void cantidadPrestamosLibrosPorSexo(){
         
         
     }
     
     //Cantidadporsexo();s
//        int hombres = 0, mujeres = 0;
//         for (int i = 0; i < lista.size(); i++) {
//             if (!lista.get(i).isAlquilado()) {
//                 for (int n = 0; n < TListaEstudiantes.lista.size() ; n++) {
//                     if (TListaEstudiantes.getEstudiante(n).getSexo().equals("Masculino")) {
//                         hombres++;
//                     } else {
//                         mujeres++;
//                     }
//                 }
//             }
//         }
//        JOptionPane.showMessageDialog(null, "La cantidad de prestamos a hombres es: "+ hombres +"\n"
//                + "La cantidad de prestamos a mujeres es: "+mujeres);
//    }
    
}
