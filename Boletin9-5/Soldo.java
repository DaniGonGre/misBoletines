package boletin9_5;

import java.util.Scanner;

public class Soldo {
    
    public void Calcular(){
        
      Scanner sc = new Scanner(System.in);
      float rango = 0;
      for (float traballadores = 0; ;){
          System.out.println("Traballadores" + traballadores);
          traballadores++;
          System.out.println("Soldo gañado: ");
          int soldo = sc.nextInt();
          if (soldo < 1750){
              if (soldo > 1000){
                  System.out.println("Soldo dos empleados"+ (++rango));
                  System.out.println("Porcentaxe: " + rango / traballadores*100);
                  
              } else if ( soldo == 0){
                  System.out.println("Fin do programa");
                  break;
              }
          }
      }
        
    }
}
