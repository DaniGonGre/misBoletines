package boletin22;

import javax.swing.JOptionPane;

public class Boletin22 {


    public static void main(String[] args) {
    
    int filas = Integer.parseInt(JOptionPane.showInputDialog("Nº de filas: "));
    int columnas = Integer.parseInt(JOptionPane.showInputDialog("Nº columnas: "));
    int op;

    int[][] taboa = new int [filas][columnas];
        String []xornada = {"Equipos/xornadas", "X1", "X2", "X3"};
        String []equipo = {"Celta", "Bilbao", "Malaga"};
    int[] totalGol = Metodos22.sumGoles(taboa);

        do{   
            op = Integer.parseInt(JOptionPane.showInputDialog(" **** MENU ****" +
            "\n1 --> Imprimir a táboa" + "\n2 --> Ordear por menos nº de goles" +
            "\n3 --> Equipo con máis goles" + "\n4 --> Equipo e xornada con máis goles" +
            "\n5 --> Consultar goles"));
           
            switch (op){
                case 1 : Metodos22.amosarTaboa(taboa, xornada, equipo);
                        break;
                case 2 : Metodos22.ordearEquipos(totalGol, taboa, equipo, xornada);      
                        break;
                case 3 : Metodos22.sumGoles(taboa);
                        break;
                case 4 : Metodos22.maisGoles(taboa, equipo, xornada);
                        break;
                case 5 : Metodos22.consultarEquip(taboa, equipo, xornada);
                        break;

    }
        } while(op!=0);
   
}
}

