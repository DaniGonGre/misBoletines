package boletin9_1;

import java.util.Scanner;

public class Numeros {

    public void cantNumeros(){
        int pos=0, neg=0, cero=0;
        for(int contador=0; contador<10; contador++){
            Scanner sc = new Scanner(System.in);
            int num;
            System.out.println("Introduce un número: ");
            num= sc.nextInt();
            
            if(num>0){
                pos++;
            }
            else if(num<0){
                neg++;
            }
            else{
                cero++;                  
            }         
        }
       
        System.out.println("Positivos= "+ pos + "\n" + "Negativos= "+ neg + "\n" +"Ceros= " + cero );
    }
    
}
