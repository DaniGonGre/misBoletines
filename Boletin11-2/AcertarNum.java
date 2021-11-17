package boletin11_2;

import javax.swing.JOptionPane;

public class AcertarNum {
    
    public void Acertar(){
    int numAleatorio = (int) (Math.random()*50 + 1);
        System.out.println("Número aleatorio: " + numAleatorio);
    
    int intentos, num, i;    
    intentos= Integer.parseInt(JOptionPane.showInputDialog("Introduce o número de intentos: "));
    
    for (i=0; i<=intentos; i++) {
        
        num= Integer.parseInt(JOptionPane.showInputDialog("Introduce o número entre 1 y 50: "));

        System.out.println("Te quedan " +intentos + " intentos");
        
        if (numAleatorio==num)
            System.out.println("O número é correcto.");
        
        else
            
        intentos--;
        
        if ((numAleatorio - num) > 20){
            System.out.println("Moi lonxe.");
        }
        else if ((numAleatorio - num) >= 10 && (numAleatorio - num) <= 20){
            System.out.println("Lonxe.");
        }
        else if ((numAleatorio - num) > 10 && (numAleatorio - num) < 5){
            System.out.println("Preto.");
        }   
            else if ((numAleatorio - num) <= 5){
            System.out.println("Moi preto.");
        }
        
    }
            if (intentos==0){
                System.out.println("Non quedan intentos.");
            }

        
    } 
    
    
    
}
