
package Entidades;

import com.toedter.calendar.JDateChooser;
import java.util.Calendar;
import javax.swing.JOptionPane;


public class Cliente implements Metodos {
    private int id;
    private String Nombre;
    private String apellido;
    private JDateChooser fechaNac;
    private char sexo;
    private String NumeroCuneta;
    private String Sucursal;
    private double Saldo;
    private String Tipo;

    public Cliente() {
    }

    public Cliente(int id, String Nombre, String apellido, JDateChooser fechaNac, char sexo, String NumeroCuneta, String Sucursal, double Saldo, String Tipo) {
        this.id = id;
        this.Nombre = Nombre;
        this.apellido = apellido;
        this.fechaNac = fechaNac;
        this.sexo = sexo;
        this.NumeroCuneta = NumeroCuneta;
        this.Sucursal = Sucursal;
        this.Saldo = Saldo;
        this.Tipo = Tipo;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNumeroCuneta() {
        return NumeroCuneta;
    }

    public void setNumeroCuneta(String NumeroCuneta) {
        this.NumeroCuneta = NumeroCuneta;
    }

    public String getSucursal() {
        return Sucursal;
    }

    public void setSucursal(String Sucursal) {
        this.Sucursal = Sucursal;
    }

    public double getSaldo() {
        return Saldo;
    }

    public void setSaldo(double Saldo) {
        this.Saldo = Saldo;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public JDateChooser getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(JDateChooser fechaNac) {
        this.fechaNac = fechaNac;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    @Override
    public void Depositar(double valor){
        this.Saldo+=valor;
        JOptionPane.showMessageDialog(null,"Transacción exitosa a la cuenta de"+
                            "\n "+this.getNombre()+
                            "\nSaldo actual: "+this.getSaldo());
    }
    @Override
    public void Retirar(double valor){
        String msg = "TRANSACCION FALLIDA\nSaldo actual insuficiente";
        if (this.Saldo>=valor) {
            if (this.Tipo.equalsIgnoreCase("CORRIENTE")) {
                if (this.Saldo>=100) {
                    this.Saldo-=valor;
                    msg = "Transacción exitosa a la cuenta de"+
                            "\n "+this.getNombre()+
                            "\nSaldo actual: "+this.getSaldo();
                    
                }
            }else{
                this.Saldo-=valor;
                msg = "Transacción exitosa a la cuenta de"+
                            "\n "+this.getNombre()+
                            "\nSaldo actual: "+this.getSaldo();
                
            }
        }
        JOptionPane.showMessageDialog(null, msg);
    }

    @Override
    public boolean CumpleAnos() {
        boolean var = false;
        Calendar fecha = fechaNac.getCalendar();
        if (fecha.get(Calendar.MONTH) == Calendar.getInstance().get(Calendar.MONTH)
                && fecha.get(Calendar.DATE) == Calendar.getInstance().get(Calendar.DATE)) {
            var = true;
        }
        return var;
    }
}
