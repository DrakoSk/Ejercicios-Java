
package holamundo1;

import javax.swing.JOptionPane;


public class Holamundo1 {

    
    public static void main(String[] args) {
        // 4 Operaciones que muestren al mismo tiempo los resultados
        String a = JOptionPane.showInputDialog(null,"Ingrese el primer numero:");
        String b = JOptionPane.showInputDialog(null, "Ingrese el segundo numero:");
        double n1 = Double.parseDouble(a);
        double n2 = Double.parseDouble(b);
        double  suma = n1 + n2;
        double resta = n1 - n2;
        double mult = n1 * n2;
        double div = n1 / n2;
        JOptionPane.showMessageDialog(null, "Los resultados fueron: \n "
                + "La suma fue: "+ suma +"\n"
                + "La resta fue: "+ resta +"\n"
                + "La miltiplicacion fue: " +mult+ "\n"
                + "La division fue: " +div);
                
   
  
    }
    
}
