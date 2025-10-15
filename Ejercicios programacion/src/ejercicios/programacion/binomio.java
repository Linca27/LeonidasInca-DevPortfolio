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
public class binomio {
    public static void main(String[] args) {
        int fila= Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas"));
        String aux="";
        String aux2="";
        String triangulo="";
        for(int i=0;i<=fila;i++){
            if(i==0){
                triangulo="1"+"\n";
            }
            if(i==1){
                triangulo+="11"+"\n";
                 aux="11";
            }
            if(i>2){
                triangulo+="\n";
            }
            
            for(int j=0; j<=i-2;j++){
                aux2+=Integer.parseInt(String.valueOf(aux.charAt(j)))+Integer.parseInt(String.valueOf(aux.charAt(j+1)));
                if(j==i-2){
                    aux="1"+aux2+"1";
                    aux2="";
                    triangulo+=aux;
                    
                }
            }
        }
        JOptionPane.showMessageDialog(null, triangulo);
    }
}
