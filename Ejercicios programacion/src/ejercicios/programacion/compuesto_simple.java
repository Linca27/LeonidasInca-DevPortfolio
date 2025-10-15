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
public class compuesto_simple {
      public static void main(String[] args) {
          int num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
          if(num==2||num==3 ||num==5 ||num==7 ||num==11){
               JOptionPane.showMessageDialog(null, "El número ingresado es primo");
          }
          else if((num%num==0&& num%1==0 )&& num%2!=0 && num%3!=0&& num%5!=0 && num%7!=0&& num%11!=0){
              JOptionPane.showMessageDialog(null, "El número ingresado es primo");
          }
          else{
              if(num%2==0 || num%3==0||num%5==0||num%7==0||num%11==0){
                  JOptionPane.showMessageDialog(null, "El número es compuesto");
              }
          }
      }
}