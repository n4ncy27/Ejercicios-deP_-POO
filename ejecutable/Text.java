// 1. Hallar el mayor de tres números.

package ejecutable;

import javax.swing.JOptionPane;

public class Text {
    public static void main(String[] args) {
       
        // Variables 

        int numero1;
        int numero2;
        int numero3;
        int mayor;
    
        // input
       
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));
        numero3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el tercer número:"));
        
        // procesing

        mayor = numero1;

        if (numero2 > mayor) {
            mayor = numero2;
        }

        if (numero3 > mayor) {
            mayor = numero3;
        }
        
        // output

        JOptionPane.showMessageDialog(null, "El número mayor es " + mayor, "Número mayor encontrado", JOptionPane.INFORMATION_MESSAGE);

    }
}

