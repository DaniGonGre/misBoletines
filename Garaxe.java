package boletin12_1;

import javax.swing.JOptionPane;

public class Garaxe {
    
      int numeroCoches, matricula, capacidade= 5;
      float cartosRecibidos, cartosDevoltos;
   
   
    public void xestionar(){
        while (numeroCoches<=capacidade)
        
        for (int i= 0; ; i++){
            float horas, euros= (float) 0.20, precio;
           
            matricula= Integer.parseInt(JOptionPane.showInputDialog("Introduce a matrícula: "));
           
            horas= Float.parseFloat(JOptionPane.showInputDialog("Introduce o número de horas: "));
           
            precio= horas*euros;
           
            if (numeroCoches <= capacidade){
                System.out.println("PLAZAS DISPOÑIBLES");
                if (horas <= 3){
                    precio = (float) 1.5;
                    
                    cartosRecibidos= Float.parseFloat(JOptionPane.showInputDialog("Introduce os cartos, precio=" + precio));
                    cartosDevoltos= cartosRecibidos - precio;
                    
                    JOptionPane.showMessageDialog(null, "Diñeiro a pagar= " + precio);
                    JOptionPane.showMessageDialog(null, "FACTURA:" + "\n" + "MATRICULA DO COCHE= "
                    + matricula + "\n" + "TEMPO= " + horas + "\n" + "PRECIO= " + precio + "\n"
                    + "CARTOS RECIBIDOS= " + cartosRecibidos + "\n" + "CARTOS DEVOLTOS= " + cartosDevoltos);
                } else if (horas > 3){
                    float precioFinal;
                    
                    precioFinal= (float) (precio +1.5);
                    
                    cartosRecibidos= Float.parseFloat(JOptionPane.showInputDialog("Introduce os cartos, precio=" + precioFinal));
                    cartosDevoltos= cartosRecibidos - precioFinal;

                    JOptionPane.showMessageDialog(null, "FACTURA:" + "\n" + "MATRICULA DO COCHE= "
                    + matricula + "\n" + "TEMPO= " + horas + "\n" + "PRECIO= " + precioFinal + "\n"
                    + "CARTOS RECIBIDOS= " + cartosRecibidos + "\n" + "CARTOS DEVOLTOS= " + cartosDevoltos);
                   
                }
            } else{
                System.out.println("COMPLETO");
                break;
            }
           
            numeroCoches++;
        }
    }
   
}
    

