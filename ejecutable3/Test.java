// Ingresar el tiempo de duración de una llamada telefónica y determinar la cantidad a pagar de acuerdo con lo siguiente.
// - toda llamada que dure 3 minutos o menos tiene un costo de 300 pesos cada minuto adicional cuesta 500.

package ejecutable3;

import javax.swing.JOptionPane;

public class Test{
    public static void main(String[] args) {
        /* declaracion de variables*/

        int duracion;
        int costo;

        // input 

        duracion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la duración de la llamada en minutos:"));

        // processing   

        if (duracion <= 3) {
            costo = duracion * 300;
        } else {
            costo = 900 + (duracion - 3) * 500;
        }

        // output 
        
        JOptionPane.showMessageDialog(null, "El costo de la llamada es de " + costo + " pesos.");

        // fin del programa 
    }
}
