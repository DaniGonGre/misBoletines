
package boletin3.pkg3;
import java.util.Scanner;
/**
 *
 * @author dam1
 */
public class Boletin33 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double billete100, billete20, billete5, moneda1;
        double total100, total20, total5, total1, total;
           System.out.println("Cantidade de billetes de 100");
              billete100= sc.nextDouble();
           System.out.println("Cantidade de billetes de 20");
              billete20= sc.nextDouble();
           System.out.println("Cantidade de billetes de 5");
              billete5= sc.nextDouble();
           System.out.println("Cantidade de monedas de 1");
              moneda1= sc.nextDouble();
        total100= billete100*100;
        total20= billete20*20;
        total5= billete5*5;
        total1= moneda1*1;
        total= total100+ total20+ total5+ total1;
        System.out.println("A cantidade total é de "+ total);
        
        
              
             

    }
    
}
