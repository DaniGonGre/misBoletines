
package boletin3.pkg2;
import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin32 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double graosC, graosF, graosK;
        System.out.println("Introduce os graos Celsius ");
           graosC= sc.nextDouble();
        graosF= (graosC*1.8)+32;
        graosK= graosC+ 273;
        System.out.println("O equivalente en graos Fahrenheit é =" + graosF);
        System.out.println("O equivalente en graos Kelvin é =" + graosK);
       
    }
    
}
