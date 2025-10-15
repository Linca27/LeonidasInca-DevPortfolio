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
public class num_invertir {
    public static void main (String[] args){
        int num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        int invertido=0;
        if(num>0){
            while(num>0){
                int residuo=num%10;
                 invertido= invertido*10+residuo;
                num/=10;
            }
           JOptionPane.showMessageDialog(null, "El número invertido es "+invertido+"\n"+
                "El número invertido multiplicado por 10 es "+invertido*10); 
        }
        
        else{
            JOptionPane.showMessageDialog(null, "Ingrese un númereo mayor a 0");
        }
    }
    
}
