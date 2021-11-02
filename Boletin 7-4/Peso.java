package boletin7_4;

import java.util.Scanner;

public class Peso {
    Scanner sc;
    public void Pes(){
        sc= new Scanner(System.in);
        System.out.println("Introduce o peso 1: ");
        float pes1= sc.nextFloat();
        
        System.out.println("Introduce o peso 2: ");
        float pes2= sc.nextFloat();  
        
        System.out.print("Nome peso 1: ");
        String nom1 = sc.next();
        
        System.out.print("Nome peso 2: ");
        String nom2 = sc.next();
                 
    //condicional
   if (pes1>pes2)
      System.out.println(nom1 + " pesa máis que "+ nom2 + ". A diferencia de peso é "+ (pes1-pes2));
   
   else 
      System.out.println(nom2 + " pesa máis que "+ nom1 + ". A diferencia de peso é "+ (pes2-pes1));
   
    
   
   
    }
    
    
}
