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
public class Divisores {
    public static void main(String[] args){
        int num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        int a=0;
        String div="";
        if(num>0){
            for(int i=1;i<=num;i++){
                if(num%i==0){
                    a+=i;
                    div+=i+" ";
                }
            }
            JOptionPane.showMessageDialog(null, "Los divisores son "+div+"\n"+
                    "La suma de los divisores es: "+a);
        }
    }
}
