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
public class n_numero_par_impar {
    public static void main (String[]args){
        int a=0;
        String deci="";
        int par=0;
        int apar=0;
        int impar=0;
        int aimpar=0;
        do{
            a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
            if(a%2==0){
                par++;
                apar+=a;
            }
            else{
                impar++;
                aimpar+=a;
            }
            deci=JOptionPane.showInputDialog("Ingrese /Y/ si quiere ingresar mas numero, Ingrese /N/ si ya no");
        }while(deci.equalsIgnoreCase("y"));
        JOptionPane.showMessageDialog(null, "La cantidad de pares es "+par+"\n"+
                "La suma de los pares es: "+apar);
        JOptionPane.showMessageDialog(null, "La cantidad de impares es "+impar+"\n"+
                "La suma de los impares es "+aimpar);
    }
}
