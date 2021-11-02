
package boletin7_2;
import java.util.Scanner;

public class Condicion {
    Scanner sc;
    
    public void Con(){
    sc= new Scanner(System.in);
        System.out.println("Teclee un número");
    short num1= sc.nextShort();
        System.out.println("Teclee un número");
    short num2= sc.nextShort();
    
    int suma;
    suma= num1+num2;
        System.out.println("Suma= "+ suma);
    int resta;
    resta= num1-num2;
    
    //condicional
    if (num1>= num2)
        System.out.println("Resta= "+ resta);
    
    

    
    }
}
