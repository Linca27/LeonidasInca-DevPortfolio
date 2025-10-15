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
public class triangulo_letra {
    public static void main(String[] args) {
       int fila=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas"));
        String triangulo="";
       for(int i=97;i<97+fila;i++){
            if(!triangulo.equals("")){
                triangulo+="\n";
            }
            for(int j=97;j<=i;j++){
                triangulo+=Character.toString((char) i)+" ";
            }
        }
       JOptionPane.showMessageDialog(null, triangulo);
    }
}
