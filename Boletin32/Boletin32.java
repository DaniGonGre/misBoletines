package boletin32;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Boletin32 {

    public static void main(String[] args) {

        ArrayList<Barco> renta = new ArrayList<>();
        
        int nDias = Integer.parseInt(JOptionPane.showInputDialog("Número de días: "));
        
        Barco v1 = new Velero("v1", 20, 3);
        Barco d1 = new Deportivo("d1", 30, 5);
        Barco y1 = new Yate("y1", 20, 4);
        
        renta.add(v1);
        renta.add(d1);
        renta.add(y1);
                
        for (Barco b : renta){
            System.out.println(b.calcularPrezo(nDias));
            
        }

    }
    
}
