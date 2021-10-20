package boletin2.pkg4;
import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin24 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        float suma, resta, producto, cociente, resta1, cociente1;
        float num1, num2;
            System.out.print("Introduce un número: ");
            num1= sc.nextFloat();
            System.out.print("Introduce otro número: ");                   
            num2= sc.nextFloat();
            suma= num1+num2;
        System.out.println("A suma é igual a "+suma);
           resta= num1-num2;
           resta1= num2-num1; 
        System.out.println("A resta é igual a "+resta + " ou " + resta1);
           producto= num1*num2;
        System.out.println("O producto é igual a "+producto);
           cociente= num1/num2;
           cociente1=num2/num1;
        System.out.println("O cociente é igual a "+cociente + " ou "+ cociente1);
        
       
        
    }
    
}
