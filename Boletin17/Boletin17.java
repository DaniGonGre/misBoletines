package boletin_17;

import javax.swing.JOptionPane;

public class Boletin_17 {

    public static void main(String[] args) {
    
        NotaFinal obx = new NotaFinal();
        
        while (true){
        obx.pedirNotas();
        obx.calcularNota();
        obx.calcularFinal();
        obx.mostrarNota();
        
        int repeat=JOptionPane.showConfirmDialog(null,"Desexas calcular outra nota?","Calcula a túa nota",JOptionPane.YES_NO_OPTION);
            if (repeat==1){
                break;
            }
        }
    
    }
}
