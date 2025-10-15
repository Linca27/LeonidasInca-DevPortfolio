
package ejercicios.programacion;

import javax.swing.JOptionPane;

/**
 *
 * @author Steven
 */


public class triangulo_numero {

    public static void main(String[] args) {
        int n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de filas"));
        String triangulo = "";
        for (int i = 1; i <= n; i++) {
            if(!triangulo.equals("")){
                triangulo+="\n";
            }
            for (int j=1;j<=i;j++){
                triangulo+=j+" ";
            }
        }
        JOptionPane.showMessageDialog(null, triangulo);
    }

}
