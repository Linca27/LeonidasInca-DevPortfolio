/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios.programacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Steven
 */
public class num_compuesto {
   public static void main(String[] args){
       int num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
       int c=1;
       String com="";
       for(int i=1;c<=num;i++){
           if(i!=1 && i!=2 &&i!=3 &&i!=5 &&i!=7 &&i!=11){
               if(i%2==0 || i%3==0 || i%5==0 || i%7==0|| i%11==0){
                   c++;
                   com+=i+" ";
               }
           }
       }
       JOptionPane.showMessageDialog(null, "Los primeros "+num+" compuestos generados son: "+com);
   } 
}
