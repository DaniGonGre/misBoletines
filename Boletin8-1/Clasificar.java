package boletin8_1;

import javax.swing.JOptionPane;

public class Clasificar {
    
    public Clasificar(){
        
    }
    
    
    public void Clasificar(){
        int ventas = Integer.parseInt(JOptionPane.showInputDialog("Ventas anuales: "));
        
        if (ventas <=100)
            JOptionPane.showMessageDialog(null, "Baixo.");
        
        else if (ventas>100)
            
            if (ventas <= 500)
            JOptionPane.showMessageDialog(null, "Medio.");
        
            else if (ventas > 500)
                if (ventas <= 1000)
                    JOptionPane.showMessageDialog(null, "Alto.");
                
                else 
                    JOptionPane.showMessageDialog(null, "Primeira necesidade.");
        
    }
}
