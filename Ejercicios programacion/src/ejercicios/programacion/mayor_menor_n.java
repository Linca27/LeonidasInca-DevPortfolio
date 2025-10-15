/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.programacion;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Steven
 */
public class mayor_menor_n {
    public static void main (String[]args){
        Scanner leo= new Scanner(System.in);
        int c=0;
        int x=1;
        int abc=0;
        int b=0;
        String deci="";
        int auxmax=0, auxmen=0;
         int hola=Integer.parseInt(JOptionPane.showInputDialog("Ingrese x numeros" ));
        
        do{
            c++;
          int a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese número "+ x ));
          x++;
          if(c==1){
              auxmen=a;
          }
          if(a>auxmax){
              auxmax=a;
          }
         b++;
          
          if(a<=auxmen ){
              auxmen=a;
          }
           //deci=JOptionPane.showInputDialog("Ingrese /Y/ para ingresar otro numero, ingrese /N/ si ya no quiere ingresar otro número");
        }while(b!=hola);
        JOptionPane.showMessageDialog(null, "El número mayor es "+auxmax+"\n"+"El número menor es "+auxmen);
    }
}
