package boletin21_2;

import javax.swing.JOptionPane;

public class Boletin21_2 {

    public static void main(String[] args) {
        
        float[] nota = new float [30];
        int op;
        ArrayNotas.crearNotas(nota);
        do {
        op = Integer.parseInt(JOptionPane.showInputDialog("***MENÚ*** \n1--> Calificacións "
                + "\n2--> Nota media \n3--> Nota máis alta \n0--> Saír do programa"));
        switch (op){
            case 1 : ArrayNotas.calificarNotas(nota);
                        break;
            case 2 : ArrayNotas.mediaNotas(nota);
                        break;
            case 3 : ArrayNotas.notaAlta(nota);
                        break;
        }
        
        } while (op!=0);
    }
    
}
