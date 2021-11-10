
package boletin8_2;

import javax.swing.JOptionPane;

public class Figuras {
    String figura= JOptionPane.showInputDialog("Introduce el nombre de la figura: ");
    
    public void darSuperficie(){
        switch(figura){
            case "circulo":
                float radio= Float.parseFloat(JOptionPane.showInputDialog("Introduce el "
                + "radio del círculo"));
                float radio2=(float)Math.pow(radio, 2);
                float superficieCir=(float) (3.4*radio2);
                JOptionPane.showMessageDialog(null, "La superficie del círculo es"+ 
                superficieCir);
                break;
                
            case "triangulo":
                float altura= Float.parseFloat(JOptionPane.showInputDialog("Introduce"
                        + "la altura del triángulo"));
                float base= Float.parseFloat(JOptionPane.showInputDialog("Introduce"
                        + "la base del triángulo"));
                float superficieTri= base*altura/2;
                JOptionPane.showMessageDialog(null, "La superficie del triángulo es: "+ superficieTri);
                break;
                
            case "cuadrado":
                float lado= Float.parseFloat(JOptionPane.showInputDialog("Introduce el lado "
                        + "del cuadrado: "));
                float superficieCua= lado*lado;
                JOptionPane.showMessageDialog(null, "La superficie del cuadrado es: "+ superficieCua);
                break;
                
            default: JOptionPane.showConfirmDialog(null, "Error");
        }
    }
    
    
}
