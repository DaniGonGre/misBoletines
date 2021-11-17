package boletin_extra1_2;

import java.util.Scanner;

public class Boletin_extra1_2 {

    public static void main(String[] args) {

        float nota1, nota2, notaFinal;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Programación.");
        
        System.out.println("Introduce nota 1: ");
        nota1 = sc.nextFloat();
        
        System.out.println("Introduce nota 2: ");
        nota2 = sc.nextFloat();
        
        notaFinal = (nota1 + nota2)/ 2;
        
        System.out.println("A nota final é " + notaFinal);
        
    }
    
}
