package boletin7_5;

import java.util.Scanner;


public class Numeros {
    Scanner pedirNum;
    
    public void pedirNumero(){
        //pedimos os tres números por teclado
        
        pedirNum= new Scanner(System.in);
        System.out.println("Introduce o número 1: ");
        int n1= pedirNum.nextInt();
        System.out.println("Introduce o número 2: ");
        int n2= pedirNum.nextInt();
        System.out.println("Introduce o número 3: ");
        int n3= pedirNum.nextInt();
        
        //condicionais
        
            if (n1 > n2) {
            if (n1 > n3) 
                System.out.println(n1 + " é o maior.");                                             
             else 
                System.out.println(n3 + " é o maior.");     
            
        } 
            else if (n2 > n3) 
            System.out.println(n2 + " é o maior.");
            else 
            System.out.println(n3 + " é o maior.");
        
    }
}