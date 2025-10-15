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
public class Combinaciones {
    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de opciones"));
        int r=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de opciones que va a escoger"));
        int d=n-r;
        for(int i=n-1;i>=1;i--){
            n*=i;
        }
        for(int i=r-1;i>=1;i--){
            r*=i;
        }
         for(int i=d-1;i>=1;i--){
            d*=i;
        }
         JOptionPane.showMessageDialog(null, "El número de combinaciones es: "+(n/(d*r)) );
    }
   
}
