package boletin9_3;

import javax.swing.JOptionPane;

public class Area {

    public void CalcArea() {

        String base;
        String altura;
        base = JOptionPane.showInputDialog("Introduce a base do rectángulo:");
        altura = JOptionPane.showInputDialog("Introduce a altura do rectángulo:");

        int b;
        int h;
        b = Integer.parseInt(base);
        h = Integer.parseInt(altura);
        
        int area = 0;
        
        if(b>0 & h>0){
       
        area= b*h;
        
        JOptionPane.showMessageDialog(null, area);

        } else {
            JOptionPane.showMessageDialog(null, "Error");
        }

    

    }

}
