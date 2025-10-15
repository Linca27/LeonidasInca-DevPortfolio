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
public class EjerciciosProgramacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         String abecedario = "";
        String opcion = JOptionPane.showInputDialog("Ingrese M si quiere mayúsculas, ingrese m si quiere minúsculas");
        if (opcion.equals("m")) {
            for (int i = 97; i <= 122; i++) {
                abecedario+= Character.toString((char)i) + " ";
            }
            JOptionPane.showMessageDialog(null, abecedario);
        }
        if (opcion.equals("M")) {
            for (int i = 65; i <= 90; i++) {
                abecedario+=Character.toString((char)i) + " ";
            }
            JOptionPane.showMessageDialog(null, abecedario);
        }
    }

}
