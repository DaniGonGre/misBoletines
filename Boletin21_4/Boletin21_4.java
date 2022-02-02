package boletin21_4;

import javax.swing.JOptionPane;

public class Boletin21_4 {
    
    public static void main(String[] args) {

        int numDni= Integer.parseInt(JOptionPane.showInputDialog("Introduce o teu DNI: "));

        letraDni.calcularLetra(numDni);
        
    }
    
}
