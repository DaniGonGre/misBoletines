package boletin21_4;

import javax.swing.JOptionPane;

public class letraDni {
        
    public static void calcularLetra(int numDni){
    
    char letraDni[]= {'T','R','W','A','G','M',
    'Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
    int resto = numDni%23;
    
        System.out.println("O DNI " + numDni + " ten a seguinte letra " + letraDni[resto] + ".");
    }
}
