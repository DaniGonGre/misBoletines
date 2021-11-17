package boletin11_1;

import javax.swing.JOptionPane;

public class AdiviñarNum {

public void AdNum(){
    int numAdiviñar, intentos, numero, i;
        
        numAdiviñar= Integer.parseInt(JOptionPane.showInputDialog("Introduce un número entre 1 e 50: "));
        
        if (numAdiviñar>50 && numAdiviñar<1){
        
        intentos= Integer.parseInt(JOptionPane.showInputDialog("Introduce o número de intentos: "));
        
    
        for (i=0; i<=intentos; i++){

    numero= Integer.parseInt(JOptionPane.showInputDialog("Introduce o número: "));

        if (numAdiviñar == numero){
            System.out.println("Número correcto!");
        break;
        }    
        else if (i == intentos){
            System.out.println("Remataron os intentos. O número era: " + numAdiviñar);
        break;
        }
        else if (numAdiviñar > numero){
            System.out.println("O número a adiviñar é maior.");
            intentos--;
        }

        else if (numAdiviñar < numero){
            System.out.println("O número a adiviñar é menor"); 
            intentos--;
            }
        }
                
                
    }
        else{
            System.out.println("Introduce un número entre los valores indicados.");
        }
}
}

 