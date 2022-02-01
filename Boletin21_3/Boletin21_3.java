package boletin21_3;

import javax.swing.JOptionPane;

public class Boletin21_3 {

    public static void main(String[] args) {
        String nomes[] = new String[5];
        float nota[] = new float[5];
        int op;        
        ArrayNomes.crearArray(nota, nomes);
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog("***MENÚ***\n1--> Visualizar nota \n2-->"
                    + "Alumnos aprobados \n3--> Ordear notas \n4--> Consultar nota \n0--> Saír do programa"));
            switch (op){
                case 1 : ArrayNomes.amosar(nota, nomes);
                            break;
                case 2 : ArrayNomes.aprobar(nota, nomes);
                            break;
                case 3 : ArrayNomes.ordearNotas(nota, nomes);
                            break;
                case 4 : ArrayNomes.consultarNota(nomes, nota);
                            break;
            }
        } while(op!=0);
        

    }
    
}
