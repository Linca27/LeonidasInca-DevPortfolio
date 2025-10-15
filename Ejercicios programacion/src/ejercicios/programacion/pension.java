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
public class pension {
    public static void main (String[] args){
        double p= Double.parseDouble(JOptionPane.showInputDialog("Ingrese su pensión"));
        String opcion="";
        do{
            double g= Double.parseDouble(JOptionPane.showInputDialog("Ingrese el gasto que va a realizar"));
            p-=g;
            JOptionPane.showMessageDialog(null, "El dinero que le queda es "+p);
             opcion=JOptionPane.showInputDialog("Ingrese /S/ si quiere realizar otro pago, ingrese /N/ si ya no quiere hacer otro pago");
        }
        while(opcion.equalsIgnoreCase("S"));
    }
}
