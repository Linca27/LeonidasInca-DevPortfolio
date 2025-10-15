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
public class asterisco_triangulo {
    public static void main(String[] args) {
        int fila=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas"));
        String triangulo="";
        int aux=0;
        for(int i=1;i<=fila;i++){
            if(!triangulo.equals("")){
               triangulo+="\n";
            }
            for(int j=1;j<=1+aux;j++){
                triangulo+="*";
            }
            aux+=2;
        }
        JOptionPane.showMessageDialog(null, triangulo);
    }
}
