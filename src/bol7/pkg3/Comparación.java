
package bol7.pkg3;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablite5
 */
public class Comparación {
    public int pedirNumero(){
        return(Short.parseShort(JOptionPane.showInputDialog("teclea primer numero")));
    }
     public void comparaNum(int num){
        if (num>0){
            System.out.println("+");
        }
        else if (num<0){
         System.out.println("-");
    }
       else{
           System.out.println("0");
       }
}
}
