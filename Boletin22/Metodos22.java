package boletin22;

import javax.swing.JOptionPane;
import libreriaDani.lerDatos;

public class Metodos22 {

    public static void amosarTaboa(int[][]taboa, String[]xornada, String[]equipo){
        
        for(int columna=0; columna<xornada.length; columna++)
            System.out.println(xornada[columna]);
        for (int fila=0; fila<taboa.length; fila++){
            System.out.println("\n" + equipo[fila] + "     ");
           for(int columna=0; columna<taboa[fila].length; columna++){
            System.out.println(taboa[fila][columna] + "      ");
           }
            System.out.println();
        }
    }

    public static int[] sumGoles(int[][]taboa){
        
        int sumGol= 0;
        int tam= taboa.length;
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
    
    public static void amosarTaboaCompleta(int[][] taboa){
        int[] total = Metodos22.sumGoles(taboa);
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
    
    public static int maisGoles(int[][]taboa, String[] equipo, String[] xornada){
        int maior= taboa[0][0];
        int j;
        for(int i=0; i< taboa.length; i++){
            maior = taboa[i][0];
            System.out.println("\n" + equipo[i] + "   ");
            for (j=0; j<taboa.length; j++){
                if (taboa[i][j] > maior){
                    maior = taboa[i][j];
                }
            }
            System.out.println("   \n" + xornada[j]);
            System.out.println("Goles: " + maior);
        }
        return maior;
    }
    
    public static void equipoMaisGoles(int[][]taboa){
        
    }
    
    public static void consultar(int[][] taboa, String[] xornada, String[] equipo){
        String consulEquip = lerDatos.lerString("Consulta o seguinte equipo: ");
        String consulXorn = lerDatos.lerString("Consultar a seguinte xornada: ");
        int atopar=0;
        
        for (int i =0; i<taboa.length; i++){
            for (int j=0; j<taboa[i].length; j++){
                
            }
        }
    }
    
}
