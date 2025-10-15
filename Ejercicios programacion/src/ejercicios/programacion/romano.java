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
public class romano {
    public static void main(String[] args) {
        int num=Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un número"));
        String romano="";
        if(num>1000){
            romano="Ingrese un número menor a 1000";
        }
        else if(num==1000){
            romano="M";
        }
        //Centenas
        else if(num>=100){
        if(num>=900 &&num<1000){
            romano="CM";
        }
         if(num>=800 &&num<900){
            romano="DCCC";
        }
         if(num>=700 &&num<800){
            romano="DCC";
        }
         if(num>=600 &&num<700){
            romano="DC";
        }
         if(num>=500 &&num<600){
            romano="D";
        }
         if(num>=400 &&num<500){
            romano="CD";
        }
         if(num>=300 &&num<400){
            romano="CCC";
        }
         if(num>=200 &&num<300){
            romano="CC";
        }
         if(num>=100 &&num<200){
            romano="C";
        }
         //Decenas
        if(Integer.parseInt(String.valueOf(num).substring(1, 3))>=10 &&Integer.parseInt(String.valueOf(num).substring(1, 3))<20){
            romano+="X";
        }
        if(Integer.parseInt(String.valueOf(num).substring(1, 3))>=20 &&Integer.parseInt(String.valueOf(num).substring(1, 3))<30){
            romano+="XX";
        }
        if(Integer.parseInt(String.valueOf(num).substring(1, 3))>=30 &&Integer.parseInt(String.valueOf(num).substring(1, 3))<40){
            romano+="XXX";
        }
        if(Integer.parseInt(String.valueOf(num).substring(1, 3))>=40 &&Integer.parseInt(String.valueOf(num).substring(1, 3))<50){
            romano+="XL";
        }
         if(Integer.parseInt(String.valueOf(num).substring(1, 3))>=50 &&Integer.parseInt(String.valueOf(num).substring(1, 3))<60){
            romano+="L";
        }
          if(Integer.parseInt(String.valueOf(num).substring(1, 3))>=60 &&Integer.parseInt(String.valueOf(num).substring(1, 3))<70){
            romano+="LX";
        }
            if(Integer.parseInt(String.valueOf(num).substring(1, 3))>=70 &&Integer.parseInt(String.valueOf(num).substring(1, 3))<80){
            romano+="LXX";
        }
              if(Integer.parseInt(String.valueOf(num).substring(1, 3))>=80 &&Integer.parseInt(String.valueOf(num).substring(1, 3))<90){
            romano+="LXXX";
        }
              if(Integer.parseInt(String.valueOf(num).substring(1, 3))>=90 &&Integer.parseInt(String.valueOf(num).substring(1, 3))<100){
            romano+="XC";
        }
              //Unidades
        if((Integer.parseInt(String.valueOf(num).substring(2, 3)))==1){
            romano+="I";
            
        }
         if((Integer.parseInt(String.valueOf(num).substring(2, 3)))==2){
            romano+="II";
            
        }
          if((Integer.parseInt(String.valueOf(num).substring(2, 3)))==3){
            romano+="III";
            
        }
           if((Integer.parseInt(String.valueOf(num).substring(2, 3)))==4){
            romano+="IV";
            
        }
            if((Integer.parseInt(String.valueOf(num).substring(2, 3)))==5){
            romano+="V";
            
        }
             if((Integer.parseInt(String.valueOf(num).substring(2, 3)))==6){
            romano+="VI";
            
        }
              if((Integer.parseInt(String.valueOf(num).substring(2, 3)))==7){
            romano+="VII";
            
        }
              if((Integer.parseInt(String.valueOf(num).substring(2, 3)))==8){
            romano+="VIII";
            
        }
               if((Integer.parseInt(String.valueOf(num).substring(2, 3)))==9){
            romano+="IX";
            
        }
        }
        //Numeros mayores a 10
        else if(num>=10){
            if(num>=10 &&num<20){
            romano="X";
        }
        if(num>=20 &&num<30){
            romano="XX";
        }
        if(num>=30 &&num<40){
            romano="XXX";
        }
        if(num>=40 &&num<50){
            romano="XL";
        }
        if(num>=50 &&num<60){
            romano="L";
        }
         if(num>=60 &&num<70){
            romano="LX";
        }
            if(num>=70 &&num<80){
            romano="LXX";
        }
             if(num>=80 &&num<90){
            romano="LXXX";
        }
             if(num>=90 &&num<100){
            romano="XC";
        }
              //Unidades
        if((Integer.parseInt(String.valueOf(num).substring(1, 2)))==1){
            romano+="I";
            
        }
         if((Integer.parseInt(String.valueOf(num).substring(1, 2)))==2){
            romano+="II";
            
        }
          if((Integer.parseInt(String.valueOf(num).substring(1, 2)))==3){
            romano+="III";
            
        }
           if((Integer.parseInt(String.valueOf(num).substring(1, 2)))==4){
            romano+="IV";
            
        }
            if((Integer.parseInt(String.valueOf(num).substring(1, 2)))==5){
            romano+="V";
            
        }
             if((Integer.parseInt(String.valueOf(num).substring(1, 2)))==6){
            romano+="VI";
            
        }
              if((Integer.parseInt(String.valueOf(num).substring(1, 2)))==7){
            romano+="VII";
            
        }
              if((Integer.parseInt(String.valueOf(num).substring(1, 2)))==8){
            romano+="VIII";
            
        }
               if((Integer.parseInt(String.valueOf(num).substring(1, 2)))==9){
            romano+="IX";
            
        }
        }
        //Numernos menores a 10
        else if(num>0){
            if(num==1){
                romano="I";
            }
             if(num==2){
                romano="II";
            }
             if(num==3){
                romano="III";
            }
          if(num==4){
                romano="IV";
            }
           if(num==5){
                romano="V";
            }
            if(num==6){
                romano="VI";
            }
             if(num==7){
                romano="VII";
            }
              if(num==8){
                romano="VIII";
            }
               if(num==9){
                romano="IX";
            }
        }  
        JOptionPane.showMessageDialog(null, romano);
    }
}
