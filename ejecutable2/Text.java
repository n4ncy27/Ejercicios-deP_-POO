// Elaborar un programa que obtenga las raíces de una ecuación segundo grado.


package ejecutable2;

import javax.swing.JOptionPane;

public class Text{ 
    public static void main(String[] args)
    {
        /* declaracion de variables*/
        double a, b, c, discriminante, x1, x2;
        
        // input 
        a = Double.parseDouble(JOptionPane.showInputDialog("DIGITE A:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("DIGITE B:"));
        c = Double.parseDouble(JOptionPane.showInputDialog("DIGITE C:"));

        // processing     
        discriminante = b*b - 4*a*c;
        
        if (discriminante > 0) {
            x1 = (-b + Math.sqrt(discriminante)) / (2*a);
            x2 = (-b - Math.sqrt(discriminante)) / (2*a);
            JOptionPane.showMessageDialog(null, "sus correspodientes raíces son: " + x1 + " y " + x2);
        } else if (discriminante == 0) {
            x1 = -b / (2*a);
            JOptionPane.showMessageDialog(null, "La raíz doble es: " + x1);
        } else {
            JOptionPane.showMessageDialog(null, "La ecuación no tiene soluciones reales.");
        }

        // fin del programa 
    }
}
