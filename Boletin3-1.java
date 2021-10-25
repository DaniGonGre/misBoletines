package boletin3.pkg1;
import java.util.Scanner;

/**
 *
 * @author dam1
 */
public class Boletin31 {


    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        double prezoTarifa, prezoPagado;
        double porcentaje;
           System.out.println("Introduce o prezo da tarifa");
              prezoTarifa= sc.nextDouble();
           System.out.println("Introduce o prezo pagado");
              prezoPagado= sc.nextDouble();
        porcentaje= (double) ((prezoPagado*100)/prezoTarifa);
        System.out.println("Porcentaxe de desconto= "+ porcentaje + "%");
        
        
              
        
    }
    
}
