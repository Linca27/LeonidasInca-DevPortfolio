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
public class par_impar {
    public static void main (String[] args){
        String num=JOptionPane.showInputDialog("Introduzca un número");
        int cp=0;
        int ci=0;
        int ap=0;
        int ai=0;
        String par="";
        String impar="";
        for(int i=0;i<=num.length()-1;i++){
            if(num.charAt(i)%2==0){
                cp++;
                String app=num.charAt(i)+"";
                ap+=Integer.parseInt(app);
                par+=num.charAt(i)+" ";
            }
            else{
                ci++;
                String aii=num.charAt(i)+"";
                ai+=Integer.parseInt(aii);
                impar+=num.charAt(i)+" ";
            }
        }
        JOptionPane.showMessageDialog(null, "Los números pares son "+par+"\n"+
                "La cantidad de números pares es: "+cp+"\n"+
                "La suma de los números pares es: "+ap);
        JOptionPane.showMessageDialog(null, "Los números impares son "+impar+"\n"+
                "La cantidad de números impares es: "+ci+"\n"+
                "La suma de los números impares es: "+ai);
    }
}
