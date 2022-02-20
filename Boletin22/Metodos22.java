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
            System.out.println("\n" + equipo[fila] + "                             ");
            for (int columna=0; columna<taboa[fila].length; columna++){
                System.out.println(taboa[fila][columna] + "   ");
            }
        }
    }
    
       public static int[] sumGoles(int[][]taboa){
       
        int sumGol= 0;
        int tam= 4;
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
    
      public static int[] ordearEquipos(int[]totalGol, int[][]taboa, String[]equipo, String[]xornada){
       
        int aux1=0, aux2=0;
        String auxString;
        
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
        for (int i=0; i<taboa.length; i++){
            System.out.println(equipo[i]+ " --> "+ totalGol[i]);
        }
        return totalGol;
    }
      
      public static int maisGoles(int[][] taboa, String[] equipo, String[] xornadas){
          int maior = taboa[0][0];
          for (int i=0; i<taboa.length; i++){
              maior = taboa[i][0];
              System.out.println("\n" + equipo[i] + "   ");
              for (int j = 0; j<taboa.length; j++){
                  if (taboa[i][j] > maior){
                      maior = taboa[i][j];
                      System.out.println("   \n" + xornadas[j]);
                  }
              }
              System.out.println(maior);
          }
          return maior;
      }
      
      public static void consultarEquip(int [][] taboa, String[] equipo, String[] xornada){
          String buscarElem = JOptionPane.showInputDialog("Consultar equipo: ");
          int pos=0, atop=0;
          for (int i=0; i<taboa[i].length; i++){
              if (buscarElem.equals(equipo[i])){
                  System.out.println(equipo[i]);
                  atop= 1;
                  pos = taboa[i][0];
              }
          }
      
      if (atop == 0){
            System.out.println("Non atopado");
}
      }
}
