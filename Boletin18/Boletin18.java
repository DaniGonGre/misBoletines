package boletin18;

import javax.swing.JOptionPane;

public class Boletin18 {

    public static void main(String[] args) {
        
        ConversorTemperaturas obx = new ConversorTemperaturas();
        
        try{
            
            obx.centigradosAFharenheit(Float.parseFloat(JOptionPane.showInputDialog("Introduce a temperatura: ")));
            obx.centigradosAReamur(Float.parseFloat(JOptionPane.showInputDialog("Introduce a temperatura: ")));
            
            
        }catch (TemperaturaErradaExcepcion ex){
            
        }

    }
    
}
