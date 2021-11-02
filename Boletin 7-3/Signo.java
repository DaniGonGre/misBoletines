package boletin7_3;
import java.util.Scanner;

public class Signo {
    Scanner sc;
    
    public void Sig(){
        sc= new Scanner(System.in);
        System.out.println("Teclee un número: ");
        int num= sc.nextInt();
        
    //condicional
    
    if (num>0)
        System.out.println("+");
    
    else if (num<0)
        System.out.println("-");
    
    else
        System.out.println("0");
    
        
        
    }
    }

