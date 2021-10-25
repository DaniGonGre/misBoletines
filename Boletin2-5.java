package boletin2.pkg5;
import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin25 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double millasMariñas, metros;
        final int EQUIVALENCIA= 1852; 
            System.out.print("Introduce a cantidade: ");
               millasMariñas= sc.nextDouble();
        metros= millasMariñas*EQUIVALENCIA;
        //System.out.println(millasMariñas+ " millas mariñas equivalen a "+metros + " metros.");
        System.out.println(millasMariñas+ " millas mariñas equivalen a "+millasMariñas*EQUIVALENCIA + " metros.");

                  
                    


    }
    
}
