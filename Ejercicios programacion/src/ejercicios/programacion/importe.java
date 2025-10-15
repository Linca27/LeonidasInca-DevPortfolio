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
public class importe {
    public static void main(String[] args) {
        int cantidad=0;
        double precio=0;
        double importe=0;
        String deci="";
        double subtotal=0;
        double des=0;
        do{
            cantidad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad"));
            precio=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio unitario"));
            subtotal+=precio*cantidad;
            deci=JOptionPane.showInputDialog("Ingrese /Y/ si quiere ingresar mas producto, ingrese /N/ si ya no quiere ingresar");
        }while(deci.equalsIgnoreCase("y"));
        if(subtotal>=100){
             des= subtotal*0.05;
        }
        JOptionPane.showMessageDialog(null, "El subtotal es "+subtotal+"\n"+
        "El total a pagar es "+(subtotal+(subtotal*0.12)-des));
    }
}
