package boletin22;

import javax.swing.JOptionPane;

class Metodos22 {
    
    public static int[][] crearTaboa(int [][] taboa){
        for (int fila=0; fila<taboa.length; fila++){
            for (int columna=0; columna<taboa[fila].length; columna++){
                taboa[fila][columna] = Integer.parseInt(JOptionPane.showInputDialog("Goles: "));
            }
        }
        return taboa;
    }
    
    public static void amosarTaboa(int[][] taboa, String[] xornada, String[] equipo){
        for (int columna=0; columna<xornada.length; columna++){
            System.out.println("   " + xornada[columna]);
        }
        for (int fila=0; fila<taboa.length; fila++){
            System.out.println("\n" + equipo[fila] + "   ");
            for (int columna=0; columna<taboa[fila].length; columna++){
                System.out.println(taboa[fila][columna] + "   ");
            }
        }
    }
    
       public static int[] sumGoles(int[][]taboa){
       
        int sumGol= 0;
        int tam= Integer.parseInt(JOptionPane.showInputDialog("Indique o tamaño do array: "));
        int[]totalGol = new int[tam];
        for(int fila=0; fila<taboa.length; fila++){
            sumGol=0;
            for(int columna=0; columna<taboa[fila].length; columna++){
                sumGol = sumGol + taboa[fila][columna];
            }
                totalGol [fila] = sumGol;
        }
        return totalGol;
    }
    
      public static void ordearEquipos(int[]totalGol, int[][]taboa, String[]equipo, String[]xornada){
       
        int aux1=0, aux2=0;
        String auxString= null;
       
        for (int i=0; i<taboa.length-1; i++){
            for (int j=i+1; j<taboa.length; j++){
                if (totalGol[i]<totalGol[j]){
                    aux1 = totalGol[i];
                    totalGol[i] = totalGol[j];
                    totalGol[j] = aux1;
                    auxString = equipo[i];
                    equipo[i] = equipo[j];
                    equipo[j] = auxString;
                   
                    for (int k=0; k<xornada.length; k++){
                        aux2 = taboa[i][k];
                        taboa[i][k] = taboa[j][k];
                       
                    }
                }
            }
        }   
    }
}
