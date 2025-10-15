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
public class n_numero_multiplo {
    public static void main(String[] args){
        int a=0;
        String all="";
        String two="";
        String three="";
        String nothing="";
        String deci="";
        do{
            a=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
            if(a%2==0 && a%3==0){
                 all+=a+" ";
            }
            else if(a%2==0 ){
                 two+=a+" ";
            }
            else if(a%3==0 ){
                 three+=a+" ";
            }
            else{
                 nothing+=a+" ";
            }
            deci=JOptionPane.showInputDialog("Ingrese /Y/ si quiere ingresar mas numeros, inrege /N/ si ya no quiere ingresar");
        }while(deci.equalsIgnoreCase("Y"));
        JOptionPane.showMessageDialog(null, "Los números múltiplos de 2 y 3 son: "+all+"\n"
        +"Los números múltiplos de 2 son: "+two+"\n"+
                "Los números múltiplos de 3 son: "+three+"\n"+
                "Los números que no son múltiplos de 2 ni de 3 son: "+nothing);
    }
    
}
