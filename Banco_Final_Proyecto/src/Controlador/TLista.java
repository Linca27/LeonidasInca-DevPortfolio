
package Controlador;

import Entidades.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class TLista {
    public static List<Cliente> lista = new ArrayList<Cliente>();
    
    public static boolean add(Cliente obj){
        boolean ret = false;
        String msg = "Saldo Insuficiente.";
        do{
            obj.setNumeroCuneta(""+((int)(Math.random()*1000000)));
        }while (Buscar(obj.getNumeroCuneta())!=-1);
        if (obj.getTipo().equalsIgnoreCase("Corriente")) {
            if (obj.getSaldo()>=200) {
                lista.add(obj);
                msg = "Cliente agregado con el numero de cuenta:\n"+obj.getNumeroCuneta();
                ret = true;
            }
        }else if (obj.getTipo().equalsIgnoreCase("Ahorro")){
            if (obj.getSaldo()>=100) {
                lista.add(obj);
                msg = "Cliente agregado con el numero de cuenta:\n"+obj.getNumeroCuneta();
                ret = true;
            }
        }
        JOptionPane.showMessageDialog(null, msg);
        return ret;
    }
    
    public static DefaultTableModel mostrarDatos(){
        DefaultTableModel model = new DefaultTableModel();
        String[] Cab = {"id.","Nombres","Numero de Cuenta","Sucursal","Saldo","Tipo"};
        String[] data = new String[6];
        model.setColumnIdentifiers(Cab);
        for (Cliente cli : lista) {
            data[0] = cli.getId()+"";
            data[1] = cli.getNombre();
            data[2] = cli.getNumeroCuneta();
            data[3] = cli.getSucursal();
            data[4] = cli.getSaldo()+"";
            data[5] = cli.getTipo();
            model.addRow(data);
        }
        return model;
    }
    
    public static int Buscar(String in){
        for (int i=0 ; i<lista.size();i++) {
            Cliente cliente = lista.get(i);
            if (cliente.getNumeroCuneta().equals(in)) {
                return i;
            }
        }
        return -1;
    }
    
    public static double TotalSucursal(String Sucursal){
        double total=0;
        for (Cliente cliente : lista) {
            if (cliente.getSucursal().equalsIgnoreCase(Sucursal)) {
                total+=cliente.getSaldo();
            }
        }
        return total;
    }
    
}
