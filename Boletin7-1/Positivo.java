package boletin7.pkg1;
import java.util.Scanner;

public class Positivo {
    Scanner sc;
    
    public void NumPositivos(){
        sc= new Scanner(System.in);
        System.out.println("Teclea un número: ");
        int num1= sc.nextInt();
        
    //condicional
    
    if (num1 >= 0){
        System.out.println(num1 + " é positivo.");
    }
    }  
}
