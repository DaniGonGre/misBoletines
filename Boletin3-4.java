package boletin3.pkg4;
import java.util.Scanner;

public class Boletin34 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        long num1, num2, num3;
        System.out.println("Introduce unha cantidade");
           num1 = sc.nextLong();
        int n100, n20, n5, n1;
        n100= (int) (num1/100);
        System.out.println("Desglosase en "+ n100 + " billetes de 100");
        n20 = (int) ((num1 % 100)/ 20);
        System.out.println("Desglose en "+n20 + " billetes de 20");
        n5 = (int) (((num1 % 100) % 20)/ 5);
        System.out.println("Desglose en "+n5 + " billetes de 5");
        n1 = (int) ((((num1 % 100) % 20)% 5)/1 );
        System.out.println("Desglose en "+n1 + " monedas de 1");


    }
    
}
