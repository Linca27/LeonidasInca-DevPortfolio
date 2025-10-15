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
public class factorial {
    public static void main (String[] args){
        int num=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        int fac=num;
        for(int i=num-1;i>=1;i--){
            fac*=i;
        }
        JOptionPane.showMessageDialog(null, "EL factorial de "+num+" es "+fac);
    }
}
